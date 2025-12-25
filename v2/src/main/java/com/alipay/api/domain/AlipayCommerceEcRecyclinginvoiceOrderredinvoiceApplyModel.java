package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 反向订单申请红字发票
 *
 * @author auto create
 * @since 1.0, 2025-05-12 19:40:20
 */
public class AlipayCommerceEcRecyclinginvoiceOrderredinvoiceApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2789399716262168216L;

	/**
	 * 订单号，调用反向订单创建接口时返回，也可以通过反向订单查询接口通过外部订单号查询
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 发票产品ID，传值为当前订单对应的发票产品编号，必须为已开通产品，可调用反向企业（商户）信息查询接口查询
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
