package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票对象明细
 *
 * @author auto create
 * @since 1.0, 2025-08-12 16:14:50
 */
public class ObcInvoiceObjectRequest extends AlipayObject {

	private static final long serialVersionUID = 5725824276626999239L;

	/**
	 * 账单号/订单号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 包年包月订单/按量付费账单
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 开票金额，不传则默认全额开票；和申请单币种保持一致，目前非国际发票支持CNY，金额单位为元
	 */
	@ApiField("invoicing_amount")
	private String invoicingAmount;

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getInvoicingAmount() {
		return this.invoicingAmount;
	}
	public void setInvoicingAmount(String invoicingAmount) {
		this.invoicingAmount = invoicingAmount;
	}

}
