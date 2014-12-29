package ru.kfu.view;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

class IntTextDocument extends PlainDocument {
    public void insertString(int offs, String str, AttributeSet a)
            throws BadLocationException {
        if (str == null)
            return;
        String oldString = getText(0, getLength());
        String newString = oldString.substring(0, offs) + str
                + oldString.substring(offs);
        try {
            Integer.parseInt(newString + "0");
            super.insertString(offs, str, a);
        } catch (NumberFormatException e) {
        }
    }
}