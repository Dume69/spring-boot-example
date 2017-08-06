package com.sopra.order.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue
    private long id;

    private Date dueDate;
    private long clientId;

    public OrderEntity(Date dueDate, long clientId) {
        this.dueDate = dueDate;
        this.clientId = clientId;
    }

    public OrderEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
}
