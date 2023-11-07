package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报案基本信息
 *
 * @author auto create
 * @since 1.0, 2022-04-27 10:13:37
 */
public class ReportBasicInfo extends AlipayObject {

	private static final long serialVersionUID = 5633693227625763549L;

	/**
	 * 出险时间
	 */
	@ApiField("accident_date")
	private String accidentDate;

	/**
	 * 投保请求的交易流水号
	 */
	@ApiField("apply_trade_no")
	private String applyTradeNo;

	/**
	 * 索赔金额
	 */
	@ApiField("estimate_amount")
	private String estimateAmount;

	/**
	 * 申请理赔的保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 关联业务订单号（理赔唯一标识/LP订单号）
	 */
	@ApiField("related_order_no")
	private String relatedOrderNo;

	/**
	 * 报案时间
	 */
	@ApiField("report_date")
	private String reportDate;

	/**
	 * 报案唯一标识，申请理赔所关联的订单号，如一个订单会存在多次理赔，请用唯一标识
	 */
	@ApiField("report_unique_key")
	private String reportUniqueKey;

	/**
	 * 报案人联系方式
	 */
	@ApiField("reporter_contact_info")
	private String reporterContactInfo;

	/**
	 * 申请报案人的名称
	 */
	@ApiField("reporter_name")
	private String reporterName;

	/**
	 * 工单号
	 */
	@ApiField("ticket_no")
	private String ticketNo;

	public String getAccidentDate() {
		return this.accidentDate;
	}
	public void setAccidentDate(String accidentDate) {
		this.accidentDate = accidentDate;
	}

	public String getApplyTradeNo() {
		return this.applyTradeNo;
	}
	public void setApplyTradeNo(String applyTradeNo) {
		this.applyTradeNo = applyTradeNo;
	}

	public String getEstimateAmount() {
		return this.estimateAmount;
	}
	public void setEstimateAmount(String estimateAmount) {
		this.estimateAmount = estimateAmount;
	}

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getRelatedOrderNo() {
		return this.relatedOrderNo;
	}
	public void setRelatedOrderNo(String relatedOrderNo) {
		this.relatedOrderNo = relatedOrderNo;
	}

	public String getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(String reportDate) {
		this.reportDate = reportDate;
	}

	public String getReportUniqueKey() {
		return this.reportUniqueKey;
	}
	public void setReportUniqueKey(String reportUniqueKey) {
		this.reportUniqueKey = reportUniqueKey;
	}

	public String getReporterContactInfo() {
		return this.reporterContactInfo;
	}
	public void setReporterContactInfo(String reporterContactInfo) {
		this.reporterContactInfo = reporterContactInfo;
	}

	public String getReporterName() {
		return this.reporterName;
	}
	public void setReporterName(String reporterName) {
		this.reporterName = reporterName;
	}

	public String getTicketNo() {
		return this.ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}

}
