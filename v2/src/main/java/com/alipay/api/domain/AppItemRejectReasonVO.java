package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 审核驳回原因
 *
 * @author auto create
 * @since 1.0, 2023-03-31 15:03:55
 */
public class AppItemRejectReasonVO extends AlipayObject {

	private static final long serialVersionUID = 6478758761869847835L;

	/**
	 * 示例图片url
	 */
	@ApiListField("problem_pic")
	@ApiField("string")
	private List<String> problemPic;

	/**
	 * 备注原因
	 */
	@ApiField("remark")
	private String remark;

	/**
	 * 风险项名称
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
