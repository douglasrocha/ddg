package com.perfani.ddg.test;

import java.io.IOException;
import java.util.ArrayList;

import com.perfani.ddg.controller.FileController;
import com.perfani.ddg.exceptions.EntityNotFoundException;
import com.perfani.ddg.exceptions.InvalidKeyAmountException;
import com.perfani.ddg.exceptions.InvalidMultiplicityException;
import com.perfani.ddg.model.Entity;
import com.perfani.ddg.model.Field;

public class TempTest
{
    public static void main(String[] args)
    {
        Entity e1 = new Entity();
        e1.setName("User");
        
        // Keys        
        Field f1 = new Field();
        f1.setType("int");
        f1.setName("id");
        
        // Fields
        ArrayList<Field> listField = new ArrayList<Field>();       
        
        Field f2 = new Field();
        f2.setType("String");
        f2.setName("username");
        listField.add(f2);
        
        Field f3 = new Field();
        f3.setType("String");
        f3.setName("password");
        listField.add(f3);
        
        // Adds lists to entity
        e1.setKey(f1);
        e1.setFields(listField);
        
        try
        {
            FileController.writeCode("D:\\input\\teste.txt", "D:\\output\\teste");
        }
        catch (IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InvalidKeyAmountException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (EntityNotFoundException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch (InvalidMultiplicityException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
