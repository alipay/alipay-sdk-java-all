package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-06-16 13:43:41
 */
public class SaveDataItemDTO extends AlipayObject {

	private static final long serialVersionUID = 3561194212497123144L;

	/**
	 * 注册授权配置时分配的办事保险箱数据属性key
	 */
	@ApiField("attribute_key")
	private String attributeKey;

	/**
	 * 认证来源，仅数据认证场景下需要填写（数据提供方appId）
	 */
	@ApiField("cert_source")
	private String certSource;

	/**
	 * null
	 */
	@ApiListField("fields")
	@ApiField("field_info_d_t_o")
	private List<FieldInfoDTO> fields;

	/**
	 * null
	 */
	@ApiListField("records")
	@ApiField("save_record_d_t_o")
	private List<SaveRecordDTO> records;

	public String getAttributeKey() {
		return this.attributeKey;
	}
	public void setAttributeKey(String attributeKey) {
		this.attributeKey = attributeKey;
	}

	public String getCertSource() {
		return this.certSource;
	}
	public void setCertSource(String certSource) {
		this.certSource = certSource;
	}

	public List<FieldInfoDTO> getFields() {
		return this.fields;
	}
	public void setFields(List<FieldInfoDTO> fields) {
		this.fields = fields;
	}

	public List<SaveRecordDTO> getRecords() {
		return this.records;
	}
	public void setRecords(List<SaveRecordDTO> records) {
		this.records = records;
	}

}
