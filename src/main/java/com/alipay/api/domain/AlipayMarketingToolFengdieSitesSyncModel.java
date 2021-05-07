package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 升级云凤蝶站点
 *
 * @author auto create
 * @since 1.0, 2021-01-06 16:27:22
 */
public class AlipayMarketingToolFengdieSitesSyncModel extends AlipayObject {

	private static final long serialVersionUID = 7313548788976175656L;

	/**
	 * 欲升级的站点 ID
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id（即创建空间成员接口的入参），应确保 operator 是参数 space_id 对应的空间成员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 欲升级的站点所归属的空间 ID
	 */
	@ApiField("space_id")
	private String spaceId;

	public Long getActivityId() {
		return this.activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getOperator() {
		return this.operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}

	public String getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

}
