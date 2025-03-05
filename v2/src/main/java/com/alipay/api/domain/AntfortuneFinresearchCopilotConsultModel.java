package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投研金融知识问答
 *
 * @author auto create
 * @since 1.0, 2024-01-18 17:06:32
 */
public class AntfortuneFinresearchCopilotConsultModel extends AlipayObject {

	private static final long serialVersionUID = 3828478565412939835L;

	/**
	 * 咨询补充信息
	 */
	@ApiField("consult_param")
	private String consultParam;

	/**
	 * 提问类型
	 */
	@ApiField("consult_type")
	private String consultType;

	/**
	 * 分析结束时间，决定了分析内容的时间段
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 提问内容
	 */
	@ApiField("question")
	private String question;

	/**
	 * 问题分析开始时间，决定了分析内容的时间段
	 */
	@ApiField("start_date")
	private String startDate;

	public String getConsultParam() {
		return this.consultParam;
	}
	public void setConsultParam(String consultParam) {
		this.consultParam = consultParam;
	}

	public String getConsultType() {
		return this.consultType;
	}
	public void setConsultType(String consultType) {
		this.consultType = consultType;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getQuestion() {
		return this.question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

}
