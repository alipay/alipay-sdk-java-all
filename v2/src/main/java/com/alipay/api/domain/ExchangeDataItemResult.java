package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-16 13:47:56
 */
public class ExchangeDataItemResult extends AlipayObject {

	private static final long serialVersionUID = 3385628772429924713L;

	/**
	 * 属性Key（如userBaseInfo、education） 
	 */
	@ApiField("attribute_key")
	private String attributeKey;

	/**
	 * 属性名称（如"个人信息"、"学历学籍"） 
	 */
	@ApiField("attribute_name")
	private String attributeName;

	/**
	 * 认证来源（数据提供方appId）
	 */
	@ApiField("cert_source")
	private String certSource;

	/**
	 * 记录级认证状态（0-未认证，1-已认证）
	 */
	@ApiField("cert_status")
	private Long certStatus;

	/**
	 * null
	 */
	@ApiListField("fields")
	@ApiField("field_info_result")
	private List<FieldInfoResult> fields;

	/**
	 * null
	 */
	@ApiListField("records")
	@ApiField("exchange_record_result")
	private List<ExchangeRecordResult> records;

	/**
	 * 属性在办事保险箱中的表单类型
	 */
	@ApiField("schema_type")
	private String schemaType;

	public String getAttributeKey() {
		return this.attributeKey;
	}
	public void setAttributeKey(String attributeKey) {
		this.attributeKey = attributeKey;
	}

	public String getAttributeName() {
		return this.attributeName;
	}
	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getCertSource() {
		return this.certSource;
	}
	public void setCertSource(String certSource) {
		this.certSource = certSource;
	}

	public Long getCertStatus() {
		return this.certStatus;
	}
	public void setCertStatus(Long certStatus) {
		this.certStatus = certStatus;
	}

	public List<FieldInfoResult> getFields() {
		return this.fields;
	}
	public void setFields(List<FieldInfoResult> fields) {
		this.fields = fields;
	}

	public List<ExchangeRecordResult> getRecords() {
		return this.records;
	}
	public void setRecords(List<ExchangeRecordResult> records) {
		this.records = records;
	}

	public String getSchemaType() {
		return this.schemaType;
	}
	public void setSchemaType(String schemaType) {
		this.schemaType = schemaType;
	}

}
