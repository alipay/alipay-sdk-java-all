package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汽车之家线索购车状态模型
 *
 * @author auto create
 * @since 1.0, 2026-06-17 15:23:51
 */
public class AutohomeDealStatusModel extends AlipayObject {

	private static final long serialVersionUID = 8683693798875615969L;

	/**
	 * 留资选择品牌
	 */
	@ApiField("clue_brand_id")
	private String clueBrandId;

	/**
	 * 实际购车品牌
	 */
	@ApiField("deal_brand_id")
	private String dealBrandId;

	/**
	 * 实际购车车系
	 */
	@ApiField("deal_series_id")
	private String dealSeriesId;

	public String getClueBrandId() {
		return this.clueBrandId;
	}
	public void setClueBrandId(String clueBrandId) {
		this.clueBrandId = clueBrandId;
	}

	public String getDealBrandId() {
		return this.dealBrandId;
	}
	public void setDealBrandId(String dealBrandId) {
		this.dealBrandId = dealBrandId;
	}

	public String getDealSeriesId() {
		return this.dealSeriesId;
	}
	public void setDealSeriesId(String dealSeriesId) {
		this.dealSeriesId = dealSeriesId;
	}

}
