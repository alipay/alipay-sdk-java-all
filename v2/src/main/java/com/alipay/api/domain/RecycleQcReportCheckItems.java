package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2025-11-17 15:02:41
 */
public class RecycleQcReportCheckItems extends AlipayObject {

	private static final long serialVersionUID = 3189641921117346646L;

	/**
	 * 质检项目名
	 */
	@ApiField("attr_name")
	private String attrName;

	/**
	 * null
	 */
	@ApiListField("items")
	@ApiField("recycle_qc_report_check_item")
	private List<RecycleQcReportCheckItem> items;

	/**
	 * question_code是问卷中的问题code，attr_name是问题文本描述，两个二选一传入。
	 */
	@ApiField("question_code")
	private String questionCode;

	public String getAttrName() {
		return this.attrName;
	}
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}

	public List<RecycleQcReportCheckItem> getItems() {
		return this.items;
	}
	public void setItems(List<RecycleQcReportCheckItem> items) {
		this.items = items;
	}

	public String getQuestionCode() {
		return this.questionCode;
	}
	public void setQuestionCode(String questionCode) {
		this.questionCode = questionCode;
	}

}
