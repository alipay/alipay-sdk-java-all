package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合同订单发送&确认记录
 *
 * @author auto create
 * @since 1.0, 2023-08-18 10:18:53
 */
public class ContractOrderSendLogDTO extends AlipayObject {

	private static final long serialVersionUID = 1811476966233326872L;

	/**
	 * 附件，逗号分隔的ResourceId
	 */
	@ApiField("files")
	private String files;

	/**
	 * 记录ID
	 */
	@ApiField("log_id")
	private String logId;

	/**
	 * 备注
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 发送时间
	 */
	@ApiField("send_time")
	private Date sendTime;

	/**
	 * 发送人工号
	 */
	@ApiField("sender")
	private String sender;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public String getFiles() {
		return this.files;
	}
	public void setFiles(String files) {
		this.files = files;
	}

	public String getLogId() {
		return this.logId;
	}
	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getSendTime() {
		return this.sendTime;
	}
	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}

	public String getSender() {
		return this.sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
