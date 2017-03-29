/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

    import java.io.File;
    import java.io.IOException;
    import javax.swing.JPanel;

    import org.jfree.chart.ChartFactory;
    import org.jfree.chart.ChartPanel;
    import org.jfree.chart.ChartUtilities;
    import org.jfree.chart.JFreeChart;
    import org.jfree.chart.plot.PlotOrientation;
    import org.jfree.chart.plot.XYPlot;
    import org.jfree.chart.renderer.xy.XYBarRenderer;
    import org.jfree.data.statistics.HistogramDataset;
    import org.jfree.data.xy.IntervalXYDataset;
    import org.jfree.ui.ApplicationFrame;
    import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Naiane
 */
public class Histograma extends ApplicationFrame{
    


        public Histograma(String title) {
            super(title);
            JPanel chartPanel = crearPanel();
            chartPanel.setPreferredSize(new java.awt.Dimension(500, 475));
            setContentPane(chartPanel);
        }

        private static IntervalXYDataset crearDataset() {
            //guarda os dados do histograma
            HistogramDataset dados = new HistogramDataset();
            int classes, min,max;
            
            //valores da amos
            //double amostra[] = {7,8,9,10,10,10.2,10.8,11,12,12};
            double amostra[] = {89,85,93,81,77,83,87,81,83,89,81,86,80,84,82};
            if(amostra.length<=25){
                classes = 5;
            }else{
                classes =(int) Math.round(Math.sqrt(amostra.length));
            }        
            
            dados.addSeries("Frequências da Amostra", amostra, classes,77, 95);
            return dados;
        }

        private static JFreeChart crearChart(IntervalXYDataset dataset) {
            JFreeChart chart = ChartFactory.createHistogram(
                    "Histograma",
                    null,
                    null,
                    dataset,
                    PlotOrientation.VERTICAL,
                    true,
                    true,
                    false);
            XYPlot plot = (XYPlot) chart.getPlot();
            XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
            renderer.setDrawBarOutline(true);
            return chart;
        }

        public static JPanel crearPanel() {
            JFreeChart chart = crearChart(crearDataset());
            return new ChartPanel(chart);
        }

        public static void main(String[] args) throws IOException {
            Histograma histo = new Histograma("Histograma");
            histo.pack();
            RefineryUtilities.centerFrameOnScreen(histo);
            histo.setVisible(true);
        }
}

