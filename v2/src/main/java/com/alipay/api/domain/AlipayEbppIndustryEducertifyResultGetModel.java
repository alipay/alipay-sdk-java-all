package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取学历认证数据
 *
 * @author auto create
 * @since 1.0, 2026-05-18 10:47:49
 */
public class AlipayEbppIndustryEducertifyResultGetModel extends AlipayObject {

	private static final long serialVersionUID = 8288985697538919165L;

	/**
	 * 业务ID,一般为UUID字符串,与获取certify_token时上传的业务ID保持一致。
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 市民中心档案保险箱授权票据，非市民中心档案保险箱授权不用填
	 */
	@ApiField("certify_auth_code")
	private String certifyAuthCode;

	/**
	 * 业务票据
	 */
	@ApiField("certify_token")
	private String certifyToken;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 支付宝用户的userId
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getCertifyAuthCode() {
		return this.certifyAuthCode;
	}
	public void setCertifyAuthCode(String certifyAuthCode) {
		this.certifyAuthCode = certifyAuthCode;
	}

	public String getCertifyToken() {
		return this.certifyToken;
	}
	public void setCertifyToken(String certifyToken) {
		this.certifyToken = certifyToken;
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
