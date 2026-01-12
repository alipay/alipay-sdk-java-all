package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LiveGiftItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.platform.gift.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-11-06 17:47:41
 */
public class AlipayContentLivePlatformGiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6222293797635739419L;

	/** 
	 * 追踪trace_id
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/** 
	 * null
	 */
	@ApiListField("gift_list")
	@ApiField("live_gift_item")
	private List<LiveGiftItem> giftList;

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

	public void setGiftList(List<LiveGiftItem> giftList) {
		this.giftList = giftList;
	}
	public List<LiveGiftItem> getGiftList( ) {
		return this.giftList;
	}

}
