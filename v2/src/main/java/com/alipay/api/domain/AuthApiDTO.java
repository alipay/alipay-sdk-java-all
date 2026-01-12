package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 敏感信息可申请接口字段列表
 *
 * @author auto create
 * @since 1.0, 2020-10-27 11:09:49
 */
public class AuthApiDTO extends AlipayObject {

	private static final long serialVersionUID = 5645692882159967315L;

	/**
	 * 敏感信息可申请接口名
	 */
	@ApiField("api_name")
	private String apiName;

	/**
	 * 敏感信息申请字段
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 敏感信息申请能力code值
	 */
	@ApiField("package_code")
	private String packageCode;

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

	public String getPackageCode() {
		return this.packageCode;
	}
	public void setPackageCode(String packageCode) {
		this.packageCode = packageCode;
	}

}
