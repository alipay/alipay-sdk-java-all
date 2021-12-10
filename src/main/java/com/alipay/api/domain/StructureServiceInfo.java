package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务详情
 *
 * @author auto create
 * @since 1.0, 2019-11-07 13:43:02
 */
public class StructureServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 1286856638154872387L;

	/**
	 * 是否提供酒精饮料
	 */
	@ApiField("alcohol")
	private Boolean alcohol;

	/**
	 * 是否接受预约
	 */
	@ApiField("booking")
	private Boolean booking;

	/**
	 * 是否有包厢
	 */
	@ApiField("box")
	private Boolean box;

	/**
	 * 是否允许自带杯
	 */
	@ApiField("byo")
	private Boolean byo;

	/**
	 * 是否提供中文服务
	 */
	@ApiField("chinese_svc")
	private Boolean chineseSvc;

	/**
	 * 是否有停车位
	 */
	@ApiField("parking")
	private Boolean parking;

	/**
	 * 是否支持外带
	 */
	@ApiField("takeout")
	private Boolean takeout;

	/**
	 * 是否支持电话预定
	 */
	@ApiField("tel_rsvt")
	private Boolean telRsvt;

	/**
	 * 是否需要小费
	 */
	@ApiField("tips")
	private Boolean tips;

	/**
	 * 是否有wifi
	 */
	@ApiField("wifi")
	private Boolean wifi;

	public Boolean getAlcohol() {
		return this.alcohol;
	}
	public void setAlcohol(Boolean alcohol) {
		this.alcohol = alcohol;
	}

	public Boolean getBooking() {
		return this.booking;
	}
	public void setBooking(Boolean booking) {
		this.booking = booking;
	}

	public Boolean getBox() {
		return this.box;
	}
	public void setBox(Boolean box) {
		this.box = box;
	}

	public Boolean getByo() {
		return this.byo;
	}
	public void setByo(Boolean byo) {
		this.byo = byo;
	}

	public Boolean getChineseSvc() {
		return this.chineseSvc;
	}
	public void setChineseSvc(Boolean chineseSvc) {
		this.chineseSvc = chineseSvc;
	}

	public Boolean getParking() {
		return this.parking;
	}
	public void setParking(Boolean parking) {
		this.parking = parking;
	}

	public Boolean getTakeout() {
		return this.takeout;
	}
	public void setTakeout(Boolean takeout) {
		this.takeout = takeout;
	}

	public Boolean getTelRsvt() {
		return this.telRsvt;
	}
	public void setTelRsvt(Boolean telRsvt) {
		this.telRsvt = telRsvt;
	}

	public Boolean getTips() {
		return this.tips;
	}
	public void setTips(Boolean tips) {
		this.tips = tips;
	}

	public Boolean getWifi() {
		return this.wifi;
	}
	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

}
