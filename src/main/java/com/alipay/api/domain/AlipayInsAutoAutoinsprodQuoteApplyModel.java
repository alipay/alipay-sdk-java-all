package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报价申请接口
 *
 * @author auto create
 * @since 1.0, 2018-01-09 11:32:37
 */
public class AlipayInsAutoAutoinsprodQuoteApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3459571636114713255L;

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
	 * 报价类型	1-微调，0-套餐
	 */
	@ApiField("quote_type")
	private String quoteType;

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

	public String getQuoteType() {
		return this.quoteType;
	}
	public void setQuoteType(String quoteType) {
		this.quoteType = quoteType;
	}

}
