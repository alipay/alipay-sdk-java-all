package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用购运营商批量预鉴权查询接口
 *
 * @author auto create
 * @since 1.0, 2026-07-21 17:02:51
 */
public class AlipayCommerceAcommunicationCreditphonePreconsultQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8481291848491653648L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝开放平台ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 预鉴权请求流水号（全局唯一）
	 */
	@ApiField("request_no")
	private String requestNo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getRequestNo() {
		return this.requestNo;
	}
	public void setRequestNo(String requestNo) {
		this.requestNo = requestNo;
	}

}
