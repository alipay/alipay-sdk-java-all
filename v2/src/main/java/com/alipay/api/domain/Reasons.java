package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品问题描述详情
 *
 * @author auto create
 * @since 1.0, 2023-12-10 00:28:16
 */
public class Reasons extends AlipayObject {

	private static final long serialVersionUID = 3589447597225875777L;

	/**
	 * 标识商品具体问题的图片
	 */
	@ApiListField("problem_pic")
	@ApiField("string")
	private List<String> problemPic;

	/**
	 * 描述风险项对应的具体问题
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 描述商品问题的类别，例如“商品页面”、“商品标题”...
	 */
	@ApiField("risk_name")
	private String riskName;

	public List<String> getProblemPic() {
		return this.problemPic;
	}
	public void setProblemPic(List<String> problemPic) {
		this.problemPic = problemPic;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getRiskName() {
		return this.riskName;
	}
	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

}
