package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:53
 */
public class McpToolParameteInfo extends AlipayObject {

	private static final long serialVersionUID = 5788432958361293865L;

	/**
	 * null
	 */
	@ApiListField("input_parameter_list")
	@ApiField("tool_parameter_info")
	private List<ToolParameterInfo> inputParameterList;

	/**
	 * null
	 */
	@ApiListField("output_parameter_list")
	@ApiField("tool_parameter_info")
	private List<ToolParameterInfo> outputParameterList;

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

	public List<ToolParameterInfo> getInputParameterList() {
		return this.inputParameterList;
	}
	public void setInputParameterList(List<ToolParameterInfo> inputParameterList) {
		this.inputParameterList = inputParameterList;
	}

	public List<ToolParameterInfo> getOutputParameterList() {
		return this.outputParameterList;
	}
	public void setOutputParameterList(List<ToolParameterInfo> outputParameterList) {
		this.outputParameterList = outputParameterList;
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

}
