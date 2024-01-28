package com.example.ai.stock.infrastruture.vo;

import com.example.ai.stock.common.utils.DateTimeUtils;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class StockInfoV2 {
    @JsonFormat(pattern="dd/MM/yyyy")
    @JsonProperty("Ngay")
    private String Ngay;

    @JsonProperty("GiaDieuChinh")
    private Float GiaDieuChinh;

    @JsonProperty("GiaDongCua")
    private Float GiaDongCua;

    @JsonProperty("ThayDoi")
    private String ThayDoi;

    @JsonProperty("KhoiLuongKhopLenh")
    private Float KhoiLuongKhopLenh;

    @JsonProperty("GiaTriKhopLenh")
    private Float GiaTriKhopLenh;

    @JsonProperty("KLThoaThuan")
    private Float KLThoaThuan;

    @JsonProperty("GtThoaThuan")
    private Float GtThoaThuan;

    @JsonProperty("GiaMoCua")
    private Float GiaMoCua;

    @JsonProperty("GiaCaoNhat")
    private Float GiaCaoNhat;

    @JsonProperty("GiaThapNhat")
    private Float GiaThapNhat;

    public LocalDate getNgay(){
       return DateTimeUtils.toLocalDate(this.Ngay);
    }
}
