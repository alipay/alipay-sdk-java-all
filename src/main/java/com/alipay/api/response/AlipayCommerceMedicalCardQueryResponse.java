package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExtendMedicalCard;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.card.query response.
 * 
 * @author auto create
 * @since 1.0, 2017-08-11 19:29:28
 */
public class AlipayCommerceMedicalCardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5671277395142889138L;

	/** 
	 * 签约协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/** 
	 * 买家支付宝账号，将用＊号屏蔽部分内容
	 */
	@ApiField("buyer_logon_id")
	private String buyerLogonId;

	/** 
	 * 买家支付宝账号对应的支付宝唯一用户号。以2088开头的纯16位数字
	 */
	@ApiField("buyer_user_id")
	private String buyerUserId;

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
	 * 一个支付宝账号绑定了多张医保卡，除本人意外的卡信息
	 */
	@ApiListField("extend_cards")
	@ApiField("extend_medical_card")
	private List<ExtendMedicalCard> extendCards;

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
	 * 绑定状态
已激活:signed
已解绑:unsigned
	 */
	@ApiField("sign_status")
	private String signStatus;

	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}
	public String getAgreementNo( ) {
		return this.agreementNo;
	}

	public void setBuyerLogonId(String buyerLogonId) {
		this.buyerLogonId = buyerLogonId;
	}
	public String getBuyerLogonId( ) {
		return this.buyerLogonId;
	}

	public void setBuyerUserId(String buyerUserId) {
		this.buyerUserId = buyerUserId;
	}
	public String getBuyerUserId( ) {
		return this.buyerUserId;
	}

	public void setCardOrgName(String cardOrgName) {
		this.cardOrgName = cardOrgName;
	}
	public String getCardOrgName( ) {
		return this.cardOrgName;
	}

	public void setCardOrgNo(String cardOrgNo) {
		this.cardOrgNo = cardOrgNo;
	}
	public String getCardOrgNo( ) {
		return this.cardOrgNo;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public String getCity( ) {
		return this.city;
	}

	public void setExtendCards(List<ExtendMedicalCard> extendCards) {
		this.extendCards = extendCards;
	}
	public List<ExtendMedicalCard> getExtendCards( ) {
		return this.extendCards;
	}

	public void setExtendParams(String extendParams) {
		this.extendParams = extendParams;
	}
	public String getExtendParams( ) {
		return this.extendParams;
	}

	public void setGmtSign(String gmtSign) {
		this.gmtSign = gmtSign;
	}
	public String getGmtSign( ) {
		return this.gmtSign;
	}

	public void setMedicalCardId(String medicalCardId) {
		this.medicalCardId = medicalCardId;
	}
	public String getMedicalCardId( ) {
		return this.medicalCardId;
	}

	public void setMedicalCardNo(String medicalCardNo) {
		this.medicalCardNo = medicalCardNo;
	}
	public String getMedicalCardNo( ) {
		return this.medicalCardNo;
	}

	public void setMedicalCardType(String medicalCardType) {
		this.medicalCardType = medicalCardType;
	}
	public String getMedicalCardType( ) {
		return this.medicalCardType;
	}

	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}
	public String getSignStatus( ) {
		return this.signStatus;
	}

}
