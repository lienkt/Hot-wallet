package thinktodo.com.hotwallet;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by User on 2/27/2016.
 */
public class SelectSeatActivity extends Activity {


    @Bind(R.id.gridview1)
    GridView gridview1;
    @Bind(R.id.selection)
    TextView selection;

    private int previousSelectedPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectseat);
        ButterKnife.bind(this);


        String arr[] = {"A1", "A2", "A3", "A4", "A5", "A6", "A7",
                "B1", "B2", "B3", "B4", "B5", "B6", "B7",
                "c1", "C2", "C3", "C4", "C5", "C6", "C7",
                "D1", "D2", "D3", "D4", "D5", "D6", "D7",
                "E1", "E2", "E3", "E4", "E5", "E6", "E7",
                "F1", "F2", "F3", "F4", "F5", "F6", "F7",
                "G1", "G2", "G3", "G4", "G5", "G6", "G7",
                "H1", "H2", "H3", "H4", "H5", "H6", "H7",
                "I1", "I2", "I3", "I4", "I5", "I6", "I7",
                "J1", "J2", "J3", "J4", "J5", "J6", "J7",
                "K1", "K2", "K3", "K4", "K5", "K6", "K7",
                "L1", "L2", "L3", "L4", "L5", "L6", "L7",
        };

        // Populate a List from Array elements
        final List<String> plantsList = new ArrayList<String>(Arrays.asList(arr));

        // Data bind GridView with ArrayAdapter (String Array elements)
        gridview1.setAdapter(new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, plantsList) {
            public View getView(int position, View convertView, ViewGroup parent) {

                // Return the GridView current item as a View
                View view = super.getView(position, convertView, parent);

                // Convert the view as a TextView widget
                TextView tv = (TextView) view;

                // set the TextView text color (GridView item color)
                tv.setTextColor(Color.DKGRAY);

                // Set the layout parameters for TextView widget
                RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(
                        RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.MATCH_PARENT
                );
                tv.setLayoutParams(lp);

                // Get the TextView LayoutParams
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) tv.getLayoutParams();

                // Set the width of TextView widget (item of GridView)
                params.width = getPixelsFromDPs(SelectSeatActivity.this, 168);

                // Set the TextView layout parameters
                tv.setLayoutParams(params);

                // Display TextView text in center position
                tv.setGravity(Gravity.CENTER);

                // Set the TextView text font family and text size
                tv.setTypeface(Typeface.SANS_SERIF, Typeface.NORMAL);
                tv.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 12);

                // Set the TextView text (GridView item text)
                tv.setText(plantsList.get(position));

                // Set the TextView background color
                tv.setBackgroundColor(Color.parseColor("#4CAF50"));

                // Return the TextView widget as GridView item
                return tv;
            }
        });

        gridview1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the selected item text
                String selectedItem = parent.getItemAtPosition(position).toString();

                // Display the selected item text to app interface
                selection.setText("Selected item : " + selectedItem);

                // Get the current selected view as a TextView
                TextView tv = (TextView) view;

                // Set the current selected item background color
                tv.setBackgroundColor(Color.parseColor("#304FFE"));

                // Set the current selected item text color
                tv.setTextColor(Color.WHITE);

                // Get the last selected View from GridView
                TextView previousSelectedView = (TextView) gridview1.getChildAt(previousSelectedPosition);

                // If there is a previous selected view exists
                if (previousSelectedPosition != -1) {
                    // Set the last selected View to deselect
                    previousSelectedView.setSelected(false);

                    // Set the last selected View background color as deselected item
//                    previousSelectedView.setBackgroundColor(Color.parseColor("#304FFE"));

                    // Set the last selected View text color as deselected item
                    previousSelectedView.setTextColor(Color.DKGRAY);
                }

                // Set the current selected view position as previousSelectedPosition
                previousSelectedPosition = position;
            }
        });
    }

    // Method for converting DP value to pixels
    public static int getPixelsFromDPs(Activity activity, int dps) {
        Resources r = activity.getResources();
        int px = (int) (TypedValue.applyDimension(
                TypedValue.COMPLEX_UNIT_DIP, dps, r.getDisplayMetrics()));
        return px;
    }

}
