package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据用户已经在支付宝绑定过的医保卡为医疗行业提供收单支付服务。同时支持自费支付服务
 *
 * @author auto create
 * @since 1.0, 2020-04-10 12:58:14
 */
public class AlipayCommerceMedicalInstcardCreateandpayModel extends AlipayObject {

	private static final long serialVersionUID = 8726585561616291286L;

	/**
	 * 业务单据号
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 对交易或者商品的描述
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
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 外部下单时间。 格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_out_create")
	private Date gmtOutCreate;

	/**
	 * 支付行业：
医院：HOSPITAL
药店：STORE
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 外部机构业务上是否允许这笔单订单使用医保支付
允许使用：T
不允许使用：F
	 */
	@ApiField("is_insurance")
	private String isInsurance;

	/**
	 * 医保卡机构内部ID号
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
	 * 支付场景，取值：REGISTRATION(挂号)
TREATMENT(诊间)
HOSPITALIZATION(住院)
COMMON(非医院类)
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
	 * 订单标题
	 */
	@ApiField("subject")
	private String subject;

	/**
	 * 该笔订单允许的最晚付款时间，逾期将关闭交易。取值范围：1m～15d。m-分钟，h-小时，d-天，1c-当天（1c-当天的情况下，无论交易何时创建，都在0点关闭）。 该参数数值不接受小数点， 如 1.5h，可转换为 90m
	 */
	@ApiField("timeout_express")
	private String timeoutExpress;

	/**
	 * 订单总金额，单位为元，不能小于0，精确到小数点后2位。
	 */
	@ApiField("total_amount")
	private String totalAmount;

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
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

	public String getTimeoutExpress() {
		return this.timeoutExpress;
	}
	public void setTimeoutExpress(String timeoutExpress) {
		this.timeoutExpress = timeoutExpress;
	}

	public String getTotalAmount() {
		return this.totalAmount;
	}
	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

}
