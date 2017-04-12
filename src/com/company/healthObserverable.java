package com.company;

import java.util.Observer;

/**
 * @author e.yushin
 */
public interface healthObserverable {
    void registerObserver(healthObserver o);
    void removeObserver(healthObserver o);
    void notifyObservers();
}
