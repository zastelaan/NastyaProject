package ua.edu.npu.lab01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Detail {
    private String name;
    private String trademark;
    private String producerCountry;
    private Date dateOfManufacture;
    private String lifeTime;
    private String additionalInformation;

    public static Date StringToDate(String s) {
        Date result = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            result = dateFormat.parse(s);
        } catch (java.text.ParseException e) {
            e.printStackTrace();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getProducerCountry() {
        return producerCountry;
    }

    public void setproducerCountry(String producerCountry) {
        this.producerCountry = producerCountry;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public String getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(String lifeTime) {
        this.lifeTime = lifeTime;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setDditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public long getAgeOfProduct(Date currentDate) {
        int diffInDays = (int) ((currentDate.getTime() - dateOfManufacture.getTime()) / (1000 * 60 * 60 * 24));
        return diffInDays;
    }

    public void setDateOfManufacture(String dateOfManufactureString) {
        Date date = StringToDate(dateOfManufactureString);
        this.dateOfManufacture = date;

    }

}
