package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 理赔报案信息修改
 *
 * @author auto create
 * @since 1.0, 2019-08-26 17:24:01
 */
public class AlipayInsSceneClaimReportModifyModel extends AlipayObject {

	private static final long serialVersionUID = 7656532724385267311L;

	/**
	 * 出险地点
	 */
	@ApiField("accident_address")
	private String accidentAddress;

	/**
	 * 出险描述
	 */
	@ApiField("accident_desc")
	private String accidentDesc;

	/**
	 * 出险时间
	 */
	@ApiField("accident_time")
	private Date accidentTime;

	/**
	 * 理赔报案的属性字段，标准JSON格式
	 */
	@ApiField("biz_data")
	private String bizData;

	/**
	 * 申请理赔的报案号
	 */
	@ApiField("claim_report_no")
	private String claimReportNo;

	public String getAccidentAddress() {
		return this.accidentAddress;
	}
	public void setAccidentAddress(String accidentAddress) {
		this.accidentAddress = accidentAddress;
	}

	public String getAccidentDesc() {
		return this.accidentDesc;
	}
	public void setAccidentDesc(String accidentDesc) {
		this.accidentDesc = accidentDesc;
	}

	public Date getAccidentTime() {
		return this.accidentTime;
	}
	public void setAccidentTime(Date accidentTime) {
		this.accidentTime = accidentTime;
	}

	public String getBizData() {
		return this.bizData;
	}
	public void setBizData(String bizData) {
		this.bizData = bizData;
	}

	public String getClaimReportNo() {
		return this.claimReportNo;
	}
	public void setClaimReportNo(String claimReportNo) {
		this.claimReportNo = claimReportNo;
	}

}
