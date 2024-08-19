package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 橱窗活动信息模型
 *
 * @author auto create
 * @since 1.0, 2022-11-21 16:47:46
 */
public class WidgetActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 2341598526971121538L;

	/**
	 * 活动点击跳转到小程序的链接地址
	 */
	@ApiField("activity_click_url")
	private String activityClickUrl;

	/**
	 * 活动的唯一标识，同一个小程序橱窗下，该标识唯一，请开发者自行保证
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动名称
	 */
	@ApiField("activity_name")
	private String activityName;

	/**
	 * 活动图片链接,最多不能超过5个
	 */
	@ApiListField("activity_picture_urls")
	@ApiField("string")
	private List<String> activityPictureUrls;

	public String getActivityClickUrl() {
		return this.activityClickUrl;
	}
	public void setActivityClickUrl(String activityClickUrl) {
		this.activityClickUrl = activityClickUrl;
	}

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getActivityName() {
		return this.activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public List<String> getActivityPictureUrls() {
		return this.activityPictureUrls;
	}
	public void setActivityPictureUrls(List<String> activityPictureUrls) {
		this.activityPictureUrls = activityPictureUrls;
	}

}
