package com.example.elearningspringwithmongodb.domain;
import lombok.*;


import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Section {

    private String title;
    private Integer orderNo;
    private List<Video> videos;
}
