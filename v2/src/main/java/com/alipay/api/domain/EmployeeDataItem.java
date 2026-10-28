package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-10-27 10:57:57
 */
public class EmployeeDataItem extends AlipayObject {

	private static final long serialVersionUID = 3112167662962988632L;

	/**
	 * null
	 */
	@ApiListField("fields")
	@ApiField("field_list")
	private List<FieldList> fields;

	public List<FieldList> getFields() {
		return this.fields;
	}
	public void setFields(List<FieldList> fields) {
		this.fields = fields;
	}

}
