package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 质检报告答案对象
 *
 * @author auto create
 * @since 1.0, 2026-08-10 10:26:39
 */
public class RecycleInspectReportAnswerVO extends AlipayObject {

	private static final long serialVersionUID = 5378571325925557466L;

	/**
	 * 是否缺陷项
	 */
	@ApiField("defect_option")
	private Boolean defectOption;

	/**
	 * 问题选项编码
	 */
	@ApiField("option_code")
	private String optionCode;

	/**
	 * 问题选项名称
	 */
	@ApiField("option_name")
	private String optionName;

	public Boolean getDefectOption() {
		return this.defectOption;
	}
	public void setDefectOption(Boolean defectOption) {
		this.defectOption = defectOption;
	}

	public String getOptionCode() {
		return this.optionCode;
	}
	public void setOptionCode(String optionCode) {
		this.optionCode = optionCode;
	}

	public String getOptionName() {
		return this.optionName;
	}
	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}

}
