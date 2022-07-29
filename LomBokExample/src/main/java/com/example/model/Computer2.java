package com.example.model;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Data
public class Computer2 {
	public int srNo;
	public String brand;
	public int RAM;
	public int storage;
	public String MB;
	public int price;
	public int warranty;
	public boolean deliveryCharges;
	public int screenSize;
	public String color;
	public String series;
	
}
