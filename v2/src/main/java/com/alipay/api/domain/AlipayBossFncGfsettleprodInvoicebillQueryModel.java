package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票关联的账单查询
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:25:47
 */
public class AlipayBossFncGfsettleprodInvoicebillQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5119184293429126122L;

	/**
	 * 结算单查询
	 */
	@ApiField("payment_apply_query_order")
	private PaymentApplyQueryOrder paymentApplyQueryOrder;

	public PaymentApplyQueryOrder getPaymentApplyQueryOrder() {
		return this.paymentApplyQueryOrder;
	}
	public void setPaymentApplyQueryOrder(PaymentApplyQueryOrder paymentApplyQueryOrder) {
		this.paymentApplyQueryOrder = paymentApplyQueryOrder;
	}

}
