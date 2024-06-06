package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 唤起云凤蝶站点编辑器
 *
 * @author auto create
 * @since 1.0, 2021-06-25 21:55:55
 */
public class AlipayMarketingToolFengdieEditorGetModel extends AlipayObject {

	private static final long serialVersionUID = 8865285674452553812L;

	/**
	 * 欲唤起的站点 ID
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * 作为当前操作者的空间成员用户名， 值为 origin_user_id（即创建空间成员接口的入参），应确保 operator 是参数 space_id 对应的空间成员
	 */
	@ApiField("operator")
	private String operator;

	/**
	 * 在云凤蝶编辑器中点击“发布”按钮后，如果发布成功则跳转到该地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 欲唤起的站点所归属的空间 ID
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

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getSpaceId() {
		return this.spaceId;
	}
	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
	}

}
