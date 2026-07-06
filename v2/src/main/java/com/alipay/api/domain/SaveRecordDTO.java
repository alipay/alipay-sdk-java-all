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
public class SaveRecordDTO extends AlipayObject {

	private static final long serialVersionUID = 4129968541453629744L;

	/**
	 * null
	 */
	@ApiListField("fields")
	@ApiField("field_info_d_t_o")
	private List<FieldInfoDTO> fields;

	public List<FieldInfoDTO> getFields() {
		return this.fields;
	}
	public void setFields(List<FieldInfoDTO> fields) {
		this.fields = fields;
	}

}
