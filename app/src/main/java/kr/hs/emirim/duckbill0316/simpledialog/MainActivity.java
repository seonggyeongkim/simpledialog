package kr.hs.emirim.duckbill0316.simpledialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String[] items ={"젤리빈","킷켓","롤리팝","마시멜로우"};
    //boolean [] checkArr={false,true,false};
    Button but;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but=(Button)findViewById(R.id.but_dialog); // 형 변환 후, 아이디와 연결
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
        //dialog.setMessage("This is message part.");
        /*dialog.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) { //항목을 클릭 했을 때 which에 값이 반환됨!
                but.setText(items[which]);
            }
        }); // 항목을 선택하였을 때 처리 가능하게 연결 함!*/
        dialog.setSingleChoiceItems(items,0, new DialogInterface.OnClickListener() {
            /**
             * This method will be invoked when a button in the dialog is clicked.
             *
             * @param dialog The dialog that received the click.
             * @param which  The button that was clicked (e.g.
             *               {@link DialogInterface#BUTTON1}) or the position
             */
            @Override
            public void onClick(DialogInterface dialog, int which) {
                but.setText(items[which]);
            }
        });
        dialog.setIcon(R.drawable.first_icon);
        dialog.setPositiveButton("확인", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"대화 상자의 확인 버튼을 클릭했음.",Toast.LENGTH_LONG).show();//MainActivity 를 꼭 참조 해야 하므로 이름을 써주어야 한다!

            }
        }); //아무런 이동 없을 때, null*

        dialog.show();

    }
}
