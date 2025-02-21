package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询选中账户的简要信息
 *
 * @author auto create
 * @since 1.0, 2023-10-24 13:58:16
 */
public class AlipayCommerceMedicalIotfmUsersimpleinfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3771181166653214914L;

	/**
	 * 插件访问令牌
	 */
	@ApiField("access_token")
	private String accessToken;

	/**
	 * 设备所在城市编码
	 */
	@ApiField("device_city_code")
	private String deviceCityCode;

	/**
	 * 子账户机构医保电子卡号
	 */
	@ApiField("fm_ins_card_id")
	private String fmInsCardId;

	/**
	 * 主账户刷脸ftoken
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 主账户支付宝用户openid
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 主账户其他支付宝账号openid
	 */
	@ApiField("other_open_id")
	private String otherOpenId;

	/**
	 * 主账户其他支付宝账号uid
	 */
	@ApiField("other_user_id")
	private String otherUserId;

	/**
	 * 终端sn
	 */
	@ApiField("term_sn")
	private String termSn;

	/**
	 * 医保sn
	 */
	@ApiField("tmnl_sn")
	private String tmnlSn;

	/**
	 * 主账户支付宝用户uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getAccessToken() {
		return this.accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}

	public String getDeviceCityCode() {
		return this.deviceCityCode;
	}
	public void setDeviceCityCode(String deviceCityCode) {
		this.deviceCityCode = deviceCityCode;
	}

	public String getFmInsCardId() {
		return this.fmInsCardId;
	}
	public void setFmInsCardId(String fmInsCardId) {
		this.fmInsCardId = fmInsCardId;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOtherOpenId() {
		return this.otherOpenId;
	}
	public void setOtherOpenId(String otherOpenId) {
		this.otherOpenId = otherOpenId;
	}

	public String getOtherUserId() {
		return this.otherUserId;
	}
	public void setOtherUserId(String otherUserId) {
		this.otherUserId = otherUserId;
	}

	public String getTermSn() {
		return this.termSn;
	}
	public void setTermSn(String termSn) {
		this.termSn = termSn;
	}

	public String getTmnlSn() {
		return this.tmnlSn;
	}
	public void setTmnlSn(String tmnlSn) {
		this.tmnlSn = tmnlSn;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
