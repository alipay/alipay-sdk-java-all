package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.driverlicense.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-14 10:13:13
 */
public class AlipayIserviceCognitiveOcrDriverlicenseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4492862792738963894L;

	/** 
	 * 地址
	 */
	@ApiField("addr")
	private String addr;

	/** 
	 * 有效期限
	 */
	@ApiField("end_date")
	private String endDate;

	/** 
	 * 识别错误的详细原因描述
	 */
	@ApiField("error_content")
	private String errorContent;

	/** 
	 * 姓名
	 */
	@ApiField("name")
	private String name;

	/** 
	 * 驾驶证号码
	 */
	@ApiField("num")
	private String num;

	/** 
	 * 服务器id
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 性别
	 */
	@ApiField("sex")
	private String sex;

	/** 
	 * 有效期起始时间
	 */
	@ApiField("start_date")
	private String startDate;

	/** 
	 * true:识别成功
false:识别失败
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 开放平台trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	/** 
	 * 准驾车型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr( ) {
		return this.addr;
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

	public void setName(String name) {
		this.name = name;
	}
	public String getName( ) {
		return this.name;
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

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleType( ) {
		return this.vehicleType;
	}

}
