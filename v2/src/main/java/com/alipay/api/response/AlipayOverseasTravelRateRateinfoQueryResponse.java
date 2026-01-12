package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ClassRateInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.rate.rateinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:41:21
 */
public class AlipayOverseasTravelRateRateinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2837725622249474261L;

	/** 
	 * 权益汇率列表：每个汇率权益级别对应的汇率；见ClassRateInfo.grade字段
	 */
	@ApiListField("benefit_rate_list")
	@ApiField("class_rate_info")
	private List<ClassRateInfo> benefitRateList;

	/** 
	 * 对比汇率：用户计算汇率的优惠力度
	 */
	@ApiField("contrast_rate")
	private String contrastRate;

	/** 
	 * 对比汇率金额：用于计算汇率优惠金额，单位是元
如：
钻石汇率优惠金额=钻石权益级别汇率金额-对比汇率金额；
用户汇率优惠金额=用户汇率金额-对比汇率金额
	 */
	@ApiField("contrast_rate_amount")
	private String contrastRateAmount;

	/** 
	 * 货币代码，ISO标准alpha-3币种代码
	 */
	@ApiField("currency")
	private String currency;

	/** 
	 * 货币icon的url地址
	 */
	@ApiField("currency_icon")
	private String currencyIcon;

	/** 
	 * 会员汇率列表：会员每个等级对应的汇率，具体会员等级见ClassRateInfo.grade字段
	 */
	@ApiListField("member_rate_list")
	@ApiField("class_rate_info")
	private List<ClassRateInfo> memberRateList;

	/** 
	 * 汇率描述
	 */
	@ApiField("rate_desc")
	private String rateDesc;

	/** 
	 * 汇率来源说明
	 */
	@ApiField("rate_source")
	private String rateSource;

	/** 
	 * 当参数中user_id不为空时返回，权益等级：
- diamond(钻石权益)
- platinum(铂金权益)
- others(无权益)
	 */
	@ApiField("user_benefit_grade")
	private String userBenefitGrade;

	/** 
	 * 当参数中user_id不为空时返回，
会员等级： 
- diamond(钻石会员) 
- platinum(铂金会员) 
- golden(黄金会员) 
- primary(大众会员)
	 */
	@ApiField("user_member_grade")
	private String userMemberGrade;

	/** 
	 * 当参数中user_id不为空时，返回用户汇率，为支付宝当面付的当前币种/CNY的汇率值，如6.2345;
	 */
	@ApiField("user_rate")
	private String userRate;

	/** 
	 * 当参数中user_id不为空时，返回用户用户汇率金额，单位元
	 */
	@ApiField("user_rate_amount")
	private String userRateAmount;

	public void setBenefitRateList(List<ClassRateInfo> benefitRateList) {
		this.benefitRateList = benefitRateList;
	}
	public List<ClassRateInfo> getBenefitRateList( ) {
		return this.benefitRateList;
	}

	public void setContrastRate(String contrastRate) {
		this.contrastRate = contrastRate;
	}
	public String getContrastRate( ) {
		return this.contrastRate;
	}

	public void setContrastRateAmount(String contrastRateAmount) {
		this.contrastRateAmount = contrastRateAmount;
	}
	public String getContrastRateAmount( ) {
		return this.contrastRateAmount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getCurrency( ) {
		return this.currency;
	}

	public void setCurrencyIcon(String currencyIcon) {
		this.currencyIcon = currencyIcon;
	}
	public String getCurrencyIcon( ) {
		return this.currencyIcon;
	}

	public void setMemberRateList(List<ClassRateInfo> memberRateList) {
		this.memberRateList = memberRateList;
	}
	public List<ClassRateInfo> getMemberRateList( ) {
		return this.memberRateList;
	}

	public void setRateDesc(String rateDesc) {
		this.rateDesc = rateDesc;
	}
	public String getRateDesc( ) {
		return this.rateDesc;
	}

	public void setRateSource(String rateSource) {
		this.rateSource = rateSource;
	}
	public String getRateSource( ) {
		return this.rateSource;
	}

	public void setUserBenefitGrade(String userBenefitGrade) {
		this.userBenefitGrade = userBenefitGrade;
	}
	public String getUserBenefitGrade( ) {
		return this.userBenefitGrade;
	}

	public void setUserMemberGrade(String userMemberGrade) {
		this.userMemberGrade = userMemberGrade;
	}
	public String getUserMemberGrade( ) {
		return this.userMemberGrade;
	}

	public void setUserRate(String userRate) {
		this.userRate = userRate;
	}
	public String getUserRate( ) {
		return this.userRate;
	}

	public void setUserRateAmount(String userRateAmount) {
		this.userRateAmount = userRateAmount;
	}
	public String getUserRateAmount( ) {
		return this.userRateAmount;
	}

}
