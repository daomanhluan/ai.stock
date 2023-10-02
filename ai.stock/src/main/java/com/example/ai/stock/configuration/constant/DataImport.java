package com.example.ai.stock.configuration.constant;

import com.example.ai.stock.infrastruture.entity.FieldEntity;

import java.util.Arrays;
import java.util.List;

public class DataImport {
  public static List<FieldEntity> fieldEntities =
      Arrays.asList(
          FieldEntity.builder().id(1).code("stock").build(),
          FieldEntity.builder().id(2).code("bank").build(),
          FieldEntity.builder().id(3).code("steel").build(),
          FieldEntity.builder().id(4).code("fertilizer").build(),
          FieldEntity.builder().id(5).code("pork").build(),
          FieldEntity.builder().id(6).code("fish").build(),
          FieldEntity.builder().id(7).code("land_house").build(),
          FieldEntity.builder().id(8).code("chemistry").build(),
          FieldEntity.builder().id(9).code("transport").build(),
          FieldEntity.builder().id(10).code("sugar").build(),
          FieldEntity.builder().id(11).code("oil").build(),
          FieldEntity.builder().id(11).code("rice").build());
}
