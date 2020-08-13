package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量添加发票
 *
 * @author auto create
 * @since 1.0, 2020-01-14 14:52:00
 */
public class AlipayBossFncApinvoiceBatchAddModel extends AlipayObject {

	private static final long serialVersionUID = 1722165769723851321L;

	/**
	 * 应付对账单发票关联明细
	 */
	@ApiListField("ap_invoice_bill_link_orders")
	@ApiField("ap_invoice_bill_link_order_request")
	private List<ApInvoiceBillLinkOrderRequest> apInvoiceBillLinkOrders;

	/**
	 * 应付发票
	 */
	@ApiListField("ap_invoice_order_list")
	@ApiField("ap_invoice_order_request")
	private List<ApInvoiceOrderRequest> apInvoiceOrderList;

	/**
	 * 发票备注信息memo
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 当前操作人
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 当前操作人类型，01:ISV 02:管理员(小二)
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 个人无票税损比例，有效范围[0,1]
	 */
	@ApiField("personal_tax_loss_rate")
	private Long personalTaxLossRate;

	public List<ApInvoiceBillLinkOrderRequest> getApInvoiceBillLinkOrders() {
		return this.apInvoiceBillLinkOrders;
	}
	public void setApInvoiceBillLinkOrders(List<ApInvoiceBillLinkOrderRequest> apInvoiceBillLinkOrders) {
		this.apInvoiceBillLinkOrders = apInvoiceBillLinkOrders;
	}

	public List<ApInvoiceOrderRequest> getApInvoiceOrderList() {
		return this.apInvoiceOrderList;
	}
	public void setApInvoiceOrderList(List<ApInvoiceOrderRequest> apInvoiceOrderList) {
		this.apInvoiceOrderList = apInvoiceOrderList;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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

	public Long getPersonalTaxLossRate() {
		return this.personalTaxLossRate;
	}
	public void setPersonalTaxLossRate(Long personalTaxLossRate) {
		this.personalTaxLossRate = personalTaxLossRate;
	}

}
