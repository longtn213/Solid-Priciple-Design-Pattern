package org.example.sport;

public abstract class Sport {
    protected abstract void initialize();
    protected abstract void playing();
    protected abstract void showResults();

    //template pattern
    //the subclasses can not override this method
    public final void sort(){
        initialize();
        playing();
        showResults();
    }
}
