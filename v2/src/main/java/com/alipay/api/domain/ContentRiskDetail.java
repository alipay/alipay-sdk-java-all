package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险规则详情
 *
 * @author auto create
 * @since 1.0, 2022-03-14 16:07:53
 */
public class ContentRiskDetail extends AlipayObject {

	private static final long serialVersionUID = 7336579472812257225L;

	/**
	 * 规则编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 当前规则对应的扩展信息
	 */
	@ApiField("ext_properties")
	private String extProperties;

	/**
	 * 当前规则对应的转换后的原始审核素材
	 */
	@ApiField("generated_file")
	private String generatedFile;

	/**
	 * 规则名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 规则命中后，提示或者驳回的话术
	 */
	@ApiField("notice")
	private String notice;

	/**
	 * https://xx.xxx.com/g/hsxone.mms.materialscenter/v/provider/getMaterialsInfo?file_guid=a87b7dc1fbc04d2c97753612fdd4dd08
	 */
	@ApiField("origin_file")
	private String originFile;

	/**
	 * 当前规则命中的风险详情信息，譬如风险在图片的坐标、位置信息,坐标对应文字。
	 */
	@ApiField("risk_infos")
	private String riskInfos;

	/**
	 * 风险等级,枚举值。
高,中,低 三种
	 */
	@ApiField("risk_level")
	private String riskLevel;

	/**
	 * 本条规则的审核状态：枚举值，唯一 ROBOT_PASS：机审通过 ROBOT_REVIEW_REJECT：机审驳回 ROBOT_FAIL：机审失败
	 */
	@ApiField("type")
	private String type;

	/**
	 * 命中文字，如：命中"关键词"文字
	 */
	@ApiField("viola_words")
	private String violaWords;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getExtProperties() {
		return this.extProperties;
	}
	public void setExtProperties(String extProperties) {
		this.extProperties = extProperties;
	}

	public String getGeneratedFile() {
		return this.generatedFile;
	}
	public void setGeneratedFile(String generatedFile) {
		this.generatedFile = generatedFile;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNotice() {
		return this.notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

	public String getOriginFile() {
		return this.originFile;
	}
	public void setOriginFile(String originFile) {
		this.originFile = originFile;
	}

	public String getRiskInfos() {
		return this.riskInfos;
	}
	public void setRiskInfos(String riskInfos) {
		this.riskInfos = riskInfos;
	}

	public String getRiskLevel() {
		return this.riskLevel;
	}
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getViolaWords() {
		return this.violaWords;
	}
	public void setViolaWords(String violaWords) {
		this.violaWords = violaWords;
	}

}
