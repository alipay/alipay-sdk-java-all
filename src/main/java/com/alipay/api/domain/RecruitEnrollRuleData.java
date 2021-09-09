package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 报名规则数据
 *
 * @author auto create
 * @since 1.0, 2021-06-30 23:43:57
 */
public class RecruitEnrollRuleData extends AlipayObject {

	private static final long serialVersionUID = 5317434975669267382L;

	/**
	 * 素材的要求，json字符串，使用时需要把此字符串解析成json对象
	 */
	@ApiField("schema")
	private String schema;

	public String getSchema() {
		return this.schema;
	}
	public void setSchema(String schema) {
		this.schema = schema;
	}

}
