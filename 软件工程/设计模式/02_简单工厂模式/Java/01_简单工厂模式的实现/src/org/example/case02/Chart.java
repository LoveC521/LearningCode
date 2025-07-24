package org.example.case02;

public abstract class Chart {
    public static Chart createChart(String type) {
        Chart chart;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
        }else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
        }else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
        }else {
            throw new IllegalArgumentException("Unsupported chart type: " + type);
        }

        return chart;
    }

    public abstract void display();
}
