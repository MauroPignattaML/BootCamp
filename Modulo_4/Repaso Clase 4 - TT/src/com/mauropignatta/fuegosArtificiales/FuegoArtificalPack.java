package com.mauropignatta.fuegosArtificiales;

import java.util.ArrayList;
import java.util.List;

public class FuegoArtificalPack extends FuegoArtificial {

    private List<FuegoArtificial> pack;

    public FuegoArtificalPack(int cant) {
        pack = new ArrayList<>();
        for(int i = 0 ; i < cant; ++i) {
            pack.add(new FuegoArtificial());
        }
    }

    @Override
    public void explotar() {
        for(FuegoArtificial fa: pack)
            fa.explotar();
    }
}
