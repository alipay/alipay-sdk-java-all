package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 诊断报告状态回传
 *
 * @author auto create
 * @since 1.0, 2026-08-04 11:22:26
 */
public class AlipayCommerceMedicalInsuranceReportinfoSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6685371789833434829L;

	/**
	 * 评估时间
	 */
	@ApiField("assess_time")
	private Date assessTime;

	/**
	 * 业务流水号
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 渠道
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 扩展xin'x
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 失败原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 解读人
	 */
	@ApiField("interpretation_person")
	private String interpretationPerson;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 卡号
	 */
	@ApiField("out_unique_biz_no")
	private String outUniqueBizNo;

	/**
	 * 报告详情json
	 */
	@ApiField("report_detail")
	private String reportDetail;

	/**
	 * 报告id
	 */
	@ApiField("report_id")
	private String reportId;

	/**
	 * 报告图片
	 */
	@ApiField("report_image")
	private String reportImage;

	/**
	 * 报告名称
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 支付宝用户id
	 */
	@ApiField("user_id")
	private String userId;

	public Date getAssessTime() {
		return this.assessTime;
	}
	public void setAssessTime(Date assessTime) {
		this.assessTime = assessTime;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getInterpretationPerson() {
		return this.interpretationPerson;
	}
	public void setInterpretationPerson(String interpretationPerson) {
		this.interpretationPerson = interpretationPerson;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutUniqueBizNo() {
		return this.outUniqueBizNo;
	}
	public void setOutUniqueBizNo(String outUniqueBizNo) {
		this.outUniqueBizNo = outUniqueBizNo;
	}

	public String getReportDetail() {
		return this.reportDetail;
	}
	public void setReportDetail(String reportDetail) {
		this.reportDetail = reportDetail;
	}

	public String getReportId() {
		return this.reportId;
	}
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	public String getReportImage() {
		return this.reportImage;
	}
	public void setReportImage(String reportImage) {
		this.reportImage = reportImage;
	}

	public String getReportName() {
		return this.reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
