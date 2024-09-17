package com.example.demo.patterns.ObservablePattern;

import com.example.demo.patterns.ObservablePattern.observable.IphoneObservableImpl;
import com.example.demo.patterns.ObservablePattern.observable.StockObservable;
import com.example.demo.patterns.ObservablePattern.observe.MobileAlertObserverImpl;
import com.example.demo.patterns.ObservablePattern.observe.NotificationAlertObserver;

public class Main {

    public static void main(String[] args) throws Exception{
        StockObservable iphoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new MobileAlertObserverImpl();
        NotificationAlertObserver observer2 = new MobileAlertObserverImpl();
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl();

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(1);
    }

}
