package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CardPriceResponseItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.aiservice.bikeprice.get response.
 * 
 * @author auto create
 * @since 1.0, 2021-06-15 16:40:47
 */
public class AlipayDataAiserviceBikepriceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8469551982452224587L;

	/** 
	 * 返回结果列表
	 */
	@ApiListField("result")
	@ApiField("card_price_response_item")
	private List<CardPriceResponseItem> result;

	public void setResult(List<CardPriceResponseItem> result) {
		this.result = result;
	}
	public List<CardPriceResponseItem> getResult( ) {
		return this.result;
	}

}
