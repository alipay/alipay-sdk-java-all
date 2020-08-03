package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 广场舞大赛做任务领票数的任务信息
 *
 * @author auto create
 * @since 1.0, 2019-10-18 14:20:01
 */
public class SquareDanceTaskInfo extends AlipayObject {

	private static final long serialVersionUID = 2771573424196119759L;

	/**
	 * 应用id，固定值，用于识别相关调用方的应用来源
	 */
	@ApiField("application_id")
	private String applicationId;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 跳转地址
	 */
	@ApiField("button_action_url")
	private String buttonActionUrl;

	/**
	 * 相关任务的按钮文案，列表中展示
	 */
	@ApiField("button_text")
	private String buttonText;

	/**
	 * 额外参数，json串
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 任务流水id，唯一值，用于双方幂等控制
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 域内可以访问的图片地址，在任务列表中进行展示
	 */
	@ApiField("img_url")
	private String imgUrl;

	/**
	 * 任务状态，包括"TO_APPLY"："待申领","PROCESSING"： "进行中","COMPLETE"："已完成"
	 */
	@ApiField("status")
	private String status;

	/**
	 * 对于任务进行的描述说明
	 */
	@ApiField("sub_title")
	private String subTitle;

	/**
	 * 任务id，biz_type+创建日期+主键组成
	 */
	@ApiField("task_id")
	private String taskId;

	/**
	 * 任务标题，在任务列表页直接展示
	 */
	@ApiField("title")
	private String title;

	/**
	 * 完成任务用户可以获得的票数（任务奖励）
	 */
	@ApiField("votes")
	private Long votes;

	public String getApplicationId() {
		return this.applicationId;
	}
	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getButtonActionUrl() {
		return this.buttonActionUrl;
	}
	public void setButtonActionUrl(String buttonActionUrl) {
		this.buttonActionUrl = buttonActionUrl;
	}

	public String getButtonText() {
		return this.buttonText;
	}
	public void setButtonText(String buttonText) {
		this.buttonText = buttonText;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubTitle() {
		return this.subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getTaskId() {
		return this.taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Long getVotes() {
		return this.votes;
	}
	public void setVotes(Long votes) {
		this.votes = votes;
	}

}
