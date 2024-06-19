package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 自定义活动消息内容模型
 *
 * @author auto create
 * @since 1.0, 2024-06-11 12:10:20
 */
public class ActivityAssistantMsgContentVO extends AlipayObject {

	private static final long serialVersionUID = 8839158939327561879L;

	/**
	 * 小助手活动内容信息列表
	 */
	@ApiListField("activity_list")
	@ApiField("assistant_activity_v_o")
	private List<AssistantActivityVO> activityList;

	/**
	 * 小助手定向消息内容，发送小助手时推送给用户的群内消息内容
	 */
	@ApiField("recommend_text")
	private String recommendText;

	public List<AssistantActivityVO> getActivityList() {
		return this.activityList;
	}
	public void setActivityList(List<AssistantActivityVO> activityList) {
		this.activityList = activityList;
	}

	public String getRecommendText() {
		return this.recommendText;
	}
	public void setRecommendText(String recommendText) {
		this.recommendText = recommendText;
	}

}
