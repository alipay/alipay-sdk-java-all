package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝行业公交验码服务
 *
 * @author auto create
 * @since 1.0, 2019-11-26 21:24:18
 */
public class AlipayEcoTrafficCodeVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 7281975284797446844L;

	/**
	 * 凭证服务类型
	 */
	@ApiField("cert_service_type")
	private String certServiceType;

	/**
	 * 凭证类型（卡类型）
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 码值/脱机记录
	 */
	@ApiField("offline_cert")
	private String offlineCert;

	/**
	 * 解析类型：QRCODE/RECORD
	 */
	@ApiField("parse_mode")
	private String parseMode;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public String getCertServiceType() {
		return this.certServiceType;
	}
	public void setCertServiceType(String certServiceType) {
		this.certServiceType = certServiceType;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public String getOfflineCert() {
		return this.offlineCert;
	}
	public void setOfflineCert(String offlineCert) {
		this.offlineCert = offlineCert;
	}

	public String getParseMode() {
		return this.parseMode;
	}
	public void setParseMode(String parseMode) {
		this.parseMode = parseMode;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
