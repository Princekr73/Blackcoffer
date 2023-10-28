package com.blackcoffer.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class VisualizationDashboard {

    @Id
    @GeneratedValue
    private Integer Id;

    private String end_year;
    private String citylng;
    private String citylat;
    private String intensity;
    private String sector;
    private String topic;
    @Lob
    private String insight;
    private String swot;
    private String url;
    private String region;
    private String start_year;
    private String impact;
    private String added;
    private String published;
    private String city;
    private String country;
    private String relevance;
    private String pestle;
    private String source;
    @Lob
    private String title;
    private String likelihood;

}
