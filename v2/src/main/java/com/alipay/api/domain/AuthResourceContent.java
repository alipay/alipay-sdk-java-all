package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资源内容
 *
 * @author auto create
 * @since 1.0, 2024-07-10 10:23:56
 */
public class AuthResourceContent extends AlipayObject {

	private static final long serialVersionUID = 8742353588372917631L;

	/**
	 * 激励，单位是g
	 */
	@ApiField("award_amount")
	private Long awardAmount;

	/**
	 * 人群
	 */
	@ApiField("group_type")
	private String groupType;

	public Long getAwardAmount() {
		return this.awardAmount;
	}
	public void setAwardAmount(Long awardAmount) {
		this.awardAmount = awardAmount;
	}

	public String getGroupType() {
		return this.groupType;
	}
	public void setGroupType(String groupType) {
		this.groupType = groupType;
	}

}
