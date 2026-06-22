package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 价格查询
 *
 * @author auto create
 * @since 1.0, 2026-06-08 20:37:55
 */
public class AlipayTradePriceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5226529837713198964L;

	/**
	 * 价格id
	 */
	@ApiField("price_id")
	private String priceId;

	/**
	 * null
	 */
	@ApiListField("query_options")
	@ApiField("string")
	private List<String> queryOptions;

	public String getPriceId() {
		return this.priceId;
	}
	public void setPriceId(String priceId) {
		this.priceId = priceId;
	}

	public List<String> getQueryOptions() {
		return this.queryOptions;
	}
	public void setQueryOptions(List<String> queryOptions) {
		this.queryOptions = queryOptions;
	}

}
