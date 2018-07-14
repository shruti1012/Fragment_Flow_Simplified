package com.fragment.flow.organizer.utility;

import android.support.v4.app.Fragment;

import com.fragment.flow.organizer.interfaces.IOnBackPressed;


/**
 * Created by Shruti Kumari
 */
public class BaseBackHandlerFragment extends Fragment implements IOnBackPressed {

    @Override
    public boolean onBackPressed() {
        return true;
    }
}
