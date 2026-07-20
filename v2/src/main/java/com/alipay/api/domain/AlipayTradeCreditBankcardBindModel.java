package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 消还贷一体用户绑定银行卡
 *
 * @author auto create
 * @since 1.0, 2026-06-26 16:12:55
 */
public class AlipayTradeCreditBankcardBindModel extends AlipayObject {

	private static final long serialVersionUID = 2345997313294419234L;

	/**
	 * 已签约协议号，当redirection_data为空时，此项必填
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 业务场景类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 证件号，用户身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 0代表身份证
	 */
	@ApiField("cert_type")
	private String certType;

	/**
	 * 是否需要同人校验，true表示需要校验用户身份
	 */
	@ApiField("need_check")
	private Boolean needCheck;

	/**
	 * 外部绑卡流水号，同一业务场景下需确保唯一
	 */
	@ApiField("out_bind_no")
	private String outBindNo;

	/**
	 * 用户姓名
	 */
	@ApiField("real_name")
	private String realName;

	/**
	 * 回跳schema地址，用于唤起支付宝选卡组件
	 */
	@ApiField("redirect_url")
	private String redirectUrl;

	/**
	 * 代扣签约页面返回数据，当agreement_no为空时，此项必填
	 */
	@ApiField("redirection_data")
	private String redirectionData;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertType() {
		return this.certType;
	}
	public void setCertType(String certType) {
		this.certType = certType;
	}

	public Boolean getNeedCheck() {
		return this.needCheck;
	}
	public void setNeedCheck(Boolean needCheck) {
		this.needCheck = needCheck;
	}

	public String getOutBindNo() {
		return this.outBindNo;
	}
	public void setOutBindNo(String outBindNo) {
		this.outBindNo = outBindNo;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getRedirectUrl() {
		return this.redirectUrl;
	}
	public void setRedirectUrl(String redirectUrl) {
		this.redirectUrl = redirectUrl;
	}

	public String getRedirectionData() {
		return this.redirectionData;
	}
	public void setRedirectionData(String redirectionData) {
		this.redirectionData = redirectionData;
	}

}
