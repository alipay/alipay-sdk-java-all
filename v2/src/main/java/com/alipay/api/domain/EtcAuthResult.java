package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * etc认证结果
 *
 * @author auto create
 * @since 1.0, 2025-06-17 09:59:28
 */
public class EtcAuthResult extends AlipayObject {

	private static final long serialVersionUID = 5832353356662138854L;

	/**
	 * 支付宝授权协议号
	 */
	@ApiField("auth_agreement_no")
	private String authAgreementNo;

	/**
	 * 认证完成时间
	 */
	@ApiField("auth_time")
	private Date authTime;

	/**
	 * ETC卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 发行机构名称
	 */
	@ApiField("issue_name")
	private String issueName;

	/**
	 * 外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	/**
	 * 车牌颜色
	 */
	@ApiField("plate_color")
	private String plateColor;

	/**
	 * 车牌号
	 */
	@ApiField("plate_no")
	private String plateNo;

	/**
	 * 授权状态
	 */
	@ApiField("service_status")
	private String serviceStatus;

	/**
	 * 解除认证完成时间
	 */
	@ApiField("unauth_time")
	private Date unauthTime;

	public String getAuthAgreementNo() {
		return this.authAgreementNo;
	}
	public void setAuthAgreementNo(String authAgreementNo) {
		this.authAgreementNo = authAgreementNo;
	}

	public Date getAuthTime() {
		return this.authTime;
	}
	public void setAuthTime(Date authTime) {
		this.authTime = authTime;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getIssueName() {
		return this.issueName;
	}
	public void setIssueName(String issueName) {
		this.issueName = issueName;
	}

	public String getOutAgreementNo() {
		return this.outAgreementNo;
	}
	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}

	public String getPlateColor() {
		return this.plateColor;
	}
	public void setPlateColor(String plateColor) {
		this.plateColor = plateColor;
	}

	public String getPlateNo() {
		return this.plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

	public String getServiceStatus() {
		return this.serviceStatus;
	}
	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public Date getUnauthTime() {
		return this.unauthTime;
	}
	public void setUnauthTime(Date unauthTime) {
		this.unauthTime = unauthTime;
	}

}
