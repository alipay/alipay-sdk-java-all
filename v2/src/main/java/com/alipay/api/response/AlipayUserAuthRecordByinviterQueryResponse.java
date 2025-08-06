package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.SearchDetailsByInviterRes;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.auth.record.byinviter.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-12 14:57:04
 */
public class AlipayUserAuthRecordByinviterQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4176219852982772936L;

	/** 
	 * 获取签名后的业务数据
	 */
	@ApiField("orderStr")
	private String orderStr;

	/** 
	 * 邀请单查询结果
	 */
	@ApiField("search_res")
	private SearchDetailsByInviterRes searchRes;

	public void setOrderStr(String orderStr) {
		this.orderStr = orderStr;
	}
	public String getOrderStr( ) {
		return this.orderStr;
	}

	public void setSearchRes(SearchDetailsByInviterRes searchRes) {
		this.searchRes = searchRes;
	}
	public SearchDetailsByInviterRes getSearchRes( ) {
		return this.searchRes;
	}

}
