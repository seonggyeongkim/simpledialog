package kr.hs.emirim.duckbill0316.simpledialog;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button but=(Button)findViewById(R.id.but_dialog); // 형 변환 후, 아이디와 연결
        but.setOnClickListener(this); // 이벤트 핸들러의 객체!
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        AlertDialog.Builder dialog=new AlertDialog.Builder(this); // this = activity 객체 의미
                                                          //메소드를 통해서 반환 받아도 된다! (activity_main.xml)과 연결!
        dialog.setTitle("First Dialog");
        dialog.setMessage("This is message part.");
        dialog.setIcon(R.drawable.first_icon);
        dialog.setPositiveButton("확인",null); //아무런 이동 없을 때, null
        dialog.show();

    }
}
