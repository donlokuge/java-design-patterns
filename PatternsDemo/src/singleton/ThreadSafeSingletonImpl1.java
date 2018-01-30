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
public class ThreadSafeSingletonImpl1 {

    private static ThreadSafeSingletonImpl1 instance;

    public static synchronized ThreadSafeSingletonImpl1 getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingletonImpl1();
        }
        return instance;
    }

    private ThreadSafeSingletonImpl1() {

    }

}
