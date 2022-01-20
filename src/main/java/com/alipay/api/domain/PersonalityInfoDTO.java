package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 标签个性化信息对外模型类
 *
 * @author auto create
 * @since 1.0, 2019-09-17 16:18:34
 */
public class PersonalityInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 4426469286593779519L;

	/**
	 * 枚举名code
	 */
	@ApiField("enum_code")
	private String enumCode;

	/**
	 * 枚举ID
	 */
	@ApiField("enum_id")
	private String enumId;

	/**
	 * 枚举名称
	 */
	@ApiField("enum_name")
	private String enumName;

	/**
	 * 枚举值code
	 */
	@ApiField("enum_value_code")
	private String enumValueCode;

	/**
	 * 枚举值名称
	 */
	@ApiField("enum_value_name")
	private String enumValueName;

	public String getEnumCode() {
		return this.enumCode;
	}
	public void setEnumCode(String enumCode) {
		this.enumCode = enumCode;
	}

	public String getEnumId() {
		return this.enumId;
	}
	public void setEnumId(String enumId) {
		this.enumId = enumId;
	}

	public String getEnumName() {
		return this.enumName;
	}
	public void setEnumName(String enumName) {
		this.enumName = enumName;
	}

	public String getEnumValueCode() {
		return this.enumValueCode;
	}
	public void setEnumValueCode(String enumValueCode) {
		this.enumValueCode = enumValueCode;
	}

	public String getEnumValueName() {
		return this.enumValueName;
	}
	public void setEnumValueName(String enumValueName) {
		this.enumValueName = enumValueName;
	}

}
