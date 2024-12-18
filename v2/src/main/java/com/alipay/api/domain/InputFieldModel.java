package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 输入域模型集合对象
 *
 * @author auto create
 * @since 1.0, 2022-11-09 17:57:45
 */
public class InputFieldModel extends AlipayObject {

	private static final long serialVersionUID = 2488546311484285796L;

	/**
	 * 默认提示值，例如歌华宽带的金额为100的倍数
	 */
	@ApiField("default_value")
	private String defaultValue;

	/**
	 * 域英文名称 例如：billkey
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 输入框下方文字提示，例如： 户号为10位数字
	 */
	@ApiField("field_tips")
	private String fieldTips;

	/**
	 * 页面显示提示 例如：手机号码
	 */
	@ApiField("field_title")
	private String fieldTitle;

	/**
	 * 控件类型 输入框类型 例如：inputText (文本输入框)
	 */
	@ApiField("field_type")
	private String fieldType;

	/**
	 * 控件展示顺序 例如：优选级 1
	 */
	@ApiField("priority")
	private String priority;

	/**
	 * 输入域的校验规则模型
	 */
	@ApiListField("regexp_rule_list")
	@ApiField("validation_rule")
	private List<ValidationRule> regexpRuleList;

	public String getDefaultValue() {
		return this.defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getFieldName() {
		return this.fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getFieldTips() {
		return this.fieldTips;
	}
	public void setFieldTips(String fieldTips) {
		this.fieldTips = fieldTips;
	}

	public String getFieldTitle() {
		return this.fieldTitle;
	}
	public void setFieldTitle(String fieldTitle) {
		this.fieldTitle = fieldTitle;
	}

	public String getFieldType() {
		return this.fieldType;
	}
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getPriority() {
		return this.priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}

	public List<ValidationRule> getRegexpRuleList() {
		return this.regexpRuleList;
	}
	public void setRegexpRuleList(List<ValidationRule> regexpRuleList) {
		this.regexpRuleList = regexpRuleList;
	}

}
