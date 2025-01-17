package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝账户风险风险
 *
 * @author auto create
 * @since 1.0, 2023-02-07 17:00:15
 */
public class AlipaySecurityRiskCustomerriskrankGetModel extends AlipayObject {

	private static final long serialVersionUID = 2117212122421618148L;

	/**
	 * 证件号码，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 证件类型，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 手机号，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 支付宝账户id ，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 支付宝账户id ，除了场景id必填，其他几个参数不能同时为空
	 */
	@ApiField("user_id")
	private String userId;

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
