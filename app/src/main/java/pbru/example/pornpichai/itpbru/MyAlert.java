package pbru.example.pornpichai.itpbru;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/**
 * Created by lab324-15 on 6/7/2016 AD.
 */
public class MyAlert {

    public void myDialog(Context context, String strTitle, String strMessage) {


        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false); //user can not click undo
        builder.setIcon(R.drawable.rat48);
        builder.setTitle(strTitle);
        builder.setMessage(strMessage);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();// click ok miss
            }
        });
        builder.show();


    } //myDialog


} //Main Class
