package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 手机设备信息
 *
 * @author auto create
 * @since 1.0, 2021-06-17 20:40:05
 */
public class MobileDeviceInfo extends AlipayObject {

	private static final long serialVersionUID = 7735942143914175511L;

	/**
	 * 设备IMEI信息
	 */
	@ApiField("imei")
	private String imei;

	/**
	 * 设备品牌
	 */
	@ApiField("mobile_brand")
	private String mobileBrand;

	/**
	 * 手机型号
	 */
	@ApiField("mobile_type")
	private String mobileType;

	public String getImei() {
		return this.imei;
	}
	public void setImei(String imei) {
		this.imei = imei;
	}

	public String getMobileBrand() {
		return this.mobileBrand;
	}
	public void setMobileBrand(String mobileBrand) {
		this.mobileBrand = mobileBrand;
	}

	public String getMobileType() {
		return this.mobileType;
	}
	public void setMobileType(String mobileType) {
		this.mobileType = mobileType;
	}

}
