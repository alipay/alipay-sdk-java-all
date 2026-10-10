package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 企业委托代理支付
 *
 * @author auto create
 * @since 1.0, 2026-09-28 23:04:27
 */
public class AlipayTradeEnterpriseDelegationPayModel extends AlipayObject {

	private static final long serialVersionUID = 4654748436486167132L;

	/**
	 * 支付宝系统中用以唯一标识用户签约记录的编号（用户签约成功后的协议号 ）
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 授权场景类型
	 */
	@ApiField("authorization_scene")
	private String authorizationScene;

	/**
	 * 授权类型
	 */
	@ApiField("authorization_type")
	private String authorizationType;

	/**
	 * 业务参数
	 */
	@ApiField("business_params")
	private String businessParams;

	/**
	 * 指定支付渠道,单通道扣款,扣款失败则交易失败,不轮扣用户其他资产
	 */
	@ApiField("enable_pay_channels")
	private String enablePayChannels;

	/**
	 * 业务扩展信息,json格式
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 服务商传入的外部订单号
	 */
	@ApiField("external_order_no")
	private String externalOrderNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 铁路或者其他收单产品生产的订单串
	 */
	@ApiField("order_str")
	private String orderStr;

	/**
	 * 预下单ID，如果是预下单场景传预下单ID,如果是创单场景可以直接传递交易号
	 */
	@ApiField("prepay_id")
	private String prepayId;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getAuthorizationScene() {
		return this.authorizationScene;
	}
	public void setAuthorizationScene(String authorizationScene) {
		this.authorizationScene = authorizationScene;
	}

	public String getAuthorizationType() {
		return this.authorizationType;
	}
	public void setAuthorizationType(String authorizationType) {
		this.authorizationType = authorizationType;
	}

	public String getBusinessParams() {
		return this.businessParams;
	}
	public void setBusinessParams(String businessParams) {
		this.businessParams = businessParams;
	}

	public String getEnablePayChannels() {
		return this.enablePayChannels;
	}
	public void setEnablePayChannels(String enablePayChannels) {
		this.enablePayChannels = enablePayChannels;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getExternalOrderNo() {
		return this.externalOrderNo;
	}
	public void setExternalOrderNo(String externalOrderNo) {
		this.externalOrderNo = externalOrderNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderStr() {
		return this.orderStr;
	}
	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}

	public String getPrepayId() {
		return this.prepayId;
	}
	public void setPrepayId(String prepayId) {
		this.prepayId = prepayId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
