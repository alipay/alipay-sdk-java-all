package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 以旧换新政府补贴项目内部平台资格认证接口
 *
 * @author auto create
 * @since 1.0, 2024-09-18 10:30:02
 */
public class AlipayFinancialnetAuthUserInnerCertifyModel extends AlipayObject {

	private static final long serialVersionUID = 7612322256362158471L;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 传入外部商户的名称即可，记录发起认证的用户来自哪一个外部商户
	 */
	@ApiField("source")
	private String source;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
