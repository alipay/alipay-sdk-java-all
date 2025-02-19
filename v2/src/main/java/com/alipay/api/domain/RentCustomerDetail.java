package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租赁客户详细信息
 *
 * @author auto create
 * @since 1.0, 2024-07-05 12:04:51
 */
public class RentCustomerDetail extends AlipayObject {

	private static final long serialVersionUID = 7516492189182822296L;

	/**
	 * 支付宝账户OpenId
	 */
	@ApiField("alipay_open_id")
	private String alipayOpenId;

	/**
	 * 支付宝账户UserId
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 身份证号码
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 证件号的SHA256值
	 */
	@ApiField("cert_no_sha_256")
	private String certNoSha256;

	/**
	 * 手机号码
	 */
	@ApiField("mobile")
	private String mobile;

	/**
	 * 手机号码的SHA256值
	 */
	@ApiField("mobile_sha_256")
	private String mobileSha256;

	public String getAlipayOpenId() {
		return this.alipayOpenId;
	}
	public void setAlipayOpenId(String alipayOpenId) {
		this.alipayOpenId = alipayOpenId;
	}

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getCertNoSha256() {
		return this.certNoSha256;
	}
	public void setCertNoSha256(String certNoSha256) {
		this.certNoSha256 = certNoSha256;
	}

	public String getMobile() {
		return this.mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobileSha256() {
		return this.mobileSha256;
	}
	public void setMobileSha256(String mobileSha256) {
		this.mobileSha256 = mobileSha256;
	}

}
