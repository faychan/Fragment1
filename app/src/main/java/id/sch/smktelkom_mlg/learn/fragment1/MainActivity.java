package id.sch.smktelkom_mlg.learn.fragment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etName;
    EditText etUmur;
    TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = (EditText) findViewById(R.id.editTextName);
        etUmur = (EditText) findViewById(R.id.editTextUmur);
        tvHasil = (TextView) findViewById(R.id.textViewHasil);

        findViewById(R.id.bProses)
                .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doProcess();
            }
        });
    }

    private void doProcess() {
        tvHasil.setText(etName.getText().toString()
                +"("+etUmur.getText().toString()+" tahun)");
    }
}
