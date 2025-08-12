package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 文体行业用户任务权益简易信息对象
 *
 * @author auto create
 * @since 1.0, 2023-07-11 19:39:35
 */
public class UserTaskRightsSimpleDto extends AlipayObject {

	private static final long serialVersionUID = 6714379919779854345L;

	/**
	 * 权益奖励个数
	 */
	@ApiField("award_count")
	private Long awardCount;

	/**
	 * 额外信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 用户任务权益领取的北京时间。格式：yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_receive")
	private String gmtReceive;

	/**
	 * 外部用户任务权益业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 用户任务权益能领取最晚的北京时间，格式：yyyy-MM-dd HH:mm:ss，不存在就没有最晚时间限制
	 */
	@ApiField("receive_deadline")
	private String receiveDeadline;

	/**
	 * 权益ID
	 */
	@ApiField("rights_id")
	private String rightsId;

	/**
	 * 权益名称
	 */
	@ApiField("rights_name")
	private String rightsName;

	/**
	 * NONE-无实际权益，ISV-服务商权益， WUFU_TASK-五福卡权益
	 */
	@ApiField("rights_type")
	private String rightsType;

	/**
	 * 用户任务权益状态，UNRECEIVED-未领取，RECEIVED-已领取
	 */
	@ApiField("status")
	private String status;

	/**
	 * 用户任务权益ID
	 */
	@ApiField("user_task_rights_id")
	private String userTaskRightsId;

	public Long getAwardCount() {
		return this.awardCount;
	}
	public void setAwardCount(Long awardCount) {
		this.awardCount = awardCount;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGmtReceive() {
		return this.gmtReceive;
	}
	public void setGmtReceive(String gmtReceive) {
		this.gmtReceive = gmtReceive;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReceiveDeadline() {
		return this.receiveDeadline;
	}
	public void setReceiveDeadline(String receiveDeadline) {
		this.receiveDeadline = receiveDeadline;
	}

	public String getRightsId() {
		return this.rightsId;
	}
	public void setRightsId(String rightsId) {
		this.rightsId = rightsId;
	}

	public String getRightsName() {
		return this.rightsName;
	}
	public void setRightsName(String rightsName) {
		this.rightsName = rightsName;
	}

	public String getRightsType() {
		return this.rightsType;
	}
	public void setRightsType(String rightsType) {
		this.rightsType = rightsType;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserTaskRightsId() {
		return this.userTaskRightsId;
	}
	public void setUserTaskRightsId(String userTaskRightsId) {
		this.userTaskRightsId = userTaskRightsId;
	}

}
