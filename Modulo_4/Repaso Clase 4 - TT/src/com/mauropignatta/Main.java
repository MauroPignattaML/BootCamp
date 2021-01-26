package com.mauropignatta;

import com.mauropignatta.fuegosArtificiales.FuegoArtificalPack;
import com.mauropignatta.fuegosArtificiales.FuegoArtificial;
import com.mauropignatta.invitado.Invitado;
import com.mauropignatta.invitado.InvitadoMeLi;
import com.mauropignatta.invitado.InvitadoStandard;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<FuegoArtificial> fuegos = new ArrayList<>();
        fuegos.add(new FuegoArtificial());
        fuegos.add(new FuegoArtificalPack(5));

        List<Invitado> invitados = new ArrayList<>();
        invitados.add(new InvitadoMeLi());
        invitados.add(new InvitadoMeLi());
        invitados.add(new InvitadoMeLi());
        invitados.add(new InvitadoStandard());
        invitados.add(new InvitadoStandard());
        invitados.add(new InvitadoStandard());

        ChiquiLegrand.soplarVelas(invitados, fuegos);
    }
}
