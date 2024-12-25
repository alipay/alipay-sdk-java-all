package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.ztb.report.create response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-05 10:22:20
 */
public class ZhimaCreditEpZtbReportCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8361952558113876834L;

	/** 
	 * 报告订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 商户唯一业务流水号，由大小写字母和数字构成（当商户传入时返回）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
