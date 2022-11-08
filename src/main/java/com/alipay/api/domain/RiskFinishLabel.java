package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险结案标签
 *
 * @author auto create
 * @since 1.0, 2022-11-01 16:31:24
 */
public class RiskFinishLabel extends AlipayObject {

	private static final long serialVersionUID = 7174196211723318999L;

	/**
	 * 对应审理平台结案标签的编码值
	 */
	@ApiField("code")
	private String code;

	/**
	 * 对应审理平台展示的标签文本
	 */
	@ApiField("label")
	private String label;

	/**
	 * 当前标签对应的标签树路径,多层标签时使用|分割
	 */
	@ApiField("path")
	private String path;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public String getPath() {
		return this.path;
	}
	public void setPath(String path) {
		this.path = path;
	}

}
