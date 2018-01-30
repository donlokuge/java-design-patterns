/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author ashok
 */
public class ThreadSafeSigleton {

    private ThreadSafeSigleton() {
    }

    // this will be initiated before ThreadSafeSigleton
    private static class SingletonHolder {
        private static final ThreadSafeSigleton INSTANCE = new ThreadSafeSigleton();
    }

    public static ThreadSafeSigleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}


