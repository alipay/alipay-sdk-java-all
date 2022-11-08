package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模版答题要素
 *
 * @author auto create
 * @since 1.0, 2022-05-24 14:27:49
 */
public class TemplateAnswerDTO extends AlipayObject {

	private static final long serialVersionUID = 5172829516475674371L;

	/**
	 * 路径
	 */
	@ApiListField("attr_path")
	@ApiField("attr_path_item_d_t_o")
	private List<AttrPathItemDTO> attrPath;

	/**
	 * 答题对应的表达式
	 */
	@ApiField("exp")
	private String exp;

	/**
	 * 初始值，可空
	 */
	@ApiField("initial_value")
	private String initialValue;

	/**
	 * 标签名称
	 */
	@ApiField("label_name")
	private String labelName;

	/**
	 * 父问卷表达式
	 */
	@ApiField("parent_exp")
	private String parentExp;

	/**
	 * 父问卷唯一标识
	 */
	@ApiField("parent_id")
	private String parentId;

	/**
	 * 父问卷结果
	 */
	@ApiField("parent_result")
	private String parentResult;

	/**
	 * 表单提示
	 */
	@ApiField("placeholder")
	private String placeholder;

	/**
	 * 答题元素列表
	 */
	@ApiListField("selects")
	@ApiField("answer_select_d_t_o")
	private List<AnswerSelectDTO> selects;

	/**
	 * 输入框类型
	 */
	@ApiField("type")
	private String type;

	/**
	 * 唯一标识
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public List<AttrPathItemDTO> getAttrPath() {
		return this.attrPath;
	}
	public void setAttrPath(List<AttrPathItemDTO> attrPath) {
		this.attrPath = attrPath;
	}

	public String getExp() {
		return this.exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getInitialValue() {
		return this.initialValue;
	}
	public void setInitialValue(String initialValue) {
		this.initialValue = initialValue;
	}

	public String getLabelName() {
		return this.labelName;
	}
	public void setLabelName(String labelName) {
		this.labelName = labelName;
	}

	public String getParentExp() {
		return this.parentExp;
	}
	public void setParentExp(String parentExp) {
		this.parentExp = parentExp;
	}

	public String getParentId() {
		return this.parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getParentResult() {
		return this.parentResult;
	}
	public void setParentResult(String parentResult) {
		this.parentResult = parentResult;
	}

	public String getPlaceholder() {
		return this.placeholder;
	}
	public void setPlaceholder(String placeholder) {
		this.placeholder = placeholder;
	}

	public List<AnswerSelectDTO> getSelects() {
		return this.selects;
	}
	public void setSelects(List<AnswerSelectDTO> selects) {
		this.selects = selects;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
