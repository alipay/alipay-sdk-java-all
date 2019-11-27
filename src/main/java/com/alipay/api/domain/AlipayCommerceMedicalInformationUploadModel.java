package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 医疗行业挂号报备接口
 *
 * @author auto create
 * @since 1.0, 2018-09-12 16:58:43
 */
public class AlipayCommerceMedicalInformationUploadModel extends AlipayObject {

	private static final long serialVersionUID = 7444381286975136139L;

	/**
	 * 支付授权码
	 */
	@ApiField("auth_code")
	private String authCode;

	/**
	 * 支付场景（默认为条形码）
条码支付，取值：bar_code
声波支付，取值：wave_code
二维码支付，取值qr_code
	 */
	@ApiField("auth_type")
	private String authType;

	/**
	 * 上报明细：
挂号场景：挂号科室名
线下药店：药品名称
	 */
	@ApiField("body")
	private String body;

	/**
	 * 买家id
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 业务扩展参数
系统商编号:sys_service_provider_id
该参数作为系统商返佣数据提取的依据，请填写系统商签约协议的PID
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 外部生成时间。 格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_out_create")
	private Date gmtOutCreate;

	/**
	 * 上报行业：
药店：STORE
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 是否医保业务
是：T
不是：F
	 */
	@ApiField("is_insurance")
	private String isInsurance;

	/**
	 * 医保卡卡机构内部ID号
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/**
	 * 医保机构的编号
	 */
	@ApiField("medical_card_inst_id")
	private String medicalCardInstId;

	/**
	 * 医疗机构名称
	 */
	@ApiField("org_name")
	private String orgName;

	/**
	 * 医疗机构编码(医保局分配)
	 */
	@ApiField("org_no")
	private String orgNo;

	/**
	 * 商户订单号，64个字符以内、可包含字母、数字、下划线；需保证在商户端不重复。
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 患者证件号码
	 */
	@ApiField("patient_card_no")
	private String patientCardNo;

	/**
	 * 患者证件类型
	 */
	@ApiField("patient_card_type")
	private String patientCardType;

	/**
	 * 患者手机号
	 */
	@ApiField("patient_mobile")
	private String patientMobile;

	/**
	 * 患者姓名
患者姓名&患者证件和医保卡信息全部匹配才能使用医保，否则认为套保嫌疑不允许医保只能自费
	 */
	@ApiField("patient_name")
	private String patientName;

	/**
	 * 如果需要医保支付这个字段必传。业务报文，报文中可包含多条业务数据
	 */
	@ApiField("request_content")
	private String requestContent;

	/**
	 * 场景，取值：REGISTRATION(挂号)
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 卖家支付宝用户ID，如果该值为空，则默认为商户签约账号对应的支付宝用户ID
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 业务流水号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 主题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 金额，单位元
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getAuthCode() {
		return this.authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}

	public String getAuthType() {
		return this.authType;
	}
	public void setAuthType(String authType) {
		this.authType = authType;
	}

	public String getBody() {
		return this.body;
	}
	public void setBody(String body) {
		this.body = body;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public Date getGmtOutCreate() {
		return this.gmtOutCreate;
	}
	public void setGmtOutCreate(Date gmtOutCreate) {
		this.gmtOutCreate = gmtOutCreate;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getIsInsurance() {
		return this.isInsurance;
	}
	public void setIsInsurance(String isInsurance) {
		this.isInsurance = isInsurance;
	}

	public String getMedicalCardId() {
		return this.medicalCardId;
	}
	public void setMedicalCardId(String medicalCardId) {
		this.medicalCardId = medicalCardId;
	}

	public String getMedicalCardInstId() {
		return this.medicalCardInstId;
	}
	public void setMedicalCardInstId(String medicalCardInstId) {
		this.medicalCardInstId = medicalCardInstId;
	}

	public String getOrgName() {
		return this.orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgNo() {
		return this.orgNo;
	}
	public void setOrgNo(String orgNo) {
		this.orgNo = orgNo;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPatientCardNo() {
		return this.patientCardNo;
	}
	public void setPatientCardNo(String patientCardNo) {
		this.patientCardNo = patientCardNo;
	}

	public String getPatientCardType() {
		return this.patientCardType;
	}
	public void setPatientCardType(String patientCardType) {
		this.patientCardType = patientCardType;
	}

	public String getPatientMobile() {
		return this.patientMobile;
	}
	public void setPatientMobile(String patientMobile) {
		this.patientMobile = patientMobile;
	}

	public String getPatientName() {
		return this.patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getRequestContent() {
		return this.requestContent;
	}
	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getSubject() {
		return this.subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
