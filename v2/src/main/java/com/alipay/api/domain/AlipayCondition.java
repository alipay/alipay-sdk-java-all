package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 智能拓客系统查询条件的实体
 *
 * @author auto create
 * @since 1.0, 2025-01-08 15:01:51
 */
public class AlipayCondition extends AlipayObject {

	private static final long serialVersionUID = 1823895476666566641L;

	/**
	 * 字段编码,查询条件的目标字段名
	 */
	@ApiField("field_code")
	private String fieldCode;

	/**
	 * field_operator_type可选类型：
 LARGE("large", "大于" , "rangeQuery"),
 LESS("less", "小于" , "rangeQuery"),
 BETWEEN("between", "在范围内，前包含后包含" , "rangeQuery"),
 IN("in", "在离散列表中" , "matchPhraseQuery"),
 EQUAL("equal", "等于" , "termQuery"),
 LIKE("like", "类似" , "matchPhraseQuery"),
 PREFIX_LIKE("prefix_like", "前缀匹配" , "prefixLike"),
 WORD_LIKE("word_like", "分词相似" , "matchQuery")
	 */
	@ApiField("field_operator_type")
	private String fieldOperatorType;

	/**
	 * 目标字段的值
	 */
	@ApiField("value")
	private String value;

	public String getFieldCode() {
		return this.fieldCode;
	}
	public void setFieldCode(String fieldCode) {
		this.fieldCode = fieldCode;
	}

	public String getFieldOperatorType() {
		return this.fieldOperatorType;
	}
	public void setFieldOperatorType(String fieldOperatorType) {
		this.fieldOperatorType = fieldOperatorType;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
