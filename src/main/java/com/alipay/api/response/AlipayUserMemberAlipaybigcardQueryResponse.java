package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BigCardData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.member.alipaybigcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-10-18 13:55:33
 */
public class AlipayUserMemberAlipaybigcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4458476861626399118L;

	/** 
	 * 支付宝大卡片展现信息（缓存类），缓存类是对实时性要求不高的透出内容。缓存类用于存在缓存中，在调用接口超时或者降级时取用。
	 */
	@ApiField("alipay_big_card_cache_data")
	private BigCardData alipayBigCardCacheData;

	/** 
	 * 支付宝大卡片展现信息（实时），展现层数据信息，结构详见具体复杂类型，返回给用户的卡片展现信息包括实时类和缓存类两部分，实时类是精确信息，直接用于前端展现
	 */
	@ApiField("alipay_big_card_real_time_data")
	private BigCardData alipayBigCardRealTimeData;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果描述
	 */
	@ApiField("result_desc")
	private String resultDesc;

	/** 
	 * 业务失败是否可重试
	 */
	@ApiField("retryable")
	private String retryable;

	/** 
	 * 是否业务处理成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setAlipayBigCardCacheData(BigCardData alipayBigCardCacheData) {
		this.alipayBigCardCacheData = alipayBigCardCacheData;
	}
	public BigCardData getAlipayBigCardCacheData( ) {
		return this.alipayBigCardCacheData;
	}

	public void setAlipayBigCardRealTimeData(BigCardData alipayBigCardRealTimeData) {
		this.alipayBigCardRealTimeData = alipayBigCardRealTimeData;
	}
	public BigCardData getAlipayBigCardRealTimeData( ) {
		return this.alipayBigCardRealTimeData;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}
	public String getResultDesc( ) {
		return this.resultDesc;
	}

	public void setRetryable(String retryable) {
		this.retryable = retryable;
	}
	public String getRetryable( ) {
		return this.retryable;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
