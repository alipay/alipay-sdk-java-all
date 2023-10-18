package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.mycar.dialogonline.vehicle.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 04:14:03
 */
public class AlipayEcoMycarDialogonlineVehicleQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1589984346716983642L;

	/** 
	 * 生产年份，格式：yyyy
	 */
	@ApiField("factory_date")
	private String factoryDate;

	/** 
	 * 车型库ID
	 */
	@ApiField("lib_id")
	private String libId;

	/** 
	 * 生产厂商
	 */
	@ApiField("manufacturer")
	private String manufacturer;

	/** 
	 * 常驻城市的编码
	 */
	@ApiField("resident_city")
	private String residentCity;

	/** 
	 * 车辆品牌
	 */
	@ApiField("vi_brand")
	private String viBrand;

	/** 
	 * 发动机排量
	 */
	@ApiField("vi_cc")
	private String viCc;

	/** 
	 * 车辆ID
	 */
	@ApiField("vi_id")
	private String viId;

	/** 
	 * 行驶里程
	 */
	@ApiField("vi_mileage")
	private String viMileage;

	/** 
	 * 车型
	 */
	@ApiField("vi_model")
	private String viModel;

	/** 
	 * 车系
	 */
	@ApiField("vi_series")
	private String viSeries;

	/** 
	 * 上路时间，格式：yyyy-mm-dd
	 */
	@ApiField("vi_time")
	private String viTime;

	public void setFactoryDate(String factoryDate) {
		this.factoryDate = factoryDate;
	}
	public String getFactoryDate( ) {
		return this.factoryDate;
	}

	public void setLibId(String libId) {
		this.libId = libId;
	}
	public String getLibId( ) {
		return this.libId;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getManufacturer( ) {
		return this.manufacturer;
	}

	public void setResidentCity(String residentCity) {
		this.residentCity = residentCity;
	}
	public String getResidentCity( ) {
		return this.residentCity;
	}

	public void setViBrand(String viBrand) {
		this.viBrand = viBrand;
	}
	public String getViBrand( ) {
		return this.viBrand;
	}

	public void setViCc(String viCc) {
		this.viCc = viCc;
	}
	public String getViCc( ) {
		return this.viCc;
	}

	public void setViId(String viId) {
		this.viId = viId;
	}
	public String getViId( ) {
		return this.viId;
	}

	public void setViMileage(String viMileage) {
		this.viMileage = viMileage;
	}
	public String getViMileage( ) {
		return this.viMileage;
	}

	public void setViModel(String viModel) {
		this.viModel = viModel;
	}
	public String getViModel( ) {
		return this.viModel;
	}

	public void setViSeries(String viSeries) {
		this.viSeries = viSeries;
	}
	public String getViSeries( ) {
		return this.viSeries;
	}

	public void setViTime(String viTime) {
		this.viTime = viTime;
	}
	public String getViTime( ) {
		return this.viTime;
	}

}
