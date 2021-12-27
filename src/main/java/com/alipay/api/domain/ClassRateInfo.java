package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分级汇率信息
 *
 * @author auto create
 * @since 1.0, 2020-03-15 16:03:47
 */
public class ClassRateInfo extends AlipayObject {

	private static final long serialVersionUID = 2394373645943111777L;

	/**
	 * 汇率等级有两种
1.权益等级汇率：
- diamond(钻石权益)
- platinum(铂金权益)
- others(无权益)

2.会员等级汇率： 
- diamond(钻石会员) 
- platinum(铂金会员) 
- golden(黄金会员) 
- primary(大众会员)
	 */
	@ApiField("grade")
	private String grade;

	/**
	 * 汇率等级描述
	 */
	@ApiField("grade_desc")
	private String gradeDesc;

	/**
	 * 汇率值
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 汇率金额，单位元
	 */
	@ApiField("rate_amount")
	private String rateAmount;

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getGradeDesc() {
		return this.gradeDesc;
	}
	public void setGradeDesc(String gradeDesc) {
		this.gradeDesc = gradeDesc;
	}

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getRateAmount() {
		return this.rateAmount;
	}
	public void setRateAmount(String rateAmount) {
		this.rateAmount = rateAmount;
	}

}
