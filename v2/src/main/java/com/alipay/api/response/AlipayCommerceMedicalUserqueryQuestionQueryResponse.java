package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.userquery.question.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-16 14:37:56
 */
public class AlipayCommerceMedicalUserqueryQuestionQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1769964869971377744L;

	/** 
	 * 跳转阿福的上报数据
	 */
	@ApiField("feed_back")
	private String feedBack;

	/** 
	 * 跳转到阿福APP的跳转链接
	 */
	@ApiField("jump_url")
	private String jumpUrl;

	/** 
	 * 跳转阿福APP承接的大模型query词
	 */
	@ApiField("query")
	private String query;

	/** 
	 * query词supId，spm埋点使用
	 */
	@ApiField("sup_id")
	private String supId;

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}
	public String getFeedBack( ) {
		return this.feedBack;
	}

	public void setJumpUrl(String jumpUrl) {
		this.jumpUrl = jumpUrl;
	}
	public String getJumpUrl( ) {
		return this.jumpUrl;
	}

	public void setQuery(String query) {
		this.query = query;
	}
	public String getQuery( ) {
		return this.query;
	}

	public void setSupId(String supId) {
		this.supId = supId;
	}
	public String getSupId( ) {
		return this.supId;
	}

}
