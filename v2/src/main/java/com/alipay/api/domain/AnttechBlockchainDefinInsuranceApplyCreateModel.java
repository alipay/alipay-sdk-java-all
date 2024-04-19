package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险投保
 *
 * @author auto create
 * @since 1.0, 2022-03-31 11:22:26
 */
public class AnttechBlockchainDefinInsuranceApplyCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6373315665191874422L;

	/**
	 * 投保基本信息
	 */
	@ApiField("apply_basic_info")
	private ApplyBasicInfo applyBasicInfo;

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
	 * 产品市场编码，一般指保司端险种编码
	 */
	@ApiField("pdt_mkt_code")
	private String pdtMktCode;

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
	 * 标的信息
	 */
	@ApiField("subject_information")
	private String subjectInformation;

	/**
	 * 唯一交易流水号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public ApplyBasicInfo getApplyBasicInfo() {
		return this.applyBasicInfo;
	}
	public void setApplyBasicInfo(ApplyBasicInfo applyBasicInfo) {
		this.applyBasicInfo = applyBasicInfo;
	}

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

	public String getPdtMktCode() {
		return this.pdtMktCode;
	}
	public void setPdtMktCode(String pdtMktCode) {
		this.pdtMktCode = pdtMktCode;
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

	public String getSubjectInformation() {
		return this.subjectInformation;
	}
	public void setSubjectInformation(String subjectInformation) {
		this.subjectInformation = subjectInformation;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
