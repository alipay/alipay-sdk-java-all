package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能定价配制同步
 *
 * @author auto create
 * @since 1.0, 2019-12-11 20:32:24
 */
public class AlipayDataAiservicePriceoptimizerConfigSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3784512334666497714L;

	/**
	 * 内部接口版本号
	 */
	@ApiField("app_version")
	private String appVersion;

	/**
	 * 事件发生时间
	 */
	@ApiField("biz_time")
	private String bizTime;

	/**
	 * 操作的内容，存json；
接入方需要沟通具体传入的参数和对应的含义，并以key-value格式传入。
	 */
	@ApiField("op_content")
	private String opContent;

	/**
	 * 操作类型,如
config_modify:修改配置
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 产品类型，如 online_car:网约车 card50:50元储值卡
	 */
	@ApiField("product_type")
	private String productType;

	/**
	 * 标识业务场景
single_pay:单次支付定价 
stored_value_card:储值卡
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 接入方名称,不同业务方的区分
	 */
	@ApiField("service_name")
	private String serviceName;

	/**
	 * 渠道
alipay_tinyapp:支付宝小程序
app:app客户端
	 */
	@ApiField("trade_channel")
	private String tradeChannel;

	public String getAppVersion() {
		return this.appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}

	public String getBizTime() {
		return this.bizTime;
	}
	public void setBizTime(String bizTime) {
		this.bizTime = bizTime;
	}

	public String getOpContent() {
		return this.opContent;
	}
	public void setOpContent(String opContent) {
		this.opContent = opContent;
	}

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public String getProductType() {
		return this.productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getServiceName() {
		return this.serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getTradeChannel() {
		return this.tradeChannel;
	}
	public void setTradeChannel(String tradeChannel) {
		this.tradeChannel = tradeChannel;
	}

}
