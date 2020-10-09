package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 报价申请接口
 *
 * @author auto create
 * @since 1.0, 2020-06-10 19:49:26
 */
public class AlipayInsAutoAutoinsprodQuoteApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7751159164626734567L;

	/**
	 * 商业险产品信息
	 */
	@ApiField("business_product")
	private InsProduct businessProduct;

	/**
	 * 用户录入验证码,当需要图片验证码时必传
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 验证码对应id	当需要图片验证码时必传
	 */
	@ApiField("check_code_id")
	private String checkCodeId;

	/**
	 * 验证类型	0-不需要、1-江苏验证码、2-中保信验证码
	 */
	@ApiField("check_type")
	private String checkType;

	/**
	 * 机构编码	当微调报价时必传，当需要图片验证码时必传
	 */
	@ApiField("company_id")
	private String companyId;

	/**
	 * 此次报价，机构id列表
	 */
	@ApiListField("company_ids")
	@ApiField("string")
	private List<String> companyIds;

	/**
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/**
	 * 交强险产品信息
	 */
	@ApiField("force_product")
	private InsProduct forceProduct;

	/**
	 * 是否通融报价
	 */
	@ApiField("is_tong_rong")
	private String isTongRong;

	/**
	 * 报价类型	1-微调，0-套餐
	 */
	@ApiField("quote_type")
	private String quoteType;

	/**
	 * 税务机构编码
	 */
	@ApiField("tax_inst_code")
	private String taxInstCode;

	/**
	 * 税务机构名称
	 */
	@ApiField("tax_inst_name")
	private String taxInstName;

	/**
	 * 完税凭证编码
	 */
	@ApiField("tax_payment_code")
	private String taxPaymentCode;

	/**
	 * 完税评审日期，格式：yyyymmdd
	 */
	@ApiField("tax_payment_date")
	private String taxPaymentDate;

	/**
	 * 是否完税标识
	 */
	@ApiField("tax_type")
	private String taxType;

	public InsProduct getBusinessProduct() {
		return this.businessProduct;
	}
	public void setBusinessProduct(InsProduct businessProduct) {
		this.businessProduct = businessProduct;
	}

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getCheckCodeId() {
		return this.checkCodeId;
	}
	public void setCheckCodeId(String checkCodeId) {
		this.checkCodeId = checkCodeId;
	}

	public String getCheckType() {
		return this.checkType;
	}
	public void setCheckType(String checkType) {
		this.checkType = checkType;
	}

	public String getCompanyId() {
		return this.companyId;
	}
	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public List<String> getCompanyIds() {
		return this.companyIds;
	}
	public void setCompanyIds(List<String> companyIds) {
		this.companyIds = companyIds;
	}

	public String getEnquiryBizId() {
		return this.enquiryBizId;
	}
	public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}

	public InsProduct getForceProduct() {
		return this.forceProduct;
	}
	public void setForceProduct(InsProduct forceProduct) {
		this.forceProduct = forceProduct;
	}

	public String getIsTongRong() {
		return this.isTongRong;
	}
	public void setIsTongRong(String isTongRong) {
		this.isTongRong = isTongRong;
	}

	public String getQuoteType() {
		return this.quoteType;
	}
	public void setQuoteType(String quoteType) {
		this.quoteType = quoteType;
	}

	public String getTaxInstCode() {
		return this.taxInstCode;
	}
	public void setTaxInstCode(String taxInstCode) {
		this.taxInstCode = taxInstCode;
	}

	public String getTaxInstName() {
		return this.taxInstName;
	}
	public void setTaxInstName(String taxInstName) {
		this.taxInstName = taxInstName;
	}

	public String getTaxPaymentCode() {
		return this.taxPaymentCode;
	}
	public void setTaxPaymentCode(String taxPaymentCode) {
		this.taxPaymentCode = taxPaymentCode;
	}

	public String getTaxPaymentDate() {
		return this.taxPaymentDate;
	}
	public void setTaxPaymentDate(String taxPaymentDate) {
		this.taxPaymentDate = taxPaymentDate;
	}

	public String getTaxType() {
		return this.taxType;
	}
	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

}
