package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 付款计划
 *
 * @author auto create
 * @since 1.0, 2023-09-15 09:58:58
 */
public class PaymentPlanDTO extends AlipayObject {

	private static final long serialVersionUID = 1365279358422197391L;

	/**
	 * 是否按比例支付
	 */
	@ApiField("pay_on_percent")
	private String payOnPercent;

	/**
	 * 条款名称
	 */
	@ApiField("payment_name")
	private String paymentName;

	/**
	 * 付款计划行信息
	 */
	@ApiListField("payment_plan_item_list")
	@ApiField("payment_plan_item_d_t_o")
	private List<PaymentPlanItemDTO> paymentPlanItemList;

	/**
	 * 条款类型
	 */
	@ApiField("payment_type")
	private String paymentType;

	/**
	 * 采购订单id
	 */
	@ApiField("purchase_order_id")
	private String purchaseOrderId;

	public String getPayOnPercent() {
		return this.payOnPercent;
	}
	public void setPayOnPercent(String payOnPercent) {
		this.payOnPercent = payOnPercent;
	}

	public String getPaymentName() {
		return this.paymentName;
	}
	public void setPaymentName(String paymentName) {
		this.paymentName = paymentName;
	}

	public List<PaymentPlanItemDTO> getPaymentPlanItemList() {
		return this.paymentPlanItemList;
	}
	public void setPaymentPlanItemList(List<PaymentPlanItemDTO> paymentPlanItemList) {
		this.paymentPlanItemList = paymentPlanItemList;
	}

	public String getPaymentType() {
		return this.paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public String getPurchaseOrderId() {
		return this.purchaseOrderId;
	}
	public void setPurchaseOrderId(String purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

}
