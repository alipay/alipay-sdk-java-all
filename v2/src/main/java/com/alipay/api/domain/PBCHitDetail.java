package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人行调用支付宝制裁扫描接口返回名单信息
 *
 * @author auto create
 * @since 1.0, 2025-12-15 15:11:26
 */
public class PBCHitDetail extends AlipayObject {

	private static final long serialVersionUID = 2479164236563548189L;

	/**
	 * 名单匹配属性
	 */
	@ApiField("match_param")
	private String matchParam;

	/**
	 * 制裁扫描匹配参数
	 */
	@ApiField("query_param")
	private String queryParam;

	/**
	 * 名单中别名
	 */
	@ApiField("record_aka")
	private String recordAka;

	/**
	 * 生日
	 */
	@ApiField("record_birth")
	private String recordBirth;

	/**
	 * 名单中性别
	 */
	@ApiField("record_gender")
	private String recordGender;

	/**
	 * 名单中证件
	 */
	@ApiField("record_id")
	private String recordId;

	/**
	 * 名单中名称
	 */
	@ApiField("record_name")
	private String recordName;

	/**
	 * 名单中国籍
	 */
	@ApiField("record_nation")
	private String recordNation;

	/**
	 * 命中名单类型
	 */
	@ApiField("record_type")
	private String recordType;

	/**
	 * 名单原始id
	 */
	@ApiField("reference_id")
	private String referenceId;

	public String getMatchParam() {
		return this.matchParam;
	}
	public void setMatchParam(String matchParam) {
		this.matchParam = matchParam;
	}

	public String getQueryParam() {
		return this.queryParam;
	}
	public void setQueryParam(String queryParam) {
		this.queryParam = queryParam;
	}

	public String getRecordAka() {
		return this.recordAka;
	}
	public void setRecordAka(String recordAka) {
		this.recordAka = recordAka;
	}

	public String getRecordBirth() {
		return this.recordBirth;
	}
	public void setRecordBirth(String recordBirth) {
		this.recordBirth = recordBirth;
	}

	public String getRecordGender() {
		return this.recordGender;
	}
	public void setRecordGender(String recordGender) {
		this.recordGender = recordGender;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

	public String getRecordName() {
		return this.recordName;
	}
	public void setRecordName(String recordName) {
		this.recordName = recordName;
	}

	public String getRecordNation() {
		return this.recordNation;
	}
	public void setRecordNation(String recordNation) {
		this.recordNation = recordNation;
	}

	public String getRecordType() {
		return this.recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}

	public String getReferenceId() {
		return this.referenceId;
	}
	public void setReferenceId(String referenceId) {
		this.referenceId = referenceId;
	}

}
