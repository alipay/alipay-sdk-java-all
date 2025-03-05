package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用服务守护配置
 *
 * @author auto create
 * @since 1.0, 2024-10-11 09:09:44
 */
public class PromiseConfigDTO extends AlipayObject {

	private static final long serialVersionUID = 7871379786847386541L;

	/**
	 * 商户客服电话，为必填字段，需为合法电话号码。
	 */
	@ApiField("merchant_service_phone")
	private String merchantServicePhone;

	/**
	 * 必填，promise_link（链接）、promise_remind（文本）
	 */
	@ApiField("promise_operation_type")
	private String promiseOperationType;

	/**
	 * 守约文案或守约链接
	 */
	@ApiField("promise_operation_value")
	private String promiseOperationValue;

	public String getMerchantServicePhone() {
		return this.merchantServicePhone;
	}
	public void setMerchantServicePhone(String merchantServicePhone) {
		this.merchantServicePhone = merchantServicePhone;
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
