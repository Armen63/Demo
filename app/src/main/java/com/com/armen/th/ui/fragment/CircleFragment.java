package com.com.armen.th.ui.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.com.armen.th.R;
import com.com.armen.th.db.pojo.Country;
import com.com.armen.th.db.provider.DataProvider;
import com.com.armen.th.ui.activity.CountryActivity;
import com.com.armen.th.ui.adapter.CountryFlagCircleAdapter;

import am.andranik.semicirclelayoutmanger.SemiCircularLayoutManager;

/**
 * A simple {@link Fragment} subclass.
 */
public class CircleFragment extends Fragment implements CountryFlagCircleAdapter.DecoratedViewHolder.OnItemSelectedListener {

    // ===========================================================
    // Constants
    // ===========================================================

    private static final String LOG_TAG = CircleFragment.class.getSimpleName();

    // ===========================================================
    // Fields
    // ===========================================================

    private RecyclerView rvCircle;
    private CountryFlagCircleAdapter adapter;
    private SemiCircularLayoutManager layoutManager;

    public static CircleFragment newInstance() {
        return new CircleFragment();
    }
    // ===========================================================
    // Constructors
    // ===========================================================

    public CircleFragment() {
    }

    // ===========================================================
    // Getter & Setter
    // ===========================================================

    // ===========================================================
    // Methods for/from SuperClass
    // ===========================================================

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_decorated_mode, container, false);
        rvCircle = view.findViewById(R.id.carousel_rv);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initAndSet();
    }

    private void initAndSet() {
        adapter = new CountryFlagCircleAdapter(DataProvider.getCountries(), this);
        layoutManager = new SemiCircularLayoutManager(rvCircle, true);

        rvCircle.setLayoutManager(layoutManager);
        rvCircle.setAdapter(adapter);
    }


    // ===========================================================
    // Listeners, methods for/from Interfaces
    // ===========================================================

    // ===========================================================
    // Methods
    // ===========================================================

    @Override
    public void onItemSelected(Country item) {
        item.setSelected(true);
        adapter.notifyDataSetChanged();
        Intent data = new Intent(getContext(), CountryActivity.class);
        data.putExtra("COUNTRY_NAME", item.getName());
        startActivity(data);
        item.setSelected(false);


    }
}
