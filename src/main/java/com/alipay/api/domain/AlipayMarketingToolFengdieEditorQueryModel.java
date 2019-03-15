package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 唤起凤蝶H5编辑器
 *
 * @author auto create
 * @since 1.0, 2018-11-26 17:37:19
 */
public class AlipayMarketingToolFengdieEditorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6536449685769721519L;

	/**
	 * 凤蝶H5应用唯一id，通过alipay.marketing.tool.fengdie.activity.create接口时自动生成
	 */
	@ApiField("activity_id")
	private Long activityId;

	/**
	 * 在凤蝶编辑器中点击“发布”按钮后，如果发布成功则跳转到该地址
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	public Long getActivityId() {
		return this.activityId;
	}
	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

}
