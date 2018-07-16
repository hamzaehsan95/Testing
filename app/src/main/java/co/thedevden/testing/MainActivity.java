package co.thedevden.testing;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.yahoo.mobile.client.android.util.rangeseekbar.RangeSeekBar;


public class MainActivity extends AppCompatActivity {


    TextView textView;
    int progres =0 ;

    RangeSeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //rangeBar = (com.appyvet.rangebar.RangeBar) findViewById(R.id.rangebar);
        textView =(TextView) findViewById(R.id.tv);

        seekBar = (RangeSeekBar) findViewById(R.id.rangebar);

        seekBar.setRangeValues(0, 100000);


        seekBar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener<Integer>() {
            @Override
            public void onRangeSeekBarValuesChanged(RangeSeekBar<?> bar, Integer minValue, Integer maxValue) {

                Toast.makeText(getApplicationContext(), minValue + "-" + maxValue, Toast.LENGTH_LONG).show();

                progres =minValue;

                seekBar.setSelectedMaxValue(100000);

                textView.setText(progres+" ");


            }
        });

        //This is my branch one modified

        seekBar.setNotifyWhileDragging(true);
    }

    //Hello World
}
