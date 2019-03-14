package org.fasttrackit.transfer;

import org.fasttrackit.domain.ToDoItem;

import java.sql.Date;
import java.util.List;

public class SaveToDoItemRequest {

    private String description;
    private Date deadline;
    private boolean done;
    private List<ToDoItem> content;

    public SaveToDoItemRequest(List<ToDoItem> content){
        this.content=content;
    }
    public SaveToDoItemRequest(){

    }

    public List<ToDoItem> getContent() {
        return content;
    }

    public void setContent(List<ToDoItem> content) {
        this.content = content;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "SaveToDoItemRequest{" +
                "description='" + description + '\'' +
                ", deadline=" + deadline +
                ", done=" + done +
                '}';
    }
}
