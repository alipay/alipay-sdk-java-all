package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户已签约卡信息
 *
 * @author auto create
 * @since 1.0, 2021-01-05 16:55:13
 */
public class AlipayFinancialnetAuthExpressSigncardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5541366675844516369L;

	/**
	 * 业务标识
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizIdentity() {
		return this.bizIdentity;
	}
	public void setBizIdentity(String bizIdentity) {
		this.bizIdentity = bizIdentity;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
