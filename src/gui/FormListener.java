package gui;

import gui.FormEvent;

import java.util.EventListener;

public interface FormListener extends EventListener {
    public void formEventOccurred(FormEvent e);
}
