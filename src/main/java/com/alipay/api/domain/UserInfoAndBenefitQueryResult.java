package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 用户信息和权益配置查询结果
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class UserInfoAndBenefitQueryResult extends AlipayObject {

	private static final long serialVersionUID = 5132755992178564137L;

	/**
	 * 用户的蚂蚁会员积分余额
	 */
	@ApiField("balance")
	private Long balance;

	/**
	 * 蚂蚁会员权益配置信息列表
	 */
	@ApiListField("benefit_info_list")
	@ApiField("benefit_grade_point")
	private List<BenefitGradePoint> benefitInfoList;

	/**
	 * 用户的蚂蚁会员等级
	 */
	@ApiField("grade")
	private String grade;

	public Long getBalance() {
		return this.balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public List<BenefitGradePoint> getBenefitInfoList() {
		return this.benefitInfoList;
	}
	public void setBenefitInfoList(List<BenefitGradePoint> benefitInfoList) {
		this.benefitInfoList = benefitInfoList;
	}

	public String getGrade() {
		return this.grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

}
