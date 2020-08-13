package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推荐服务信息
 *
 * @author auto create
 * @since 1.0, 2020-04-13 17:15:26
 */
public class RecommendServiceInfo extends AlipayObject {

	private static final long serialVersionUID = 8537819379254418238L;

	/**
	 * 一级类目
	 */
	@ApiField("cate_1")
	private String cate1;

	/**
	 * 二级类目
	 */
	@ApiField("cate_2")
	private String cate2;

	/**
	 * 三级类目
	 */
	@ApiField("cate_3")
	private String cate3;

	/**
	 * 是否是首选项
	 */
	@ApiField("first_choose")
	private Boolean firstChoose;

	/**
	 * 套餐最高价
	 */
	@ApiField("max_price")
	private Long maxPrice;

	/**
	 * 套餐最低价
	 */
	@ApiField("min_price")
	private Long minPrice;

	/**
	 * 服务推荐原因
	 */
	@ApiField("recommend_reason")
	private String recommendReason;

	/**
	 * 店铺星级
	 */
	@ApiField("star")
	private Long star;

	public String getCate1() {
		return this.cate1;
	}
	public void setCate1(String cate1) {
		this.cate1 = cate1;
	}

	public String getCate2() {
		return this.cate2;
	}
	public void setCate2(String cate2) {
		this.cate2 = cate2;
	}

	public String getCate3() {
		return this.cate3;
	}
	public void setCate3(String cate3) {
		this.cate3 = cate3;
	}

	public Boolean getFirstChoose() {
		return this.firstChoose;
	}
	public void setFirstChoose(Boolean firstChoose) {
		this.firstChoose = firstChoose;
	}

	public Long getMaxPrice() {
		return this.maxPrice;
	}
	public void setMaxPrice(Long maxPrice) {
		this.maxPrice = maxPrice;
	}

	public Long getMinPrice() {
		return this.minPrice;
	}
	public void setMinPrice(Long minPrice) {
		this.minPrice = minPrice;
	}

	public String getRecommendReason() {
		return this.recommendReason;
	}
	public void setRecommendReason(String recommendReason) {
		this.recommendReason = recommendReason;
	}

	public Long getStar() {
		return this.star;
	}
	public void setStar(Long star) {
		this.star = star;
	}

}
