package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * ユーザー情報 Entity
 */
@Entity
@Data
@Table(name="test")
public class Test implements Serializable {

   /**
    * KEY
    */
    @Id
    @Column(name="key")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private String key;

	/**
	 * データ1
	 */
	@Column(name="data1")
	private String data1;

	/**
	 * データ2
	 */
	@Column(name="data2")
	private String data2;

	/**
	 * データ3
	 */
	@Column(name="data3")
	private String data3;
}