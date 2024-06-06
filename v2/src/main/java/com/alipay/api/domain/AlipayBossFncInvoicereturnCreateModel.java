package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 发票退换票申请
 *
 * @author auto create
 * @since 1.0, 2024-01-22 09:41:04
 */
public class AlipayBossFncInvoicereturnCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8596691986266968872L;

	/**
	 * 申请明细
	 */
	@ApiListField("ar_invoice_return_apply_detail_orders")
	@ApiField("ar_invoice_return_detail_order")
	private List<ArInvoiceReturnDetailOrder> arInvoiceReturnApplyDetailOrders;

	/**
	 * 申请退换票的备注消息
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 修改项
	 */
	@ApiField("modified_item")
	private String modifiedItem;

	/**
	 * 当前操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 当前操作人类型,01:商户 02:管理员(小二)
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 退换票类型,01:退票 02:换票
	 */
	@ApiField("return_order_type")
	private String returnOrderType;

	/**
	 * 退换票原因类型
01：发票介质修改
02：发票类型修改
03：发票信息修改
05：其他
06：不需要发票
	 */
	@ApiField("return_reason_type")
	private String returnReasonType;

	/**
	 * 快递单号
	 */
	@ApiField("tracking_no")
	private String trackingNo;

	public List<ArInvoiceReturnDetailOrder> getArInvoiceReturnApplyDetailOrders() {
		return this.arInvoiceReturnApplyDetailOrders;
	}
	public void setArInvoiceReturnApplyDetailOrders(List<ArInvoiceReturnDetailOrder> arInvoiceReturnApplyDetailOrders) {
		this.arInvoiceReturnApplyDetailOrders = arInvoiceReturnApplyDetailOrders;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getModifiedItem() {
		return this.modifiedItem;
	}
	public void setModifiedItem(String modifiedItem) {
		this.modifiedItem = modifiedItem;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getReturnOrderType() {
		return this.returnOrderType;
	}
	public void setReturnOrderType(String returnOrderType) {
		this.returnOrderType = returnOrderType;
	}

	public String getReturnReasonType() {
		return this.returnReasonType;
	}
	public void setReturnReasonType(String returnReasonType) {
		this.returnReasonType = returnReasonType;
	}

	public String getTrackingNo() {
		return this.trackingNo;
	}
	public void setTrackingNo(String trackingNo) {
		this.trackingNo = trackingNo;
	}

}
