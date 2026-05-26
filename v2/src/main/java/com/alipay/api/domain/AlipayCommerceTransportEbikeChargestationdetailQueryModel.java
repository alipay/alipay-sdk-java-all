package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 两轮充电桩详情查询
 *
 * @author auto create
 * @since 1.0, 2026-05-19 10:57:45
 */
public class AlipayCommerceTransportEbikeChargestationdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8715385967993497432L;

	/**
	 * 品牌编码
	 */
	@ApiField("brand_code")
	private String brandCode;

	/**
	 * 设备编号，设备唯一标识
	 */
	@ApiField("device_no")
	private String deviceNo;

	/**
	 * 合作方编码
	 */
	@ApiField("partner_code")
	private String partnerCode;

	public String getBrandCode() {
		return this.brandCode;
	}
	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getDeviceNo() {
		return this.deviceNo;
	}
	public void setDeviceNo(String deviceNo) {
		this.deviceNo = deviceNo;
	}

	public String getPartnerCode() {
		return this.partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

}
