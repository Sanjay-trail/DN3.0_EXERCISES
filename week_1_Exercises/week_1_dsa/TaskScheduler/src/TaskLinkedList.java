public class TaskLinkedList {
    private TaskNode head;

    public void addTask(Task task) {
        TaskNode newNode = new TaskNode(task);
        if (head == null) {
            head = newNode;
        } else {
            TaskNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("Task added: " + task);
    }

    // Method to search for a task by taskId
    public Task searchTask(int taskId) {
        TaskNode current = head;
        while (current != null) {
            if (current.task.getTaskId() == taskId) {
                return current.task; // Return the found task
            }
            current = current.next;
        }
        return null; // Task not found
    }

    // Method to traverse and print all tasks
    public void traverseTasks() {
        if (head == null) {
            System.out.println("No tasks to display.");
            return;
        }
        System.out.println("Task List:");
        TaskNode current = head;
        while (current != null) {
            System.out.println(current.task);
            current = current.next;
        }
    }

    // Method to delete a task by taskId
    public void deleteTask(int taskId) {
        if (head == null) {
            System.out.println("No tasks to delete.");
            return;
        }

        // If the head needs to be removed
        if (head.task.getTaskId() == taskId) {
            head = head.next; // Update head to the next node
            System.out.println("Task with ID " + taskId + " deleted.");
            return;
        }

        TaskNode current = head;
        while (current.next != null) {
            if (current.next.task.getTaskId() == taskId) {
                current.next = current.next.next; // Bypass the node to delete it
                System.out.println("Task with ID " + taskId + " deleted.");
                return;
            }
            current = current.next;
        }
        System.out.println("Task with ID " + taskId + " not found.");
    }

    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Adding tasks
        taskList.addTask(new Task(1, "Complete project report", "In Progress"));
        taskList.addTask(new Task(2, "Submit budget proposal", "Pending"));
        taskList.addTask(new Task(3, "Prepare for team meeting", "Completed"));


        taskList.traverseTasks();


        Task foundTask = taskList.searchTask(2);
        if (foundTask != null) {
            System.out.println("Found Task: " + foundTask);
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        taskList.deleteTask(2);
        taskList.traverseTasks();

        // Trying to delete a non-existing task
        taskList.deleteTask(4);
    }
}
