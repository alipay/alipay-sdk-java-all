package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * OpenApiOperationAnalysisCustomerTrdLvlAliasDTO
 *
 * @author auto create
 * @since 1.0, 2024-08-05 09:49:54
 */
public class OpenApiOperationAnalysisCustomerTrdLvlAliasDTO extends AlipayObject {

	private static final long serialVersionUID = 1354697974875989145L;

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
	 * 数据平台类型，数据上报的平台类型枚举.所有枚举情况可以查看入参的该字段的描述
	 */
	@ApiField("channel_type")
	private String channelType;

	/**
	 * 业务的数据日期
	 */
	@ApiField("dt")
	private String dt;

	/**
	 * 消费层级总人数
	 */
	@ApiField("level_all_uv")
	private OperationValueLongDTO levelAllUv;

	/**
	 * 层级访问人数
	 */
	@ApiField("level_uv")
	private OperationValueLongDTO levelUv;

	/**
	 * 层级访问人数占比
	 */
	@ApiField("level_uv_percent")
	private OperationValueBaseDTO levelUvPercent;

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
	 * 消费层级粒度
	 */
	@ApiField("trade_level_granularity")
	private OperationValueLongDTO tradeLevelGranularity;

	/**
	 * 消费层级
	 */
	@ApiField("traded_level")
	private String tradedLevel;

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

	public OperationValueLongDTO getLevelAllUv() {
		return this.levelAllUv;
	}
	public void setLevelAllUv(OperationValueLongDTO levelAllUv) {
		this.levelAllUv = levelAllUv;
	}

	public OperationValueLongDTO getLevelUv() {
		return this.levelUv;
	}
	public void setLevelUv(OperationValueLongDTO levelUv) {
		this.levelUv = levelUv;
	}

	public OperationValueBaseDTO getLevelUvPercent() {
		return this.levelUvPercent;
	}
	public void setLevelUvPercent(OperationValueBaseDTO levelUvPercent) {
		this.levelUvPercent = levelUvPercent;
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

	public OperationValueLongDTO getTradeLevelGranularity() {
		return this.tradeLevelGranularity;
	}
	public void setTradeLevelGranularity(OperationValueLongDTO tradeLevelGranularity) {
		this.tradeLevelGranularity = tradeLevelGranularity;
	}

	public String getTradedLevel() {
		return this.tradedLevel;
	}
	public void setTradedLevel(String tradedLevel) {
		this.tradedLevel = tradedLevel;
	}

}
