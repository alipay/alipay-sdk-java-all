package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反向订单操作_审核
 *
 * @author auto create
 * @since 1.0, 2025-08-11 23:07:22
 */
public class AlipayCommerceEcRecyclinginvoiceOrderAuditModel extends AlipayObject {

	private static final long serialVersionUID = 8366573721652464121L;

	/**
	 * 订单的备注字段,用于发票的备注显示
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 订单号，调用反向订单创建接口时返回，也可以通过反向订单查询接口通过外部订单号查询
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单商品明细
	 */
	@ApiListField("order_item_list")
	@ApiField("recyclinginvoice_order_audit_item")
	private List<RecyclinginvoiceOrderAuditItem> orderItemList;

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

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public List<RecyclinginvoiceOrderAuditItem> getOrderItemList() {
		return this.orderItemList;
	}
	public void setOrderItemList(List<RecyclinginvoiceOrderAuditItem> orderItemList) {
		this.orderItemList = orderItemList;
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
