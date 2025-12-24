package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 搜索词复杂对象
 *
 * @author auto create
 * @since 1.0, 2025-12-03 10:34:54
 */
public class SearchWord extends AlipayObject {

	private static final long serialVersionUID = 2314677166569141471L;

	/**
	 * 词文本
	 */
	@ApiField("bidword")
	private String bidword;

	/**
	 * 词匹配规则，如果未传则默认为宽泛匹配BROAD_MATCH
	 */
	@ApiField("match_type")
	private String matchType;

	/**
	 * 词出价，单位【元】
	 */
	@ApiField("price")
	private String price;

	public String getBidword() {
		return this.bidword;
	}
	public void setBidword(String bidword) {
		this.bidword = bidword;
	}

	public String getMatchType() {
		return this.matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getPrice() {
		return this.price;
	}
	public void setPrice(String price) {
		this.price = price;
	}

}
