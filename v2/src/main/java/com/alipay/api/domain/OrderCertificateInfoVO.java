package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 本地生活商品凭证信息
 *
 * @author auto create
 * @since 1.0, 2024-01-29 14:39:10
 */
public class OrderCertificateInfoVO extends AlipayObject {

	private static final long serialVersionUID = 2866132611918965712L;

	/**
	 * 本地商品对应的凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 本地生活商品凭证生效日期
	 */
	@ApiField("gmt_active")
	private String gmtActive;

	/**
	 * 本地生活商品凭证失效日期
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 本地生活商品凭证核销时间
	 */
	@ApiField("use_time")
	private String useTime;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getGmtActive() {
		return this.gmtActive;
	}
	public void setGmtActive(String gmtActive) {
		this.gmtActive = gmtActive;
	}

	public String getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getUseTime() {
		return this.useTime;
	}
	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

}
