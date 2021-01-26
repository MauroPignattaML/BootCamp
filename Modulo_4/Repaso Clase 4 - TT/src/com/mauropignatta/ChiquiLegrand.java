package com.mauropignatta;

import com.mauropignatta.fuegosArtificiales.FuegoArtificial;
import com.mauropignatta.invitado.Invitado;

import java.util.List;

public class ChiquiLegrand {

    public static void soplarVelas(List<Invitado> invitados, List<FuegoArtificial> fuegosArtificiales){
        for(FuegoArtificial f : fuegosArtificiales){
            f.explotar();
        }

        for(Invitado i : invitados){
            i.celebrar();
        }
    }

}
