package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExchangeDataItemResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.treasurechest.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-16 13:47:56
 */
public class AlipayEbppIndustryTreasurechestDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1153659668897548786L;

	/** 
	 * null
	 */
	@ApiListField("items")
	@ApiField("exchange_data_item_result")
	private List<ExchangeDataItemResult> items;

	public void setItems(List<ExchangeDataItemResult> items) {
		this.items = items;
	}
	public List<ExchangeDataItemResult> getItems( ) {
		return this.items;
	}

}
