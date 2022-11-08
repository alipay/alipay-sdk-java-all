package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序消息运营位创建
 *
 * @author auto create
 * @since 1.0, 2022-10-11 19:22:17
 */
public class AlipayOpenMiniTemplateMarketingCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6448252271258969898L;

	/**
	 * 营销活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 活动结束时间
	 */
	@ApiField("gmt_end")
	private String gmtEnd;

	/**
	 * 活动开始时间
	 */
	@ApiField("gmt_start")
	private String gmtStart;

	/**
	 * 消息模板id列表，最多50个模板id
	 */
	@ApiListField("template_ids")
	@ApiField("string")
	private List<String> templateIds;

	/**
	 * 消息运营位名称，不填默认使用券名称
	 */
	@ApiField("title")
	private String title;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public String getGmtEnd() {
		return this.gmtEnd;
	}
	public void setGmtEnd(String gmtEnd) {
		this.gmtEnd = gmtEnd;
	}

	public String getGmtStart() {
		return this.gmtStart;
	}
	public void setGmtStart(String gmtStart) {
		this.gmtStart = gmtStart;
	}

	public List<String> getTemplateIds() {
		return this.templateIds;
	}
	public void setTemplateIds(List<String> templateIds) {
		this.templateIds = templateIds;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
