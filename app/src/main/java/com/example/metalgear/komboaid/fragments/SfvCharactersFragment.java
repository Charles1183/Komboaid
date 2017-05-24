package com.example.metalgear.komboaid.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.metalgear.komboaid.R;
import com.example.metalgear.komboaid.fragments.sfv.*;

public class SfvCharactersFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_sfv_characters, container, false);

        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_sfv_characters, container, false);

        final Button akumaButton = (Button) layout.findViewById(R.id.akuma_button);
        final Button alexButton = (Button) layout.findViewById(R.id.alex_button);
        final Button balrogButton = (Button) layout.findViewById(R.id.balrog_button);
        final Button birdieButton = (Button) layout.findViewById(R.id.birdie_button);
        final Button bisonButton = (Button) layout.findViewById(R.id.bison_button);
        final Button cammyButton = (Button) layout.findViewById(R.id.cammy_button);
        final Button chunButton = (Button) layout.findViewById(R.id.chunli_button);
        final Button dhalButton = (Button) layout.findViewById(R.id.dhalism_button);
        final Button fangButton = (Button) layout.findViewById(R.id.fang_button);
        final Button guileButton = (Button) layout.findViewById(R.id.guile_button);
        final Button ibukiButton = (Button) layout.findViewById(R.id.ibuki_button);
        final Button juriButton = (Button) layout.findViewById(R.id.juri_button);
        final Button karinButton = (Button) layout.findViewById(R.id.karin_button);
        final Button kenButton = (Button) layout.findViewById(R.id.ken_button);
        final Button kolinButton = (Button) layout.findViewById(R.id.kolin_button);
        final Button lauraButton = (Button) layout.findViewById(R.id.laura_button);
        final Button nashButton = (Button) layout.findViewById(R.id.nash_button);
        final Button necalButton = (Button) layout.findViewById(R.id.necal_button);
        final Button rashidButton = (Button) layout.findViewById(R.id.rashid_button);
        final Button mikaButton = (Button) layout.findViewById(R.id.mika_button);
        final Button ryuButton = (Button) layout.findViewById(R.id.ryu_button);
        final Button urienButton = (Button) layout.findViewById(R.id.urien_button);
        final Button vegaButton = (Button) layout.findViewById(R.id.vega_button);
        final Button zangButton = (Button) layout.findViewById(R.id.zang_button);

        akumaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AkumaMatchUpFragment akumaMatchUpFragment = new AkumaMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, akumaMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        alexButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                AlexMatchUpFragment alexMatchUpFragment = new AlexMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, alexMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        balrogButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BalrogMatchUpFragment balrogMatchUpFragment = new BalrogMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, balrogMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        birdieButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BirdieMatchUpFragment birdieMatchUpFragment = new BirdieMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, birdieMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        bisonButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                BisonMatchUpFragment bisonMatchUpFragment = new BisonMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, bisonMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        cammyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                CammyMatchUpFragment cammyMatchUpFragment = new CammyMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, cammyMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        chunButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ChunLiMatchUpFragment chunLiMatchUpFragment = new ChunLiMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, chunLiMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        dhalButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DhalsimMatchUpFragment dhalsimMatchUpFragment = new DhalsimMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, dhalsimMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        fangButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                FangMatchUpFragment fangMatchUpFragment = new FangMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, fangMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        guileButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                GuileMatchUpFragment guileMatchUpFragment = new GuileMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, guileMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        ibukiButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                IbukiMatchUpFragment ibukiMatchUpFragment = new IbukiMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, ibukiMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        juriButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                JuriMatchUpFragment juriMatchUpFragment = new JuriMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, juriMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        karinButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                KarinMatchUpFragment karinMatchUpFragment = new KarinMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, karinMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        kenButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                KenMatchUpFragment kenMatchUpFragment = new KenMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, kenMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        kolinButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                KolinMatchUpFragment kolinMatchUpFragment = new KolinMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, kolinMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        lauraButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                LauraMatchUpFragment lauraMatchUpFragment = new LauraMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, lauraMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        nashButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                NashMatchUpFragment nashMatchUpFragment = new NashMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, nashMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        necalButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                NecalliMatchUpFragment necalliMatchUpFragment = new NecalliMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, necalliMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        rashidButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                RashidMatchUpFragment rashidMatchUpFragment = new RashidMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, rashidMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        mikaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                RMikaMatchUpFragment rMikaMatchUpFragment = new RMikaMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, rMikaMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        ryuButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                RyuMatchUpFragment ryuMatchUpFragment = new RyuMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, ryuMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        urienButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                UrienMatchUpFragment urienMatchUpFragment = new UrienMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, urienMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        vegaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                VegaMatchUpFragment vegaMatchUpFragment = new VegaMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, vegaMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        zangButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //Removes all fragments form the content container in content_locations.xml
                //Place this line of code before adding a new fragment into the container
                //getFragmentManager().beginTransaction().remove(getFragmentManager().findFragmentById(R.id.content)).commit();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                ZangiefMatchUpFragment zangiefMatchUpFragment = new ZangiefMatchUpFragment();
                fragmentTransaction.replace(R.id.table_content, zangiefMatchUpFragment);
                fragmentTransaction.commit();


            }
        });

        return layout;

    }

}
