package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.content.community.hotevent.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:18
 */
public class AntfortuneContentCommunityHoteventListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4686242155342237414L;

	/** 
	 * 存储json序列化后的热门事件列表
	 */
	@ApiField("hot_event_product")
	private String hotEventProduct;

	/** 
	 * 返回trace，方便排查问题
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setHotEventProduct(String hotEventProduct) {
		this.hotEventProduct = hotEventProduct;
	}
	public String getHotEventProduct( ) {
		return this.hotEventProduct;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
