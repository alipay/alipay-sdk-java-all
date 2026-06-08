package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店参数
 *
 * @author auto create
 * @since 1.0, 2026-04-13 20:47:44
 */
public class OutletInfo extends AlipayObject {

	private static final long serialVersionUID = 8191217311892757555L;

	/**
	 * 是否支持商保直付
	 */
	@ApiField("insurance_direct_payment")
	private Boolean insuranceDirectPayment;

	/**
	 * 门店地址
	 */
	@ApiField("outlet_address")
	private String outletAddress;

	/**
	 * 门店编号
	 */
	@ApiField("outlet_code")
	private String outletCode;

	/**
	 * 门店距离
	 */
	@ApiField("outlet_distance")
	private String outletDistance;

	/**
	 * 门店纬度
	 */
	@ApiField("outlet_latitude")
	private String outletLatitude;

	/**
	 * 门店经度
	 */
	@ApiField("outlet_longitude")
	private String outletLongitude;

	/**
	 * 门店名称
	 */
	@ApiField("outlet_name")
	private String outletName;

	/**
	 * 门店电话
	 */
	@ApiField("outlet_phone")
	private String outletPhone;

	/**
	 * 门店服务时间范围
	 */
	@ApiField("outlet_time")
	private String outletTime;

	public Boolean getInsuranceDirectPayment() {
		return this.insuranceDirectPayment;
	}
	public void setInsuranceDirectPayment(Boolean insuranceDirectPayment) {
		this.insuranceDirectPayment = insuranceDirectPayment;
	}

	public String getOutletAddress() {
		return this.outletAddress;
	}
	public void setOutletAddress(String outletAddress) {
		this.outletAddress = outletAddress;
	}

	public String getOutletCode() {
		return this.outletCode;
	}
	public void setOutletCode(String outletCode) {
		this.outletCode = outletCode;
	}

	public String getOutletDistance() {
		return this.outletDistance;
	}
	public void setOutletDistance(String outletDistance) {
		this.outletDistance = outletDistance;
	}

	public String getOutletLatitude() {
		return this.outletLatitude;
	}
	public void setOutletLatitude(String outletLatitude) {
		this.outletLatitude = outletLatitude;
	}

	public String getOutletLongitude() {
		return this.outletLongitude;
	}
	public void setOutletLongitude(String outletLongitude) {
		this.outletLongitude = outletLongitude;
	}

	public String getOutletName() {
		return this.outletName;
	}
	public void setOutletName(String outletName) {
		this.outletName = outletName;
	}

	public String getOutletPhone() {
		return this.outletPhone;
	}
	public void setOutletPhone(String outletPhone) {
		this.outletPhone = outletPhone;
	}

	public String getOutletTime() {
		return this.outletTime;
	}
	public void setOutletTime(String outletTime) {
		this.outletTime = outletTime;
	}

}
