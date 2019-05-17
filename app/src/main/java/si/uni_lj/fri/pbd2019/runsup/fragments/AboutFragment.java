package si.uni_lj.fri.pbd2019.runsup.fragments;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import si.uni_lj.fri.pbd2019.runsup.Constant;
import si.uni_lj.fri.pbd2019.runsup.R;

import static android.content.Context.MODE_PRIVATE;
import static si.uni_lj.fri.pbd2019.runsup.MainActivity.STATE_PREF_NAME;

public class AboutFragment extends Fragment {

    // ### PROPERTIES ###

    private SharedPreferences preferences;

    // ### /PROPERTIES ###

    // onCreateView: method called when view is to be created.
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        setHasOptionsMenu(true);  // Fragment has an options menu.

        // Get shared preferences.
        this.preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        return inflater.inflate(R.layout.fragment_about, parent, false);
    }

}
