package com.example.demo.patterns.ObservablePattern.observe;

import com.example.demo.patterns.ObservablePattern.observable.StockObservable;

public interface NotificationAlertObserver {
    public void update(StockObservable stockObservable);
}
