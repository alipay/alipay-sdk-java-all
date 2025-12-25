package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.report.create response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-16 10:25:39
 */
public class ZhimaCreditEpReportCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3658182935394774145L;

	/** 
	 * 报告订单号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 合作方外部订单号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 页面跳转地址
	 */
	@ApiField("page_redirection")
	private String pageRedirection;

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

	public void setPageRedirection(String pageRedirection) {
		this.pageRedirection = pageRedirection;
	}
	public String getPageRedirection( ) {
		return this.pageRedirection;
	}

}
