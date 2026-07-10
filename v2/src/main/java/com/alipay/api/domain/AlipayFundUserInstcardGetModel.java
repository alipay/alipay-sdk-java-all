package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 银行代发开立外标卡接口
 *
 * @author auto create
 * @since 1.0, 2026-04-15 20:57:45
 */
public class AlipayFundUserInstcardGetModel extends AlipayObject {

	private static final long serialVersionUID = 5265147966675182888L;

	/**
	 * 根据实际业务，转账场景传以下8大场景其中之一：
佣金报酬，行政补贴，业务结算，二手回收，企业退款，现金营销，保险理赔，公益补助
根据实际业务，充值场景传以下4大场景其中之一：
销卡充值，企业充值，账户充值，营销充值
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 用户账户ID，如支付宝UID, 场景钱包ID,支付宝登录账号等
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 用户账户ID，如支付宝UID, 场景钱包ID,支付宝登录账号等
	 */
	@ApiField("identity_open_id")
	private String identityOpenId;

	/**
	 * 用户账户类型，如ALIPAY_USER_ID支付宝UID、SCENE_WALLET_ID 支付宝场景钱包、ALIPAY_LOGON_ID 支付宝登录ID
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 合作银行在支付宝侧的PID
	 */
	@ApiField("inst_alipay_pid")
	private String instAlipayPid;

	/**
	 * 当identityType=ALIPAY_LOGIN_ID时，name必选
	 */
	@ApiField("name")
	private String name;

	/**
	 * 支付宝open_id
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 产品码，固定值：BANK_TO_ALIPAY
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 支付宝uid
	 */
	@ApiField("user_id")
	private String userId;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityOpenId() {
		return this.identityOpenId;
	}
	public void setIdentityOpenId(String identityOpenId) {
		this.identityOpenId = identityOpenId;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getInstAlipayPid() {
		return this.instAlipayPid;
	}
	public void setInstAlipayPid(String instAlipayPid) {
		this.instAlipayPid = instAlipayPid;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
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

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
