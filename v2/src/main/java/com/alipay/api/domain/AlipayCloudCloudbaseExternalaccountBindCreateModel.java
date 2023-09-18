package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部账号绑定
 *
 * @author auto create
 * @since 1.0, 2023-08-13 21:55:17
 */
public class AlipayCloudCloudbaseExternalaccountBindCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3778552152563332281L;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 支付宝用户ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 预绑定ID
	 */
	@ApiField("prebind_id")
	private String prebindId;

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

	public String getPrebindId() {
		return this.prebindId;
	}
	public void setPrebindId(String prebindId) {
		this.prebindId = prebindId;
	}

}
