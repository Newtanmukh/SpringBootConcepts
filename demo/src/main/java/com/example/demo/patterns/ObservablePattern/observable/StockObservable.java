package com.example.demo.patterns.ObservablePattern.observable;

import com.example.demo.patterns.ObservablePattern.observe.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifyObservers();

    public void setStockCount(int stockCount);

    public int getStockCount();

}
