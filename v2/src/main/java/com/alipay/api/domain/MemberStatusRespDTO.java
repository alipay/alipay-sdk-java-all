package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员企关系状态返回
 *
 * @author auto create
 * @since 1.0, 2022-12-01 11:37:29
 */
public class MemberStatusRespDTO extends AlipayObject {

	private static final long serialVersionUID = 8499299322898747975L;

	/**
	 * 用户支付宝会员openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 员工当前状态：
邀请中（PROCESSING）、正常（NORMAL）、不在企业中（OUT）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户支付宝2088会员号
	 */
	@ApiField("user_id")
	private String userId;

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
