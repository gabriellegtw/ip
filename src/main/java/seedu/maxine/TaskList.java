package seedu.maxine;

import java.util.ArrayList;
import java.util.Iterator;

import seedu.maxine.task.Task;

public class TaskList implements MaxineList {
    private ArrayList<Task> list;
    private Storage storage;

    /**
     * Constructs new instance of TaskList class
     */
    public TaskList() {
        this.storage = new Storage("data/maxine.txt");
        this.list = storage.load();
    }
    public void addTask(Task task) {
        list.add(task);
    }
    /**
     * Deletes the task in the collection that corresponds to the key
     * @param key The number that is tagged to the task that os to be deleted
     */
    public void delete(int key) {
        Task task = list.get(key);
        list.remove(task);
    }

    /**
     * Returns the size of the current task list
     * @return Size of current task list
     */
    public int size() {
        return list.size();
    }

    /**
     * Retrieves the Task in the task list that corresponds to the number
     * @param num
     * @return task
     */
    public Task get(int num) {
        return list.get(num);
    }


    /**
     * Returns an iterator over the elements in the list.
     * <p>
     * This method provides an iterator that can be used to traverse the elements
     * of the list in a sequential manner. The iterator supports both read and remove operations.
     * </p>
     *
     * @return an {@link Iterator} over the elements in the list
     */
    @Override
    public Iterator<Task> iterator() {
        return list.iterator();
    }
    public void deleteAll() {
        list.clear();
    }
}
