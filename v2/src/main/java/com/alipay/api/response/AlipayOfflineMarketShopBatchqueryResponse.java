package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.market.shop.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-12 06:57:08
 */
public class AlipayOfflineMarketShopBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7756227546997686543L;

	/** 
	 * 当前页码
	 */
	@ApiField("current_pageno")
	private String currentPageno;

	/** 
	 * 门店列表ID，逗号分隔
	 */
	@ApiListField("shop_ids")
	@ApiField("string")
	private List<String> shopIds;

	/** 
	 * 总页码数目
	 */
	@ApiField("total_pageno")
	private String totalPageno;

	public void setCurrentPageno(String currentPageno) {
		this.currentPageno = currentPageno;
	}
	public String getCurrentPageno( ) {
		return this.currentPageno;
	}

	public void setShopIds(List<String> shopIds) {
		this.shopIds = shopIds;
	}
	public List<String> getShopIds( ) {
		return this.shopIds;
	}

	public void setTotalPageno(String totalPageno) {
		this.totalPageno = totalPageno;
	}
	public String getTotalPageno( ) {
		return this.totalPageno;
	}

}
