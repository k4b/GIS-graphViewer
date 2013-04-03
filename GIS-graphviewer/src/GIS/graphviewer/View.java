/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GIS.graphviewer;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.event.ChangeListener;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author karol
 */
public class View extends javax.swing.JFrame {

    /**
     * Creates new form View
     */
    public View(Model m) {
        model = m;
        initComponents();
        DefaultCaret caret = (DefaultCaret)logger.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        paramsPanel = new javax.swing.JPanel();
        controlsPanel = new javax.swing.JPanel();
        loadGraphBtn = new javax.swing.JButton();
        loadCoordBtn = new javax.swing.JButton();
        showBtn = new javax.swing.JButton();
        algBox = new javax.swing.JComboBox();
        slider = new javax.swing.JSlider();
        runBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        logger = new javax.swing.JTextArea();
        canvasPanel = new CanvasPanel(model);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Graph coloring visualiser");

        mainPanel.setBorder(null);

        sidePanel.setMaximumSize(new java.awt.Dimension(800, 800));

        javax.swing.GroupLayout paramsPanelLayout = new javax.swing.GroupLayout(paramsPanel);
        paramsPanel.setLayout(paramsPanelLayout);
        paramsPanelLayout.setHorizontalGroup(
            paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        paramsPanelLayout.setVerticalGroup(
            paramsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 69, Short.MAX_VALUE)
        );

        controlsPanel.setLayout(new java.awt.GridLayout(0, 1, 0, 5));

        loadGraphBtn.setText("Load graph");
        controlsPanel.add(loadGraphBtn);

        loadCoordBtn.setText("Load Coordinates");
        controlsPanel.add(loadCoordBtn);

        showBtn.setText("Show graph");
        controlsPanel.add(showBtn);
        controlsPanel.add(algBox);

        slider.setMaximum(1000);
        slider.setToolTipText("");
        slider.setValue(500);
        controlsPanel.add(slider);

        runBtn.setText("Run");
        controlsPanel.add(runBtn);

        exitBtn.setText("Exit");
        controlsPanel.add(exitBtn);

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
            .addComponent(paramsPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(paramsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addComponent(controlsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Logger"));

        logger.setColumns(20);
        logger.setRows(5);
        logger.setBorder(null);
        jScrollPane1.setViewportView(logger);

        canvasPanel.setBackground(javax.swing.UIManager.getDefaults().getColor("white"));
        canvasPanel.setMaximumSize(new java.awt.Dimension(1000, 1000));
        canvasPanel.setMinimumSize(new java.awt.Dimension(100, 100));
        canvasPanel.setPreferredSize(new java.awt.Dimension(800, 800));

        javax.swing.GroupLayout canvasPanelLayout = new javax.swing.GroupLayout(canvasPanel);
        canvasPanel.setLayout(canvasPanelLayout);
        canvasPanelLayout.setHorizontalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        canvasPanelLayout.setVerticalGroup(
            canvasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(canvasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1036, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sidePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(canvasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox algBox;
    private javax.swing.JPanel canvasPanel;
    private javax.swing.JPanel controlsPanel;
    private javax.swing.JButton exitBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loadCoordBtn;
    private javax.swing.JButton loadGraphBtn;
    private javax.swing.JTextArea logger;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel paramsPanel;
    private javax.swing.JButton runBtn;
    private javax.swing.JButton showBtn;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JSlider slider;
    // End of variables declaration//GEN-END:variables
    // Programmer variables declaration
    public static final String LINE_END = "\n";
    private Model model;
    // End of programmer variables declaration

    /**
     * @return the controlsPanel
     */
    public javax.swing.JPanel getControlsPanel() {
        return controlsPanel;
    }

    /**
     * @param controlsPanel the controlsPanel to set
     */
    public void setControlsPanel(javax.swing.JPanel controlsPanel) {
        this.controlsPanel = controlsPanel;
    }

    /**
     * @return the exitBtn
     */
    public javax.swing.JButton getExitBtn() {
        return exitBtn;
    }

    /**
     * @return the jComboBox1
     */
    public javax.swing.JComboBox getAlgBox() {
        return algBox;
    }

    /**
     * @return the jSlider1
     */
    public javax.swing.JSlider getSlider() {
        return slider;
    }

    /**
     * @return the loadCoordBtn
     */
    public javax.swing.JButton getLoadCoordBtn() {
        return loadCoordBtn;
    }

    /**
     * @return the loadGraphBtn
     */
    public javax.swing.JButton getLoadGraphBtn() {
        return loadGraphBtn;
    }

    /**
     * @return the mainPanel
     */
    public javax.swing.JPanel getMainPanel() {
        return mainPanel;
    }

    /**
     * @param mainPanel the mainPanel to set
     */
    public void setMainPanel(javax.swing.JPanel mainPanel) {
        this.mainPanel = mainPanel;
    }

    /**
     * @return the paramsPanel
     */
    public javax.swing.JPanel getParamsPanel() {
        return paramsPanel;
    }

    /**
     * @param paramsPanel the paramsPanel to set
     */
    public void setParamsPanel(javax.swing.JPanel paramsPanel) {
        this.paramsPanel = paramsPanel;
    }

    /**
     * @return the runBtn
     */
    public javax.swing.JButton getRunBtn() {
        return runBtn;
    }

    /**
     * @return the showBtn
     */
    public javax.swing.JButton getShowBtn() {
        return showBtn;
    }

    /**
     * @return the sidePanel
     */
    public javax.swing.JPanel getSidePanel() {
        return sidePanel;
    }

    /**
     * @return the logger
     */
    public javax.swing.JTextArea getLogger() {
        return logger;
    }

    /**
     * @param logger the logger to set
     */
    public void setLogger(javax.swing.JTextArea logger) {
        this.logger = logger;
    }

    public void addBtnActionListener(JButton btn, ActionListener al){
        btn.addActionListener(al);
    }
    
    public void addAlgBoxActionListener(ActionListener al){
        algBox.addActionListener(al);
    }
    
    public void addSliderChangeListener(ChangeListener cl){
        slider.addChangeListener(cl);
    }
    
    public void closeWindow(){
        WindowEvent wev = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(wev);
    }
    
    public void drawGraph(){
        canvasPanel.repaint();
    }
    
    public void log(String s){
        logger.append(s);
    }
}
