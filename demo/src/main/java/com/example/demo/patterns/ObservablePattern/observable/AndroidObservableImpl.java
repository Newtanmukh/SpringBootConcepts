package com.example.demo.patterns.ObservablePattern.observable;

import com.example.demo.patterns.ObservablePattern.observe.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class AndroidObservableImpl implements  StockObservable{

    public int stockCount = 0;

    public List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifyObservers() {
        for(NotificationAlertObserver notificationAlertObserver: notificationAlertObserverList){
            notificationAlertObserver.update(this);
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        if(this.stockCount!=stockCount){
            this.stockCount = stockCount;
            notifyObservers();
        }
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
