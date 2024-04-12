package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商品推荐价格列表：is_suggest_price 是否推荐，1推荐，0不推荐；price：推荐的价格；freq：权重
 *
 * @author auto create
 * @since 1.0, 2023-09-20 13:45:36
 */
public class RecommendPrice extends AlipayObject {

	private static final long serialVersionUID = 3765183681638847595L;

	/**
	 * 商品价格在商户中的占比权重，小数表示；如果使用百分比需自行转化
	 */
	@ApiField("freq")
	private String freq;

	/**
	 * 是否推荐，1推荐，0不推荐
	 */
	@ApiField("is_suggest_price")
	private String isSuggestPrice;

	/**
	 * 推荐的价格，单位：分
	 */
	@ApiField("price")
	private Long price;

	public String getFreq() {
		return this.freq;
	}
	public void setFreq(String freq) {
		this.freq = freq;
	}

	public String getIsSuggestPrice() {
		return this.isSuggestPrice;
	}
	public void setIsSuggestPrice(String isSuggestPrice) {
		this.isSuggestPrice = isSuggestPrice;
	}

	public Long getPrice() {
		return this.price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}

}
