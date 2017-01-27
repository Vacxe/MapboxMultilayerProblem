package problemmultilayer.mapbox.com.mapboxmultilayerproblemexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mapbox.mapboxsdk.MapboxAccountManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MapboxAccountManager.start(this, "pk.eyJ1IjoidmFjeGUiLCJhIjoiY2lmNm51djhoMDA3NXRtbTAyczRxMXBzOSJ9.fsYPDRGLsY0gE9cwo5k59Q");
        getSupportFragmentManager().beginTransaction().add(R.id.layout_frame, new FirstFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.layout_frame, new SecondFragment()).commit();
    }
}
