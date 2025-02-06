package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 地区类型
 *
 * @author auto create
 * @since 1.0, 2024-06-20 15:15:30
 */
public class LmDivisionVO extends AlipayObject {

	private static final long serialVersionUID = 2419749152477127116L;

	/**
	 * 地区码
	 */
	@ApiField("division_code")
	private Long divisionCode;

	/**
	 * 地区层级
	 */
	@ApiField("division_level")
	private Long divisionLevel;

	/**
	 * 地区名
	 */
	@ApiField("division_name")
	private String divisionName;

	/**
	 * 父地区码
	 */
	@ApiField("parent_id")
	private Long parentId;

	/**
	 * 地区拼音
	 */
	@ApiField("pinyin")
	private String pinyin;

	public Long getDivisionCode() {
		return this.divisionCode;
	}
	public void setDivisionCode(Long divisionCode) {
		this.divisionCode = divisionCode;
	}

	public Long getDivisionLevel() {
		return this.divisionLevel;
	}
	public void setDivisionLevel(Long divisionLevel) {
		this.divisionLevel = divisionLevel;
	}

	public String getDivisionName() {
		return this.divisionName;
	}
	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public Long getParentId() {
		return this.parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getPinyin() {
		return this.pinyin;
	}
	public void setPinyin(String pinyin) {
		this.pinyin = pinyin;
	}

}
