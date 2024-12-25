package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 医保区域平台消息发送接口
 *
 * @author auto create
 * @since 1.0, 2023-12-15 17:46:43
 */
public class AlipayCommerceMedicalAreaplatformMsgSendModel extends AlipayObject {

	private static final long serialVersionUID = 3525146593574573967L;

	/**
	 * 医院名称
	 */
	@ApiField("hospital")
	private String hospital;

	/**
	 * 医院ID类型
	 */
	@ApiField("hospital_id_type")
	private String hospitalIdType;

	/**
	 * 医院ID
	 */
	@ApiField("hospital_register_id")
	private String hospitalRegisterId;

	/**
	 * 消息参数列表
	 */
	@ApiListField("msg_arg_list")
	@ApiField("medical_area_platform_msg_send_arg")
	private List<MedicalAreaPlatformMsgSendArg> msgArgList;

	/**
	 * 外部消息id
	 */
	@ApiField("out_msg_id")
	private String outMsgId;

	/**
	 * 就诊人姓名
	 */
	@ApiField("patient")
	private String patient;

	/**
	 * 模板码，支付宝侧定义
	 */
	@ApiField("template_code")
	private String templateCode;

	/**
	 * 证件号
	 */
	@ApiField("user_card_no")
	private String userCardNo;

	/**
	 * 证件类型
	 */
	@ApiField("user_card_type")
	private String userCardType;

	public String getHospital() {
		return this.hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	public String getHospitalIdType() {
		return this.hospitalIdType;
	}
	public void setHospitalIdType(String hospitalIdType) {
		this.hospitalIdType = hospitalIdType;
	}

	public String getHospitalRegisterId() {
		return this.hospitalRegisterId;
	}
	public void setHospitalRegisterId(String hospitalRegisterId) {
		this.hospitalRegisterId = hospitalRegisterId;
	}

	public List<MedicalAreaPlatformMsgSendArg> getMsgArgList() {
		return this.msgArgList;
	}
	public void setMsgArgList(List<MedicalAreaPlatformMsgSendArg> msgArgList) {
		this.msgArgList = msgArgList;
	}

	public String getOutMsgId() {
		return this.outMsgId;
	}
	public void setOutMsgId(String outMsgId) {
		this.outMsgId = outMsgId;
	}

	public String getPatient() {
		return this.patient;
	}
	public void setPatient(String patient) {
		this.patient = patient;
	}

	public String getTemplateCode() {
		return this.templateCode;
	}
	public void setTemplateCode(String templateCode) {
		this.templateCode = templateCode;
	}

	public String getUserCardNo() {
		return this.userCardNo;
	}
	public void setUserCardNo(String userCardNo) {
		this.userCardNo = userCardNo;
	}

	public String getUserCardType() {
		return this.userCardType;
	}
	public void setUserCardType(String userCardType) {
		this.userCardType = userCardType;
	}

}
