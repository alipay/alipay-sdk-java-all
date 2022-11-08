package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 属性路径
 *
 * @author auto create
 * @since 1.0, 2022-05-24 14:20:23
 */
public class AttrPathItemDTO extends AlipayObject {

	private static final long serialVersionUID = 3448922343947398836L;

	/**
	 * 编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 真实名称
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 展示名称
	 */
	@ApiField("view_name")
	private String viewName;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getViewName() {
		return this.viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}

}
