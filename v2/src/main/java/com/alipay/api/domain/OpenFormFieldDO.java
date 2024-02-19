package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开放表单字段定义数据模型
 *
 * @author auto create
 * @since 1.0, 2017-04-18 12:09:49
 */
public class OpenFormFieldDO extends AlipayObject {

	private static final long serialVersionUID = 1194782551618384316L;

	/**
	 * 表单可选字段配置，common_fields属性定义一个表单字段数组，表单字段有效值列表与required字段有效值列表相同。

可选字段配置中不能含有必须字段配置的有效值。
	 */
	@ApiField("optional")
	private String optional;

	/**
	 * 表单必填字段配置，common_fields属性定义一个表单字段数组，字段有效值如下列表所示：

OPEN_FORM_FIELD_MOBILE -- 手机号

OPEN_FORM_FIELD_GENDER -- 性别

OPEN_FORM_FIELD_NAME -- 姓名

OPEN_FORM_FIELD_BIRTHDAY -- 生日

OPEN_FORM_FIELD_IDCARD -- 身份证

OPEN_FORM_FIELD_EMAIL -- 邮箱

OPEN_FORM_FIELD_ADDRESS -- 地址

OPEN_FORM_FIELD_CITY -- 城市

OPEN_FORM_FIELD_IS_STUDENT -- 是否学生认证

OPEN_FORM_FIELD_MEMBER_GRADE -- 会员等级
	 */
	@ApiField("required")
	private String required;

	public String getOptional() {
		return this.optional;
	}
	public void setOptional(String optional) {
		this.optional = optional;
	}

	public String getRequired() {
		return this.required;
	}
	public void setRequired(String required) {
		this.required = required;
	}

}
