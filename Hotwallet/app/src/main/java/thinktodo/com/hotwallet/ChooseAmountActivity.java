package thinktodo.com.hotwallet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by User on 2/27/2016.
 */
public class ChooseAmountActivity extends Activity {

    @Bind(R.id.chooseamount_btrma)
    Button chooseamountBtrma;
    @Bind(R.id.chooseamount_btrmb)
    Button chooseamountBtrmb;
    @Bind(R.id.chooseamount_btrmc)
    Button chooseamountBtrmc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseamount);
        ButterKnife.bind(this);

//        chooseamountBtrma.setTextColor(getResources().getColor(R.color.colorWhite));
//        chooseamountBtrma.setBackgroundResource(R.drawable.chooseamount_button_pressed);
//
//        chooseamountBtrmb.setTextColor(getResources().getColor(R.color.colorRed));
//        chooseamountBtrmb.setBackgroundResource(R.drawable.chooseamount_button_normal);
//
//        chooseamountBtrmc.setTextColor(Color.parseColor("#950e13"));
//        chooseamountBtrmc.setBackground(getDrawable(R.drawable.chooseamount_button_normal));


        chooseamountBtrma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state_pressed = chooseamountBtrma.isPressed();
                if (state_pressed == true) {
                    chooseamountBtrma.setTextColor(getResources().getColor(R.color.colorWhite));
                    chooseamountBtrma.setBackgroundResource(R.drawable.chooseamount_button_pressed);

                    chooseamountBtrmb.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrmb.setBackgroundResource(R.drawable.chooseamount_button_normal);

                    chooseamountBtrmc.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrmc.setBackgroundResource(R.drawable.chooseamount_button_normal);
                }
            }
        });
        chooseamountBtrmb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state_pressed = chooseamountBtrmb.isPressed();
                if (state_pressed == true) {
                    chooseamountBtrmb.setTextColor(getResources().getColor(R.color.colorWhite));
                    chooseamountBtrmb.setBackgroundResource(R.drawable.chooseamount_button_pressed);

                    chooseamountBtrma.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrma.setBackgroundResource(R.drawable.chooseamount_button_normal);

                    chooseamountBtrmc.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrmc.setBackgroundResource(R.drawable.chooseamount_button_normal);

                }
            }
        });
        chooseamountBtrmc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean state_pressed = chooseamountBtrmc.isPressed();
                if (state_pressed == true) {
                    chooseamountBtrmc.setTextColor(getResources().getColor(R.color.colorWhite));
                    chooseamountBtrmc.setBackgroundResource(R.drawable.chooseamount_button_pressed);

                    chooseamountBtrmb.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrmb.setBackgroundResource(R.drawable.chooseamount_button_normal);

                    chooseamountBtrma.setTextColor(getResources().getColor(R.color.colorRed));
                    chooseamountBtrma.setBackgroundResource(R.drawable.chooseamount_button_normal);

                }
            }
        });


    }


//    @OnClick({R.id.chooseamount_btrma, R.id.chooseamount_btrmb, R.id.chooseamount_btrmc})
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.chooseamount_btrma:
//                break;
//            case R.id.chooseamount_btrmb:
//                break;
//            case R.id.chooseamount_btrmc:
//                break;
//        }
//    }
}
