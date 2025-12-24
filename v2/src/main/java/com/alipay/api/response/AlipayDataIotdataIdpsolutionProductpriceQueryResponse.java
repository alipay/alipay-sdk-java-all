package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecommendPrice;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.iotdata.idpsolution.productprice.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-26 17:31:46
 */
public class AlipayDataIotdataIdpsolutionProductpriceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1525732376823837874L;

	/** 
	 * 推荐价格列表，is_suggest_price：1推荐，0不推荐；price：推荐的价格，单位：分；freq：权重
	 */
	@ApiListField("price_dist")
	@ApiField("recommend_price")
	private List<RecommendPrice> priceDist;

	/** 
	 * 单位：分
	 */
	@ApiField("suggest_price")
	private Long suggestPrice;

	public void setPriceDist(List<RecommendPrice> priceDist) {
		this.priceDist = priceDist;
	}
	public List<RecommendPrice> getPriceDist( ) {
		return this.priceDist;
	}

	public void setSuggestPrice(Long suggestPrice) {
		this.suggestPrice = suggestPrice;
	}
	public Long getSuggestPrice( ) {
		return this.suggestPrice;
	}

}
