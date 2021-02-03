package com.example.fractals.fractalsapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomepagePortraitFragment extends Fragment {


    private OnFragmentInteractionListener mListener;

    public HomepagePortraitFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_homepage_portrait, container, false);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
         if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }

    public void goToTutorial(View view) {
        Intent intent = new Intent(getContext(), TutorialActivity.class);
        startActivity(intent);
    }
    public void findMoreInfo(View view) {
        Intent intent = new Intent(getContext(), ViewMoreWebviewActivity.class);
        startActivity(intent);
    }
    public void takeTheQuiz(View view) {
        Intent intent = new Intent(getContext(), QuizActivity.class);
        startActivity(intent);
    }

}
