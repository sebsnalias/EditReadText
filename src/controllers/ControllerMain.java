package controllers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import models.ModelMain;
import views.ViewMain;

/**
 *
 * @author Sebastián
 */
public class ControllerMain {
    ModelMain modelMain = new ModelMain();
    ViewMain viewMain = new ViewMain();
    
    
public ControllerMain(ModelMain modelMain, ViewMain viewMain){
    this.modelMain = modelMain;
    this.viewMain = viewMain;
    
}    
    
}
