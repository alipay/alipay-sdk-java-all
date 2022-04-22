package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.cognitive.ocr.vehiclelicense.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 10:41:59
 */
public class AlipayIserviceCognitiveOcrVehiclelicenseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2449378895378743332L;

	/** 
	 * 核定载质量
	 */
	@ApiField("approved_load")
	private String approvedLoad;

	/** 
	 * 核定载人数
	 */
	@ApiField("approved_passenger_capacity")
	private String approvedPassengerCapacity;

	/** 
	 * 燃油类型
	 */
	@ApiField("energy_type")
	private String energyType;

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
	 * 档案编号
	 */
	@ApiField("file_no")
	private String fileNo;

	/** 
	 * 总质量
	 */
	@ApiField("gross_mass")
	private String grossMass;

	/** 
	 * 副页备注
	 */
	@ApiField("inspection_record")
	private String inspectionRecord;

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
	 * 4587X1798X1463mm
	 */
	@ApiField("overall_dimension")
	private String overallDimension;

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
	 * 1255kg
	 */
	@ApiField("unladen_mass")
	private String unladenMass;

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

	public void setApprovedLoad(String approvedLoad) {
		this.approvedLoad = approvedLoad;
	}
	public String getApprovedLoad( ) {
		return this.approvedLoad;
	}

	public void setApprovedPassengerCapacity(String approvedPassengerCapacity) {
		this.approvedPassengerCapacity = approvedPassengerCapacity;
	}
	public String getApprovedPassengerCapacity( ) {
		return this.approvedPassengerCapacity;
	}

	public void setEnergyType(String energyType) {
		this.energyType = energyType;
	}
	public String getEnergyType( ) {
		return this.energyType;
	}

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

	public void setFileNo(String fileNo) {
		this.fileNo = fileNo;
	}
	public String getFileNo( ) {
		return this.fileNo;
	}

	public void setGrossMass(String grossMass) {
		this.grossMass = grossMass;
	}
	public String getGrossMass( ) {
		return this.grossMass;
	}

	public void setInspectionRecord(String inspectionRecord) {
		this.inspectionRecord = inspectionRecord;
	}
	public String getInspectionRecord( ) {
		return this.inspectionRecord;
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

	public void setOverallDimension(String overallDimension) {
		this.overallDimension = overallDimension;
	}
	public String getOverallDimension( ) {
		return this.overallDimension;
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

	public void setUnladenMass(String unladenMass) {
		this.unladenMass = unladenMass;
	}
	public String getUnladenMass( ) {
		return this.unladenMass;
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
