package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询驿站宝案件信息
 *
 * @author auto create
 * @since 1.0, 2022-04-14 12:17:28
 */
public class AnttechBlockchainDefinInsuranceReportQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6718268734845298622L;

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
	 * 保单号
	 */
	@ApiField("policy_no")
	private String policyNo;

	/**
	 * 产品运营中心开通的产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 报案号
	 */
	@ApiField("report_no")
	private String reportNo;

	/**
	 * 原报案流水号
	 */
	@ApiField("report_trade_no")
	private String reportTradeNo;

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

	public String getPolicyNo() {
		return this.policyNo;
	}
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getReportNo() {
		return this.reportNo;
	}
	public void setReportNo(String reportNo) {
		this.reportNo = reportNo;
	}

	public String getReportTradeNo() {
		return this.reportTradeNo;
	}
	public void setReportTradeNo(String reportTradeNo) {
		this.reportTradeNo = reportTradeNo;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
