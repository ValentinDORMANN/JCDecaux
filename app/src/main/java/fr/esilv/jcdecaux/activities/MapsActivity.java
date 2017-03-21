package fr.esilv.jcdecaux.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import fr.esilv.jcdecaux.R;
import fr.esilv.jcdecaux.models.Station;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private static final String POSITION = "POSITION";
    private static final String NAME = "NAME";
    private GoogleMap mMap;
    private Station.Position coordinates;
    private String stationName;

    public static void start(Context context, Station.Position station, String name) {
        Intent intent = new Intent(context, MapsActivity.class);
        intent.putExtra(POSITION, station);
        intent.putExtra(NAME, station);
        context.startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        coordinates = (Station.Position) bundle.getSerializable(POSITION);
        stationName = bundle.getString(NAME);

        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(coordinates.getLat(), coordinates.getLng());
        mMap.addMarker(new MarkerOptions().position(sydney).title(stationName));
        mMap.setBuildingsEnabled(true);
        mMap.setMaxZoomPreference(1000);
        mMap.setMinZoomPreference(50);
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }
}
