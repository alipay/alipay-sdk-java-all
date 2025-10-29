package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * NFC用户卡信息同步
 *
 * @author auto create
 * @since 1.0, 2025-05-26 16:25:34
 */
public class AlipayCommerceTransportNfccardSendModel extends AlipayObject {

	private static final long serialVersionUID = 8739724163674128915L;

	/**
	 * 发卡方pid
	 */
	@ApiField("card_issuer_pid")
	private String cardIssuerPid;

	/**
	 * 卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡片状态。枚举值如下：
*  FREEZE：冻结。
*  CANCEL：销卡。
MOVEOUT 迁出
	 */
	@ApiField("card_status")
	private String cardStatus;

	/**
	 * NFC卡
	 */
	@ApiField("card_type")
	private String cardType;

	/**
	 * 字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 发卡机构代码
	 */
	@ApiField("issue_org_no")
	private String issueOrgNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 签约升级：签约代扣协议
解约降级：解约代扣协议
	 */
	@ApiField("sign_status")
	private String signStatus;

	/**
	 * 签约免密协议的时间
	 */
	@ApiField("sign_time")
	private Date signTime;

	/**
	 * 解约时间
	 */
	@ApiField("unsign_time")
	private Date unsignTime;

	/**
	 * 免密签约协议号
	 */
	@ApiField("withhold_agreement_no")
	private String withholdAgreementNo;

	public String getCardIssuerPid() {
		return this.cardIssuerPid;
	}
	public void setCardIssuerPid(String cardIssuerPid) {
		this.cardIssuerPid = cardIssuerPid;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardStatus() {
		return this.cardStatus;
	}
	public void setCardStatus(String cardStatus) {
		this.cardStatus = cardStatus;
	}

	public String getCardType() {
		return this.cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getIssueOrgNo() {
		return this.issueOrgNo;
	}
	public void setIssueOrgNo(String issueOrgNo) {
		this.issueOrgNo = issueOrgNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getSignStatus() {
		return this.signStatus;
	}
	public void setSignStatus(String signStatus) {
		this.signStatus = signStatus;
	}

	public Date getSignTime() {
		return this.signTime;
	}
	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public Date getUnsignTime() {
		return this.unsignTime;
	}
	public void setUnsignTime(Date unsignTime) {
		this.unsignTime = unsignTime;
	}

	public String getWithholdAgreementNo() {
		return this.withholdAgreementNo;
	}
	public void setWithholdAgreementNo(String withholdAgreementNo) {
		this.withholdAgreementNo = withholdAgreementNo;
	}

}
