/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
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
public class Histograma extends ApplicationFrame {

    URL url = this.getClass().getResource("/img/X32.png");
    Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url);
    static ArrayList<Double> amostra;
    static double min, max;

    public void setTitulo(Image iconeTitulo) {
        this.setIconImage(iconeTitulo);
    }

    /**
     *
     * @param amostra
     */
    public Histograma(ArrayList<Double> amostra, double min, double max) {
        super("Histograma");
        this.amostra = amostra;
        this.min = min;
        this.max = max;

        //Atribuir gráfico ao JPanel
        JPanel panelHist = preencherPanel();
        panelHist.setPreferredSize(new java.awt.Dimension(500, 475));
        setContentPane(panelHist);

        //Visibilidade da tela
        this.pack();
        RefineryUtilities.centerFrameOnScreen(this);
        this.setVisible(true);

        //Adicionando ícone
        setIconImage(iconeTitulo);
    }

    public static JPanel preencherPanel() {
        //Atribuir gráfico ao JPanel
        JFreeChart chart = gerarGrafico(criarDataset());
        return new ChartPanel(chart);
    }

    private static IntervalXYDataset criarDataset() {
        //guarda os dados do histograma
        HistogramDataset dados = new HistogramDataset();
        int classes;
        double valores[] = new double[amostra.size()];

        //Definindo quantidade de classes
        if (amostra.size() <= 25) {
            classes = 5;
        } else {
            classes = (int) Math.round(Math.sqrt(amostra.size()));
        }
        //Criando vetor com valores da amostra
        for (int i = 0; i < amostra.size(); i++) {
            valores[i] = amostra.get(i);
        }

        //Adicionando os dataset para o histograma
        dados.addSeries("Frequência das Amostras", valores, classes, min, max);
        return dados;
    }

    private static JFreeChart gerarGrafico(IntervalXYDataset dados) {
        JFreeChart chart = ChartFactory.createHistogram(
                "Histograma",
                null,
                null,
                dados,
                PlotOrientation.VERTICAL,
                true,
                true,
                false);
        XYPlot plot = (XYPlot) chart.getPlot();
        XYBarRenderer renderer = (XYBarRenderer) plot.getRenderer();
        renderer.setDrawBarOutline(true);
        return chart;
    }

}
