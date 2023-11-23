package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店不置信推荐信息
 *
 * @author auto create
 * @since 1.0, 2023-05-24 20:43:53
 */
public class ShopRecommendInfo extends AlipayObject {

	private static final long serialVersionUID = 6267127895638456799L;

	/**
	 * 门店修改建议
	 */
	@ApiField("recommend")
	private String recommend;

	/**
	 * 推荐详细地址
	 */
	@ApiField("recommend_address")
	private String recommendAddress;

	/**
	 * 推荐纬度
	 */
	@ApiField("recommend_latitude")
	private String recommendLatitude;

	/**
	 * 推荐经度
	 */
	@ApiField("recommend_longtitude")
	private String recommendLongtitude;

	/**
	 * 推荐门店名称
	 */
	@ApiField("recommend_name")
	private String recommendName;

	/**
	 * 门店不置信原因
	 */
	@ApiField("unconfidence_reason")
	private String unconfidenceReason;

	public String getRecommend() {
		return this.recommend;
	}
	public void setRecommend(String recommend) {
		this.recommend = recommend;
	}

	public String getRecommendAddress() {
		return this.recommendAddress;
	}
	public void setRecommendAddress(String recommendAddress) {
		this.recommendAddress = recommendAddress;
	}

	public String getRecommendLatitude() {
		return this.recommendLatitude;
	}
	public void setRecommendLatitude(String recommendLatitude) {
		this.recommendLatitude = recommendLatitude;
	}

	public String getRecommendLongtitude() {
		return this.recommendLongtitude;
	}
	public void setRecommendLongtitude(String recommendLongtitude) {
		this.recommendLongtitude = recommendLongtitude;
	}

	public String getRecommendName() {
		return this.recommendName;
	}
	public void setRecommendName(String recommendName) {
		this.recommendName = recommendName;
	}

	public String getUnconfidenceReason() {
		return this.unconfidenceReason;
	}
	public void setUnconfidenceReason(String unconfidenceReason) {
		this.unconfidenceReason = unconfidenceReason;
	}

}
