package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 线下拉新结算明细数据模型
 *
 * @author auto create
 * @since 1.0, 2019-07-15 11:39:55
 */
public class OfflineInviteNewerDetailInfo extends AlipayObject {

	private static final long serialVersionUID = 2737146129466831237L;

	/**
	 * 城市
	 */
	@ApiField("city_name")
	private String cityName;

	/**
	 * 扩展信息字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 被邀请手机号
	 */
	@ApiField("invited_phone")
	private String invitedPhone;

	/**
	 * 地域系数
	 */
	@ApiField("lbs_rate")
	private String lbsRate;

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
	 * 省份
	 */
	@ApiField("province_name")
	private String provinceName;

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

	public String getCityName() {
		return this.cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getInvitedPhone() {
		return this.invitedPhone;
	}
	public void setInvitedPhone(String invitedPhone) {
		this.invitedPhone = invitedPhone;
	}

	public String getLbsRate() {
		return this.lbsRate;
	}
	public void setLbsRate(String lbsRate) {
		this.lbsRate = lbsRate;
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

	public String getProvinceName() {
		return this.provinceName;
	}
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
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
