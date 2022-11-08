package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 百格用例创建
 *
 * @author auto create
 * @since 1.0, 2022-10-27 09:16:31
 */
public class AlipayOpenMiniAutocheckCaseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7698565614465983654L;

	/**
	 * 针对用例进行描述
	 */
	@ApiField("case_intro")
	private String caseIntro;

	/**
	 * 用例名称，确保唯一，不可重复
	 */
	@ApiField("case_name")
	private String caseName;

	/**
	 * 步骤信息
	 */
	@ApiListField("case_step_models")
	@ApiField("use_case_step_info")
	private List<UseCaseStepInfo> caseStepModels;

	/**
	 * 用例的创建人，传创建人工号
	 */
	@ApiField("creator")
	private String creator;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 用例执行的超时时间
	 */
	@ApiField("time_out")
	private String timeOut;

	public String getCaseIntro() {
		return this.caseIntro;
	}
	public void setCaseIntro(String caseIntro) {
		this.caseIntro = caseIntro;
	}

	public String getCaseName() {
		return this.caseName;
	}
	public void setCaseName(String caseName) {
		this.caseName = caseName;
	}

	public List<UseCaseStepInfo> getCaseStepModels() {
		return this.caseStepModels;
	}
	public void setCaseStepModels(List<UseCaseStepInfo> caseStepModels) {
		this.caseStepModels = caseStepModels;
	}

	public String getCreator() {
		return this.creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getTimeOut() {
		return this.timeOut;
	}
	public void setTimeOut(String timeOut) {
		this.timeOut = timeOut;
	}

}
