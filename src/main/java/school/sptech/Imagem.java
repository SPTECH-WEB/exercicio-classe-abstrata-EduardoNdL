package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Imagem {
    private List<Figura> figuras;

    public Imagem() {
        this.figuras = new ArrayList<>();
    }

    public void adicionar(Figura figura){
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas(){
        Double soma = 0.0;
        for(Figura f : figuras){
            soma += f.calcularArea();
        }
        return soma;
    }

    public List<Figura> buscarPorAreaMaiorQue20(){
        List<Figura> figEncontradas = new ArrayList<>();
        for(Figura f : figuras){
            if(f.calcularArea() > 20){
                figEncontradas.add(f);
            }
        }
        return figEncontradas;
    }

    public List<Figura> buscarQuadrados(){
        List<Figura> quadradosEncontrados = new ArrayList<>();
        for(Figura f : figuras){
            if(f instanceof Quadrado){
                quadradosEncontrados.add(f);
            }
        }
        return quadradosEncontrados;
    }
}
