package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-05 16:32:53
 */
public class ToolInfo extends AlipayObject {

	private static final long serialVersionUID = 1896572466435697799L;

	/**
	 * 工具code
	 */
	@ApiField("tool_code")
	private String toolCode;

	/**
	 * 工具英文名
	 */
	@ApiField("tool_en_name")
	private String toolEnName;

	public String getToolCode() {
		return this.toolCode;
	}
	public void setToolCode(String toolCode) {
		this.toolCode = toolCode;
	}

	public String getToolEnName() {
		return this.toolEnName;
	}
	public void setToolEnName(String toolEnName) {
		this.toolEnName = toolEnName;
	}

}
