package problemmultilayer.mapbox.com.mapboxmultilayerproblemexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mapbox.mapboxsdk.constants.Style;
import com.mapbox.mapboxsdk.maps.MapboxMapOptions;
import com.mapbox.mapboxsdk.maps.SupportMapFragment;

/**
 * Created by konstantinaksenov on 27.01.17.
 */

public class SecondFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.second_fragment_layout, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment smf = SupportMapFragment.newInstance(new MapboxMapOptions().styleUrl(Style.LIGHT));
        getChildFragmentManager().beginTransaction().add(R.id.map_container, smf).commit();
    }
}
