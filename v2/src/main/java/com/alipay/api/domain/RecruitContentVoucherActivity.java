package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报名提交的券活动
 *
 * @author auto create
 * @since 1.0, 2023-06-06 11:09:34
 */
public class RecruitContentVoucherActivity extends AlipayObject {

	private static final long serialVersionUID = 2523711331835159566L;

	/**
	 * 券活动ID。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 券活动配置信息列表。
	 */
	@ApiListField("content_configs")
	@ApiField("recruit_content_config")
	private List<RecruitContentConfig> contentConfigs;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public List<RecruitContentConfig> getContentConfigs() {
		return this.contentConfigs;
	}
	public void setContentConfigs(List<RecruitContentConfig> contentConfigs) {
		this.contentConfigs = contentConfigs;
	}

}
