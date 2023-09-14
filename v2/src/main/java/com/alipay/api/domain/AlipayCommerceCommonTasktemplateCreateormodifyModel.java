package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客任务模板上传
 *
 * @author auto create
 * @since 1.0, 2023-06-20 14:33:07
 */
public class AlipayCommerceCommonTasktemplateCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 1427559183275928894L;

	/**
	 * 小程序跳转链接
	 */
	@ApiField("applet_id")
	private String appletId;

	/**
	 * 商户侧任务模板号，新建模板的时候必传，修改模板时，create_biz_no 与任务模板id至少一个必填
	 */
	@ApiField("create_biz_no")
	private String createBizNo;

	/**
	 * 出资方的id
	 */
	@ApiField("funder_id")
	private String funderId;

	/**
	 * 激励规则
	 */
	@ApiField("incentive_rule")
	private RealAmountRatioIncentiveRule incentiveRule;

	/**
	 * 任务最大领取数量
	 */
	@ApiField("max_receive_num")
	private Long maxReceiveNum;

	/**
	 * 代运营的商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 操作者openId
	 */
	@ApiField("operate_open_id")
	private String operateOpenId;

	/**
	 * 操作者id
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
	 * 任务模板描述
	 */
	@ApiField("task_desc")
	private String taskDesc;

	/**
	 * 任务结束时间
	 */
	@ApiField("task_end_time")
	private Date taskEndTime;

	/**
	 * 任务模板名称
	 */
	@ApiField("task_name")
	private String taskName;

	/**
	 * 任务生效时间
	 */
	@ApiField("task_start_time")
	private Date taskStartTime;

	/**
	 * 创建模板时，返回参数任务模板id，
修改模板时，任务模板id与外部模板号必传一个
	 */
	@ApiField("task_template_id")
	private String taskTemplateId;

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

	public String getFunderId() {
		return this.funderId;
	}
	public void setFunderId(String funderId) {
		this.funderId = funderId;
	}

	public RealAmountRatioIncentiveRule getIncentiveRule() {
		return this.incentiveRule;
	}
	public void setIncentiveRule(RealAmountRatioIncentiveRule incentiveRule) {
		this.incentiveRule = incentiveRule;
	}

	public Long getMaxReceiveNum() {
		return this.maxReceiveNum;
	}
	public void setMaxReceiveNum(Long maxReceiveNum) {
		this.maxReceiveNum = maxReceiveNum;
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

	public String getTaskName() {
		return this.taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
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

}
