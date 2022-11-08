package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UseCaseStepInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.autocheck.case.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-10-27 09:21:53
 */
public class AlipayOpenMiniAutocheckCaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1446743944261169878L;

	/** 
	 * 业务线
	 */
	@ApiField("biz_line_name")
	private String bizLineName;

	/** 
	 * 小程序类型
	 */
	@ApiField("case_type")
	private String caseType;

	/** 
	 * 创建人
	 */
	@ApiField("creator")
	private String creator;

	/** 
	 * 用例描述
	 */
	@ApiField("desc")
	private String desc;

	/** 
	 * 用例唯一主键ID
	 */
	@ApiField("id")
	private String id;

	/** 
	 * 标签
	 */
	@ApiListField("labels")
	@ApiField("string")
	private List<String> labels;

	/** 
	 * 小程序ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/** 
	 * 小程序ID
	 */
	@ApiField("mini_app_version")
	private String miniAppVersion;

	/** 
	 * 步骤信息
	 */
	@ApiField("step_info_list")
	private UseCaseStepInfo stepInfoList;

	/** 
	 * 用例执行超时时间
	 */
	@ApiField("timeout")
	private Long timeout;

	/** 
	 * 用例名称
	 */
	@ApiField("use_case_name")
	private String useCaseName;

	/** 
	 * 用例类型
	 */
	@ApiField("use_case_type")
	private String useCaseType;

	public void setBizLineName(String bizLineName) {
		this.bizLineName = bizLineName;
	}
	public String getBizLineName( ) {
		return this.bizLineName;
	}

	public void setCaseType(String caseType) {
		this.caseType = caseType;
	}
	public String getCaseType( ) {
		return this.caseType;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}
	public String getCreator( ) {
		return this.creator;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getDesc( ) {
		return this.desc;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

	public void setLabels(List<String> labels) {
		this.labels = labels;
	}
	public List<String> getLabels( ) {
		return this.labels;
	}

	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}
	public String getMiniAppId( ) {
		return this.miniAppId;
	}

	public void setMiniAppVersion(String miniAppVersion) {
		this.miniAppVersion = miniAppVersion;
	}
	public String getMiniAppVersion( ) {
		return this.miniAppVersion;
	}

	public void setStepInfoList(UseCaseStepInfo stepInfoList) {
		this.stepInfoList = stepInfoList;
	}
	public UseCaseStepInfo getStepInfoList( ) {
		return this.stepInfoList;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
	}
	public Long getTimeout( ) {
		return this.timeout;
	}

	public void setUseCaseName(String useCaseName) {
		this.useCaseName = useCaseName;
	}
	public String getUseCaseName( ) {
		return this.useCaseName;
	}

	public void setUseCaseType(String useCaseType) {
		this.useCaseType = useCaseType;
	}
	public String getUseCaseType( ) {
		return this.useCaseType;
	}

}
