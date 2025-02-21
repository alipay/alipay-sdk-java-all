package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.advanced.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:27:05
 */
public class AlipayOverseasTaxAdvancedCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3139588931812164134L;

	/** 
	 * 线上预授权下单时返回，用于唤起收银台的参数，有效期15分钟。过期后无法唤起收银台，可以使用相同的out_tax_refund_no重新下单来获取新的order_str
	 */
	@ApiField("order_str")
	private String orderStr;

	/** 
	 * 退税机构业务流水号
	 */
	@ApiField("out_tax_refund_no")
	private String outTaxRefundNo;

	/** 
	 * 支付宝退税资金订单号
	 */
	@ApiField("tax_refund_no")
	private String taxRefundNo;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

	public void setOutTaxRefundNo(String outTaxRefundNo) {
		this.outTaxRefundNo = outTaxRefundNo;
	}
	public String getOutTaxRefundNo( ) {
		return this.outTaxRefundNo;
	}

	public void setTaxRefundNo(String taxRefundNo) {
		this.taxRefundNo = taxRefundNo;
	}
	public String getTaxRefundNo( ) {
		return this.taxRefundNo;
	}

}
