package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签呗电子签约解决方案保存服务
 *
 * @author auto create
 * @since 1.0, 2023-05-18 15:28:28
 */
public class AlipayFinancialnetAuthEcsignSolutionSaveModel extends AlipayObject {

	private static final long serialVersionUID = 6668513239644948582L;

	/**
	 * ecsign解决方案属性信息开放试图对象，主要用于承载服务载体等信息，不能为空。
	 */
	@ApiListField("attribute_vo_list")
	@ApiField("solution_attribute_info_open_v_o")
	private List<SolutionAttributeInfoOpenVO> attributeVoList;

	/**
	 * 拓展模式，需要与蚂蚁这边咨询具体入参，没有则可空。
	 */
	@ApiField("extend_mode")
	private String extendMode;

	/**
	 * 解决方案码，唯一值，如果传入则表示更新，如果未传入表示新增。
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 解决方案示例值，由用户输入。
	 */
	@ApiField("solution_desc")
	private String solutionDesc;

	/**
	 * 解决方案名称，非唯一值，必传。
	 */
	@ApiField("solution_name")
	private String solutionName;

	/**
	 * 模板列表，可空，VO参数中只需要传templateId,mustRest两个参数就行。
	 */
	@ApiListField("template_vo_list")
	@ApiField("contract_template_open_v_o")
	private List<ContractTemplateOpenVO> templateVoList;

	public List<SolutionAttributeInfoOpenVO> getAttributeVoList() {
		return this.attributeVoList;
	}
	public void setAttributeVoList(List<SolutionAttributeInfoOpenVO> attributeVoList) {
		this.attributeVoList = attributeVoList;
	}

	public String getExtendMode() {
		return this.extendMode;
	}
	public void setExtendMode(String extendMode) {
		this.extendMode = extendMode;
	}

	public String getSolutionCode() {
		return this.solutionCode;
	}
	public void setSolutionCode(String solutionCode) {
		this.solutionCode = solutionCode;
	}

	public String getSolutionDesc() {
		return this.solutionDesc;
	}
	public void setSolutionDesc(String solutionDesc) {
		this.solutionDesc = solutionDesc;
	}

	public String getSolutionName() {
		return this.solutionName;
	}
	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
	}

	public List<ContractTemplateOpenVO> getTemplateVoList() {
		return this.templateVoList;
	}
	public void setTemplateVoList(List<ContractTemplateOpenVO> templateVoList) {
		this.templateVoList = templateVoList;
	}

}
