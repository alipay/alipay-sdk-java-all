package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 回答内容详细模型
 *
 * @author auto create
 * @since 1.0, 2026-05-22 14:12:15
 */
public class AnswerContent extends AlipayObject {

	private static final long serialVersionUID = 3899795568452199167L;

	/**
	 * 数据内容
	 */
	@ApiField("data_content")
	private String dataContent;

	/**
	 * 子agent能力
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * JSON,TEXT
	 */
	@ApiField("meta_type")
	private String metaType;

	public String getDataContent() {
		return this.dataContent;
	}
	public void setDataContent(String dataContent) {
		this.dataContent = dataContent;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getMetaType() {
		return this.metaType;
	}
	public void setMetaType(String metaType) {
		this.metaType = metaType;
	}

}
