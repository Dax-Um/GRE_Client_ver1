package app.realestate.gre_client_ver1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private long backKeyPressedTime = 0;
    private Toast toast;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        if(System.currentTimeMillis() > backKeyPressedTime + 2000) {
            backKeyPressedTime = System.currentTimeMillis();
            toast = Toast.makeText(this,"뒤로 가기 버튼을 한 번 더 누르시면 종료됩니다.",Toast.LENGTH_SHORT);
            toast.show();
            return;
        }

        if(System.currentTimeMillis() <= backKeyPressedTime + 2000) {
            finish();

            //toast.cancel();
            //toast = Toast.makeText(this,"이용해주셔서 감사합니다.",Toast.LENGTH_SHORT);
            //toast.show();
        }
    }



    public void onCallbtnClicked(View view) {
        Intent myIntent = new Intent (Intent.ACTION_VIEW, Uri.parse("tel:02-5656-010"));
        startActivity(myIntent);
    }


}