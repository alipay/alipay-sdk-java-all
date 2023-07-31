package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询敏感信息字段应用场景
 *
 * @author auto create
 * @since 1.0, 2020-10-28 16:03:14
 */
public class AlipayOpenAppApiSceneQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2617794137658232839L;

	/**
	 * 接口英文名。
	 */
	@ApiField("api_name")
	private String apiName;

	/**
	 * 接口出参字段英文名。
	 */
	@ApiField("field_name")
	private String fieldName;

	public String getApiName() {
		return this.apiName;
	}
	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

}
