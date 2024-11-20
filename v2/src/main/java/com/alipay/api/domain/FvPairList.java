package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用于主数据项过滤指定信息的参数列表
[ {     "field_code": "biz_code",     "field_value": "BZF0013"   }
, {     "field_code": "sale_code",     "field_value": "I1110800001000001000" }]

 *
 * @author auto create
 * @since 1.0, 2021-09-22 13:59:59
 */
public class FvPairList extends AlipayObject {

	private static final long serialVersionUID = 1188464792829454995L;

	/**
	 * 具体的字段代号
	 */
	@ApiField("field_code")
	private String fieldCode;

	/**
	 * 具体的字段值
	 */
	@ApiField("field_value")
	private String fieldValue;

	public String getFieldCode() {
		return this.fieldCode;
	}
	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public String getFieldValue() {
		return this.fieldValue;
	}
	public void setFieldValue(String fieldValue) {
		this.fieldValue = fieldValue;
	}

}
