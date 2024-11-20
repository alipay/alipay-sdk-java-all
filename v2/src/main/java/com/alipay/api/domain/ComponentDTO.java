package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 模板组件对象
 *
 * @author auto create
 * @since 1.0, 2024-06-12 11:03:18
 */
public class ComponentDTO extends AlipayObject {

	private static final long serialVersionUID = 7582443389282177745L;

	/**
	 * 可修改
	 */
	@ApiField("enable_edit")
	private String enableEdit;

	/**
	 * 表达式
	 */
	@ApiField("exp")
	private String exp;

	/**
	 * 返回类型
	 */
	@ApiField("exp_return_type")
	private String expReturnType;

	/**
	 * 组件id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 【甲方姓名】
	 */
	@ApiField("name")
	private String name;

	/**
	 * placeholder
	 */
	@ApiField("placeholder")
	private String placeholder;

	/**
	 * 是否只读
	 */
	@ApiField("readonly")
	private String readonly;

	/**
	 * 关联的属性
	 */
	@ApiField("ref")
	private String ref;

	/**
	 * 组件是否必填
	 */
	@ApiField("required")
	private String required;

	/**
	 * 组件值最大长度
	 */
	@ApiField("size")
	private String size;

	/**
	 * 文本内容
	 */
	@ApiField("src_content")
	private String srcContent;

	/**
	 * 结构化要素渲染的类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 唯一key
	 */
	@ApiField("uk")
	private String uk;

	/**
	 * 组件值
	 */
	@ApiField("value")
	private String value;

	/**
	 * 版本
	 */
	@ApiField("version_no")
	private String versionNo;

	public String getEnableEdit() {
		return this.enableEdit;
	}
	public void setEnableEdit(String enableEdit) {
		this.enableEdit = enableEdit;
	}

	public String getExp() {
		return this.exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getExpReturnType() {
		return this.expReturnType;
	}
	public void setExpReturnType(String expReturnType) {
		this.expReturnType = expReturnType;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getPlaceholder() {
		return this.placeholder;
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public String getReadonly() {
		return this.readonly;
	}
	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}

	public String getRef() {
		return this.ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}

	public String getRequired() {
		return this.required;
	}
	public void setRequired(String required) {
		this.required = required;
	}

	public String getSize() {
		return this.size;
	}
	public void setSize(String size) {
		this.size = size;
	}

	public String getSrcContent() {
		return this.srcContent;
	}
	public void setSrcContent(String srcContent) {
		this.srcContent = srcContent;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getUk() {
		return this.uk;
	}
	public void setUk(String uk) {
		this.uk = uk;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	public String getVersionNo() {
		return this.versionNo;
	}
	public void setVersionNo(String versionNo) {
		this.versionNo = versionNo;
	}

}
