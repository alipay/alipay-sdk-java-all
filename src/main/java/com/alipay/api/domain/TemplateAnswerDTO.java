package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 模版答题要素
 *
 * @author auto create
 * @since 1.0, 2022-04-06 16:05:38
 */
public class TemplateAnswerDTO extends AlipayObject {

	private static final long serialVersionUID = 2269856679557261976L;

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
