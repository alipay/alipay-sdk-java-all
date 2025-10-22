package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客税筹签约链接生成
 *
 * @author auto create
 * @since 1.0, 2023-12-04 19:57:30
 */
public class AlipayCommerceCommonUsertaxbillsignCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5169382861131232154L;

	/**
	 * 淘客签约完成后的回跳地址
	 */
	@ApiField("back_url")
	private String backUrl;

	/**
	 * 需要签约淘客的userId
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 需要签约淘客的openId
	 */
	@ApiField("sign_user_open_id")
	private String signUserOpenId;

	public String getBackUrl() {
		return this.backUrl;
	}
	public void setBackUrl(String backUrl) {
		this.backUrl = backUrl;
	}

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

	public String getSignUserOpenId() {
		return this.signUserOpenId;
	}
	public void setSignUserOpenId(String signUserOpenId) {
		this.signUserOpenId = signUserOpenId;
	}

}
