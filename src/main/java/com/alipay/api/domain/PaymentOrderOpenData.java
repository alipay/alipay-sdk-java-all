package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付单明细

 *
 * @author auto create
 * @since 1.0, 2019-05-05 20:39:58
 */
public class PaymentOrderOpenData extends AlipayObject {

	private static final long serialVersionUID = 5443738987533255165L;

	/**
	 * 金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 支付单扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 资金明细
	 */
	@ApiField("fund_detail")
	private String fundDetail;

	/**
	 * 操作类型
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 支付单ID
	 */
	@ApiField("payment_order_id")
	private String paymentOrderId;

	/**
	 * 支付单状态
	 */
	@ApiField("status")
	private String status;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFundDetail() {
		return this.fundDetail;
	}
	public void setFundDetail(String fundDetail) {
		this.fundDetail = fundDetail;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getPaymentOrderId() {
		return this.paymentOrderId;
	}
	public void setPaymentOrderId(String paymentOrderId) {
		this.paymentOrderId = paymentOrderId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
