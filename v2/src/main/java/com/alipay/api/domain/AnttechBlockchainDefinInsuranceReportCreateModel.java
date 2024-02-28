package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险报案
 *
 * @author auto create
 * @since 1.0, 2022-04-27 10:13:37
 */
public class AnttechBlockchainDefinInsuranceReportCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3244747722167772513L;

	/**
	 * 统一客户平台的业务线编码
	 */
	@ApiField("business_code")
	private String businessCode;

	/**
	 * 个性化参数
	 */
	@ApiField("parm")
	private String parm;

	/**
	 * 统一客户平台的会员类型
	 */
	@ApiField("platform_access_type")
	private String platformAccessType;

	/**
	 * 统一客户平台编码
	 */
	@ApiField("platform_code")
	private String platformCode;

	/**
	 * 产品运营中心开通的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 报案基本信息
	 */
	@ApiField("report_basic_info")
	private ReportBasicInfo reportBasicInfo;

	/**
	 * 案件标的信息
	 */
	@ApiField("report_subject_information")
	private String reportSubjectInformation;

	/**
	 * 唯一交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getBusinessCode() {
		return this.businessCode;
	}
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public String getParm() {
		return this.parm;
	}
	public void setParm(String parm) {
		this.parm = parm;
	}

	public String getPlatformAccessType() {
		return this.platformAccessType;
	}
	public void setPlatformAccessType(String platformAccessType) {
		this.platformAccessType = platformAccessType;
	}

	public String getPlatformCode() {
		return this.platformCode;
	}
	public void setPlatformCode(String platformCode) {
		this.platformCode = platformCode;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public ReportBasicInfo getReportBasicInfo() {
		return this.reportBasicInfo;
	}
	public void setReportBasicInfo(ReportBasicInfo reportBasicInfo) {
		this.reportBasicInfo = reportBasicInfo;
	}

	public String getReportSubjectInformation() {
		return this.reportSubjectInformation;
	}
	public void setReportSubjectInformation(String reportSubjectInformation) {
		this.reportSubjectInformation = reportSubjectInformation;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
