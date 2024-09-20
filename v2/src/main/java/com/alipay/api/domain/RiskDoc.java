package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 风险doc
 *
 * @author auto create
 * @since 1.0, 2022-11-22 09:56:30
 */
public class RiskDoc extends AlipayObject {

	private static final long serialVersionUID = 2582441197967354676L;

	/**
	 * 事件时间
	 */
	@ApiField("event_time")
	private Date eventTime;

	/**
	 * 风险docId
	 */
	@ApiField("source_doc_id")
	private String sourceDocId;

	/**
	 * 风险docType
	 */
	@ApiField("source_doc_type")
	private String sourceDocType;

	/**
	 * 风险摘要
	 */
	@ApiField("summary")
	private String summary;

	/**
	 * 风险标题
	 */
	@ApiField("title")
	private String title;

	public Date getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getSourceDocId() {
		return this.sourceDocId;
	}
	public void setSourceDocId(String sourceDocId) {
		this.sourceDocId = sourceDocId;
	}

	public String getSourceDocType() {
		return this.sourceDocType;
	}
	public void setSourceDocType(String sourceDocType) {
		this.sourceDocType = sourceDocType;
	}

	public String getSummary() {
		return this.summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
