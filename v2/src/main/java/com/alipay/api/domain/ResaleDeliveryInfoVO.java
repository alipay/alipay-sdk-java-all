package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 履约信息
 *
 * @author auto create
 * @since 1.0, 2026-05-26 16:37:33
 */
public class ResaleDeliveryInfoVO extends AlipayObject {

	private static final long serialVersionUID = 1162461563899413831L;

	/**
	 * 收件人详细收货地址
	 */
	@ApiField("address")
	private String address;

	/**
	 * 收件人区
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * 履约状态
	 */
	@ApiField("delivery_status")
	private String deliveryStatus;

	/**
	 * 履约类型
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/**
	 * 收件人区
	 */
	@ApiField("district_code")
	private String districtCode;

	/**
	 * 物流单号
	 */
	@ApiField("logistics_bill_no")
	private String logisticsBillNo;

	/**
	 * 物流平台
	 */
	@ApiField("logistics_platform")
	private String logisticsPlatform;

	/**
	 * 收件人联系电话
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 收件人名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 收件人省
	 */
	@ApiField("province_code")
	private String provinceCode;

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getDeliveryStatus() {
		return this.deliveryStatus;
	}
	public void setDeliveryStatus(String deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getDeliveryType() {
		return this.deliveryType;
	}
	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}

	public String getDistrictCode() {
		return this.districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getLogisticsBillNo() {
		return this.logisticsBillNo;
	}
	public void setLogisticsBillNo(String logisticsBillNo) {
		this.logisticsBillNo = logisticsBillNo;
	}

	public String getLogisticsPlatform() {
		return this.logisticsPlatform;
	}
	public void setLogisticsPlatform(String logisticsPlatform) {
		this.logisticsPlatform = logisticsPlatform;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getProvinceCode() {
		return this.provinceCode;
	}
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

}
