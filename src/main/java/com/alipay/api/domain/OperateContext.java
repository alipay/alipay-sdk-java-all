package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 操作上下文
 *
 * @author auto create
 * @since 1.0, 2018-04-20 18:48:00
 */
public class OperateContext extends AlipayObject {

	private static final long serialVersionUID = 4688635739738398211L;

	/**
	 * 商户ID
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 操作者id
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 操作者类型，PROVIDER:服务商,PROVIDER_STAFF:服务商员工,MER:商户,MER_STAFF:商户员工,SALES:阿里销售小二,SYSTEM:系统
	 */
	@ApiField("operator_type")
	private String operatorType;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

}
