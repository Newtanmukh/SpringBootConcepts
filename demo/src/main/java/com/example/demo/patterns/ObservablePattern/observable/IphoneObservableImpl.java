package com.example.demo.patterns.ObservablePattern.observable;

import com.example.demo.patterns.ObservablePattern.observe.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable{

    public List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    public int stockCount = 0;

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
