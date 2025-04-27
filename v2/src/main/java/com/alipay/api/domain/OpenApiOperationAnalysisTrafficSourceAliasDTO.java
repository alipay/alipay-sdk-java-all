package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 经营分析-流量分析-流量来源分析返回结构体
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:50
 */
public class OpenApiOperationAnalysisTrafficSourceAliasDTO extends AlipayObject {

	private static final long serialVersionUID = 4153794739727333832L;

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
	 * 数据平台类型，数据上报的平台类型
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 业务的数据日期
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 一级来源渠道
	 */
	@ApiField("first_source_type")
	private String firstSourceType;

	/**
	 * 多端小程序应用ID，非支付宝平台的其他平台的小程序应用ID
	 */
	@ApiField("multi_app_id")
	private String multiAppId;

	/**
	 * 多端小程序应用ID，非支付宝平台的其他平台的小程序应用ID
	 */
	@ApiField("multi_app_name")
	private String multiAppName;

	/**
	 * 二级来源渠道
	 */
	@ApiField("second_source_type")
	private String secondSourceType;

	/**
	 * 加购人数
	 */
	@ApiField("tapp_add_user_cnt")
	private OperationValueLongDTO tappAddUserCnt;

	/**
	 * 下单支付人数转化率
	 */
	@ApiField("tapp_order_traded_user_cvr")
	private OperationValueBaseDTO tappOrderTradedUserCvr;

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
	 * 场景访问人数
	 */
	@ApiField("tapp_uv")
	private OperationValueLongDTO tappUv;

	/**
	 * 场景访问人数占比
	 */
	@ApiField("tapp_uv_rate")
	private OperationValueBaseDTO tappUvRate;

	/**
	 * 访问下单人数转化率
	 */
	@ApiField("tapp_visit_order_user_cvr")
	private OperationValueBaseDTO tappVisitOrderUserCvr;

	/**
	 * 访问支付人数转化率
	 */
	@ApiField("tapp_visit_traded_user_cvr")
	private OperationValueBaseDTO tappVisitTradedUserCvr;

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

	public String getFirstSourceType() {
		return this.firstSourceType;
	}
	public void setFirstSourceType(String firstSourceType) {
		this.firstSourceType = firstSourceType;
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

	public String getSecondSourceType() {
		return this.secondSourceType;
	}
	public void setSecondSourceType(String secondSourceType) {
		this.secondSourceType = secondSourceType;
	}

	public OperationValueLongDTO getTappAddUserCnt() {
		return this.tappAddUserCnt;
	}
	public void setTappAddUserCnt(OperationValueLongDTO tappAddUserCnt) {
		this.tappAddUserCnt = tappAddUserCnt;
	}

	public OperationValueBaseDTO getTappOrderTradedUserCvr() {
		return this.tappOrderTradedUserCvr;
	}
	public void setTappOrderTradedUserCvr(OperationValueBaseDTO tappOrderTradedUserCvr) {
		this.tappOrderTradedUserCvr = tappOrderTradedUserCvr;
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

	public OperationValueLongDTO getTappUv() {
		return this.tappUv;
	}
	public void setTappUv(OperationValueLongDTO tappUv) {
		this.tappUv = tappUv;
	}

	public OperationValueBaseDTO getTappUvRate() {
		return this.tappUvRate;
	}
	public void setTappUvRate(OperationValueBaseDTO tappUvRate) {
		this.tappUvRate = tappUvRate;
	}

	public OperationValueBaseDTO getTappVisitOrderUserCvr() {
		return this.tappVisitOrderUserCvr;
	}
	public void setTappVisitOrderUserCvr(OperationValueBaseDTO tappVisitOrderUserCvr) {
		this.tappVisitOrderUserCvr = tappVisitOrderUserCvr;
	}

	public OperationValueBaseDTO getTappVisitTradedUserCvr() {
		return this.tappVisitTradedUserCvr;
	}
	public void setTappVisitTradedUserCvr(OperationValueBaseDTO tappVisitTradedUserCvr) {
		this.tappVisitTradedUserCvr = tappVisitTradedUserCvr;
	}

}
