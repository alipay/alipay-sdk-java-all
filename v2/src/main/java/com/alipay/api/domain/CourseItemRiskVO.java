package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 当前入参needEditVersion 为true, 且审核被驳回时, 此处显示驳回信息
 *
 * @author auto create
 * @since 1.0, 2025-08-18 14:17:36
 */
public class CourseItemRiskVO extends AlipayObject {

	private static final long serialVersionUID = 1649858134671568773L;

	/**
	 * 最近一次审核完结时间
yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("audit_time")
	private String auditTime;

	/**
	 * null
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
	 * 描述商品问题的类别，例如“商品页面”、“商品标题”.
	 */
	@ApiField("risk_name")
	private String riskName;

	public String getAuditTime() {
		return this.auditTime;
	}
	public void setAuditTime(String auditTime) {
		this.auditTime = auditTime;
	}

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
