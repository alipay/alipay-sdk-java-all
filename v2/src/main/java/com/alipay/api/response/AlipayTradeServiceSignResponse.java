package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.LargeInfiniteCardInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.service.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-29 22:41:57
 */
public class AlipayTradeServiceSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 4397568538621812838L;

	/** 
	 * 无限付产品的转入卡信息，服务类型为LARGE_INFINITE时返回。
	 */
	@ApiField("large_infinite_card_info")
	private LargeInfiniteCardInfo largeInfiniteCardInfo;

	public void setLargeInfiniteCardInfo(LargeInfiniteCardInfo largeInfiniteCardInfo) {
		this.largeInfiniteCardInfo = largeInfiniteCardInfo;
	}
	public LargeInfiniteCardInfo getLargeInfiniteCardInfo( ) {
		return this.largeInfiniteCardInfo;
	}

}
