package tasklist;

import javafx.application.Application;
import javafx.stage.Stage;
import tasklist.core.ModelFactory;
import tasklist.core.ViewModelFactory;
import tasklist.model.ListModel;
import tasklist.model.Model;
import tasklist.core.ViewHandler;

public class TaskListApplication extends Application {

    @Override
    public void start(Stage stage) {
        ModelFactory mf = new ModelFactory();
        ViewModelFactory vmf = new ViewModelFactory(mf);
        ViewHandler vh = new ViewHandler(stage, vmf);
        vh.start();
    }
}
