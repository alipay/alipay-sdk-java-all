package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 校验详情
 *
 * @author auto create
 * @since 1.0, 2023-08-01 23:40:31
 */
public class PrescriptionCheckDetail extends AlipayObject {

	private static final long serialVersionUID = 6457369939677786537L;

	/**
	 * 校验编码
	 */
	@ApiField("check_code")
	private String checkCode;

	/**
	 * 校验内容
	 */
	@ApiField("check_content")
	private String checkContent;

	/**
	 * 校验标题
	 */
	@ApiField("check_title")
	private String checkTitle;

	/**
	 * 推荐的处方
	 */
	@ApiListField("recommended_diagnosis_list")
	@ApiField("diagnosis")
	private List<Diagnosis> recommendedDiagnosisList;

	/**
	 * SUGGESTION： 建议解决
REQUIRED：必须解决
	 */
	@ApiField("solve_level")
	private String solveLevel;

	public String getCheckCode() {
		return this.checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}

	public String getCheckContent() {
		return this.checkContent;
	}
	public void setCheckContent(String checkContent) {
		this.checkContent = checkContent;
	}

	public String getCheckTitle() {
		return this.checkTitle;
	}
	public void setCheckTitle(String checkTitle) {
		this.checkTitle = checkTitle;
	}

	public List<Diagnosis> getRecommendedDiagnosisList() {
		return this.recommendedDiagnosisList;
	}
	public void setRecommendedDiagnosisList(List<Diagnosis> recommendedDiagnosisList) {
		this.recommendedDiagnosisList = recommendedDiagnosisList;
	}

	public String getSolveLevel() {
		return this.solveLevel;
	}
	public void setSolveLevel(String solveLevel) {
		this.solveLevel = solveLevel;
	}

}
