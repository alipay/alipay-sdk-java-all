package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 承保状态查询
 *
 * @author auto create
 * @since 1.0, 2025-10-22 14:59:03
 */
public class AlipayCommerceDecorationPolicystatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7868276791511253564L;

	/**
	 * 订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 保险产品编码
	 */
	@ApiField("product_code")
	private String productCode;

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
