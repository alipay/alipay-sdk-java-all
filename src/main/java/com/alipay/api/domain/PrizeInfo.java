package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 奖品信息
 *
 * @author auto create
 * @since 1.0, 2018-12-25 15:38:50
 */
public class PrizeInfo extends AlipayObject {

	private static final long serialVersionUID = 1234974446496678587L;

	/**
	 * 奖品使用地址
	 */
	@ApiField("activity_url")
	private String activityUrl;

	/**
	 * 脱敏后的支付宝登陆账号
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 奖品金额,单位为元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 奖品描述信息
	 */
	@ApiField("desc")
	private String desc;

	/**
	 * 奖品发放时间，格式为yyyy-MM-dd HH:mm:ss；有多个奖品时按发放时间倒序排列
	 */
	@ApiField("gmt_create")
	private String gmtCreate;

	/**
	 * 奖品过期时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_expired")
	private String gmtExpired;

	/**
	 * 奖品ID
	 */
	@ApiField("id")
	private String id;

	/**
	 * 奖品名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 奖品状态，可枚举，分别为“可用”(ENABLED)、“不可用”(DISABLED)、“未激活”(UNACTIVATED)
	 */
	@ApiField("status")
	private String status;

	public String getActivityUrl() {
		return this.activityUrl;
	}
	public void setActivityUrl(String activityUrl) {
		this.activityUrl = activityUrl;
	}

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
	}

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getDesc() {
		return this.desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(String gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public String getGmtExpired() {
		return this.gmtExpired;
	}
	public void setGmtExpired(String gmtExpired) {
		this.gmtExpired = gmtExpired;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
