package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询用户户号绑定状态
 *
 * @author auto create
 * @since 1.0, 2026-10-08 14:21:58
 */
public class AlipayEbppEbppTransferTransferbillkeyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3875371827956129257L;

	/**
	 * 户号所属的出账机构
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
