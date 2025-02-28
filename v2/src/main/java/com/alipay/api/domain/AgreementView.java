package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 接口协议信息字段类型定义
 *
 * @author auto create
 * @since 1.0, 2024-12-02 17:42:39
 */
public class AgreementView extends AlipayObject {

	private static final long serialVersionUID = 2417487827486295612L;

	/**
	 * 合同模板code带版本号
	 */
	@ApiField("agreement_version")
	private String agreementVersion;

	/**
	 * 协议类型Code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 隐私信息脱敏
	 */
	@ApiField("content")
	private String content;

	/**
	 * 内容格式
	 */
	@ApiField("content_type")
	private String contentType;

	/**
	 * 当前协议是否强制阅读
	 */
	@ApiField("force_read")
	private Boolean forceRead;

	/**
	 * 机构信息:机构Id和机构名称
	 */
	@ApiField("fund_supplier")
	private InstitutionVO fundSupplier;

	/**
	 * 强读时间,单位秒, forceRead=true, 时默认5秒
	 */
	@ApiField("mandatory_reading_time")
	private Long mandatoryReadingTime;

	/**
	 * 协议类型名称
	 */
	@ApiField("name")
	private String name;

	public String getAgreementVersion() {
		return this.agreementVersion;
	}
	public void setAgreementVersion(String agreementVersion) {
		this.agreementVersion = agreementVersion;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getContentType() {
		return this.contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Boolean getForceRead() {
		return this.forceRead;
	}
	public void setForceRead(Boolean forceRead) {
		this.forceRead = forceRead;
	}

	public InstitutionVO getFundSupplier() {
		return this.fundSupplier;
	}
	public void setFundSupplier(InstitutionVO fundSupplier) {
		this.fundSupplier = fundSupplier;
	}

	public Long getMandatoryReadingTime() {
		return this.mandatoryReadingTime;
	}
	public void setMandatoryReadingTime(Long mandatoryReadingTime) {
		this.mandatoryReadingTime = mandatoryReadingTime;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
