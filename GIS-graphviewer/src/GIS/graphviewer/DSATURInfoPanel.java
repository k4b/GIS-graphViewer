/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GIS.graphviewer;

import javax.swing.JLabel;

/**
 *
 * @author Karol
 */
public class DSATURInfoPanel extends javax.swing.JPanel {

    /**
     * Creates new form DSATURInfoPanel
     */
    public DSATURInfoPanel() {
        initComponents();
    }

    public JLabel getDegreeNodesLabel() {
        return degreeNodesLabel;
    }

    public void setDegreeNodesLabel(JLabel degreeNodesLabel) {
        this.degreeNodesLabel = degreeNodesLabel;
    }

    public JLabel getIterationLabel() {
        return iterationLabel;
    }

    public void setIterationLabel(JLabel iterationLabel) {
        this.iterationLabel = iterationLabel;
    }

    public JLabel getMaxDegreeLabel() {
        return maxDegreeLabel;
    }

    public void setMaxDegreeLabel(JLabel maxDegreeLabel) {
        this.maxDegreeLabel = maxDegreeLabel;
    }

    public JLabel getMaxSaturationLabel() {
        return maxSaturationLabel;
    }

    public void setMaxSaturationLabel(JLabel maxSaturationLabel) {
        this.maxSaturationLabel = maxSaturationLabel;
    }

    public JLabel getNextNodeLabel() {
        return nextNodeLabel;
    }

    public void setNextNodeLabel(JLabel nextNodeLabel) {
        this.nextNodeLabel = nextNodeLabel;
    }

    public JLabel getSaturiationNodesLabel() {
        return saturiationNodesLabel;
    }

    public void setSaturiationNodesLabel(JLabel saturiationNodesLabel) {
        this.saturiationNodesLabel = saturiationNodesLabel;
    }
    
    /**
     * Creates new form DSATURInfoPanel
     */
    public DSATURInfoPanel(DSATURInfoItem item) {
        initComponents();
        iterationLabel.setText(""+item.getIteration());
        maxSaturationLabel.setText("" + item.getMaxSaturation());
        saturiationNodesLabel.setText(item.getSaturationNodes());
        maxDegreeLabel.setText(""+item.getMaxNodeDegree());
        degreeNodesLabel.setText(item.getDegreeNodes());
        nextNodeLabel.setText(""+item.getNextNode());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        iterationLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        maxSaturationLabel = new javax.swing.JLabel();
        saturiationNodesLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        maxDegreeLabel = new javax.swing.JLabel();
        degreeNodesLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        nextNodeLabel = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setPreferredSize(new java.awt.Dimension(230, 454));
        setLayout(new java.awt.GridLayout(6, 2, 4, 4));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel1.setText("Iteration");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel1);
        add(iterationLabel);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setText("Max Saturation");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabel3);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("Nodes");
        add(jLabel4);
        add(maxSaturationLabel);
        add(saturiationNodesLabel);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("Max Degree");
        add(jLabel7);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel8.setText("Nodes");
        add(jLabel8);
        add(maxDegreeLabel);
        add(degreeNodesLabel);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel12.setText("Next Node");
        add(jLabel12);
        add(nextNodeLabel);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel degreeNodesLabel;
    private javax.swing.JLabel iterationLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel maxDegreeLabel;
    private javax.swing.JLabel maxSaturationLabel;
    private javax.swing.JLabel nextNodeLabel;
    private javax.swing.JLabel saturiationNodesLabel;
    // End of variables declaration//GEN-END:variables
}
