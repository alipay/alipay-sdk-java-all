package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 设计saas页面模版的参数
 *
 * @author auto create
 * @since 1.0, 2022-07-19 19:44:56
 */
public class PageTemplateParamInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5549169756967827741L;

	/**
	 * 是否允许用户输入
	 */
	@ApiField("allow_user_input")
	private Boolean allowUserInput;

	/**
	 * code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 额外信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 前端需要的渲染类型
	 */
	@ApiField("front_render_type")
	private String frontRenderType;

	/**
	 * 表单的标题
	 */
	@ApiField("label")
	private String label;

	/**
	 * 是否为必填
	 */
	@ApiField("required")
	private Boolean required;

	/**
	 * type
	 */
	@ApiField("type")
	private String type;

	/**
	 * 填入值
	 */
	@ApiField("value")
	private String value;

	public Boolean getAllowUserInput() {
		return this.allowUserInput;
	}
	public void setAllowUserInput(Boolean allowUserInput) {
		this.allowUserInput = allowUserInput;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFrontRenderType() {
		return this.frontRenderType;
	}
	public void setFrontRenderType(String frontRenderType) {
		this.frontRenderType = frontRenderType;
	}

	public String getLabel() {
		return this.label;
	}
	public void setLabel(String label) {
		this.label = label;
	}

	public Boolean getRequired() {
		return this.required;
	}
	public void setRequired(Boolean required) {
		this.required = required;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
