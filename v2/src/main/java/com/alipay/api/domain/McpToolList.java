package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:54
 */
public class McpToolList extends AlipayObject {

	private static final long serialVersionUID = 4776426132597767998L;

	/**
	 * 业务状态
	 */
	@ApiField("biz_status")
	private String bizStatus;

	/**
	 * null
	 */
	@ApiListField("input_parameter_list")
	@ApiField("tool_parameter_infos")
	private List<ToolParameterInfos> inputParameterList;

	/**
	 * null
	 */
	@ApiListField("output_parameter_list")
	@ApiField("tool_parameter_infos")
	private List<ToolParameterInfos> outputParameterList;

	/**
	 * 工具中文名
	 */
	@ApiField("tool_cn_name")
	private String toolCnName;

	/**
	 * 工具编码
	 */
	@ApiField("tool_code")
	private String toolCode;

	/**
	 * 工具描述
	 */
	@ApiField("tool_description")
	private String toolDescription;

	/**
	 * 工具英文名
	 */
	@ApiField("tool_en_name")
	private String toolEnName;

	/**
	 * 工具版本
	 */
	@ApiField("tool_version")
	private String toolVersion;

	public String getBizStatus() {
		return this.bizStatus;
	}
	public void setBizStatus(String bizStatus) {
		this.bizStatus = bizStatus;
	}

	public List<ToolParameterInfos> getInputParameterList() {
		return this.inputParameterList;
	}
	public void setInputParameterList(List<ToolParameterInfos> inputParameterList) {
		this.inputParameterList = inputParameterList;
	}

	public List<ToolParameterInfos> getOutputParameterList() {
		return this.outputParameterList;
	}
	public void setOutputParameterList(List<ToolParameterInfos> outputParameterList) {
		this.outputParameterList = outputParameterList;
	}

	public String getToolCnName() {
		return this.toolCnName;
	}
	public void setToolCnName(String toolCnName) {
		this.toolCnName = toolCnName;
	}

	public String getToolCode() {
		return this.toolCode;
	}
	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}

	public String getToolDescription() {
		return this.toolDescription;
	}
	public void setToolDescription(String toolDescription) {
		this.toolDescription = toolDescription;
	}

	public String getToolEnName() {
		return this.toolEnName;
	}
	public void setToolEnName(String toolEnName) {
		this.toolEnName = toolEnName;
	}

	public String getToolVersion() {
		return this.toolVersion;
	}
	public void setToolVersion(String toolVersion) {
		this.toolVersion = toolVersion;
	}

}
