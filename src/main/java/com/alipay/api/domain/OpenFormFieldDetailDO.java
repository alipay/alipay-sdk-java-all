package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 开放表单字段配置详情
 *
 * @author auto create
 * @since 1.0, 2017-10-16 13:49:19
 */
public class OpenFormFieldDetailDO extends AlipayObject {

	private static final long serialVersionUID = 4756322973292989355L;

	/**
	 * 表单必填字段配置，common_fields属性定义一个表单字段数组，字段有效值如下列表所示：
OPEN_FORM_FIELD_MOBILE -- 手机号
OPEN_FORM_FIELD_GENDER -- 性别
OPEN_FORM_FIELD_NAME -- 姓名
OPEN_FORM_FIELD_BIRTHDAY -- 生日（不含年份，如：01-01）
OPEN_FORM_FIELD_BIRTHDAY_WITH_YEAR -- 生日（含年份，如：1988-01-01）
OPEN_FORM_FIELD_IDCARD -- 身份证
OPEN_FORM_FIELD_CERT_TYPE -- 证件类型
OPEN_FORM_FIELD_CERT_NO -- 证件号
OPEN_FORM_FIELD_EMAIL -- 邮箱
OPEN_FORM_FIELD_ADDRESS -- 地址
OPEN_FORM_FIELD_CITY -- 城市
OPEN_FORM_FIELD_IS_STUDENT -- 是否学生认证
OPEN_FORM_FIELD_MEMBER_GRADE -- 会员等级

注：
1. 会员等级、是否学生认证字段，如果获取不到该项数据时，表单页面不做展示。
2. 身份证字段和证件号、证件类型字段不可同时配置。
3. 如果身份证字段不能满足业务需求，可通过配置证件类型+证件号字段来获取其他证件类型的支持，目前支持的证件类型有：身份证、护照、港澳居民通行证、台湾居民通行证
	 */
	@ApiListField("common_fields")
	@ApiField("string")
	private List<String> commonFields;

	public List<String> getCommonFields() {
		return this.commonFields;
	}
	public void setCommonFields(List<String> commonFields) {
		this.commonFields = commonFields;
	}

}
