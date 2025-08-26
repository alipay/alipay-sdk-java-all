package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向订单查询
 *
 * @author auto create
 * @since 1.0, 2025-05-12 19:41:54
 */
public class AlipayCommerceEcRecyclinginvoiceOrderQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3411711136933582324L;

	/**
	 * 订单号，调用反向订单创建接口时返回
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 外部订单号，外部系统订单的唯一值
	 */
	@ApiField("outer_order_id")
	private String outerOrderId;

	/**
	 * 发票产品ID，传值为当前订单对应的发票产品ID，必须为已开通产品，可调用反向企业（商户）信息查询接口查询
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 企业（商户）税号
	 */
	@ApiField("tax_no")
	private String taxNo;

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOuterOrderId() {
		return this.outerOrderId;
	}
	public void setOuterOrderId(String outerOrderId) {
		this.outerOrderId = outerOrderId;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getTaxNo() {
		return this.taxNo;
	}
	public void setTaxNo(String taxNo) {
		this.taxNo = taxNo;
	}

}
