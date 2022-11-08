package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 渠道投放计划创建
 *
 * @author auto create
 * @since 1.0, 2022-07-27 15:02:25
 */
public class DatadigitalFincloudFinsaasPutplanCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3452549531766297626L;

	/**
	 * 已有页面地址
	 */
	@ApiField("activity_page")
	private String activityPage;

	/**
	 * 活动主标题
	 */
	@ApiField("activity_title")
	private String activityTitle;

	/**
	 * 权益描述内容
	 */
	@ApiField("benefit_desc")
	private String benefitDesc;

	/**
	 * 计费方式
	 */
	@ApiField("bill_way")
	private String billWay;

	/**
	 * 渠道 id
	 */
	@ApiField("channel_id")
	private Long channelId;

	/**
	 * 创建人 id
	 */
	@ApiField("creator_id")
	private String creatorId;

	/**
	 * 创建人名称
	 */
	@ApiField("creator_name")
	private String creatorName;

	/**
	 * 人群 id 列表，多个英文逗号分隔
	 */
	@ApiField("crowd_ids")
	private String crowdIds;

	/**
	 * 自定义活动页面地址
	 */
	@ApiField("customize_page")
	private String customizePage;

	/**
	 * 详情页标题
	 */
	@ApiField("detail_page_title")
	private String detailPageTitle;

	/**
	 * 投放计划结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 投放计划名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 投放页面类型
	 */
	@ApiField("page_type")
	private String pageType;

	/**
	 * 列表页展示图
	 */
	@ApiField("pic_url")
	private String picUrl;

	/**
	 * 投放内容
	 */
	@ApiField("plan_content")
	private String planContent;

	/**
	 * 展示用规则文本
	 */
	@ApiField("rule_text")
	private String ruleText;

	/**
	 * 投放计划开始时间
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 运营增长任务 id
	 */
	@ApiField("task_id")
	private Long taskId;

	/**
	 * 租户 code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getActivityPage() {
		return this.activityPage;
	}
	public void setActivityPage(String activityPage) {
		this.activityPage = activityPage;
	}

	public String getActivityTitle() {
		return this.activityTitle;
	}
	public void setActivityTitle(String activityTitle) {
		this.activityTitle = activityTitle;
	}

	public String getBenefitDesc() {
		return this.benefitDesc;
	}
	public void setBenefitDesc(String benefitDesc) {
		this.benefitDesc = benefitDesc;
	}

	public String getBillWay() {
		return this.billWay;
	}
	public void setBillWay(String billWay) {
		this.billWay = billWay;
	}

	public Long getChannelId() {
		return this.channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getCreatorId() {
		return this.creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return this.creatorName;
	}
	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getCrowdIds() {
		return this.crowdIds;
	}
	public void setCrowdIds(String crowdIds) {
		this.crowdIds = crowdIds;
	}

	public String getCustomizePage() {
		return this.customizePage;
	}
	public void setCustomizePage(String customizePage) {
		this.customizePage = customizePage;
	}

	public String getDetailPageTitle() {
		return this.detailPageTitle;
	}
	public void setDetailPageTitle(String detailPageTitle) {
		this.detailPageTitle = detailPageTitle;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPageType() {
		return this.pageType;
	}
	public void setPageType(String pageType) {
		this.pageType = pageType;
	}

	public String getPicUrl() {
		return this.picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getPlanContent() {
		return this.planContent;
	}
	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public String getRuleText() {
		return this.ruleText;
	}
	public void setRuleText(String ruleText) {
		this.ruleText = ruleText;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
