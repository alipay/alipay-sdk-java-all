package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsProduct;
import com.alipay.api.domain.Car;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.quote.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-02-18 21:36:50
 */
public class AlipayInsAutoAutoinsprodQuoteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7851197431754813715L;

	/** 
	 * 商业险保费
	 */
	@ApiField("business_premium")
	private String businessPremium;

	/** 
	 * 商业险产品信息
	 */
	@ApiField("business_product")
	private InsProduct businessProduct;

	/** 
	 * 车辆信息
	 */
	@ApiField("car")
	private Car car;

	/** 
	 * 如果是图片验证码问题，返回验证码的base64流
	 */
	@ApiField("check_code")
	private String checkCode;

	/** 
	 * 图片验证码标识
	 */
	@ApiField("check_code_id")
	private String checkCodeId;

	/** 
	 * 0-不需要、1-江苏验证码、2-中保信验证码
	 */
	@ApiField("check_code_type")
	private String checkCodeType;

	/** 
	 * 保险公司ID
	 */
	@ApiField("com_id")
	private String comId;

	/** 
	 * 保险公司简称
	 */
	@ApiField("com_name")
	private String comName;

	/** 
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/** 
	 * 交强险保费
	 */
	@ApiField("force_premium")
	private String forcePremium;

	/** 
	 * 交强险产品信息
	 */
	@ApiField("force_product")
	private InsProduct forceProduct;

	/** 
	 * 报价ID
	 */
	@ApiField("quote_biz_id")
	private String quoteBizId;

	/** 
	 * 报价失败错误码，这个很重要
	 */
	@ApiField("quote_error_code")
	private String quoteErrorCode;

	/** 
	 * 报价失败提示信息
	 */
	@ApiField("quote_error_msg")
	private String quoteErrorMsg;

	/** 
	 * 实付保费[优惠后用户应付金额]
	 */
	@ApiField("real_premium")
	private String realPremium;

	/** 
	 * 优惠保费
	 */
	@ApiField("reduce_premium")
	private String reducePremium;

	/** 
	 * 总保费
	 */
	@ApiField("total_premium")
	private String totalPremium;

	public void setBusinessPremium(String businessPremium) {
		this.businessPremium = businessPremium;
	}
	public String getBusinessPremium( ) {
		return this.businessPremium;
	}

	public void setBusinessProduct(InsProduct businessProduct) {
		this.businessProduct = businessProduct;
	}
	public InsProduct getBusinessProduct( ) {
		return this.businessProduct;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	public Car getCar( ) {
		return this.car;
	}

	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	public String getCheckCode( ) {
		return this.checkCode;
	}

	public void setCheckCodeId(String checkCodeId) {
		this.checkCodeId = checkCodeId;
	}
	public String getCheckCodeId( ) {
		return this.checkCodeId;
	}

	public void setCheckCodeType(String checkCodeType) {
		this.checkCodeType = checkCodeType;
	}
	public String getCheckCodeType( ) {
		return this.checkCodeType;
	}

	public void setComId(String comId) {
		this.comId = comId;
	}
	public String getComId( ) {
		return this.comId;
	}

	public void setComName(String comName) {
		this.comName = comName;
	}
	public String getComName( ) {
		return this.comName;
	}

	public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}
	public String getEnquiryBizId( ) {
		return this.enquiryBizId;
	}

	public void setForcePremium(String forcePremium) {
		this.forcePremium = forcePremium;
	}
	public String getForcePremium( ) {
		return this.forcePremium;
	}

	public void setForceProduct(InsProduct forceProduct) {
		this.forceProduct = forceProduct;
	}
	public InsProduct getForceProduct( ) {
		return this.forceProduct;
	}

	public void setQuoteBizId(String quoteBizId) {
		this.quoteBizId = quoteBizId;
	}
	public String getQuoteBizId( ) {
		return this.quoteBizId;
	}

	public void setQuoteErrorCode(String quoteErrorCode) {
		this.quoteErrorCode = quoteErrorCode;
	}
	public String getQuoteErrorCode( ) {
		return this.quoteErrorCode;
	}

	public void setQuoteErrorMsg(String quoteErrorMsg) {
		this.quoteErrorMsg = quoteErrorMsg;
	}
	public String getQuoteErrorMsg( ) {
		return this.quoteErrorMsg;
	}

	public void setRealPremium(String realPremium) {
		this.realPremium = realPremium;
	}
	public String getRealPremium( ) {
		return this.realPremium;
	}

	public void setReducePremium(String reducePremium) {
		this.reducePremium = reducePremium;
	}
	public String getReducePremium( ) {
		return this.reducePremium;
	}

	public void setTotalPremium(String totalPremium) {
		this.totalPremium = totalPremium;
	}
	public String getTotalPremium( ) {
		return this.totalPremium;
	}

}
