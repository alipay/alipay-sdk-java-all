package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 保险极简投保定制参数
 *
 * @author auto create
 * @since 1.0, 2026-07-17 10:55:25
 */
public class InsOpenSimplestIssueCustomParamDTO extends AlipayObject {

	private static final long serialVersionUID = 2896676352922552672L;

	/**
	 * 职业类别
	 */
	@ApiField("job_category")
	private String jobCategory;

	/**
	 * 是否跳过风控核保
	 */
	@ApiField("skip_risk_underwrite")
	private Boolean skipRiskUnderwrite;

	public String getJobCategory() {
		return this.jobCategory;
	}
	public void setJobCategory(String jobCategory) {
		this.jobCategory = jobCategory;
	}

	public Boolean getSkipRiskUnderwrite() {
		return this.skipRiskUnderwrite;
	}
	public void setSkipRiskUnderwrite(Boolean skipRiskUnderwrite) {
		this.skipRiskUnderwrite = skipRiskUnderwrite;
	}

}
