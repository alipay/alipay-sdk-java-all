package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 异常线圈对应的处理方案

 *
 * @author auto create
 * @since 1.0, 2025-08-15 15:24:30
 */
public class TagSolution extends AlipayObject {

	private static final long serialVersionUID = 4442317522429441897L;

	/**
	 * 处理方案CODE
	 */
	@ApiField("code")
	private String code;

	/**
	 * 方案描叙
	 */
	@ApiField("name")
	private String name;

	/**
	 * 是否需要备注
	 */
	@ApiField("need_notes")
	private Boolean needNotes;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Boolean getNeedNotes() {
		return this.needNotes;
	}
	public void setNeedNotes(Boolean needNotes) {
		this.needNotes = needNotes;
	}

}
