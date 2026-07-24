package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 家庭医生授权
 *
 * @author auto create
 * @since 1.0, 2026-07-09 14:12:55
 */
public class AlipayCommerceMedicalHomedoctorDoctorBindModel extends AlipayObject {

	private static final long serialVersionUID = 6832639867657464216L;

	/**
	 * 智能体ID，由支付宝提供，如果一个服务商仅有一个agent_id时可为空
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * 蚂蚁健康用户的openId
	 */
	@ApiField("aq_open_id")
	private String aqOpenId;

	/**
	 * 医生的唯一ID，可传入服务商系统的医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 群公告
	 */
	@ApiField("group_notice")
	private String groupNotice;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public String getAqOpenId() {
		return this.aqOpenId;
	}
	public void setAqOpenId(String aqOpenId) {
		this.aqOpenId = aqOpenId;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getGroupNotice() {
		return this.groupNotice;
	}
	public void setGroupNotice(String groupNotice) {
		this.groupNotice = groupNotice;
	}

}
