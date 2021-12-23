package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户的已绑定卡数据
 *
 * @author auto create
 * @since 1.0, 2021-07-02 15:22:56
 */
public class ExtendMedicalCard extends AlipayObject {

	private static final long serialVersionUID = 6252152244365955348L;

	/**
	 * 签约状态为成功绑定为不可空
卡颁发机构名称
	 */
	@ApiField("card_org_name")
	private String cardOrgName;

	/**
	 * 签约状态为成功绑定为不可空
卡颁发机构编号
	 */
	@ApiField("card_org_no")
	private String cardOrgNo;

	/**
	 * 城市编码(格式为：行政区域代码)
多个地市逗号分隔
	 */
	@ApiField("city")
	private String city;

	/**
	 * Json格式的业务扩展参数
	 */
	@ApiField("extend_params")
	private String extendParams;

	/**
	 * 签约状态为成功绑定为不可空
签约成功时间。 格式为 yyyy-MM-dd HH:mm:ss
	 */
	@ApiField("gmt_sign")
	private String gmtSign;

	/**
	 * 000102020011
	 */
	@ApiField("medical_card_id")
	private String medicalCardId;

	/**
	 * 签约状态为成功绑定为不可空
医保卡号，敏感信息脱敏输出
	 */
	@ApiField("medical_card_no")
	private String medicalCardNo;

	/**
	 * 市医保：CITY_INS
省医保:PROVINCE_INS
县医保:COUNTY_INS
	 */
	@ApiField("medical_card_type")
	private String medicalCardType;

	/**
	 * 医保卡持卡人证件号码(脱敏)
	 */
	@ApiField("out_user_card_no")
	private String outUserCardNo;

	/**
	 * 医保卡持有人姓名( 脱敏)
	 */
	@ApiField("out_user_name")
	private String outUserName;

	/**
	 * 绑定状态
已激活:signed
已解绑:unsigned
	 */
	@ApiField("sign_status")
	private String signStatus;

	public String getCardOrgName() {
		return this.cardOrgName;
	}
	public void setCardOrgName(String cardOrgName) {
		this.cardOrgName = cardOrgName;
	}

	public String getCardOrgNo() {
		return this.cardOrgNo;
	}
	public void setCardOrgNo(String cardOrgNo) {
		this.cardOrgNo = cardOrgNo;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getExtendParams() {
		return this.extendParams;
	}
	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}

	public String getGmtSign() {
		return this.gmtSign;
	}
	public void setGmtSign(String gmtSign) {
		this.gmtSign = gmtSign;
	}

	public String getMedicalCardId() {
		return this.medicalCardId;
	}
	public void setMedicalCardId(String medicalCardId) {
		this.medicalCardId = medicalCardId;
	}

	public String getMedicalCardNo() {
		return this.medicalCardNo;
	}
	public void setMedicalCardNo(String medicalCardNo) {
		this.medicalCardNo = medicalCardNo;
	}

	public String getMedicalCardType() {
		return this.medicalCardType;
	}
	public void setMedicalCardType(String medicalCardType) {
		this.medicalCardType = medicalCardType;
	}

	public String getOutUserCardNo() {
		return this.outUserCardNo;
	}
	public void setOutUserCardNo(String outUserCardNo) {
		this.outUserCardNo = outUserCardNo;
	}

	public String getOutUserName() {
		return this.outUserName;
	}
	public void setOutUserName(String outUserName) {
		this.outUserName = outUserName;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

}
