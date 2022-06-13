package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线上拉新结算明细数据模型
 *
 * @author auto create
 * @since 1.0, 2019-01-04 15:40:43
 */
public class OnlineInviteNewerDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 4731913585758249982L;

	/**
	 * 用户首登/回流时间
	 */
	@ApiField("fst_login_time")
	private Date fstLoginTime;

	/**
	 * 绑定时间
	 */
	@ApiField("invite_time")
	private Date inviteTime;

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
	 * 用户实名时间
	 */
	@ApiField("user_cert_time")
	private Date userCertTime;

	public Date getFstLoginTime() {
		return this.fstLoginTime;
	}
	public void setFstLoginTime(Date fstLoginTime) {
		this.fstLoginTime = fstLoginTime;
	}

	public Date getInviteTime() {
		return this.inviteTime;
	}
	public void setInviteTime(Date inviteTime) {
		this.inviteTime = inviteTime;
	}

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

	public Date getUserCertTime() {
		return this.userCertTime;
	}
	public void setUserCertTime(Date userCertTime) {
		this.userCertTime = userCertTime;
	}

}
