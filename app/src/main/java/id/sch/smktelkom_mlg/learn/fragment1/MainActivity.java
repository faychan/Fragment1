package id.sch.smktelkom_mlg.learn.fragment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
        implements InputFragment.IListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void doProses(String name, String age) {
        OutputFragment fragOut =
                (OutputFragment) getSupportFragmentManager()
                .findFragmentById(R.id.fragmentOutput);
        fragOut.doProses(name, age);
    }
}
