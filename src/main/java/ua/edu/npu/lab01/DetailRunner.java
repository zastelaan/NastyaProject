package ua.edu.npu.lab01;

import java.util.Date;

public class DetailRunner {

    public static void main(String[] args) {
        Detail someDetail = new Detail();
        Date currentDate = new Date();

        String dateOfManufacture = "2015-12-06";
        someDetail.setDateOfManufacture(dateOfManufacture);

        System.out.println("Age of the product is " + someDetail.getAgeOfProduct(currentDate) + " days");
    }
}
