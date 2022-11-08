package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 运营数据
 *
 * @author auto create
 * @since 1.0, 2022-06-09 13:42:13
 */
public class OperationData extends AlipayObject {

	private static final long serialVersionUID = 3118463348121625471L;

	/**
	 * 对应的运营数据内容
	 */
	@ApiField("operation_data")
	private String operationData;

	/**
	 * 运营数据类型枚举，如ALIPAY_PAY_COUNT代表支付宝支付笔数（含刷脸、扫码），详细枚举定义由产品给出
	 */
	@ApiField("operation_type")
	private String operationType;

	public String getOperationData() {
		return this.operationData;
	}
	public void setOperationData(String operationData) {
		this.operationData = operationData;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

}
