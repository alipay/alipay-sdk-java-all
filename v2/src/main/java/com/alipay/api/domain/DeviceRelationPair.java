package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * n设备绑定关系
 *
 * @author auto create
 * @since 1.0, 2026-04-24 17:06:06
 */
public class DeviceRelationPair extends AlipayObject {

	private static final long serialVersionUID = 3728432833934779995L;

	/**
	 * 设备类型
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 设备绑定的SMID或PID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 绑定的商户类型,标识merchant_id给的pid还是smid
	 */
	@ApiField("merchant_type")
	private String merchantType;

	/**
	 * 设备的sn号
	 */
	@ApiField("sn")
	private String sn;

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
