package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PaymentObject;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.careertraining.payment.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-26 19:07:36
 */
public class AlipayEbppIndustryCareertrainingPaymentBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1876665271499867957L;

	/** 
	 * 数据列表
	 */
	@ApiField("list")
	private PaymentObject list;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

	public void setList(PaymentObject list) {
		this.list = list;
	}
	public PaymentObject getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
