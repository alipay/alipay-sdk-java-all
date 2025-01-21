package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 机构专户查询是否用户已开户
 *
 * @author auto create
 * @since 1.0, 2024-12-13 15:03:24
 */
public class AlipayFinancialnetAuthSpaccountConsultModel extends AlipayObject {

	private static final long serialVersionUID = 4261756684162163179L;

	/**
	 * 业务标识ID
	 */
	@ApiField("biz_identity")
	private String bizIdentity;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 签约产品ID
	 */
	@ApiField("sign_product_id")
	private String signProductId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSignProductId() {
		return this.signProductId;
	}
	public void setSignProductId(String signProductId) {
		this.signProductId = signProductId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
