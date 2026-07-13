package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.shop.review.create response.
 * 
 * @author auto create
 * @since 1.0, 2026-04-16 12:22:45
 */
public class AntMerchantExpandShopReviewCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7863669856492491211L;

	/** 
	 * 同步时间
	 */
	@ApiField("sync_time")
	private Date syncTime;

	public void setSyncTime(Date syncTime) {
		this.syncTime = syncTime;
	}
	public Date getSyncTime( ) {
		return this.syncTime;
	}

}
