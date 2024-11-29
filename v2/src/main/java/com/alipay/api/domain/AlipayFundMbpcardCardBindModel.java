package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 预付卡用户绑卡
 *
 * @author auto create
 * @since 1.0, 2023-10-25 17:54:04
 */
public class AlipayFundMbpcardCardBindModel extends AlipayObject {

	private static final long serialVersionUID = 1427612533873646449L;

	/**
	 * 支付宝账号
	 */
	@ApiField("alipay_identity_id")
	private String alipayIdentityId;

	/**
	 * 支付宝账号类型
ALIPAY_LOGON_ID：登录号
ALIPAY_USER_ID：会员号
	 */
	@ApiField("alipay_identity_type")
	private String alipayIdentityType;

	/**
	 * 绑卡用户名称
	 */
	@ApiField("bind_user_name")
	private String bindUserName;

	/**
	 * 场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * x6570cNf
	 */
	@ApiField("card_password")
	private String cardPassword;

	/**
	 * 支付宝开放平台账号
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getAlipayIdentityId() {
		return this.alipayIdentityId;
	}
	public void setAlipayIdentityId(String alipayIdentityId) {
		this.alipayIdentityId = alipayIdentityId;
	}

	public String getAlipayIdentityType() {
		return this.alipayIdentityType;
	}
	public void setAlipayIdentityType(String alipayIdentityType) {
		this.alipayIdentityType = alipayIdentityType;
	}

	public String getBindUserName() {
		return this.bindUserName;
	}
	public void setBindUserName(String bindUserName) {
		this.bindUserName = bindUserName;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardPassword() {
		return this.cardPassword;
	}
	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
