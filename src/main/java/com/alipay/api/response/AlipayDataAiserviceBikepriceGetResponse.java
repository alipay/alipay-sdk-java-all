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
 * @since 1.0, 2022-12-08 12:49:00
 */
public class AlipayDataAiserviceBikepriceGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 6673116345619953821L;

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
