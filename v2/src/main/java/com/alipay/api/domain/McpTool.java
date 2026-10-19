package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-10 16:12:58
 */
public class McpTool extends AlipayObject {

	private static final long serialVersionUID = 1368564455179268838L;

	/**
	 * null
	 */
	@ApiListField("input_schema_examples")
	@ApiField("string")
	private List<String> inputSchemaExamples;

	/**
	 * null
	 */
	@ApiListField("output_schema_examples")
	@ApiField("string")
	private List<String> outputSchemaExamples;

	/**
	 * 工具编码
	 */
	@ApiField("tool_code")
	private String toolCode;

	/**
	 * 工具名称
	 */
	@ApiField("tool_name")
	private String toolName;

	/**
	 * 工具schema
	 */
	@ApiField("tool_schema")
	private String toolSchema;

	/**
	 * 工具版本
	 */
	@ApiField("tool_version")
	private String toolVersion;

	public List<String> getInputSchemaExamples() {
		return this.inputSchemaExamples;
	}
	public void setInputSchemaExamples(List<String> inputSchemaExamples) {
		this.inputSchemaExamples = inputSchemaExamples;
	}

	public List<String> getOutputSchemaExamples() {
		return this.outputSchemaExamples;
	}
	public void setOutputSchemaExamples(List<String> outputSchemaExamples) {
		this.outputSchemaExamples = outputSchemaExamples;
	}

	public String getToolCode() {
		return this.toolCode;
	}
	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}

	public String getToolName() {
		return this.toolName;
	}
	public void setToolName(String toolName) {
		this.toolName = toolName;
	}

	public String getToolSchema() {
		return this.toolSchema;
	}
	public void setToolSchema(String toolSchema) {
		this.toolSchema = toolSchema;
	}

	public String getToolVersion() {
		return this.toolVersion;
	}
	public void setToolVersion(String toolVersion) {
		this.toolVersion = toolVersion;
	}

}
