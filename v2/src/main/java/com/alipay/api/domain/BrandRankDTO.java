package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌排行信息
 *
 * @author auto create
 * @since 1.0, 2024-03-06 20:22:13
 */
public class BrandRankDTO extends AlipayObject {

	private static final long serialVersionUID = 4745146242841756753L;

	/**
	 * 品牌名称
	 */
	@ApiField("brand_name")
	private String brandName;

	/**
	 * 品牌排行
	 */
	@ApiField("rank")
	private Long rank;

	/**
	 * 交易金额指数，在所选周期内（如某个自然周、自然月），按交易金额的多少换算成的指数指标。交易金额指数越高，代表交易金额越多，单位元
	 */
	@ApiField("trd_amt_index")
	private Long trdAmtIndex;

	public String getBrandName() {
		return this.brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public Long getRank() {
		return this.rank;
	}
	public void setRank(Long rank) {
		this.rank = rank;
	}

	public Long getTrdAmtIndex() {
		return this.trdAmtIndex;
	}
	public void setTrdAmtIndex(Long trdAmtIndex) {
		this.trdAmtIndex = trdAmtIndex;
	}

}
