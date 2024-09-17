package com.example.demo.patterns.ObservablePattern.observe;

import com.example.demo.patterns.ObservablePattern.observable.AndroidObservableImpl;
import com.example.demo.patterns.ObservablePattern.observable.IphoneObservableImpl;
import com.example.demo.patterns.ObservablePattern.observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    int iphone = 0;
    int androidPhone = 0;

    @Override
    public void update(StockObservable stockObservable) {
        if(stockObservable instanceof IphoneObservableImpl){
            this.iphone = 1;
            this.androidPhone = 0;

            System.out.println("IPHONE IS : " + this.iphone + " ANDROID IS : " + this.androidPhone);
        }else if(stockObservable instanceof AndroidObservableImpl){
            this.androidPhone = 1;
            this.iphone = 0;

            System.out.println("IPHONE IS : " + this.iphone + " ANDROID IS : " + this.androidPhone);
        }
    }
}
