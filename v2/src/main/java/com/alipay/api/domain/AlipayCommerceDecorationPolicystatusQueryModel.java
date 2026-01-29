package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 承保状态查询
 *
 * @author auto create
 * @since 1.0, 2025-12-24 19:18:51
 */
public class AlipayCommerceDecorationPolicystatusQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5145866618495337132L;

	/**
	 * 订单号。out_order_no与order_no二选一
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 外部订单号。
out_order_no与order_no二选一
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

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

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

}
