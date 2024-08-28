package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 星云删除用户
 *
 * @author auto create
 * @since 1.0, 2024-07-25 14:07:14
 */
public class AlipayIserviceIsresourceapiBizuserDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 5493318516719443898L;

	/**
	 * 业务方用户id
	 */
	@ApiField("biz_user_id")
	private String bizUserId;

	/**
	 * 清退类型：主动离职（可重新入职），质量清退（同步拉黑）不可再入职
	 */
	@ApiField("leave_type")
	private String leaveType;

	/**
	 * 删除原因
	 */
	@ApiField("reason")
	private String reason;

	/**
	 * 租户名称
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getBizUserId() {
		return this.bizUserId;
	}
	public void setBizUserId(String bizUserId) {
		this.bizUserId = bizUserId;
	}

	public String getLeaveType() {
		return this.leaveType;
	}
	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public String getReason() {
		return this.reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
