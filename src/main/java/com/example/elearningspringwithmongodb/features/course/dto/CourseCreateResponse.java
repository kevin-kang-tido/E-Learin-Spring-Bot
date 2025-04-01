package com.example.elearningspringwithmongodb.features.course.dto;

public record CourseCreateResponse(
        String id,
        String title,
        String slug,
        String description,
        Double price,
        Double discount,
        Boolean isPaid,
        Boolean isDraft,
        String thumbnail,
        String categoryName,
        String instructorName,
        String createdAt,
        String updatedAt
) {
}
