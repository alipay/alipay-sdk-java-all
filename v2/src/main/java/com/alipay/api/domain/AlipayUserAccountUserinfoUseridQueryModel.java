package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取支付宝用户ID
 *
 * @author auto create
 * @since 1.0, 2024-11-06 20:13:10
 */
public class AlipayUserAccountUserinfoUseridQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2513672913154699627L;

	/**
	 * 用来描述及校验业务来源，如果不传会提示异常
	 */
	@ApiField("biz_from")
	private String bizFrom;

	/**
	 * 用来标注qr_code使用业务场景
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 获取支付宝用户id的令牌
	 */
	@ApiField("qr_code")
	private String qrCode;

	public String getBizFrom() {
		return this.bizFrom;
	}
	public void setBizFrom(String bizFrom) {
		this.bizFrom = bizFrom;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getQrCode() {
		return this.qrCode;
	}
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

}
