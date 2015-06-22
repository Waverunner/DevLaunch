package pswg.tools.devlaunch.resources.views;

import javafx.stage.Stage;
import pswg.tools.devlaunch.controllers.ConsoleController;

/**
 * @author Waverunner on 6/21/2015
 */
public class ConsoleDialog extends ApplicationDialog {
    private int watchCount = 0;

    public ConsoleDialog(Stage parent) {
        super(parent, "SWGClient_r.exe Console Output");
    }

    public void print(String message) {
        getController().print(message);
    }

    public void watchProcess(Process process) {
        ConsoleController controller = getController();

        controller.addProcessTab(process.getInputStream(), "Process [" + watchCount + "]");
        watchCount++;
    }

    @Override
    protected String getDesignPath() {
        return "resources/design/console.fxml";
    }

    @SuppressWarnings("unchecked")
    @Override
    public ConsoleController getController() {
        return super.getController();
    }

}
