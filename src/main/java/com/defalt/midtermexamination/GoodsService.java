package com.defalt.midtermexamination;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GoodsService implements Serializable{

    private static ArrayList<Goods> goodsList = new ArrayList<>();

    public static void addGoods(Goods goods) {
        goodsList.add(goods);
    }

    public static void delGoods(Goods goods) {
        goodsList.remove(goods);
    }

    public static void delGoods(int index) {
        goodsList.remove(index);
    }

    public static Goods getGoods(int index) {
        return goodsList.get(index);
    }

    public static void updateGoods(int index, Goods goods) {
        goodsList.set(index, goods);
    }public static ArrayList<Goods> getGoodsList(){
        return goodsList;
    }public static void saveData(){
        File file = null;
        FileOutputStream fos= null;
        ObjectOutputStream oos = null;
        try{
            file  = new File("Ming.dat");
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(goodsList);
            oos.close();
            fos.close();
        }catch(FileNotFoundException ex){
            Logger.getLogger(GoodsService.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(GoodsService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }public static void loadData(){
        File file = null;
        FileInputStream fis= null;
        ObjectInputStream ois = null;
        try{
            file  = new File("Ming.dat");
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);
            goodsList = (ArrayList<Goods>) ois.readObject();
            ois.close();
            fis.close();
        }catch(FileNotFoundException ex){
            Logger.getLogger(GoodsService.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            Logger.getLogger(GoodsService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(GoodsService.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
}
