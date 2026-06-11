package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 集团商户入驻签约状态查询
 *
 * @author auto create
 * @since 1.0, 2026-06-10 16:14:45
 */
public class AntMerchantExpandGroupEntrysignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5191551223431881333L;

	/**
	 * openid 是支付宝用户在应用维度下的唯一标识。
● 支付宝用户访问小程序、网页移动应用、生活号等应用，会产生唯一的 openid。并且对于同一用户，不同应用的 openid 是不同的。
● 例如，对于不同小程序，同一用户的 openid 不同；同理，对于不同的网页移动应用，同一用户的 openid 也是不同的。
	 */
	@ApiField("entry_sign_open_id")
	private String entrySignOpenId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getEntrySignOpenId() {
		return this.entrySignOpenId;
	}
	public void setEntrySignOpenId(String entrySignOpenId) {
		this.entrySignOpenId = entrySignOpenId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
