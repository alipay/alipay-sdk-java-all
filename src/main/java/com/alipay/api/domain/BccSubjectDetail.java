package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻约定事项下标的信息
 *
 * @author auto create
 * @since 1.0, 2020-03-05 19:31:35
 */
public class BccSubjectDetail extends AlipayObject {

	private static final long serialVersionUID = 5147644391122169231L;

	/**
	 * 标的完成值
	 */
	@ApiField("completions")
	private String completions;

	/**
	 * 当前值
	 */
	@ApiField("current_value")
	private String currentValue;

	/**
	 * 该标的对应的事项
	 */
	@ApiField("item_no")
	private String itemNo;

	/**
	 * 标的id
	 */
	@ApiField("subject_id")
	private String subjectId;

	/**
	 * 标的类型
	 */
	@ApiField("subject_type")
	private String subjectType;

	public String getCompletions() {
		return this.completions;
	}
	public void setCompletions(String completions) {
		this.completions = completions;
	}

	public String getCurrentValue() {
		return this.currentValue;
	}
	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}

	public String getItemNo() {
		return this.itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}

	public String getSubjectId() {
		return this.subjectId;
	}
	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return this.subjectType;
	}
	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

}
