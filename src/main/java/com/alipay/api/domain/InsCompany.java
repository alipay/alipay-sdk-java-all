package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 投保保险的商户(企业)信息
 *
 * @author auto create
 * @since 1.0, 2022-06-10 16:17:55
 */
public class InsCompany extends AlipayObject {

	private static final long serialVersionUID = 5663979366277259738L;

	/**
	 * 支付宝账号ID
	 */
	@ApiField("alipay_account_no")
	private String alipayAccountNo;

	/**
	 * 商户/企业名称
	 */
	@ApiField("cert_name")
	private String certName;

	/**
	 * 社会统一信用代码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 渠道用户ID
	 */
	@ApiField("channel_account_id")
	private String channelAccountId;

	/**
	 * 渠道用户类型
	 */
	@ApiField("channel_account_type")
	private String channelAccountType;

	/**
	 * 手机号
	 */
	@ApiField("phone")
	private String phone;

	public String getAlipayAccountNo() {
		return this.alipayAccountNo;
	}
	public void setAlipayAccountNo(String alipayAccountNo) {
		this.alipayAccountNo = alipayAccountNo;
	}

	public String getCertName() {
		return this.certName;
	}
	public void setCertName(String certName) {
		this.certName = certName;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getChannelAccountId() {
		return this.channelAccountId;
	}
	public void setChannelAccountId(String channelAccountId) {
		this.channelAccountId = channelAccountId;
	}

	public String getChannelAccountType() {
		return this.channelAccountType;
	}
	public void setChannelAccountType(String channelAccountType) {
		this.channelAccountType = channelAccountType;
	}

	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

}
