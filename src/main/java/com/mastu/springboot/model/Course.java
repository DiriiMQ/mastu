package com.mastu.springboot.model;

import java.util.List;

public record Course(String id,
                     String name,
                     String description,
                     List<String> steps) {
}