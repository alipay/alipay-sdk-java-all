package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecommendBankInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.trade.service.recommendbank.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:33:12
 */
public class AlipayTradeServiceRecommendbankQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1583186476411443847L;

	/** 
	 * 推荐银行列表,包含iosSchama,安卓Schama等信息
	 */
	@ApiListField("recommend_bank_infos")
	@ApiField("recommend_bank_info")
	private List<RecommendBankInfo> recommendBankInfos;

	public void setRecommendBankInfos(List<RecommendBankInfo> recommendBankInfos) {
		this.recommendBankInfos = recommendBankInfos;
	}
	public List<RecommendBankInfo> getRecommendBankInfos( ) {
		return this.recommendBankInfos;
	}

}
