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
 * @since 1.0, 2026-06-23 14:49:23
 */
public class AlipayContentLivePlatformGiftQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3219485159467486992L;

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
