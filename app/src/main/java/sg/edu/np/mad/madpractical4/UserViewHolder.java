package sg.edu.np.mad.madpractical4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;
public class UserViewHolder extends RecyclerView.ViewHolder{
    ImageView smallImage;
    TextView name;
    TextView description;
    ImageView bigImage;

    public UserViewHolder(View itemView){
        super(itemView);
        //location of image, name and description found in custom_activity_list.xml
        smallImage = itemView.findViewById(R.id.ivSmallImage);
        name = itemView.findViewById(R.id.tvName);
        description = itemView.findViewById(R.id.tvDescription);
        bigImage = itemView.findViewById(R.id.ivBigImage);
    }

}