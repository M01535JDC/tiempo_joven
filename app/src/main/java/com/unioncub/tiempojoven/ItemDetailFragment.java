package com.unioncub.tiempojoven;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.appbar.CollapsingToolbarLayout;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import com.unioncub.tiempojoven.dummy.DummyContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link ItemListActivity}
 * in two-pane mode (on tablets) or a {@link ItemDetailActivity}
 * on handsets.
 */
public class ItemDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The dummy content this fragment is presenting.
     */
    private DummyContent.DummyItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ItemDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the dummy content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = DummyContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(mItem.content);
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.item_detail, container, false);
        Button enviar;

        // Show the dummy content as text in a TextView.
        if (mItem != null) {
           // TextView text = rootView.findViewById(R.id.item_detail);
            switch (mItem.details) {
                case 1:
                    rootView =inflater.inflate(R.layout.fragment_lec1,container,false);
                    enviar= rootView.findViewById(R.id.l1_send_btn);
                    enviar.setOnClickListener(v -> EnviarRP(respuesta(1),"1"));

                break;
                case 2:
                    rootView =inflater.inflate(R.layout.fragment_lec2,container,false);
                    enviar=rootView.findViewById(R.id.l2_send_btn);
                    enviar.setOnClickListener(v -> EnviarRP(respuesta(2),"2"));
                    return rootView;
                case 3:
                    rootView =inflater.inflate(R.layout.fragment_lec3,container,false);
                    enviar=rootView.findViewById(R.id.l3_send_btn);
                    enviar.setOnClickListener(v -> EnviarRP(respuesta(mItem.details),""+mItem.details));
                    break;
                case 4:
                    rootView =inflater.inflate(R.layout.fragment_lec4,container,false);
                    enviar=rootView.findViewById(R.id.l4_send_btn);
                    enviar.setOnClickListener(v -> EnviarRP(respuesta(mItem.details),""+mItem.details));
                    break;
                case 5:
                    rootView =inflater.inflate(R.layout.fragment_lec5,container,false);
                    enviar=rootView.findViewById(R.id.l5_send_btn);
                    enviar.setOnClickListener(v -> EnviarRP(respuesta(mItem.details),""+mItem.details));
                    break;
                case 6:
                    rootView =inflater.inflate(R.layout.fragment_lec6,container,false);
                    break;
                case 7:
                    rootView =inflater.inflate(R.layout.fragment_lec7,container,false);
                    break;
                case 8:
                    rootView =inflater.inflate(R.layout.fragment_lec8,container,false);
                    break;
                case 9:
                    rootView =inflater.inflate(R.layout.fragment_lec9,container,false);
                    break;
                case 10:
                    rootView =inflater.inflate(R.layout.fragment_lec10,container,false);
                    break;
                case 11:
                    rootView =inflater.inflate(R.layout.fragment_lec11,container,false);
                    break;
                case 12:
                    rootView =inflater.inflate(R.layout.fragment_lec12_,container,false);
                    break;
            }
            }


       return rootView;
    }
    String respuesta(int id) {
        String a="";
        switch (id){
            case 1:
                TextView r1= getActivity().findViewById(R.id.C1_R1);
                TextView r2= getActivity().findViewById(R.id.C1_R2);
                TextView r3= getActivity().findViewById(R.id.C1_R3);
                TextView r4= getActivity().findViewById(R.id.C1_R4);
                a="P1: "+getString(R.string.C1_P1)+"\n R1: "+strFrom(r1)+"\n P2: "+getString(R.string.C1_P2)+"\n R2: "+strFrom(r2)+"\n P3: "+getString(R.string.C1_P3)+"\n R3: "+strFrom(r3)+"\n P4:"+getString(R.string.C1_P4)+"\n R4: "+strFrom(r4);
                break;
            case 2:
                TextView r2_1 =getActivity().findViewById(R.id.C2_R1);
                TextView r2_2 =getActivity().findViewById(R.id.C2_R2);
                TextView r2_3 =getActivity().findViewById(R.id.C2_R3);
                TextView r2_4 =getActivity().findViewById(R.id.C2_R4);
                TextView r2_5 =getActivity().findViewById(R.id.C2_R5);
                TextView r2_6 =getActivity().findViewById(R.id.C2_R6);
                TextView r2_7 =getActivity().findViewById(R.id.C2_R7);
                TextView r2_8 =getActivity().findViewById(R.id.C2_R8);
                a="P1: "+getString(R.string.C2_P1)+"\n R1: "+strFrom(r2_1)+"\n P2: "+getString(R.string.C2_P2)+"\n R2: "+strFrom(r2_2)+"\n P3: "+getString(R.string.C2_P3)+"\n R3: "+strFrom(r2_3)+"\n P4: "+getString(R.string.C2_P4)+"\n R4: "+strFrom(r2_4)+"\n P5: "+getString(R.string.C2_P5)+"\n R5: "+strFrom(r2_5)+"\n P6: "+getString(R.string.C2_P6)+"\n R6: "+strFrom(r2_6)+"\n P7: "+getString(R.string.C2_P7)+"\n R7: "+strFrom(r2_7)+"\n P8: "+getString(R.string.C2_P8)+"\n R8: "+strFrom(r2_8);
                break;
            case 3:
                TextView r3_1 =getActivity().findViewById(R.id.C3_R1);
                TextView r3_2 =getActivity().findViewById(R.id.C3_R2);
                TextView r3_4 =getActivity().findViewById(R.id.C3_R4);
                TextView r3_5 =getActivity().findViewById(R.id.C3_R5);
                TextView r3_6 =getActivity().findViewById(R.id.C3_R6);
                TextView r3_7 =getActivity().findViewById(R.id.C3_R7);
                CheckBox r3_8 =getActivity().findViewById(R.id.checkBox22);
                CheckBox r3_9 =getActivity().findViewById(R.id.checkBox23);
                CheckBox r3_10 =getActivity().findViewById(R.id.checkBox24);
                CheckBox r3_11 =getActivity().findViewById(R.id.checkBox25);
                //TODO: chkBox not working properly
                a="P1: "+getString(R.string.C3_P1)+"\n R1: "+strFrom(r3_1)+ "\n"+"P2: "+getString(R.string.C3_P2)+"\n R2: "+strFrom(r3_2)+ "\n"+"P3: "+getString(R.string.C3_P4)+"\n R3: "+strFrom(r3_4)+ "\n"+"P4: "+getString(R.string.C3_P5)+"\n R4: "+strFrom(r3_5)+ "\n"+"P5: "+getString(R.string.C3_P6)+"\n R5: "+strFrom(r3_6)+ "\n"+"P6: "+getString(R.string.C3_P7)+"\n R6: "+strFrom(r3_7)+ "\n"+"P7: "+getString(R.string.C3_P8)+"\n R7: "+chkBox(r3_8)+"\n"+chkBox(r3_9)+"\n"+chkBox(r3_10)+"\n"+chkBox(r3_11)+"\n";
                break;
            case 4:
                TextView r4_1 =getActivity().findViewById(R.id.C4_R1);
                TextView r4_2 =getActivity().findViewById(R.id.C4_R2);
                TextView r4_3 =getActivity().findViewById(R.id.C4_R3);
                TextView r4_4 =getActivity().findViewById(R.id.C4_R4);
                TextView r4_5 =getActivity().findViewById(R.id.C4_R5);
                TextView r4_6 =getActivity().findViewById(R.id.C4_R6);
                TextView r4_7 =getActivity().findViewById(R.id.C4_R7);
                TextView r4_8 =getActivity().findViewById(R.id.C4_R8);
                TextView r4_9 =getActivity().findViewById(R.id.C4_R9);
                TextView r4_10 =getActivity().findViewById(R.id.C4_R10);
                a= "P1: "+getString(R.string.C4_P1)+"\n R1: "+strFrom(r4_1)+"\n P2: "+getString(R.string.C4_P2)+"\n R2: "+strFrom(r4_2)+"\n P3: "+getString(R.string.C4_P3)+"\n R3: "+strFrom(r4_3)+"\n P4: "+getString(R.string.C4_P4)+"\n R4: "+strFrom(r4_4)+"\n P5: "+getString(R.string.C4_P5)+"\n R5: "+strFrom(r4_5)+"\n P6: "+getString(R.string.C4_P6)+"\n R6: "+strFrom(r4_6)+"\n P7: "+getString(R.string.C4_P7)+"\n R7: "+strFrom(r4_7)+"\n P8: "+getString(R.string.C4_P8)+"\n R8: "+strFrom(r4_8)+"\n P9: "+getString(R.string.C4_P9)+"\n R9: "+strFrom(r4_9)+"\n P10: "+getString(R.string.C4_P10)+"\n R10: "+strFrom(r4_10);
                break;
            case 5:
                TextView r5_1=getActivity().findViewById(R.id.C5_R1);
                TextView r5_2=getActivity().findViewById(R.id.C5_R2);
                TextView r5_3=getActivity().findViewById(R.id.C5_R3);
                TextView r5_4=getActivity().findViewById(R.id.C5_R4);
                TextView r5_5=getActivity().findViewById(R.id.C5_R5);
                TextView r5_6=getActivity().findViewById(R.id.C5_R6);
                a= "P1: "+getString(R.string.C5_P1)+"\n R1: "+strFrom(r5_1)+"\n P2: "+getString(R.string.C5_P2)+"\n R2: "+strFrom(r5_2)+"\n P3: "+getString(R.string.C5_P3)+"\n R3: "+strFrom(r5_3)+"\n P4: "+getString(R.string.C5_P4)+"\n R4: "+strFrom(r5_4)+"\n P5: "+getString(R.string.C5_P5)+"\n R5: "+strFrom(r5_5)+"\n P6: "+getString(R.string.C5_P6)+"\n R6: "+strFrom(r5_6);
                break;
            case 6:
                TextView r6_1=getActivity().findViewById(R.id.C6_R1);
                //TODO: Complete Lec6 answers
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            default:
                Log.d("test", "Function: def");
                break;

        }
        return a;

    }
    String strFrom(TextView text){
        return text.getText().toString();
    }

    //TODO: chkBox not working properly
    String chkBox(CheckBox check){
        String a="";
        String texto=check.getText().toString();
        if (check.isActivated()){
            return texto;
        }
        else{
        return a;
        }
    }


    void EnviarRP(String respuesta, String leccion){
        Intent intent = new Intent(android.content.Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Tiempo Joven Lección "+leccion );
        intent.putExtra(android.content.Intent.EXTRA_TEXT, respuesta);
        startActivity(Intent.createChooser(intent, "Compartir Respuestas"));
    }
}