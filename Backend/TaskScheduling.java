package Backend;

import java.util.HashMap;
import java.util.Map;

public class TaskScheduling {
    /*
     Features we need:
     1) Plan and schedule farm tasks
     2) Ensure timely execution of tasks
    */

    // Declare variables
    private Map<String, String> taskSchedule;

    // Constructor
    public TaskScheduling() {
        taskSchedule = new HashMap<>();
    }

    // Add task to the schedule
    public void addTask(String task, String schedule) {
        taskSchedule.put(task, schedule);
    }

    // Update task schedule
    public void updateTaskSchedule(String task, String newSchedule) {
        if (taskSchedule.containsKey(task)) {
            taskSchedule.put(task, newSchedule);
        } else {
            System.out.println("Task does not exist in the schedule.");
        }
    }

    // Remove task from the schedule
    public void removeTask(String task) {
        taskSchedule.remove(task);
    }

    // Get schedule for a task
    public String getTaskSchedule(String task) {
        if (taskSchedule.containsKey(task)) {
            return taskSchedule.get(task);
        } else {
            return "Task does not exist in the schedule.";
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of TaskScheduling
        TaskScheduling taskScheduling = new TaskScheduling();

        // Add tasks to the schedule
        taskScheduling.addTask("Sowing", "2023-04-01");
        taskScheduling.addTask("Irrigation", "2023-04-15");
        taskScheduling.addTask("Fertilization", "2023-05-01");
        taskScheduling.addTask("Pest Control", "2023-05-15");

        // Get schedule for a task
        String sowingSchedule = taskScheduling.getTaskSchedule("Sowing");
        System.out.println("Sowing Schedule: " + sowingSchedule);

        // Update task schedule
        taskScheduling.updateTaskSchedule("Fertilization", "2023-05-02");

        // Remove a task from the schedule
        taskScheduling.removeTask("Pest Control");

        // Get updated schedule for a task
        String updatedFertilizationSchedule = taskScheduling.getTaskSchedule("Fertilization");
        System.out.println("Updated Fertilization Schedule: " + updatedFertilizationSchedule);
    }
}

