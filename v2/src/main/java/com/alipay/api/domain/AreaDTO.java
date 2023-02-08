package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 区域信息
 *
 * @author auto create
 * @since 1.0, 2022-11-14 15:40:15
 */
public class AreaDTO extends AlipayObject {

	private static final long serialVersionUID = 3353873967164322239L;

	/**
	 * 区域code
	 */
	@ApiField("area_code")
	private String areaCode;

	/**
	 * 区域英文名称
	 */
	@ApiField("area_english_name")
	private String areaEnglishName;

	/**
	 * 区域中文名称
	 */
	@ApiField("area_name")
	private String areaName;

	/**
	 * 区域拼音名称
	 */
	@ApiField("area_pinyin_name")
	private String areaPinyinName;

	/**
	 * 区域类型
	 */
	@ApiField("area_type")
	private String areaType;

	/**
	 * 区域版本信息
	 */
	@ApiField("area_version")
	private Long areaVersion;

	/**
	 * 扩展信息map的格式
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 区域的父code，若为国家则没有相关信息
	 */
	@ApiField("parent_area_code")
	private String parentAreaCode;

	public String getAreaCode() {
		return this.areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaEnglishName() {
		return this.areaEnglishName;
	}
	public void setAreaEnglishName(String areaEnglishName) {
		this.areaEnglishName = areaEnglishName;
	}

	public String getAreaName() {
		return this.areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getAreaPinyinName() {
		return this.areaPinyinName;
	}
	public void setAreaPinyinName(String areaPinyinName) {
		this.areaPinyinName = areaPinyinName;
	}

	public String getAreaType() {
		return this.areaType;
	}
	public void setAreaType(String areaType) {
		this.areaType = areaType;
	}

	public Long getAreaVersion() {
		return this.areaVersion;
	}
	public void setAreaVersion(Long areaVersion) {
		this.areaVersion = areaVersion;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getParentAreaCode() {
		return this.parentAreaCode;
	}
	public void setParentAreaCode(String parentAreaCode) {
		this.parentAreaCode = parentAreaCode;
	}

}
