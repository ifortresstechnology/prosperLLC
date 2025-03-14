package com.prospersllc.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "company_info")
public class CompanyInfo {

    @Id
    private String id;
    private String aboutUs;
    private String contactUs;
    private String technicalServices;
    private String managedServices;
    private String people;
    private String consultancy;

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAboutUs() {
        return aboutUs;
    }

    public void setAboutUs(String aboutUs) {
        this.aboutUs = aboutUs;
    }

    public String getContactUs() {
        return contactUs;
    }

    public void setContactUs(String contactUs) {
        this.contactUs = contactUs;
    }

    public String getTechnicalServices() {
        return technicalServices;
    }

    public void setTechnicalServices(String technicalServices) {
        this.technicalServices = technicalServices;
    }

    public String getManagedServices() {
        return managedServices;
    }

    public void setManagedServices(String managedServices) {
        this.managedServices = managedServices;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public String getConsultancy() {
        return consultancy;
    }

    public void setConsultancy(String consultancy) {
        this.consultancy = consultancy;
    }
}
