package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险管家沟通多媒体文件实时文件地址获取
 *
 * @author auto create
 * @since 1.0, 2022-06-02 15:37:19
 */
public class AlipayInsCooperationResourceUrlBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7843397845298681453L;

	/**
	 * 请求发生的时间
	 */
	@ApiField("action_time")
	private Date actionTime;

	/**
	 * 请求来源系统功能描述
	 */
	@ApiField("app_name")
	private String appName;

	/**
	 * 来源系统ID
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 来源场景码
	 */
	@ApiField("biz_code")
	private String bizCode;

	/**
	 * 客户唯一标志
	 */
	@ApiField("customer_id")
	private String customerId;

	/**
	 * 资源项ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 文件类型
	 */
	@ApiField("item_type")
	private String itemType;

	/**
	 * 当前操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 服务提供唯一标志
	 */
	@ApiField("provider_code")
	private String providerCode;

	public Date getActionTime() {
		return this.actionTime;
	}
	public void setActionTime(Date actionTime) {
		this.actionTime = actionTime;
	}

	public String getAppName() {
		return this.appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public String getBizCode() {
		return this.bizCode;
	}
	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getCustomerId() {
		return this.customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemType() {
		return this.itemType;
	}
	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getProviderCode() {
		return this.providerCode;
	}
	public void setProviderCode(String providerCode) {
		this.providerCode = providerCode;
	}

}
