package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdVoucherPrizeDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.offline.provider.indflow.prize.recommend response.
 * 
 * @author auto create
 * @since 1.0, 2026-09-10 10:12:57
 */
public class AlipayOfflineProviderIndflowPrizeRecommendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1787534168718462565L;

	/** 
	 * null
	 */
	@ApiListField("recommend_prizes")
	@ApiField("ad_voucher_prize_detail")
	private List<AdVoucherPrizeDetail> recommendPrizes;

	/** 
	 * 发奖记录ID
	 */
	@ApiField("record_id")
	private String recordId;

	public void setRecommendPrizes(List<AdVoucherPrizeDetail> recommendPrizes) {
		this.recommendPrizes = recommendPrizes;
	}
	public List<AdVoucherPrizeDetail> getRecommendPrizes( ) {
		return this.recommendPrizes;
	}

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
