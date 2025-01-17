package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地址信息
 *
 * @author auto create
 * @since 1.0, 2024-06-07 15:31:11
 */
public class AreaInfoVO extends AlipayObject {

	private static final long serialVersionUID = 3222438852574425545L;

	/**
	 * 代码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 英文名称
	 */
	@ApiField("en_name")
	private String enName;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 父级代码
	 */
	@ApiField("parent_code")
	private String parentCode;

	/**
	 * 拼写
	 */
	@ApiField("spell")
	private String spell;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getEnName() {
		return this.enName;
	}
	public void setEnName(String enName) {
		this.enName = enName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getParentCode() {
		return this.parentCode;
	}
	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getSpell() {
		return this.spell;
	}
	public void setSpell(String spell) {
		this.spell = spell;
	}

}
