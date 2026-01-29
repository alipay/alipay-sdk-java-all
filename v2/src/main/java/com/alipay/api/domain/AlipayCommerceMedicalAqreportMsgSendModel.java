package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AQ报告消息推送
 *
 * @author auto create
 * @since 1.0, 2025-11-04 18:10:25
 */
public class AlipayCommerceMedicalAqreportMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 5418385153425756959L;

	/**
	 * AQ报告查询
	 */
	@ApiField("biz_principal")
	private String bizPrincipal;

	/**
	 * 科室名称
	 */
	@ApiField("department")
	private String department;

	/**
	 * 院区名称
	 */
	@ApiField("hospital_name")
	private String hospitalName;

	/**
	 * 消息创建时间，时间格式为：yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("msg_create_time")
	private Date msgCreateTime;

	/**
	 * 消息修改时间，时间格式为：yyyy-mm-dd hh:mm:ss
	 */
	@ApiField("msg_modified_time")
	private Date msgModifiedTime;

	/**
	 * 商户订单id
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 报告名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 报告数量
	 */
	@ApiField("report_num")
	private Long reportNum;

	/**
	 * 报告出具时间
	 */
	@ApiField("report_time")
	private Date reportTime;

	/**
	 * 报告来源
	 */
	@ApiField("source_name")
	private String sourceName;

	/**
	 * 模板码，支付宝侧定义
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 统一社会信用代码
	 */
	@ApiField("uscc")
	private String uscc;

	/**
	 * 用户证件号
	 */
	@ApiField("user_card_no")
	private String userCardNo;

	/**
	 * 用户身份类型
	 */
	@ApiField("user_card_type")
	private String userCardType;

	/**
	 * 用户手机号
	 */
	@ApiField("user_phone_no")
	private String userPhoneNo;

	public String getBizPrincipal() {
		return this.bizPrincipal;
	}
	public void setBizPrincipal(String bizPrincipal) {
		this.bizPrincipal = bizPrincipal;
	}

	public String getDepartment() {
		return this.department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}

	public String getHospitalName() {
		return this.hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Date getMsgCreateTime() {
		return this.msgCreateTime;
	}
	public void setMsgCreateTime(Date msgCreateTime) {
		this.msgCreateTime = msgCreateTime;
	}

	public Date getMsgModifiedTime() {
		return this.msgModifiedTime;
	}
	public void setMsgModifiedTime(Date msgModifiedTime) {
		this.msgModifiedTime = msgModifiedTime;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReportName() {
		return this.reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public Long getReportNum() {
		return this.reportNum;
	}
	public void setReportNum(Long reportNum) {
		this.reportNum = reportNum;
	}

	public Date getReportTime() {
		return this.reportTime;
	}
	public void setReportTime(Date reportTime) {
		this.reportTime = reportTime;
	}

	public String getSourceName() {
		return this.sourceName;
	}
	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getUscc() {
		return this.uscc;
	}
	public void setUscc(String uscc) {
		this.uscc = uscc;
	}

	public String getUserCardNo() {
		return this.userCardNo;
	}
	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}

	public String getUserCardType() {
		return this.userCardType;
	}
	public void setUserCardType(String userCardType) {
		this.userCardType = userCardType;
	}

	public String getUserPhoneNo() {
		return this.userPhoneNo;
	}
	public void setUserPhoneNo(String userPhoneNo) {
		this.userPhoneNo = userPhoneNo;
	}

}
