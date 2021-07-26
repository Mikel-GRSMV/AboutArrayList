package taskList;

import java.util.List;

public class ArrayList {

    private List<String> toDoList = new java.util.ArrayList<>();//(private)

    public void addToList(String task) {//(1)
        toDoList.add(task);
    }

    public void addToListPosition(int position, String task) {//(2)
        toDoList.add(position, task);
    }

//    public void printToDoList() {
//        for (String s : toDoList) {
//            System.out.println(s);
//        }

    public void printToDoList() {//(3)
        for (int i = 0; i < toDoList.size(); i++) {
            System.out.println(i + " - " + toDoList.get(i));
        }
    }

    public void changeTask(int index, String task) {//(4)
        toDoList.set(index, task);
    }

    public void removeTask(String task) {//(5)
        toDoList.remove(task);
    }

    public int getTaskPriority(String task) {//(6)
        return toDoList.indexOf(task);
    }


}
