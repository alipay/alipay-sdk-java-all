package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 投放计划详情数据对象
 *
 * @author auto create
 * @since 1.0, 2022-07-05 14:39:32
 */
public class ChannelPutPlanDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 7511157523287465545L;

	/**
	 * 自定义活动页面地址
	 */
	@ApiField("activity_page")
	private String activityPage;

	/**
	 * 计费方式
	 */
	@ApiField("bill_way")
	private String billWay;

	/**
	 * 投放计划绑定渠道 id
	 */
	@ApiField("channel_id")
	private Long channelId;

	/**
	 * 投放计划绑定的渠道名称
	 */
	@ApiField("channel_name")
	private String channelName;

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
	 * 人群 id 集合
	 */
	@ApiListField("crowd_ids")
	@ApiField("string")
	private List<String> crowdIds;

	/**
	 * 自定义活动页面地址
	 */
	@ApiField("customize_page")
	private String customizePage;

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
	 * 投放计划主键 id
	 */
	@ApiField("id")
	private Long id;

	/**
	 * 修改人 id
	 */
	@ApiField("modifier_id")
	private String modifierId;

	/**
	 * 修改人名称
	 */
	@ApiField("modifier_name")
	private String modifierName;

	/**
	 * 投放计划名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 投放计划关联的页面类型
	 */
	@ApiField("page_type")
	private String pageType;

	/**
	 * 投放计划拒绝原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/**
	 * 投放计划状态值
	 */
	@ApiField("status")
	private String status;

	/**
	 * 运营增长活动 id
	 */
	@ApiField("task_id")
	private Long taskId;

	/**
	 * 运营增长活动名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 所属租户 code
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

	public Long getChannelId() {
		return this.channelId;
	}
	public void setChannelId(Long channelId) {
		this.channelId = channelId;
	}

	public String getChannelName() {
		return this.channelName;
	}
	public void setChannelName(String channelName) {
		this.channelName = channelName;
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

	public List<String> getCrowdIds() {
		return this.crowdIds;
	}
	public void setCrowdIds(List<String> crowdIds) {
		this.crowdIds = crowdIds;
	}

	public String getCustomizePage() {
		return this.customizePage;
	}
	public void setCustomizePage(String customizePage) {
		this.customizePage = customizePage;
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

	public String getRejectReason() {
		return this.rejectReason;
	}
	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getTaskId() {
		return this.taskId;
	}
	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
