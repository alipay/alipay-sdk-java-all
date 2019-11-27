package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 拉新推荐手机号，手机号加密
 *
 * @author auto create
 * @since 1.0, 2018-12-13 21:14:48
 */
public class DingDingMobileRecommendData extends AlipayObject {

	private static final long serialVersionUID = 6323782167854865398L;

	/**
	 * 二分类标签，推荐与否
	 */
	@ApiField("label")
	private Boolean label;

	/**
	 * 手机号
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 推荐分数
	 */
	@ApiField("score")
	private Long score;

	public Boolean getLabel() {
		return this.label;
	}
	public void setLabel(Boolean label) {
		this.label = label;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Long getScore() {
		return this.score;
	}
	public void setScore(Long score) {
		this.score = score;
	}

}
