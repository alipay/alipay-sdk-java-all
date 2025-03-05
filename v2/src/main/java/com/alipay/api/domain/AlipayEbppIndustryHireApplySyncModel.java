package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 招工交付岗位应聘状态同步接口
 *
 * @author auto create
 * @since 1.0, 2024-04-08 14:34:08
 */
public class AlipayEbppIndustryHireApplySyncModel extends AlipayObject {

	private static final long serialVersionUID = 2812132331676965314L;

	/**
	 * 用户投递ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 报名状态
	 */
	@ApiField("apply_status")
	private String applyStatus;

	/**
	 * 报名状态详细说明，相当于备注
	 */
	@ApiField("detail_reason")
	private String detailReason;

	/**
	 * 不合适原因
	 */
	@ApiField("inappropriate_reason")
	private String inappropriateReason;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 报名状态更新操作时间 如果报名状态有变更，通过本接口传更新后的信息。
	 */
	@ApiField("operation_time")
	private Date operationTime;

	/**
	 * 流程异常原因
	 */
	@ApiField("process_exception_reason")
	private String processExceptionReason;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getApplyStatus() {
		return this.applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}

	public String getDetailReason() {
		return this.detailReason;
	}
	public void setDetailReason(String detailReason) {
		this.detailReason = detailReason;
	}

	public String getInappropriateReason() {
		return this.inappropriateReason;
	}
	public void setInappropriateReason(String inappropriateReason) {
		this.inappropriateReason = inappropriateReason;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public Date getOperationTime() {
		return this.operationTime;
	}
	public void setOperationTime(Date operationTime) {
		this.operationTime = operationTime;
	}

	public String getProcessExceptionReason() {
		return this.processExceptionReason;
	}
	public void setProcessExceptionReason(String processExceptionReason) {
		this.processExceptionReason = processExceptionReason;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
