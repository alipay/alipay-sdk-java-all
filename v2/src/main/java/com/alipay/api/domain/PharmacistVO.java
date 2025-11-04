package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 药师信息
 *
 * @author auto create
 * @since 1.0, 2025-04-16 10:10:13
 */
public class PharmacistVO extends AlipayObject {

	private static final long serialVersionUID = 6471548717622937476L;

	/**
	 * 合作方外部门店编码
	 */
	@ApiField("app_store_code")
	private String appStoreCode;

	/**
	 * 组织渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 平台药师编码
	 */
	@ApiField("pharmacist_code")
	private String pharmacistCode;

	/**
	 * 门店药师姓名
	 */
	@ApiField("pharmacist_name")
	private String pharmacistName;

	/**
	 * 药师状态；1-有效；2-无效
	 */
	@ApiField("pharmacist_status")
	private String pharmacistStatus;

	/**
	 * 商家ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	public String getAppStoreCode() {
		return this.appStoreCode;
	}
	public void setAppStoreCode(String appStoreCode) {
		this.appStoreCode = appStoreCode;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPharmacistCode() {
		return this.pharmacistCode;
	}
	public void setPharmacistCode(String pharmacistCode) {
		this.pharmacistCode = pharmacistCode;
	}

	public String getPharmacistName() {
		return this.pharmacistName;
	}
	public void setPharmacistName(String pharmacistName) {
		this.pharmacistName = pharmacistName;
	}

	public String getPharmacistStatus() {
		return this.pharmacistStatus;
	}
	public void setPharmacistStatus(String pharmacistStatus) {
		this.pharmacistStatus = pharmacistStatus;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

}
