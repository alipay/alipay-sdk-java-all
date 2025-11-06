package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * FAQ问答
 *
 * @author auto create
 * @since 1.0, 2025-05-29 10:37:14
 */
public class CommonQaDTO extends AlipayObject {

	private static final long serialVersionUID = 7652937225565399976L;

	/**
	 * 城市code
	 */
	@ApiField("city_code")
	private String cityCode;

	/**
	 * faq的回答内容
	 */
	@ApiField("content")
	private String content;

	/**
	 * 机构统一定义的faq问答对的统一id，要求唯一性
	 */
	@ApiField("out_faq_id")
	private String outFaqId;

	/**
	 * 用于描述该faq问答对的发布单位
	 */
	@ApiField("report_department")
	private String reportDepartment;

	/**
	 * 语料状态
	 */
	@ApiField("run_status")
	private String runStatus;

	/**
	 * FAQ问答的问题
	 */
	@ApiField("title")
	private String title;

	public String getCityCode() {
		return this.cityCode;
	}
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public String getContent() {
		return this.content;
	}
	public void setContent(String content) {
		this.content = content;
	}

	public String getOutFaqId() {
		return this.outFaqId;
	}
	public void setOutFaqId(String outFaqId) {
		this.outFaqId = outFaqId;
	}

	public String getReportDepartment() {
		return this.reportDepartment;
	}
	public void setReportDepartment(String reportDepartment) {
		this.reportDepartment = reportDepartment;
	}

	public String getRunStatus() {
		return this.runStatus;
	}
	public void setRunStatus(String runStatus) {
		this.runStatus = runStatus;
	}

	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
