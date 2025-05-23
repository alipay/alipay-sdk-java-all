package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 输出的输入域模型
 *
 * @author auto create
 * @since 1.0, 2017-09-19 12:38:10
 */
public class JFExportInputFieldModel extends AlipayObject {

	private static final long serialVersionUID = 1839862481654321716L;

	/**
	 * STANDARD_DATA(标准数据)，对应的是查询机构账单请求中的参数，目前机构账单查询请求中包含billkey、ownerName和billDate这三个参数；EXTEND_DATA(拓展数据)，则以field_name为key，把用户输入的值放到拓展字段中
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 输入框的默认值，可以删除后重新输入
	 */
	@ApiField("default_value")
	private String defaultValue;

	/**
	 * 域英文名称 例如：billkey、ownerName和billDate，需要结合data_type字段来使用。
	 */
	@ApiField("field_name")
	private String fieldName;

	/**
	 * 输入框下方文字提示，例如： 户号为10位数字
	 */
	@ApiField("field_tips")
	private String fieldTips;

	/**
	 * 页面显示提示 例如：户号
	 */
	@ApiField("field_title")
	private String fieldTitle;

	/**
	 * 控件类型 输入框类型 例如：inputText (文本输入框)
	 */
	@ApiField("field_type")
	private String fieldType;

	/**
	 * 输入域的最近修改时间，可以用于判断输入域数据最近是否有更新。
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 获取场景:load，加载展示，渲染初始页面时的场景；query，查询展示, 查询成功后确认页面的场景。
	 */
	@ApiField("mode_type")
	private String modeType;

	/**
	 * 控件展示顺序 例如：1，展示到最前面
	 */
	@ApiField("priority")
	private Long priority;

	/**
	 * 输入域的正则校验规则列表
	 */
	@ApiListField("regexp_rules")
	@ApiField("validation_rule")
	private List<ValidationRule> regexpRules;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

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

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getModeType() {
		return this.modeType;
	}
	public void setModeType(String modeType) {
		this.modeType = modeType;
	}

	public Long getPriority() {
		return this.priority;
	}
	public void setPriority(Long priority) {
		this.priority = priority;
	}

	public List<ValidationRule> getRegexpRules() {
		return this.regexpRules;
	}
	public void setRegexpRules(List<ValidationRule> regexpRules) {
		this.regexpRules = regexpRules;
	}

}
