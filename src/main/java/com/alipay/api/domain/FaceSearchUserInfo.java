package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 账户信息
 *
 * @author auto create
 * @since 1.0, 2018-09-07 23:09:38
 */
public class FaceSearchUserInfo extends AlipayObject {

	private static final long serialVersionUID = 7865296335157573587L;

	/**
	 * 自定义用户标识
	 */
	@ApiField("customuserid")
	private String customuserid;

	/**
	 * 商户标识
	 */
	@ApiField("merchantid")
	private String merchantid;

	/**
	 * 商户uid
	 */
	@ApiField("merchantuid")
	private String merchantuid;

	/**
	 * 分数
	 */
	@ApiField("score")
	private String score;

	public String getCustomuserid() {
		return this.customuserid;
	}
	public void setCustomuserid(String customuserid) {
		this.customuserid = customuserid;
	}

	public String getMerchantid() {
		return this.merchantid;
	}
	public void setMerchantid(String merchantid) {
		this.merchantid = merchantid;
	}

	public String getMerchantuid() {
		return this.merchantuid;
	}
	public void setMerchantuid(String merchantuid) {
		this.merchantuid = merchantuid;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

}
