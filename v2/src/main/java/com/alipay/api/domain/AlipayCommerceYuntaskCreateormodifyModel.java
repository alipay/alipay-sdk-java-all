package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 创建/编辑云店任务模版
 *
 * @author auto create
 * @since 1.0, 2024-09-13 21:13:52
 */
public class AlipayCommerceYuntaskCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 2316732292735449934L;

	/**
	 * 小程序appid，支持带跳转链接
	 */
	@ApiField("applet_id")
	private String appletId;

	/**
	 * 创建业务幂等号
	 */
	@ApiField("create_biz_no")
	private String createBizNo;

	/**
	 * 任务生效范围
	 */
	@ApiField("effect_scope")
	private TaskEffectScope effectScope;

	/**
	 * 出资方id
	 */
	@ApiField("funder_id")
	private String funderId;

	/**
	 * 出资方类型：品牌BRAND，零售商RETAILER，平台PLATFORM
	 */
	@ApiField("funder_type")
	private String funderType;

	/**
	 * 激励对象：
SHOP 门店
MERCHANT 商户
HUNTER 导购员
SUPERVISOR 督导员
	 */
	@ApiField("incentive")
	private String incentive;

	/**
	 * 任务结束后，在激励延长时间段内核销相关券，依然可以获得激励，单位为天
	 */
	@ApiField("incentive_extended_period")
	private Long incentiveExtendedPeriod;

	/**
	 * 激励方式：
PRESTROKE 逐笔
FIXEDLADDER 固定阶梯
ALGOLADDER 算法阶梯
	 */
	@ApiField("incentive_mode")
	private String incentiveMode;

	/**
	 * 激励规则, json字符
	 */
	@ApiField("incentive_rule")
	private String incentiveRule;

	/**
	 * 商户pid， 代运营模式需要
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作者uid
	 */
	@ApiField("operate_open_id")
	private String operateOpenId;

	/**
	 * 操作者uid
	 */
	@ApiField("operate_user_id")
	private String operateUserId;

	/**
	 * 活动方id
	 */
	@ApiField("organizer_id")
	private String organizerId;

	/**
	 * 活动方名称
	 */
	@ApiField("organizer_name")
	private String organizerName;

	/**
	 * 活动方类型：零售商RETAILER
	 */
	@ApiField("organizer_type")
	private String organizerType;

	/**
	 * 招商信息，task_type=VOUCHER 必填
	 */
	@ApiField("plan_info")
	private PlanInfo planInfo;

	/**
	 * 支持统一物料码激励到店长, 默认false
	 */
	@ApiField("support_unified_material_code")
	private Boolean supportUnifiedMaterialCode;

	/**
	 * 任务描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 任务结束时间
	 */
	@ApiField("task_end_time")
	private Date taskEndTime;

	/**
	 * 任务推广码背景图
	 */
	@ApiField("task_img")
	private String taskImg;

	/**
	 * 任务名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务规则图片
	 */
	@ApiField("task_rule_pic")
	private String taskRulePic;

	/**
	 * 任务开始时间
	 */
	@ApiField("task_start_time")
	private Date taskStartTime;

	/**
	 * 任务模版id，有值则编辑覆盖
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

	/**
	 * 任务类型：
VOUCHER 优惠券核销
IOT lot核销
	 */
	@ApiField("task_type")
	private String taskType;

	public String getAppletId() {
		return this.appletId;
	}
	public void setAppletId(String appletId) {
		this.appletId = appletId;
	}

	public String getCreateBizNo() {
		return this.createBizNo;
	}
	public void setCreateBizNo(String createBizNo) {
		this.createBizNo = createBizNo;
	}

	public TaskEffectScope getEffectScope() {
		return this.effectScope;
	}
	public void setEffectScope(TaskEffectScope effectScope) {
		this.effectScope = effectScope;
	}

	public String getFunderId() {
		return this.funderId;
	}
	public void setFunderId(String funderId) {
		this.funderId = funderId;
	}

	public String getFunderType() {
		return this.funderType;
	}
	public void setFunderType(String funderType) {
		this.funderType = funderType;
	}

	public String getIncentive() {
		return this.incentive;
	}
	public void setIncentive(String incentive) {
		this.incentive = incentive;
	}

	public Long getIncentiveExtendedPeriod() {
		return this.incentiveExtendedPeriod;
	}
	public void setIncentiveExtendedPeriod(Long incentiveExtendedPeriod) {
		this.incentiveExtendedPeriod = incentiveExtendedPeriod;
	}

	public String getIncentiveMode() {
		return this.incentiveMode;
	}
	public void setIncentiveMode(String incentiveMode) {
		this.incentiveMode = incentiveMode;
	}

	public String getIncentiveRule() {
		return this.incentiveRule;
	}
	public void setIncentiveRule(String incentiveRule) {
		this.incentiveRule = incentiveRule;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public String getOperateOpenId() {
		return this.operateOpenId;
	}
	public void setOperateOpenId(String operateOpenId) {
		this.operateOpenId = operateOpenId;
	}

	public String getOperateUserId() {
		return this.operateUserId;
	}
	public void setOperateUserId(String operateUserId) {
		this.operateUserId = operateUserId;
	}

	public String getOrganizerId() {
		return this.organizerId;
	}
	public void setOrganizerId(String organizerId) {
		this.organizerId = organizerId;
	}

	public String getOrganizerName() {
		return this.organizerName;
	}
	public void setOrganizerName(String organizerName) {
		this.organizerName = organizerName;
	}

	public String getOrganizerType() {
		return this.organizerType;
	}
	public void setOrganizerType(String organizerType) {
		this.organizerType = organizerType;
	}

	public PlanInfo getPlanInfo() {
		return this.planInfo;
	}
	public void setPlanInfo(PlanInfo planInfo) {
		this.planInfo = planInfo;
	}

	public Boolean getSupportUnifiedMaterialCode() {
		return this.supportUnifiedMaterialCode;
	}
	public void setSupportUnifiedMaterialCode(Boolean supportUnifiedMaterialCode) {
		this.supportUnifiedMaterialCode = supportUnifiedMaterialCode;
	}

	public String getTaskDesc() {
		return this.taskDesc;
	}
	public void setTaskDesc(String taskDesc) {
		this.taskDesc = taskDesc;
	}

	public Date getTaskEndTime() {
		return this.taskEndTime;
	}
	public void setTaskEndTime(Date taskEndTime) {
		this.taskEndTime = taskEndTime;
	}

	public String getTaskImg() {
		return this.taskImg;
	}
	public void setTaskImg(String taskImg) {
		this.taskImg = taskImg;
	}

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getTaskRulePic() {
		return this.taskRulePic;
	}
	public void setTaskRulePic(String taskRulePic) {
		this.taskRulePic = taskRulePic;
	}

	public Date getTaskStartTime() {
		return this.taskStartTime;
	}
	public void setTaskStartTime(Date taskStartTime) {
		this.taskStartTime = taskStartTime;
	}

	public String getTaskTemplateId() {
		return this.taskTemplateId;
	}
	public void setTaskTemplateId(String taskTemplateId) {
		this.taskTemplateId = taskTemplateId;
	}

	public String getTaskType() {
		return this.taskType;
	}
	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

}
