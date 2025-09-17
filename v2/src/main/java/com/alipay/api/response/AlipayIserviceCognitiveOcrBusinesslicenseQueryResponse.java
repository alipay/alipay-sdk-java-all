package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.businesslicense.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 15:42:42
 */
public class AlipayIserviceCognitiveOcrBusinesslicenseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8445388251343316364L;

	/** 
	 * 住所
	 */
	@ApiField("address")
	private String address;

	/** 
	 * 经营范围
	 */
	@ApiField("business")
	private String business;

	/** 
	 * 注册资本
	 */
	@ApiField("captial")
	private String captial;

	/** 
	 * 识别错误情况下的，详细错误原因
	 */
	@ApiField("error_content")
	private String errorContent;

	/** 
	 * 成立日期
	 */
	@ApiField("establish_date")
	private String establishDate;

	/** 
	 * 名称
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 法定代表人
	 */
	@ApiField("person")
	private String person;

	/** 
	 * 注册号
	 */
	@ApiField("reg_num")
	private String regNum;

	/** 
	 * 服务器id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * true: 识别成功
false：识别失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 营业期限
	 */
	@ApiField("valid_period")
	private String validPeriod;

	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress( ) {
		return this.address;
	}

	public void setBusiness(String business) {
		this.business = business;
	}
	public String getBusiness( ) {
		return this.business;
	}

	public void setCaptial(String captial) {
		this.captial = captial;
	}
	public String getCaptial( ) {
		return this.captial;
	}

	public void setErrorContent(String errorContent) {
		this.errorContent = errorContent;
	}
	public String getErrorContent( ) {
		return this.errorContent;
	}

	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}
	public String getEstablishDate( ) {
		return this.establishDate;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
	}

	public void setPerson(String person) {
		this.person = person;
	}
	public String getPerson( ) {
		return this.person;
	}

	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public String getRegNum( ) {
		return this.regNum;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
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

	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}
	public String getValidPeriod( ) {
		return this.validPeriod;
	}

}
