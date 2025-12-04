package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务守约配置
 *
 * @author auto create
 * @since 1.0, 2024-03-11 15:17:02
 */
public class PromiseApiConfig extends AlipayObject {

	private static final long serialVersionUID = 6454458642418832471L;

	/**
	 * 合约履约周期，以天为单位。
	 */
	@ApiField("fulfillment_days")
	private Long fulfillmentDays;

	/**
	 * 商户客服电话，为必填字段，需为合法电话号码。
	 */
	@ApiField("merchant_service_phone")
	private String merchantServicePhone;

	/**
	 * 商户主页链接，取值为商户小程序地址或H5页面地址。
	 */
	@ApiField("merchant_service_url")
	private String merchantServiceUrl;

	/**
	 * 守约操作（钱、物、行为）、promise_link（链接）、promise_remind（文本）
	 */
	@ApiField("promise_operation_type")
	private String promiseOperationType;

	/**
	 * 守约文案或守约链接
	 */
	@ApiField("promise_operation_value")
	private String promiseOperationValue;

	public Long getFulfillmentDays() {
		return this.fulfillmentDays;
	}
	public void setFulfillmentDays(Long fulfillmentDays) {
		this.fulfillmentDays = fulfillmentDays;
	}

	public String getMerchantServicePhone() {
		return this.merchantServicePhone;
	}
	public void setMerchantServicePhone(String merchantServicePhone) {
		this.merchantServicePhone = merchantServicePhone;
	}

	public String getMerchantServiceUrl() {
		return this.merchantServiceUrl;
	}
	public void setMerchantServiceUrl(String merchantServiceUrl) {
		this.merchantServiceUrl = merchantServiceUrl;
	}

	public String getPromiseOperationType() {
		return this.promiseOperationType;
	}
	public void setPromiseOperationType(String promiseOperationType) {
		this.promiseOperationType = promiseOperationType;
	}

	public String getPromiseOperationValue() {
		return this.promiseOperationValue;
	}
	public void setPromiseOperationValue(String promiseOperationValue) {
		this.promiseOperationValue = promiseOperationValue;
	}

}
