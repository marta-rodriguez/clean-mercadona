package marta.rodriguez.mercadonaapp.mercadona.ui;

import android.os.Bundle;

import butterknife.ButterKnife;
import marta.rodriguez.mercadonaapp.mercadona.R;
import marta.rodriguez.mercadonaapp.mercadona.ui.fragments.SupermarketsMapFragment;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getIntent().setAction(MainActivity.class.getCanonicalName());

        ButterKnife.bind(this);

        initToolbar();
        setupDrawerLayout();

        getFragmentManager().beginTransaction()
                .add(R.id.content, SupermarketsMapFragment.newInstance(null))
                .commit();
    }

}
