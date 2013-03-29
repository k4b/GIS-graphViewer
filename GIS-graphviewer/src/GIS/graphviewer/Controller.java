package GIS.graphviewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Controller {
    
	private int interval = 1000;
	private Model model;
        private View view;
	
	public int getInterval() {
		return interval;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	public Model getModel() {
		return model;
	}
	public void setModel(Model model) {
		this.model = model;
	}
	
	public Controller(Model m, View v)
	{
		model = m;
                view = v;
                
                // add listeners to the view
                ControlsActionListener listener = new ControlsActionListener();
                view.addBtnActionListener(view.getLoadGraphBtn(), listener);
                view.addBtnActionListener(view.getLoadCoordBtn(), listener);
                view.addBtnActionListener(view.getShowBtn(), listener);
                view.addAlgBoxActionListener(listener);
                view.addSliderChangeListener(listener);
                view.addBtnActionListener(view.getRunBtn(), listener);
                view.addBtnActionListener(view.getExitBtn(), listener);
	}
	
	public void loadNeighboursMatrix(String path)
	{
		model.setNeighboursMatrix(FileLoader.loadFile(path));
	}
        
        public void loadNeighboursMatrix(File f)
	{
		model.setNeighboursMatrix(FileLoader.loadFile(f));
	}
	
	public void loadCoordinatesMatrix(String path)
	{
		model.setCoordinatesMatrix(FileLoader.loadFile(path));
	}
        
        public void loadCoordinatesMatrix(File f)
	{
		model.setCoordinatesMatrix(FileLoader.loadFile(f));
	}
        
        /**
         * 
         */
        public class ControlsActionListener implements ActionListener, ChangeListener{
            
            JFileChooser fc;
            int returnVal;
            File file;

            @Override
            public void actionPerformed(ActionEvent ae) {
                //handle load graph
                if(ae.getSource() == view.getLoadGraphBtn()){
                    fc = new JFileChooser();
                    returnVal = fc.showOpenDialog(view);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        file = fc.getSelectedFile();
                        loadNeighboursMatrix(file);
                        //This is where a real application would open the file.
                        view.getLogger().append("Graph loaded:" + View.LINE_END);
                    } else {
                        view.getLogger().append("Graph not loaded!" + View.LINE_END);
                    }
                    view.getLogger().append(Model.matrixToString(model.getNeighboursMatrix()));
                } else if (ae.getSource() == view.getLoadCoordBtn()){
                    fc = new JFileChooser();
                    returnVal = fc.showOpenDialog(view);
                    if (returnVal == JFileChooser.APPROVE_OPTION) {
                        file = fc.getSelectedFile();
                        loadCoordinatesMatrix(file);
                        //This is where a real application would open the file.
                        view.getLogger().append("Coordinates loaded:" + View.LINE_END);
                    } else {
                        view.getLogger().append("Coordinates not loaded!" + View.LINE_END);
                    }
                    view.getLogger().append(Model.matrixToString(model.getCoordinatesMatrix()));
                } else if (ae.getSource() == view.getShowBtn()){
                    //TODO malowanie grafu
                } else if (ae.getSource() == view.getAlgBox()){
                    //TODO wybor algorytmu
                } else if (ae.getSource() == view.getRunBtn()){
                    //TODO uruchamianie animacji
                } else if (ae.getSource() == view.getExitBtn()){
                    view.closeWindow();
                }
            }

        @Override
        public void stateChanged(ChangeEvent ce) {
            JSlider source = (JSlider)ce.getSource();
            if (!source.getValueIsAdjusting()) {
                interval = (int)source.getValue();
//                if (fps == 0) {
//                    if (!frozen) stopAnimation();
//                } else {
//                    delay = 1000 / fps;
//                    timer.setDelay(delay);
//                    timer.setInitialDelay(delay * 10);
//                    if (frozen) startAnimation();
//                }
            }
        }

        }
}
