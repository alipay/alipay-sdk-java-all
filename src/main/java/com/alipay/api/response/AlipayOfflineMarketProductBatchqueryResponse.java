package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.product.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-11-05 15:05:40
 */
public class AlipayOfflineMarketProductBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2517554432322279433L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_pageno")
	private Long currentPageno;

	/** 
	 * 商品列表ID，逗号分隔
	 */
	@ApiListField("item_ids")
	@ApiField("string")
	private List<String> itemIds;

	/** 
	 * 总页码数
	 */
	@ApiField("total_pageno")
	private Long totalPageno;

	public void setCurrentPageno(Long currentPageno) {
		this.currentPageno = currentPageno;
	}
	public Long getCurrentPageno( ) {
		return this.currentPageno;
	}

	public void setItemIds(List<String> itemIds) {
		this.itemIds = itemIds;
	}
	public List<String> getItemIds( ) {
		return this.itemIds;
	}

	public void setTotalPageno(Long totalPageno) {
		this.totalPageno = totalPageno;
	}
	public Long getTotalPageno( ) {
		return this.totalPageno;
	}

}
