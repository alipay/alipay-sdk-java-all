package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * IoT设备-结果页-展位查询
 *
 * @author auto create
 * @since 1.0, 2021-06-10 10:05:34
 */
public class AlipayMarketingIotBoothQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6613332971999166356L;

	/**
	 * 接口调用版本号
	 */
	@ApiField("api_version")
	private String apiVersion;

	/**
	 * 客户端app信息，设备信息及sdk版本等信息加密后数据
	 */
	@ApiField("app_info")
	private String appInfo;

	/**
	 * 支付宝付款码，dynamic_id_type选择bar_code时必填
	 */
	@ApiField("bar_code")
	private String barCode;

	/**
	 * 支付码类型，可选bar_code、security_code
	 */
	@ApiField("dynamic_id_type")
	private String dynamicIdType;

	/**
	 * 刷脸成功返回的一次性消费码，dynamic_id_type选择security_code时必填
	 */
	@ApiField("ftoken")
	private String ftoken;

	/**
	 * 商家活动ID
	 */
	@ApiField("merchant_plan_id")
	private String merchantPlanId;

	/**
	 * IoT展位码
	 */
	@ApiField("space_code")
	private String spaceCode;

	/**
	 * 交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getAppInfo() {
		return this.appInfo;
	}
	public void setAppInfo(String appInfo) {
		this.appInfo = appInfo;
	}

	public String getBarCode() {
		return this.barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}

	public String getDynamicIdType() {
		return this.dynamicIdType;
	}
	public void setDynamicIdType(String dynamicIdType) {
		this.dynamicIdType = dynamicIdType;
	}

	public String getFtoken() {
		return this.ftoken;
	}
	public void setFtoken(String ftoken) {
		this.ftoken = ftoken;
	}

	public String getMerchantPlanId() {
		return this.merchantPlanId;
	}
	public void setMerchantPlanId(String merchantPlanId) {
		this.merchantPlanId = merchantPlanId;
	}

	public String getSpaceCode() {
		return this.spaceCode;
	}
	public void setSpaceCode(String spaceCode) {
		this.spaceCode = spaceCode;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
