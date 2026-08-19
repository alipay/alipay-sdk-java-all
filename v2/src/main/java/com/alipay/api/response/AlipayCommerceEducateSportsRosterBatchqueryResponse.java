package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SportsRosterBatchQueryItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.sports.roster.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-08-11 17:37:52
 */
public class AlipayCommerceEducateSportsRosterBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5236197866877469979L;

	/** 
	 * 花名册列表
	 */
	@ApiField("list")
	private SportsRosterBatchQueryItem list;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

	public void setList(SportsRosterBatchQueryItem list) {
		this.list = list;
	}
	public SportsRosterBatchQueryItem getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
