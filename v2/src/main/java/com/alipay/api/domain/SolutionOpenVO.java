package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 签呗电子签约合同解决方案查询视图对象。
 *
 * @author auto create
 * @since 1.0, 2023-05-16 15:23:14
 */
public class SolutionOpenVO extends AlipayObject {

	private static final long serialVersionUID = 3891752665157788969L;

	/**
	 * ecsign解决方案属性信息开放试图对象，主要用于承载服务载体等信息，不能为空。
	 */
	@ApiListField("attribute_vo_list")
	@ApiField("solution_attribute_info_open_v_o")
	private List<SolutionAttributeInfoOpenVO> attributeVoList;

	/**
	 * 用户模式扩展使用，可为空。
	 */
	@ApiField("extend_mode")
	private String extendMode;

	/**
	 * 解决方案的创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 解决方案码，唯一值，又创建时系统生成。
	 */
	@ApiField("solution_code")
	private String solutionCode;

	/**
	 * 解决方案示例值，由用户输入。
	 */
	@ApiField("solution_desc")
	private String solutionDesc;

	/**
	 * 解决方案名称，非唯一值，有用户自行输入。
	 */
	@ApiField("solution_name")
	private String solutionName;

	/**
	 * 合同模板列表，解决方案详情接口查询出来仅包括模板ID及是否必读。
	 */
	@ApiListField("template_list")
	@ApiField("contract_template_open_v_o")
	private List<ContractTemplateOpenVO> templateList;

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

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
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

	public List<ContractTemplateOpenVO> getTemplateList() {
		return this.templateList;
	}
	public void setTemplateList(List<ContractTemplateOpenVO> templateList) {
		this.templateList = templateList;
	}

}
