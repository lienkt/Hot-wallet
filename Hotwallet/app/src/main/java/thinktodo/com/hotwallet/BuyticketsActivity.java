package thinktodo.com.hotwallet;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by User on 3/1/2016.
 */
public class BuyticketsActivity extends Activity {

    @Bind(R.id.buyticket_tvcinema)
    TextView buyticketTvcinema;
    @Bind(R.id.buyticket_tvmovie)
    TextView buyticketTvmovie;
    @Bind(R.id.buyticket_tvshowdate)
    TextView buyticketTvshowdate;
    @Bind(R.id.buyticket_tvshowtime)
    TextView buyticketTvshowtime;
    @Bind(R.id.buyticket_tvnoofticket)
    TextView buyticketTvnoofticket;
    @Bind(R.id.buyticket_ivcinema)
    ImageView buyticketIvcinema;
    @Bind(R.id.buyticket_ivmovie)
    ImageView buyticketIvmovie;
    @Bind(R.id.buyticket_ivshowdate)
    ImageView buyticketIvshowdate;
    @Bind(R.id.buyticket_ivshowtime)
    ImageView buyticketIvshowtime;
    @Bind(R.id.buyticket_ivnoofticket)
    ImageView buyticketIvnoofticket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buytickets);
        ButterKnife.bind(this);

        buyticketIvcinema.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final CharSequence[] items = {
                        "Rajesh", "Mahesh", "Vijayakumar"
                };

                AlertDialog.Builder builder = new AlertDialog.Builder(BuyticketsActivity.this);
                builder.setTitle("Make your selection");
                builder.setItems(items, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int item) {
                        // Do something with the selection
                        buyticketTvcinema.setText(items[item]);
                    }
                });
                AlertDialog alert = builder.create();
                alert.show();
            }
        });

    }
}
