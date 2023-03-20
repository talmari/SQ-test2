import net.sf.javaml.clustering.Clusterer;
import net.sf.javaml.clustering.Cobweb;
import net.sf.javaml.core.Dataset;
import java.io.File;
import net.sf.javaml.clustering.KMeans;
import net.sf.javaml.clustering.FarthestFirst;
import static net.sf.javaml.tools.data.FileHandler.loadDataset;
public class goodclusters {
    public static void main(String[] args) throws Exception{
        /* Load a dataset */
        Dataset data = loadDataset(new File("C:\\Users\\talma\\IdeaProjects\\SQ-test2\\src\\iris.data"), 4, ",");
        /* Create a new instance of the KMeans algorithm, with no options
         * specified. By default, this will generate 4 clusters. */
        Clusterer km = new KMeans();
        /* Cluster the data, it will be returned as an array of data sets, with
         * each dataset representing a cluster. */
        Dataset[] kmclusters = km.cluster(data);
        System.out.println("KMeans Clusters: " + kmclusters);

        /* Create a new instance of the KMeans algorithm, with no options
         * specified. By default, this will generate 4 clusters. */
        Clusterer FF = new FarthestFirst();
        /* Cluster the data, it will be returned as an array of data sets, with
         * each dataset representing a cluster. */
        Dataset[] FFclusters = FF.cluster(data);
        System.out.println("FF Clusters: " + FFclusters);

        /* Create a new instance of the KMeans algorithm, with no options
         * specified. By default, this will generate 4 clusters. */
        Clusterer CW = new Cobweb();
        /* Cluster the data, it will be returned as an array of data sets, with
         * each dataset representing a cluster. */
        Dataset[] CWclusters = CW.cluster(data);
        System.out.println("cw Clusters: " + CWclusters);
    }
}
