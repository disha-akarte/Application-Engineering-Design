/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import business.VitalSign;
import business.VitalSignHistory;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.XYPlot;
import org.jfree.chart.renderer.xy.XYLineAndShapeRenderer;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author SONY
 */
public class Chart extends JFrame {

    private VitalSignHistory vSHistory;

    public Chart(VitalSignHistory vSHistory) {
        this.vSHistory = vSHistory;
        JPanel chartPanel = createChartPanel();
        add(chartPanel, BorderLayout.CENTER);
        setSize(500,500);
        setLocationRelativeTo(null);

    }

    private XYDataset createDataset() {
        XYSeriesCollection dataset = new XYSeriesCollection();
        XYSeries series;

        List<VitalSign> vsl = vSHistory.getVSHistory();
        double i = 1.0;
        for (int j = 0; j < vsl.size(); j++) {
            VitalSign vs = vsl.get(j);
            series = new XYSeries("Vital Sign " + j);
            series.add(i, vs.getRespRate());
            series.add(i + 0.2, vs.getHeartRate());
            series.add(i + 0.4, vs.getBloodPressure());
            series.add(i + 0.6, vs.getWeight());
            dataset.addSeries(series);
        }
        return dataset;

    }

    private JPanel createChartPanel() {
        String title = "Vital Sign Chart";
        XYDataset dataset = createDataset();
        JFreeChart chart = ChartFactory.createXYLineChart(title,
                "Vital Signs", "Values", dataset);
        XYPlot plot = chart.getXYPlot();
        XYLineAndShapeRenderer renderer = new XYLineAndShapeRenderer();
        plot.setRenderer(renderer);
        plot.setBackgroundPaint(Color.WHITE);
        return new ChartPanel(chart);

    }

}

