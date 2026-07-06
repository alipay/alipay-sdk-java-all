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
public class ExchangeRecordResult extends AlipayObject {

	private static final long serialVersionUID = 1462457711932597491L;

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

}
