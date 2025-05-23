package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.content.live.livedata.currentlive.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 14:02:30
 */
public class AlipayContentLiveLivedataCurrentliveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2898917834555746282L;

	/** 
	 * 支付宝直播id
	 */
	@ApiField("alipay_live_id")
	private String alipayLiveId;

	/** 
	 * 应用日志traceId
	 */
	@ApiField("biz_trace_id")
	private String bizTraceId;

	/** 
	 * 评论UV
	 */
	@ApiField("comment_uv")
	private String commentUv;

	/** 
	 * 礼物人数
	 */
	@ApiField("num_gift_recipients")
	private String numGiftRecipients;

	/** 
	 * 房主流水,单位元
	 */
	@ApiField("owner_cash_flow")
	private String ownerCashFlow;

	/** 
	 * 观看UV
	 */
	@ApiField("play_uv")
	private String playUv;

	/** 
	 * 点赞UV
	 */
	@ApiField("praise_uv")
	private String praiseUv;

	public void setAlipayLiveId(String alipayLiveId) {
		this.alipayLiveId = alipayLiveId;
	}
	public String getAlipayLiveId( ) {
		return this.alipayLiveId;
	}

	public void setBizTraceId(String bizTraceId) {
		this.bizTraceId = bizTraceId;
	}
	public String getBizTraceId( ) {
		return this.bizTraceId;
	}

	public void setCommentUv(String commentUv) {
		this.commentUv = commentUv;
	}
	public String getCommentUv( ) {
		return this.commentUv;
	}

	public void setNumGiftRecipients(String numGiftRecipients) {
		this.numGiftRecipients = numGiftRecipients;
	}
	public String getNumGiftRecipients( ) {
		return this.numGiftRecipients;
	}

	public void setOwnerCashFlow(String ownerCashFlow) {
		this.ownerCashFlow = ownerCashFlow;
	}
	public String getOwnerCashFlow( ) {
		return this.ownerCashFlow;
	}

	public void setPlayUv(String playUv) {
		this.playUv = playUv;
	}
	public String getPlayUv( ) {
		return this.playUv;
	}

	public void setPraiseUv(String praiseUv) {
		this.praiseUv = praiseUv;
	}
	public String getPraiseUv( ) {
		return this.praiseUv;
	}

}
