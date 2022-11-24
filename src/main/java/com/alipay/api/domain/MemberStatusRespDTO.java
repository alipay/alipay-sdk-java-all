package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 员企关系状态返回
 *
 * @author auto create
 * @since 1.0, 2022-11-22 15:25:31
 */
public class MemberStatusRespDTO extends AlipayObject {

	private static final long serialVersionUID = 8286171347883134379L;

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
