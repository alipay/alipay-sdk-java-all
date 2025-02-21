package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询apmobile检测结果
 *
 * @author auto create
 * @since 1.0, 2023-08-11 17:48:44
 */
public class AlipayDigitalmgmtAppAppreportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7679832528137186243L;

	/**
	 * 外部用户id
	 */
	@ApiField("client_id")
	private String clientId;

	/**
	 * 产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 检测结果对外唯一标识id
	 */
	@ApiField("trace_id")
	private String traceId;

	public String getClientId() {
		return this.clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

}
