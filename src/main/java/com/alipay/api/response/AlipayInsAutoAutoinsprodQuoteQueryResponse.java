package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InsProduct;
import com.alipay.api.domain.Car;
import com.alipay.api.domain.CarModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.quote.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-08-12 09:52:26
 */
public class AlipayInsAutoAutoinsprodQuoteQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8638761388161376412L;

	/** 
	 * 商业费率浮动系数，0~1分值的数字，精确到小数点后4位，如：0.6589
	 */
	@ApiField("biz_discount")
	private String bizDiscount;

	/** 
	 * 商业险续保标识,  1：新保；2：续保；3：转保
	 */
	@ApiField("biz_renewal_flag")
	private String bizRenewalFlag;

	/** 
	 * 商业险续保公司名称
	 */
	@ApiField("biz_renewal_org")
	private String bizRenewalOrg;

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
	 * 车主评分，分值为1-100数字，精确到个位，如：92
	 */
	@ApiField("car_owner_grade")
	private String carOwnerGrade;

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
	 * 正确车险信息
	 */
	@ApiListField("correct_car_models")
	@ApiField("car_model")
	private List<CarModel> correctCarModels;

	/** 
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/** 
	 * 交强费率浮动系数，0~1分值的数字，精确到小数点后4位，如：0.6589
	 */
	@ApiField("force_discount")
	private String forceDiscount;

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
	 * 交强险续保标识; 1：新保；2：续保；3：转保
	 */
	@ApiField("force_renewal_flag")
	private String forceRenewalFlag;

	/** 
	 * 交强险续保公司名称
	 */
	@ApiField("force_renewal_org")
	private String forceRenewalOrg;

	/** 
	 * 支持的物流配送方式
	 */
	@ApiListField("logistics_models")
	@ApiField("string")
	private List<String> logisticsModels;

	/** 
	 * 允许调整的最大渠道系数，精确到小数点后十位
	 */
	@ApiField("max_self_channel_ratio")
	private String maxSelfChannelRatio;

	/** 
	 * 允许调整的最大核保系数，精确到小数点后十位
	 */
	@ApiField("max_self_underwrite_ratio")
	private String maxSelfUnderwriteRatio;

	/** 
	 * 允许调整的最小渠道系数，精确到小数点后十位
	 */
	@ApiField("min_self_channel_ratio")
	private String minSelfChannelRatio;

	/** 
	 * 允许调整的最小核保系数，精确到小数点后十位
	 */
	@ApiField("min_self_underwrite_ratio")
	private String minSelfUnderwriteRatio;

	/** 
	 * 平台NCD系数，精确到小数点后两位
	 */
	@ApiField("no_claim_adjust_ratio")
	private String noClaimAdjustRatio;

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
	 * 保司自主渠道系数，精确到小数点后十位
	 */
	@ApiField("self_channel_ratio")
	private String selfChannelRatio;

	/** 
	 * 保司自主核保系数，精确到小数点后十位
	 */
	@ApiField("self_underwrite_ratio")
	private String selfUnderwriteRatio;

	/** 
	 * 总保费
	 */
	@ApiField("total_premium")
	private String totalPremium;

	/** 
	 * 交通违法系数,精确到小数点后两位
	 */
	@ApiField("traffic_violation_ratio")
	private String trafficViolationRatio;

	/** 
	 * 客户评级信息，辅助作业人员展业(具体内容以保司信息为准)
	 */
	@ApiField("user_level")
	private String userLevel;

	/** 
	 * 用户提醒code
	 */
	@ApiField("warn_code")
	private String warnCode;

	/** 
	 * 用户提示内容
	 */
	@ApiField("warn_message")
	private String warnMessage;

	public void setBizDiscount(String bizDiscount) {
		this.bizDiscount = bizDiscount;
	}
	public String getBizDiscount( ) {
		return this.bizDiscount;
	}

	public void setBizRenewalFlag(String bizRenewalFlag) {
		this.bizRenewalFlag = bizRenewalFlag;
	}
	public String getBizRenewalFlag( ) {
		return this.bizRenewalFlag;
	}

	public void setBizRenewalOrg(String bizRenewalOrg) {
		this.bizRenewalOrg = bizRenewalOrg;
	}
	public String getBizRenewalOrg( ) {
		return this.bizRenewalOrg;
	}

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

	public void setCarOwnerGrade(String carOwnerGrade) {
		this.carOwnerGrade = carOwnerGrade;
	}
	public String getCarOwnerGrade( ) {
		return this.carOwnerGrade;
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

	public void setCorrectCarModels(List<CarModel> correctCarModels) {
		this.correctCarModels = correctCarModels;
	}
	public List<CarModel> getCorrectCarModels( ) {
		return this.correctCarModels;
	}

	public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}
	public String getEnquiryBizId( ) {
		return this.enquiryBizId;
	}

	public void setForceDiscount(String forceDiscount) {
		this.forceDiscount = forceDiscount;
	}
	public String getForceDiscount( ) {
		return this.forceDiscount;
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

	public void setForceRenewalFlag(String forceRenewalFlag) {
		this.forceRenewalFlag = forceRenewalFlag;
	}
	public String getForceRenewalFlag( ) {
		return this.forceRenewalFlag;
	}

	public void setForceRenewalOrg(String forceRenewalOrg) {
		this.forceRenewalOrg = forceRenewalOrg;
	}
	public String getForceRenewalOrg( ) {
		return this.forceRenewalOrg;
	}

	public void setLogisticsModels(List<String> logisticsModels) {
		this.logisticsModels = logisticsModels;
	}
	public List<String> getLogisticsModels( ) {
		return this.logisticsModels;
	}

	public void setMaxSelfChannelRatio(String maxSelfChannelRatio) {
		this.maxSelfChannelRatio = maxSelfChannelRatio;
	}
	public String getMaxSelfChannelRatio( ) {
		return this.maxSelfChannelRatio;
	}

	public void setMaxSelfUnderwriteRatio(String maxSelfUnderwriteRatio) {
		this.maxSelfUnderwriteRatio = maxSelfUnderwriteRatio;
	}
	public String getMaxSelfUnderwriteRatio( ) {
		return this.maxSelfUnderwriteRatio;
	}

	public void setMinSelfChannelRatio(String minSelfChannelRatio) {
		this.minSelfChannelRatio = minSelfChannelRatio;
	}
	public String getMinSelfChannelRatio( ) {
		return this.minSelfChannelRatio;
	}

	public void setMinSelfUnderwriteRatio(String minSelfUnderwriteRatio) {
		this.minSelfUnderwriteRatio = minSelfUnderwriteRatio;
	}
	public String getMinSelfUnderwriteRatio( ) {
		return this.minSelfUnderwriteRatio;
	}

	public void setNoClaimAdjustRatio(String noClaimAdjustRatio) {
		this.noClaimAdjustRatio = noClaimAdjustRatio;
	}
	public String getNoClaimAdjustRatio( ) {
		return this.noClaimAdjustRatio;
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

	public void setSelfChannelRatio(String selfChannelRatio) {
		this.selfChannelRatio = selfChannelRatio;
	}
	public String getSelfChannelRatio( ) {
		return this.selfChannelRatio;
	}

	public void setSelfUnderwriteRatio(String selfUnderwriteRatio) {
		this.selfUnderwriteRatio = selfUnderwriteRatio;
	}
	public String getSelfUnderwriteRatio( ) {
		return this.selfUnderwriteRatio;
	}

	public void setTotalPremium(String totalPremium) {
		this.totalPremium = totalPremium;
	}
	public String getTotalPremium( ) {
		return this.totalPremium;
	}

	public void setTrafficViolationRatio(String trafficViolationRatio) {
		this.trafficViolationRatio = trafficViolationRatio;
	}
	public String getTrafficViolationRatio( ) {
		return this.trafficViolationRatio;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	public String getUserLevel( ) {
		return this.userLevel;
	}

	public void setWarnCode(String warnCode) {
		this.warnCode = warnCode;
	}
	public String getWarnCode( ) {
		return this.warnCode;
	}

	public void setWarnMessage(String warnMessage) {
		this.warnMessage = warnMessage;
	}
	public String getWarnMessage( ) {
		return this.warnMessage;
	}

}
