package main.java.network.generic;

import java.math.BigDecimal;
import main.java.maps.Computable;
import main.java.maps.Var;
import main.java.model.Model;
import main.java.statistics.Characteristics;
import main.java.statistics.Statistics;

/**
 * Le modèle du reseau. Contient le graphe et permet de faire différents relevés
 * sur le déroulement de la propagation des signaux.
 *
 * @author CARRARA Nicolas
 */
public abstract class NetworkModel extends Model implements Computable{

    @Override
    public void compute() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Var<BigDecimal> getDt() {
        // todo
        return null;
    }

    @Override
    public void setTime(BigDecimal currentTime) {
        // todo
    }

    private SpreadingGraph spreadingGraph;

    private final SpreadingGraphFactory spreadingGraphFactory;

    public NetworkModel(String name) {
        super(name);
        spreadingGraphFactory = SpreadingGraphFactory.getInstance();
    }

    /**
     * Doit initilialiser spreadingGraph
     */
    public abstract void constructGraph();

    //-----------------------  getteur/setteur ---------------------------------
    /**
     * @return the spreadingGraph
     */
    public SpreadingGraph getSpreadingGraph() {
        return spreadingGraph;
    }

    /**
     * @param spreadingGraph the spreadingGraph to set
     */
    public void setSpreadingGraph(SpreadingGraph spreadingGraph) {
        this.spreadingGraph = spreadingGraph;
    }

    /**
     * @return the spreadingGraphFactory
     */
    public SpreadingGraphFactory getSpreadingGraphFactory() {
        return spreadingGraphFactory;
    }
}
