package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 蚂蚁风险运营平台业务域、风险域信息
 *
 * @author auto create
 * @since 1.0, 2022-03-25 17:43:26
 */
public class RiskBizDomain extends AlipayObject {

	private static final long serialVersionUID = 8845571343598625484L;

	/**
	 * 编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 描述信息
	 */
	@ApiField("description")
	private String description;

	/**
	 * 英文名称
	 */
	@ApiField("english_name")
	private String englishName;

	/**
	 * 全称
	 */
	@ApiField("full_name")
	private String fullName;

	/**
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 名称的拼音，可用于模糊查询
	 */
	@ApiField("name_pinyin")
	private String namePinyin;

	/**
	 * 租户id
	 */
	@ApiField("tnt_inst_id")
	private String tntInstId;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public String getEnglishName() {
		return this.englishName;
	}
	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}

	public String getFullName() {
		return this.fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNamePinyin() {
		return this.namePinyin;
	}
	public void setNamePinyin(String namePinyin) {
		this.namePinyin = namePinyin;
	}

	public String getTntInstId() {
		return this.tntInstId;
	}
	public void setTntInstId(String tntInstId) {
		this.tntInstId = tntInstId;
	}

}
