package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 排序字段列表，可选。平台可映射为服务端驼峰字段
 *
 * @author auto create
 * @since 1.0, 2026-08-13 19:22:54
 */
public class SortField extends AlipayObject {

	private static final long serialVersionUID = 1299752518849961692L;

	/**
	 * 排序字段编码
	 */
	@ApiField("field_code")
	private String fieldCode;

	/**
	 * 排序方向：asc-升序，desc-降序
	 */
	@ApiField("ort_by")
	private String ortBy;

	public String getFieldCode() {
		return this.fieldCode;
	}
	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public String getOrtBy() {
		return this.ortBy;
	}
	public void setOrtBy(String ortBy) {
		this.ortBy = ortBy;
	}

}
