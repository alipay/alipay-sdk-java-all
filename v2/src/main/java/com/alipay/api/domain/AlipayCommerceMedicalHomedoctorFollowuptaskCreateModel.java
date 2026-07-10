package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 创建AI随访任务
 *
 * @author auto create
 * @since 1.0, 2026-06-24 17:58:45
 */
public class AlipayCommerceMedicalHomedoctorFollowuptaskCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6395388614792142523L;

	/**
	 * 智能体ID,可不传入
	 */
	@ApiField("agent_id")
	private String agentId;

	/**
	 * null
	 */
	@ApiListField("biz_list")
	@ApiField("follow_up_create_task_biz_id_request")
	private List<FollowUpCreateTaskBizIdRequest> bizList;

	/**
	 * AI随访任务过期时间
	 */
	@ApiField("dead_line")
	private Date deadLine;

	/**
	 * 服务商维护的医生id
	 */
	@ApiField("doctor_id")
	private String doctorId;

	/**
	 * 服务商维护的医生名称
	 */
	@ApiField("doctor_name")
	private String doctorName;

	/**
	 * AI随访模版ID
	 */
	@ApiField("template_id")
	private String templateId;

	public String getAgentId() {
		return this.agentId;
	}
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public List<FollowUpCreateTaskBizIdRequest> getBizList() {
		return this.bizList;
	}
	public void setBizList(List<FollowUpCreateTaskBizIdRequest> bizList) {
		this.bizList = bizList;
	}

	public Date getDeadLine() {
		return this.deadLine;
	}
	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public String getDoctorId() {
		return this.doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return this.doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

}
