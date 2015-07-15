package com.gulci.essentialfrag;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gulci.essentialfrag.data.Flower;
import com.gulci.essentialfrag.data.FlowerData;

import java.util.List;


public class FirstFragment extends ListFragment {

    List<Flower> flowers = new FlowerData().getFlowers();

    public FirstFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FlowerArrayAdapter adapter = new FlowerArrayAdapter(getActivity(),
                R.layout.flower_listitem,
                flowers);

        setListAdapter(adapter);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_first, container, false);
        return rootView;
    }
}
