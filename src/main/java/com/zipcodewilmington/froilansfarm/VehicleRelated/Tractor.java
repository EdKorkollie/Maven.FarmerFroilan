package com.zipcodewilmington.froilansfarm.VehicleRelated;


import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;

import java.util.ArrayList;

import com.zipcodewilmington.froilansfarm.Baskets.Basket;
import com.zipcodewilmington.froilansfarm.Edibles.EarCorn;
import com.zipcodewilmington.froilansfarm.Edibles.Edible;
import com.zipcodewilmington.froilansfarm.FieldRelated.Crop;
import com.zipcodewilmington.froilansfarm.FieldRelated.CropRow;


public class Tractor extends Vehicle implements FarmVehicle {


    Crop crop = new Crop();
    Tractor tractor = new Tractor();

    public String makeNoise() {

        return "Tractor noise";
    }

    public void harvest(Crop crop) {


    }
    public void harvest(CropRow crops, Basket basket){
        Integer counter = 0;
        Crop tempCrop = crops.getCrop();
        Integer holder = crops.count();
        for (int i = 0; i <holder ; i++) {
            crops.remove();

            counter++;



        }
        for (int i = 0; i <counter ; i++) {
          basket.add(tempCrop.yield());

        }


    }
}