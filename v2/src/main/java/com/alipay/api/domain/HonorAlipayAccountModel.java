package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝账号模型
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:06:24
 */
public class HonorAlipayAccountModel extends AlipayObject {

	private static final long serialVersionUID = 3218952922735543428L;

	/**
	 * 账号 (掩码)
	 */
	@ApiField("account")
	private String account;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 优先级：从小到大，小优先级高
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 姓名 (掩码)
	 */
	@ApiField("real_name")
	private String realName;

	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}

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

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

}
