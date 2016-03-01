package thinktodo.com.hotwallet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by User on 2/27/2016.
 */
public class ChooseAmountActivity extends Activity {
    @Bind(R.id.chooseamount_btrma)
    TextView chooseamountBtrma;
    @Bind(R.id.chooseamount_btrmb)
    TextView chooseamountBtrmb;
    @Bind(R.id.chooseamount_btrmc)
    TextView chooseamountBtrmc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseamount);
        ButterKnife.bind(ChooseAmountActivity.this);

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


}
