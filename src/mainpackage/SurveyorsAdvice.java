/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpackage;

/**
 *
 * @author akash
 */
public class SurveyorsAdvice {
    protected String textadvice;

    public SurveyorsAdvice(String textadvice) {
        this.textadvice = textadvice;
    }

    public String getTextadvice() {
        return textadvice;
    }

    public void setTextadvice(String textadvice) {
        this.textadvice = textadvice;
    }

    @Override
    public String toString() {
        return "SurveyorsAdvice{" + "textadvice=" + textadvice + '}';
    }
    
}
