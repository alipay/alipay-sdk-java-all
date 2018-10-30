package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.idcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-05-09 14:55:00
 */
public class AlipayIserviceCognitiveOcrIdcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1669842696544129428L;

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
	 * 信息抽取失败后详细错误原因
	 */
	@ApiField("error_content")
	private String errorContent;

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

	public void setErrorContent(String errorContent) {
		this.errorContent = errorContent;
	}
	public String getErrorContent( ) {
		return this.errorContent;
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
