package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 场景钱包创单接口
 *
 * @author auto create
 * @since 1.0, 2024-07-15 18:14:19
 */
public class AlipayCloudFundWalletDepositorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6835811981211822869L;

	/**
	 * 充值金额，单位元
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 钱包场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 待邀请用户的支付宝账号： identity_type是ALIPAY_USER_ID填支付宝会员账号； 是ALIPAY_LOGON_ID 填支付宝登录号（支持邮箱和手机号格式）
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 待邀请用户的支付宝账号： identity_type是ALIPAY_USER_ID填支付宝会员账号； 是ALIPAY_LOGON_ID 填支付宝登录号（支持邮箱和手机号格式）
	 */
	@ApiField("identity_open_id")
	private String identityOpenId;

	/**
	 * 待邀请的用户支付宝账号类型，目前支持如下类型： 1、ALIPAY_USER_ID 支付宝的会员ID 2、ALIPAY_LOGON_ID 支付宝登录号，支持邮箱和手机号格式
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 标题描述
	 */
	@ApiField("order_title")
	private String orderTitle;

	/**
	 * 充值外部订单号，用于幂等
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 钱包产品code一般为FUND_TRUSTSHIP
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 订单失效时间。绝对超时时间，格式为yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("time_expire")
	private Date timeExpire;

	/**
	 * 钱包id
	 */
	@ApiField("user_wallet_id")
	private String userWalletId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

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

	public String getOrderTitle() {
		return this.orderTitle;
	}
	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public Date getTimeExpire() {
		return this.timeExpire;
	}
	public void setTimeExpire(Date timeExpire) {
		this.timeExpire = timeExpire;
	}

	public String getUserWalletId() {
		return this.userWalletId;
	}
	public void setUserWalletId(String userWalletId) {
		this.userWalletId = userWalletId;
	}

}
