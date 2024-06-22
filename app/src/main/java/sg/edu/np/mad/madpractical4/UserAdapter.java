package sg.edu.np.mad.madpractical4;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class UserAdapter extends RecyclerView.Adapter<UserViewHolder>{
    private ArrayList<User> list_objects;
    private ListActivity listActivity;


    //private ListActivity activity;
    public UserAdapter(ArrayList<User> list_objects, ListActivity activity){
        this.list_objects = list_objects;
        //this.activity = activity;
    }
    //Method to create a view holder for a username.
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_activity_list, parent, false);
        UserViewHolder holder = new UserViewHolder(view);
        return holder;
    }
    //Method to bind username to a view holder.
    public void onBindViewHolder(UserViewHolder holder, int position){
        //Get position of a username
        User user = list_objects.get(position);
        //Set username to the view holder based on custom_activity_list.xml
        holder.name.setText(user.getName());
        //Set description to the view holder based on custom_activity_list.xml
        holder.description.setText(user.getDescription());

        if (user.getName().charAt(user.getName().length() - 1) == '7'){
            holder.bigImage.setVisibility(View.VISIBLE);
        } else{
            holder.bigImage.setVisibility(View.GONE);
        }


        //Configure setOnClickListener() for the small image on the view holder based on custom_activity_list.xml
        holder.smallImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ListActivity.showAlertDialog(listActivity,user);
            }
        });
    }
    public int getItemCount() {return list_objects.size();}
}
