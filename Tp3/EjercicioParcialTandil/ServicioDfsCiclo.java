package Tp3.EjercicioParcialTandil;

import Tp3.Ejercicios1y3y7.Grafo;

import java.util.*;

public class ServicioDfsCiclo {
    
        private Grafo<?> grafo;
        private Map<Integer, String> vertices;
        private ArrayList<Integer> cicloMayor;
        private Integer origen;

    public ServicioDfsCiclo(Grafo<?> grafo) {
        this.grafo = grafo;
        this.vertices = new HashMap<>();
        this.cicloMayor = new ArrayList<>();
    }

        public List<Integer> dfsForest() {
        blanquear();
        for (Integer v : this.vertices.keySet()) {
            blanquear();
            if (vertices.get(v).equals("blanco")) {
                this.origen = v;
                ArrayList<Integer> list_dfs = this.dfs_visit(v);
                if (list_dfs.size() > this.cicloMayor.size()) {
                    this.cicloMayor.clear();
                    this.cicloMayor.addAll(list_dfs);
                }
            }
        }
        return this.cicloMayor;
    }

        private ArrayList<Integer> dfs_visit(Integer v) {
        this.vertices.put(v, "amarillo");
        Iterator<Integer> adyacentes = this.grafo.obtenerAdyacentes(v);
        ArrayList<Integer> aux = new ArrayList<>();
        aux.add(v);
        while (adyacentes.hasNext()) {
            int x = adyacentes.next();
            if (this.vertices.get(x).equals("blanco")) {
                ArrayList<Integer> resp = this.dfs_visit(x);
                if (!resp.isEmpty()) {
                    aux.addAll(resp);
                    return aux;
                }
            } else {
                if(x == this.origen) {
                    aux.add(x);
                    return aux;
                }
            }
        }
        return new ArrayList<>();
    }

        public void blanquear() {
        Iterator<Integer> aux = this.grafo.obtenerVertices();
        while (aux.hasNext()) {
            this.vertices.put(aux.next(), "blanco");
        }
    }

}
