package com.example.appvacaciones;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        ListView lvDestinos = view.findViewById(R.id.lv_destinos);

        List<Destino> lista = new ArrayList<>();
        lista.add(new Destino(
                "Punta Cana",
                "República Dominicana",
                "Plan 5 Días / 4 Noches",
                "$ 2.800.000",
                R.drawable.punta_cana
        ));
        lista.add(new Destino(
                "Eje Cafetero",
                "Quindío, Colombia",
                "Plan 4 Días / 3 Noches",
                "$ 1.250.000",
                R.drawable.eje_cafetero
        ));
        lista.add(new Destino(
                "San Andrés",
                "Caribe, Colombia",
                "Plan 4 Días / 3 Noches",
                "$ 1.950.000",
                R.drawable.san_andres
        ));
        lista.add(new Destino(
                "Cancún",
                "Quintana Roo, México",
                "Plan 6 Días / 5 Noches",
                "$ 3.400.000",
                R.drawable.cancun
        ));
        lista.add(new Destino(
                "Cartagena de Indias",
                "Bolívar, Colombia",
                "Plan 3 Días / 2 Noches",
                "$ 980.000",
                R.drawable.cartagena
        ));

        DestinoAdapter adapter = new DestinoAdapter(requireContext(), lista);
        lvDestinos.setAdapter(adapter);

        return view;
    }
}