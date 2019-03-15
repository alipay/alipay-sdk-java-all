package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下拉新结算明细数据模型
 *
 * @author auto create
 * @since 1.0, 2019-01-10 11:11:47
 */
public class OfflineInviteNewerDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 7118525895275472227L;

	/**
	 * 被邀请手机号
	 */
	@ApiField("invited_phone")
	private String invitedPhone;

	/**
	 * 二级渠道
	 */
	@ApiField("partner_id")
	private String partnerId;

	/**
	 * 一级渠道
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 是否可结算核销用户
	 */
	@ApiField("settled")
	private Boolean settled;

	/**
	 * 是否可结算的绑卡用户
	 */
	@ApiField("settled_and_bind")
	private Boolean settledAndBind;

	/**
	 * 绑卡时间
	 */
	@ApiField("user_bind_card_time")
	private Date userBindCardTime;

	/**
	 * 用户实名时间
	 */
	@ApiField("user_cert_time")
	private String userCertTime;

	/**
	 * 用户领奖时间
	 */
	@ApiField("user_prize_time")
	private Date userPrizeTime;

	public String getInvitedPhone() {
		return this.invitedPhone;
	}
	public void setInvitedPhone(String invitedPhone) {
		this.invitedPhone = invitedPhone;
	}

	public String getPartnerId() {
		return this.partnerId;
	}
	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public Boolean getSettled() {
		return this.settled;
	}
	public void setSettled(Boolean settled) {
		this.settled = settled;
	}

	public Boolean getSettledAndBind() {
		return this.settledAndBind;
	}
	public void setSettledAndBind(Boolean settledAndBind) {
		this.settledAndBind = settledAndBind;
	}

	public Date getUserBindCardTime() {
		return this.userBindCardTime;
	}
	public void setUserBindCardTime(Date userBindCardTime) {
		this.userBindCardTime = userBindCardTime;
	}

	public String getUserCertTime() {
		return this.userCertTime;
	}
	public void setUserCertTime(String userCertTime) {
		this.userCertTime = userCertTime;
	}

	public Date getUserPrizeTime() {
		return this.userPrizeTime;
	}
	public void setUserPrizeTime(Date userPrizeTime) {
		this.userPrizeTime = userPrizeTime;
	}

}
