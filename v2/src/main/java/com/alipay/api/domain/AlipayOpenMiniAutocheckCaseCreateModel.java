package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 百格用例创建
 *
 * @author auto create
 * @since 1.0, 2023-03-03 22:35:15
 */
public class AlipayOpenMiniAutocheckCaseCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3283575279686674285L;

	/**
	 * 业务线
	 */
	@ApiField("biz_line_name")
	private String bizLineName;

	/**
	 * 用例执行时的小程序类型
	 */
	@ApiField("case_app_type")
	private String caseAppType;

	/**
	 * slm上的用例ID，在用例类型为脚本时必填，多个用例ID之间用,分割
	 */
	@ApiField("case_ids")
	private String caseIds;

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

	/**
	 * slm脚本用例中使用到的参数
	 */
	@ApiField("use_case_exe_map")
	private String useCaseExeMap;

	/**
	 * 用例类型
	 */
	@ApiField("use_case_type")
	private String useCaseType;

	public String getBizLineName() {
		return this.bizLineName;
	}
	public void setBizLineName(String bizLineName) {
		this.bizLineName = bizLineName;
	}

	public String getCaseAppType() {
		return this.caseAppType;
	}
	public void setCaseAppType(String caseAppType) {
		this.caseAppType = caseAppType;
	}

	public String getCaseIds() {
		return this.caseIds;
	}
	public void setCaseIds(String caseIds) {
		this.caseIds = caseIds;
	}

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

	public String getUseCaseExeMap() {
		return this.useCaseExeMap;
	}
	public void setUseCaseExeMap(String useCaseExeMap) {
		this.useCaseExeMap = useCaseExeMap;
	}

	public String getUseCaseType() {
		return this.useCaseType;
	}
	public void setUseCaseType(String useCaseType) {
		this.useCaseType = useCaseType;
	}

}
