package thinktodo.com.hotwallet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by User on 2/27/2016.
 */
public class SelectSeatActivity extends Activity {


    @Bind(R.id.gridview1)
    GridView gridview1;

    String arr[]={"A1","A2","A3","A4","A5","A6","A7",
            "B1","B2","B3","B4","B5","B6","B7",
            "c1","C2","C3","C4","C5","C6","C7",
            "D1","D2","D3","D4","D5","D6","D7",
            "E1","E2","E3","E4","E5","E6","E7",
            "F1","F2","F3","F4","F5","F6","F7",
            "G1","G2","G3","G4","G5","G6","G7",
            "H1","H2","H3","H4","H5","H6","H7",
            "I1","I2","I3","I4","I5","I6","I7",
            "J1","J2","J3","J4","J5","J6","J7",
            "K1","K2","K3","K4","K5","K6","K7",
            "L1","L2","L3","L4","L5","L6","L7",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectseat);
        ButterKnife.bind(this);

        final TextView selection=(TextView)
                findViewById(R.id.selection);
        //Gán DataSource vào ArrayAdapter
        ArrayAdapter<String> da=new ArrayAdapter<String>
                (
                        this, android.R.layout.simple_list_item_1, arr
                );
        //gán Datasource vào GridView
        gridview1.setAdapter(da);
        //Thiết lập sự kiện cho GridView,
        gridview1.setOnItemClickListener(new AdapterView
                .OnItemClickListener() {
            public void onItemClick(AdapterView<?> arg0,
                                    View arg1, int arg2,
                                    long arg3) {
                //Hiển thị phần tử được chọn trong GridView lên TextView
                selection.setText(arr[arg2]);
            }
        });
    }
//
//    @OnClick(R.id.gridview1)
//    public void onClick() {
//    }
}
