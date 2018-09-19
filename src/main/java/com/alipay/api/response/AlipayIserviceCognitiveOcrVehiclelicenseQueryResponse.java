package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.vehiclelicense.query response.
 * 
 * @author auto create
 * @since 1.0, 2018-05-21 18:10:00
 */
public class AlipayIserviceCognitiveOcrVehiclelicenseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7556698831829798154L;

	/** 
	 * 发动机号码
	 */
	@ApiField("engine_num")
	private String engineNum;

	/** 
	 * 识别错误的详细原因描述
	 */
	@ApiField("error_content")
	private String errorContent;

	/** 
	 * 发证时间
	 */
	@ApiField("issue_date")
	private String issueDate;

	/** 
	 * 品牌型号
	 */
	@ApiField("model")
	private String model;

	/** 
	 * 所有人
	 */
	@ApiField("owner")
	private String owner;

	/** 
	 * 号牌号码
	 */
	@ApiField("plate_num")
	private String plateNum;

	/** 
	 * 注册时间
	 */
	@ApiField("register_date")
	private String registerDate;

	/** 
	 * 服务器内部请求id
	 */
	@ApiField("request_id")
	private String requestId;

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
	 * 使用性质
	 */
	@ApiField("use_character")
	private String useCharacter;

	/** 
	 * 车辆类型
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/** 
	 * 车辆识别代号
	 */
	@ApiField("vin")
	private String vin;

	public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}
	public String getEngineNum( ) {
		return this.engineNum;
	}

	public void setErrorContent(String errorContent) {
		this.errorContent = errorContent;
	}
	public String getErrorContent( ) {
		return this.errorContent;
	}

	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}
	public String getIssueDate( ) {
		return this.issueDate;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String getModel( ) {
		return this.model;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwner( ) {
		return this.owner;
	}

	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}
	public String getPlateNum( ) {
		return this.plateNum;
	}

	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}
	public String getRegisterDate( ) {
		return this.registerDate;
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

	public void setUseCharacter(String useCharacter) {
		this.useCharacter = useCharacter;
	}
	public String getUseCharacter( ) {
		return this.useCharacter;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getVehicleType( ) {
		return this.vehicleType;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}
	public String getVin( ) {
		return this.vin;
	}

}
