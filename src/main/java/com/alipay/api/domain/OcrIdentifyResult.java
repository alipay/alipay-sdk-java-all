package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 火眼识别结果
 *
 * @author auto create
 * @since 1.0, 2018-12-25 14:11:59
 */
public class OcrIdentifyResult extends AlipayObject {

	private static final long serialVersionUID = 2891121672463698463L;

	/**
	 * 当识别驾驶证时，返回家庭住址；
	 */
	@ApiField("addr")
	private String addr;

	/**
	 * 当识别营业执照时，返回注册地址；
当识别身份证时，返回家庭住址；
	 */
	@ApiField("address")
	private String address;

	/**
	 * 当识别身份证时，返回生日
	 */
	@ApiField("birth")
	private String birth;

	/**
	 * 当识别营业执照时，返回经营范围
	 */
	@ApiField("business")
	private String business;

	/**
	 * 当识别营业执照时，返回注册资本
	 */
	@ApiField("captial")
	private String captial;

	/**
	 * 当识别银行卡时，返回银行卡号
	 */
	@ApiField("card_num")
	private String cardNum;

	/**
	 * 调用结果编码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 当识别驾驶证时，返回证件有效期结束时间
	 */
	@ApiField("end_date")
	private String endDate;

	/**
	 * 当识别行驶证时，返回发动机号
	 */
	@ApiField("engine_num")
	private String engineNum;

	/**
	 * 当识别营业执照时，返回注册时间
	 */
	@ApiField("establish_date")
	private String establishDate;

	/**
	 * 当识别行驶证时，返回发证日期
	 */
	@ApiField("issue_date")
	private String issueDate;

	/**
	 * 调用结果说明
	 */
	@ApiField("msg")
	private String msg;

	/**
	 * 当识别营业执照时，返回公司名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 当识别身份证时，返回民族
	 */
	@ApiField("nationality")
	private String nationality;

	/**
	 * 当识别驾驶证时，返回证件号码；
当识别身份证时，返回身份证号码；
	 */
	@ApiField("num")
	private String num;

	/**
	 * 当识别行驶证时，返回所有人
	 */
	@ApiField("owner")
	private String owner;

	/**
	 * 当识别营业执照时，返回公司法人
	 */
	@ApiField("person")
	private String person;

	/**
	 * 当识别行驶证时，返回车牌
	 */
	@ApiField("plate_num")
	private String plateNum;

	/**
	 * 当识别营业执照时，返回注册编号
	 */
	@ApiField("reg_num")
	private String regNum;

	/**
	 * 当识别行驶证时，返回注册时间
	 */
	@ApiField("register_date")
	private String registerDate;

	/**
	 * request_id
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 当识别身份证时，返回性别
	 */
	@ApiField("sex")
	private String sex;

	/**
	 * 当识别驾驶证时，返回证件有效期起始时间
	 */
	@ApiField("start_date")
	private String startDate;

	/**
	 * 识别是否成功
	 */
	@ApiField("success")
	private String success;

	/**
	 * trace_id
	 */
	@ApiField("trace_id")
	private String traceId;

	/**
	 * 当识别行驶证时，返回使用性质
	 */
	@ApiField("use_character")
	private String useCharacter;

	/**
	 * 当识别营业执照时，返回有效期
	 */
	@ApiField("valid_period")
	private String validPeriod;

	/**
	 * 当识别驾驶证时，返回证件准驾车型；
当识别行驶证时，返回车辆类型；
	 */
	@ApiField("vehicle_type")
	private String vehicleType;

	/**
	 * 当识别车架号时，返回车架号；
当识别行驶证时，返回车辆识别代号；
	 */
	@ApiField("vin")
	private String vin;

	public String getAddr() {
		return this.addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return this.birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getBusiness() {
		return this.business;
	}
	public void setBusiness(String business) {
		this.business = business;
	}

	public String getCaptial() {
		return this.captial;
	}
	public void setCaptial(String captial) {
		this.captial = captial;
	}

	public String getCardNum() {
		return this.cardNum;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getEndDate() {
		return this.endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getEngineNum() {
		return this.engineNum;
	}
	public void setEngineNum(String engineNum) {
		this.engineNum = engineNum;
	}

	public String getEstablishDate() {
		return this.establishDate;
	}
	public void setEstablishDate(String establishDate) {
		this.establishDate = establishDate;
	}

	public String getIssueDate() {
		return this.issueDate;
	}
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	public String getMsg() {
		return this.msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getNationality() {
		return this.nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getNum() {
		return this.num;
	}
	public void setNum(String num) {
		this.num = num;
	}

	public String getOwner() {
		return this.owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getPerson() {
		return this.person;
	}
	public void setPerson(String person) {
		this.person = person;
	}

	public String getPlateNum() {
		return this.plateNum;
	}
	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}

	public String getRegNum() {
		return this.regNum;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}

	public String getRegisterDate() {
		return this.registerDate;
	}
	public void setRegisterDate(String registerDate) {
		this.registerDate = registerDate;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSex() {
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getStartDate() {
		return this.startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getSuccess() {
		return this.success;
	}
	public void setSuccess(String success) {
		this.success = success;
	}

	public String getTraceId() {
		return this.traceId;
	}
	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}

	public String getUseCharacter() {
		return this.useCharacter;
	}
	public void setUseCharacter(String useCharacter) {
		this.useCharacter = useCharacter;
	}

	public String getValidPeriod() {
		return this.validPeriod;
	}
	public void setValidPeriod(String validPeriod) {
		this.validPeriod = validPeriod;
	}

	public String getVehicleType() {
		return this.vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVin() {
		return this.vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}

}
