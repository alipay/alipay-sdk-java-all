package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AlipayMiniCardData;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.member.alipaycard.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:54
 */
public class AlipayUserMemberAlipaycardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4397865128559975664L;

	/** 
	 * 支付宝卡片展现信息（缓存）
	 */
	@ApiField("alipay_card_cache_data")
	private AlipayMiniCardData alipayCardCacheData;

	/** 
	 * 支付宝卡片展现信息（实时），展现层数据信息，结构详见具体复杂类型，返回给用户的卡片展现信息包括实时类和缓存类两部分，缓存类是对实时性要求不高的透出内容。实时类是精确信息，直接用于前端展现，缓存类用于存在缓存中，在调用接口超时或者降级时取用。
	 */
	@ApiField("alipay_card_real_time_data")
	private AlipayMiniCardData alipayCardRealTimeData;

	public void setAlipayCardCacheData(AlipayMiniCardData alipayCardCacheData) {
		this.alipayCardCacheData = alipayCardCacheData;
	}
	public AlipayMiniCardData getAlipayCardCacheData( ) {
		return this.alipayCardCacheData;
	}

	public void setAlipayCardRealTimeData(AlipayMiniCardData alipayCardRealTimeData) {
		this.alipayCardRealTimeData = alipayCardRealTimeData;
	}
	public AlipayMiniCardData getAlipayCardRealTimeData( ) {
		return this.alipayCardRealTimeData;
	}

}
