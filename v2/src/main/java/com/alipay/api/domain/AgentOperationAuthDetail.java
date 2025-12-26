package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 代运营授权信息
 *
 * @author auto create
 * @since 1.0, 2025-09-02 15:07:34
 */
public class AgentOperationAuthDetail extends AlipayObject {

	private static final long serialVersionUID = 2363688154212852986L;

	/**
	 * 代运营授权产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 代运营作业子单号，以产品维度拆分子项
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

}
