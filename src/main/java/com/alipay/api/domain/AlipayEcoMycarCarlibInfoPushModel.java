package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同步车型库
 *
 * @author auto create
 * @since 1.0, 2020-12-31 11:44:55
 */
public class AlipayEcoMycarCarlibInfoPushModel extends AlipayObject {

	private static final long serialVersionUID = 4839488833972413418L;

	/**
	 * 品牌
	 */
	@ApiField("brand")
	private String brand;

	/**
	 * 排量
	 */
	@ApiField("cc")
	private String cc;

	/**
	 * 厂商
	 */
	@ApiField("company")
	private String company;

	/**
	 * 发动机型号
	 */
	@ApiField("engine")
	private String engine;

	/**
	 * 销售名字
	 */
	@ApiField("marker")
	private String marker;

	/**
	 * 生产年份
	 */
	@ApiField("prod_year")
	private String prodYear;

	/**
	 * 车系
	 */
	@ApiField("serie")
	private String serie;

	/**
	 * 车款
	 */
	@ApiField("style")
	private String style;

	public String getBrand() {
		return this.brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCc() {
		return this.cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getCompany() {
		return this.company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

	public String getEngine() {
		return this.engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getMarker() {
		return this.marker;
	}
	public void setMarker(String marker) {
		this.marker = marker;
	}

	public String getProdYear() {
		return this.prodYear;
	}
	public void setProdYear(String prodYear) {
		this.prodYear = prodYear;
	}

	public String getSerie() {
		return this.serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}

	public String getStyle() {
		return this.style;
	}
	public void setStyle(String style) {
		this.style = style;
	}

}
