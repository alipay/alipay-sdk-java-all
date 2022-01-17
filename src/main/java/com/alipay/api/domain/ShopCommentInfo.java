package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店评分信息模型
 *
 * @author auto create
 * @since 1.0, 2018-11-20 10:06:10
 */
public class ShopCommentInfo extends AlipayObject {

	private static final long serialVersionUID = 7599252145616225243L;

	/**
	 * 店铺30天平均人气值
	 */
	@ApiField("avg_popularity")
	private String avgPopularity;

	/**
	 * avg_popularity字段展示文案
	 */
	@ApiField("avg_popularity_name")
	private String avgPopularityName;

	/**
	 * 门店评分，评分越高，门店质量越高
	 */
	@ApiField("score")
	private String score;

	/**
	 * 门店星级，0~5,越高，店铺质量越高
	 */
	@ApiField("star")
	private String star;

	public String getAvgPopularity() {
		return this.avgPopularity;
	}
	public void setAvgPopularity(String avgPopularity) {
		this.avgPopularity = avgPopularity;
	}

	public String getAvgPopularityName() {
		return this.avgPopularityName;
	}
	public void setAvgPopularityName(String avgPopularityName) {
		this.avgPopularityName = avgPopularityName;
	}

	public String getScore() {
		return this.score;
	}
	public void setScore(String score) {
		this.score = score;
	}

	public String getStar() {
		return this.star;
	}
	public void setStar(String star) {
		this.star = star;
	}

}
