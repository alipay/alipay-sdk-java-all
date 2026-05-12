package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-04-29 15:17:47
 */
public class NfcDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 6433549899692658654L;

	/**
	 * 设备号
	 */
	@ApiField("device_id")
	private String deviceId;

	/**
	 * 设备类型：N7：N7，蓝环：BLUE_COIL，音箱：SPEAKER
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 平台侧商户号
	 */
	@ApiField("merchant_no")
	private String merchantNo;

	/**
	 * 商户类型
	 */
	@ApiField("merchant_type")
	private String merchantType;

	public String getDeviceId() {
		return this.deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public String getMerchantType() {
		return this.merchantType;
	}
	public void setMerchantType(String merchantType) {
		this.merchantType = merchantType;
	}

}
