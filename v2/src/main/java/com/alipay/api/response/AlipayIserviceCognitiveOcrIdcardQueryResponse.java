package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.idcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:00
 */
public class AlipayIserviceCognitiveOcrIdcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7895623266378761444L;

	/** 
	 * 地址
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 出生年月日
	 */
	@ApiField("birth")
	private String birth;

	/** 
	 * 有效期截止时间
	 */
	@ApiField("end_date")
	private String endDate;

	/** 
	 * 信息抽取失败后详细错误原因
	 */
	@ApiField("error_content")
	private String errorContent;

	/** 
	 * 公安局分案
	 */
	@ApiField("issue")
	private String issue;

	/** 
	 * 身份证姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 民族
	 */
	@ApiField("nationality")
	private String nationality;

	/** 
	 * 号码
	 */
	@ApiField("num")
	private String num;

	/** 
	 * 服务器内部id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 性别：男/女
	 */
	@ApiField("sex")
	private String sex;

	/** 
	 * 有效期开始时间
	 */
	@ApiField("start_date")
	private String startDate;

	/** 
	 * true: 解析成功
false: 解析失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getBirth( ) {
		return this.birth;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getEndDate( ) {
		return this.endDate;
	}

	public void setErrorContent(String errorContent) {
		this.errorContent = errorContent;
	}
	public String getErrorContent( ) {
		return this.errorContent;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getIssue( ) {
		return this.issue;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getNationality( ) {
		return this.nationality;
	}

	public void setNum(String num) {
		this.num = num;
	}
	public String getNum( ) {
		return this.num;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getSex( ) {
		return this.sex;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getStartDate( ) {
		return this.startDate;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
