package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 反馈选项类
 *
 * @author auto create
 * @since 1.0, 2025-03-31 14:08:34
 */
public class FeedbackOptionsVO extends AlipayObject {

	private static final long serialVersionUID = 2333997972832743133L;

	/**
	 * 一级选项名称
	 */
	@ApiField("primary_class")
	private String primaryClass;

	/**
	 * 一级分类名称code
	 */
	@ApiField("primary_class_code")
	private String primaryClassCode;

	/**
	 * 子选择
	 */
	@ApiListField("suboption")
	@ApiField("feedback_suboption")
	private List<FeedbackSuboption> suboption;

	public String getPrimaryClass() {
		return this.primaryClass;
	}
	public void setPrimaryClass(String primaryClass) {
		this.primaryClass = primaryClass;
	}

	public String getPrimaryClassCode() {
		return this.primaryClassCode;
	}
	public void setPrimaryClassCode(String primaryClassCode) {
		this.primaryClassCode = primaryClassCode;
	}

	public List<FeedbackSuboption> getSuboption() {
		return this.suboption;
	}
	public void setSuboption(List<FeedbackSuboption> suboption) {
		this.suboption = suboption;
	}

}
