package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 酒店在PSB服务商侧的信息
 *
 * @author auto create
 * @since 1.0, 2022-06-17 14:03:22
 */
public class PsbHotelInfo extends AlipayObject {

	private static final long serialVersionUID = 6136993938326496465L;

	/**
	 * PSB中台将酒店授权给PSB服务商待调用的授权码
	 */
	@ApiField("license_key")
	private String licenseKey;

	/**
	 * PSB服务商的标识，请提前联系支付宝技术人员来配置
	 */
	@ApiField("psb_code")
	private String psbCode;

	/**
	 * PSB服务商侧维护的酒店唯一标识
	 */
	@ApiField("psb_hotel_id")
	private String psbHotelId;

	public String getLicenseKey() {
		return this.licenseKey;
	}
	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}

	public String getPsbCode() {
		return this.psbCode;
	}
	public void setPsbCode(String psbCode) {
		this.psbCode = psbCode;
	}

	public String getPsbHotelId() {
		return this.psbHotelId;
	}
	public void setPsbHotelId(String psbHotelId) {
		this.psbHotelId = psbHotelId;
	}

}
