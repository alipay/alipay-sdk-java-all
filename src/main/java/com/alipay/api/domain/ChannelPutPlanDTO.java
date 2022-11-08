package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投放计划数据传输对象
 *
 * @author auto create
 * @since 1.0, 2022-09-13 22:49:13
 */
public class ChannelPutPlanDTO extends AlipayObject {

	private static final long serialVersionUID = 4751662562238323338L;

	/**
	 * 已有活动页面地址
	 */
	@ApiField("activity_page")
	private String activityPage;

	/**
	 * 计费方式
	 */
	@ApiField("bill_way")
	private String billWay;

	/**
	 * 渠道关联业务 id，比如运营活动 id
一期回填的是运营增长活动 id
V1.1 版本开始废弃
	 */
	@ApiField("channel_biz_id")
	private Long channelBizId;

	/**
	 * 渠道关联业务 id，比如运营活动 id
一期回填的是运营增长活动 id
	 */
	@ApiField("channel_biz_id_str")
	private String channelBizIdStr;

	/**
	 * 渠道类别+不唯一+租户渠道列表查询+数据库
	 */
	@ApiField("channel_categorychannel_category")
	private String channelCategorychannelCategory;

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
	 * 人群ids,用,分隔人群id
	 */
	@ApiField("crowd_ids")
	private String crowdIds;

	/**
	 * 自定义页面地址
	 */
	@ApiField("customize_page")
	private String customizePage;

	/**
	 * 计划实际执行结束时间
	 */
	@ApiField("exc_end_time")
	private Date excEndTime;

	/**
	 * 投放计划实际执行时间
	 */
	@ApiField("exc_start_time")
	private Date excStartTime;

	/**
	 * 异常原因
	 */
	@ApiField("exception_reason")
	private String exceptionReason;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 更新时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 计划结束时间
	 */
	@ApiField("gmt_plan_end")
	private Date gmtPlanEnd;

	/**
	 * 计划开始时间
	 */
	@ApiField("gmt_plan_start")
	private Date gmtPlanStart;

	/**
	 * 主键 id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 更新人 id
	 */
	@ApiField("modifier_id")
	private String modifierId;

	/**
	 * 更新人名称
	 */
	@ApiField("modifier_name")
	private String modifierName;

	/**
	 * 投放计划名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 页面类型
	 */
	@ApiField("page_type")
	private String pageType;

	/**
	 * 投放内容，动态json
	 */
	@ApiField("plan_content")
	private String planContent;

	/**
	 * 计划来源
	 */
	@ApiField("plan_source")
	private String planSource;

	/**
	 * 审核拒绝原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 重试次数
	 */
	@ApiField("repeat_times")
	private Long repeatTimes;

	/**
	 * 投放计划状态值
	 */
	@ApiField("status")
	private String status;

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

	public String getBillWay() {
		return this.billWay;
	}
	public void setBillWay(String billWay) {
		this.billWay = billWay;
	}

	public Long getChannelBizId() {
		return this.channelBizId;
	}
	public void setChannelBizId(Long channelBizId) {
		this.channelBizId = channelBizId;
	}

	public String getChannelBizIdStr() {
		return this.channelBizIdStr;
	}
	public void setChannelBizIdStr(String channelBizIdStr) {
		this.channelBizIdStr = channelBizIdStr;
	}

	public String getChannelCategorychannelCategory() {
		return this.channelCategorychannelCategory;
	}
	public void setChannelCategorychannelCategory(String channelCategorychannelCategory) {
		this.channelCategorychannelCategory = channelCategorychannelCategory;
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

	public Date getExcEndTime() {
		return this.excEndTime;
	}
	public void setExcEndTime(Date excEndTime) {
		this.excEndTime = excEndTime;
	}

	public Date getExcStartTime() {
		return this.excStartTime;
	}
	public void setExcStartTime(Date excStartTime) {
		this.excStartTime = excStartTime;
	}

	public String getExceptionReason() {
		return this.exceptionReason;
	}
	public void setExceptionReason(String exceptionReason) {
		this.exceptionReason = exceptionReason;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public Date getGmtPlanEnd() {
		return this.gmtPlanEnd;
	}
	public void setGmtPlanEnd(Date gmtPlanEnd) {
		this.gmtPlanEnd = gmtPlanEnd;
	}

	public Date getGmtPlanStart() {
		return this.gmtPlanStart;
	}
	public void setGmtPlanStart(Date gmtPlanStart) {
		this.gmtPlanStart = gmtPlanStart;
	}

	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getModifierId() {
		return this.modifierId;
	}
	public void setModifierId(String modifierId) {
		this.modifierId = modifierId;
	}

	public String getModifierName() {
		return this.modifierName;
	}
	public void setModifierName(String modifierName) {
		this.modifierName = modifierName;
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

	public String getPlanContent() {
		return this.planContent;
	}
	public void setPlanContent(String planContent) {
		this.planContent = planContent;
	}

	public String getPlanSource() {
		return this.planSource;
	}
	public void setPlanSource(String planSource) {
		this.planSource = planSource;
	}

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public Long getRepeatTimes() {
		return this.repeatTimes;
	}
	public void setRepeatTimes(Long repeatTimes) {
		this.repeatTimes = repeatTimes;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
