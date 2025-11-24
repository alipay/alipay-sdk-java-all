package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 安心招工平台结算信息同步
 *
 * @author auto create
 * @since 1.0, 2025-03-11 16:57:28
 */
public class AlipayEbppIndustryRecruitSettlementSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4773676862248969417L;

	/**
	 * 实际工时；当前结算单对应的实际工时，（单位：小时），例如：8小时 
	 */
	@ApiField("attendance_time")
	private String attendanceTime;

	/**
	 * 结算详情URL，C端的钱包URL
	 */
	@ApiField("client_settlement_url")
	private String clientSettlementUrl;

	/**
	 * 岗位薪资；单位：元，精确到分，例如：80.00元
	 */
	@ApiField("job_salary")
	private String jobSalary;

	/**
	 * 岗位薪资单位；单位：元/小时、元/天、 元/周、元/月、 元/件
	 */
	@ApiField("job_salary_type")
	private String jobSalaryType;

	/**
	 * 报名订单ID
	 */
	@ApiField("out_apply_id")
	private String outApplyId;

	/**
	 * null
	 */
	@ApiListField("out_attendance_ids")
	@ApiField("string")
	private List<String> outAttendanceIds;

	/**
	 * 外部岗位id
	 */
	@ApiField("out_job_id")
	private String outJobId;

	/**
	 * 结算ID；ISV侧结算ID，当前报名ID的结算ID，记录待结算账单信息
	 */
	@ApiField("out_settlement_id")
	private String outSettlementId;

	/**
	 * 外部用户id
	 */
	@ApiField("out_user_id")
	private String outUserId;

	/**
	 * 调整后工时：（单位：小时）
	 */
	@ApiField("real_attendance_time")
	private String realAttendanceTime;

	/**
	 * 调整后薪资，单位：元，精确到分，例如：300.00元
	 */
	@ApiField("real_settle_amount")
	private String realSettleAmount;

	/**
	 * 待结算信息URL，B端的待结算信息URL
	 */
	@ApiField("server_settlement_url")
	private String serverSettlementUrl;

	/**
	 * 应结算薪资；当前结算单，按照实际工时对应结算的薪资，单位：元，精确到分，例如：300.00元
	 */
	@ApiField("settle_amount")
	private String settleAmount;

	/**
	 * 结算状态枚举：待雇主结算、雇主已结算
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * 结算信息来源
	 */
	@ApiField("source")
	private String source;

	public String getAttendanceTime() {
		return this.attendanceTime;
	}
	public void setAttendanceTime(String attendanceTime) {
		this.attendanceTime = attendanceTime;
	}

	public String getClientSettlementUrl() {
		return this.clientSettlementUrl;
	}
	public void setClientSettlementUrl(String clientSettlementUrl) {
		this.clientSettlementUrl = clientSettlementUrl;
	}

	public String getJobSalary() {
		return this.jobSalary;
	}
	public void setJobSalary(String jobSalary) {
		this.jobSalary = jobSalary;
	}

	public String getJobSalaryType() {
		return this.jobSalaryType;
	}
	public void setJobSalaryType(String jobSalaryType) {
		this.jobSalaryType = jobSalaryType;
	}

	public String getOutApplyId() {
		return this.outApplyId;
	}
	public void setOutApplyId(String outApplyId) {
		this.outApplyId = outApplyId;
	}

	public List<String> getOutAttendanceIds() {
		return this.outAttendanceIds;
	}
	public void setOutAttendanceIds(List<String> outAttendanceIds) {
		this.outAttendanceIds = outAttendanceIds;
	}

	public String getOutJobId() {
		return this.outJobId;
	}
	public void setOutJobId(String outJobId) {
		this.outJobId = outJobId;
	}

	public String getOutSettlementId() {
		return this.outSettlementId;
	}
	public void setOutSettlementId(String outSettlementId) {
		this.outSettlementId = outSettlementId;
	}

	public String getOutUserId() {
		return this.outUserId;
	}
	public void setOutUserId(String outUserId) {
		this.outUserId = outUserId;
	}

	public String getRealAttendanceTime() {
		return this.realAttendanceTime;
	}
	public void setRealAttendanceTime(String realAttendanceTime) {
		this.realAttendanceTime = realAttendanceTime;
	}

	public String getRealSettleAmount() {
		return this.realSettleAmount;
	}
	public void setRealSettleAmount(String realSettleAmount) {
		this.realSettleAmount = realSettleAmount;
	}

	public String getServerSettlementUrl() {
		return this.serverSettlementUrl;
	}
	public void setServerSettlementUrl(String serverSettlementUrl) {
		this.serverSettlementUrl = serverSettlementUrl;
	}

	public String getSettleAmount() {
		return this.settleAmount;
	}
	public void setSettleAmount(String settleAmount) {
		this.settleAmount = settleAmount;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public String getSource() {
		return this.source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
