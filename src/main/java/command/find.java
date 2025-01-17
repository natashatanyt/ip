package command;

import utility.Parser;
import utility.Ui;

import tasks.Task;

import java.util.ArrayList;

public class find {
    /**
     * Finds task based on user's input
     * @param userInput Description of task to be searched for
     * @param tasks Array list of tasks
     */
    public static void executeFind(String userInput, ArrayList<Task> tasks) {
        // Gets the description
        String description = Parser.removeCommandWord(userInput);

        int counter = 0;
        Ui.findHeader(description);

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).contains(description)) {
                Ui.findMatching(counter + 1, tasks.get(i));
                counter++;
            }
        }
        Ui.findEnd();
    }
}
