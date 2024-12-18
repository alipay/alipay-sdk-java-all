package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OpenApiOperationAnalysisCustomerAliasDTO
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:53
 */
public class OpenApiOperationAnalysisCustomerAliasDTO extends AlipayObject {

	private static final long serialVersionUID = 2131529864185598265L;

	/**
	 * 小程序应用ID，分配给开发者的应用ID
	 */
	@ApiField("alipay_app_id")
	private String alipayAppId;

	/**
	 * 小程序应用名称，开发者的应用设置的小程序应用名称
	 */
	@ApiField("alipay_app_name")
	private String alipayAppName;

	/**
	 * 数据平台端类型，数据上报的平台类型枚举，所有枚举情况请查看入参的该字段。
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 业务的数据日期
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 多端小程序应用ID，非支付宝平台的其他平台的小程序应用ID
	 */
	@ApiField("multi_app_id")
	private String multiAppId;

	/**
	 * 多端小程序应用名称，非支付宝平台的小程序应用名称
	 */
	@ApiField("multi_app_name")
	private String multiAppName;

	/**
	 * 支付转化率
	 */
	@ApiField("order_traded_user_cvr")
	private OperationValueBaseDTO orderTradedUserCvr;

	/**
	 * 下单人数
	 */
	@ApiField("tapp_order_user_cnt")
	private OperationValueLongDTO tappOrderUserCnt;

	/**
	 * 支付人数
	 */
	@ApiField("tapp_traded_user_cnt")
	private OperationValueLongDTO tappTradedUserCnt;

	/**
	 * 交易整体转化率
	 */
	@ApiField("traded_user_cvr")
	private OperationValueBaseDTO tradedUserCvr;

	/**
	 * 用户类型
	 */
	@ApiField("user_type")
	private String userType;

	/**
	 * 访问人数
	 */
	@ApiField("uv")
	private OperationValueLongDTO uv;

	/**
	 * 下单转化率
	 */
	@ApiField("visit_order_user_cvr")
	private OperationValueBaseDTO visitOrderUserCvr;

	public String getAlipayAppId() {
		return this.alipayAppId;
	}
	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getAlipayAppName() {
		return this.alipayAppName;
	}
	public void setAlipayAppName(String alipayAppName) {
		this.alipayAppName = alipayAppName;
	}

	public String getChannelType() {
		return this.channelType;
	}
	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getDt() {
		return this.dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}

	public String getMultiAppId() {
		return this.multiAppId;
	}
	public void setMultiAppId(String multiAppId) {
		this.multiAppId = multiAppId;
	}

	public String getMultiAppName() {
		return this.multiAppName;
	}
	public void setMultiAppName(String multiAppName) {
		this.multiAppName = multiAppName;
	}

	public OperationValueBaseDTO getOrderTradedUserCvr() {
		return this.orderTradedUserCvr;
	}
	public void setOrderTradedUserCvr(OperationValueBaseDTO orderTradedUserCvr) {
		this.orderTradedUserCvr = orderTradedUserCvr;
	}

	public OperationValueLongDTO getTappOrderUserCnt() {
		return this.tappOrderUserCnt;
	}
	public void setTappOrderUserCnt(OperationValueLongDTO tappOrderUserCnt) {
		this.tappOrderUserCnt = tappOrderUserCnt;
	}

	public OperationValueLongDTO getTappTradedUserCnt() {
		return this.tappTradedUserCnt;
	}
	public void setTappTradedUserCnt(OperationValueLongDTO tappTradedUserCnt) {
		this.tappTradedUserCnt = tappTradedUserCnt;
	}

	public OperationValueBaseDTO getTradedUserCvr() {
		return this.tradedUserCvr;
	}
	public void setTradedUserCvr(OperationValueBaseDTO tradedUserCvr) {
		this.tradedUserCvr = tradedUserCvr;
	}

	public String getUserType() {
		return this.userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	public OperationValueLongDTO getUv() {
		return this.uv;
	}
	public void setUv(OperationValueLongDTO uv) {
		this.uv = uv;
	}

	public OperationValueBaseDTO getVisitOrderUserCvr() {
		return this.visitOrderUserCvr;
	}
	public void setVisitOrderUserCvr(OperationValueBaseDTO visitOrderUserCvr) {
		this.visitOrderUserCvr = visitOrderUserCvr;
	}

}
