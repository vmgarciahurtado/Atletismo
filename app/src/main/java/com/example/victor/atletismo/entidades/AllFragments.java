package com.example.victor.atletismo.entidades;

import com.example.victor.atletismo.fragments.ConsultarAtletas;
import com.example.victor.atletismo.fragments.PantallaPrincipal;
import com.example.victor.atletismo.fragments.RegistroAtletas;

public interface AllFragments extends ConsultarAtletas.OnFragmentInteractionListener,
        RegistroAtletas.OnFragmentInteractionListener,
        PantallaPrincipal.OnFragmentInteractionListener {
}
