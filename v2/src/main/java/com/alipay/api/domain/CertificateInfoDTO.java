package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证信息。包含凭证id、次序号、核销状态等字段。
 *
 * @author auto create
 * @since 1.0, 2026-04-17 21:07:08
 */
public class CertificateInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 1255282751349919538L;

	/**
	 * 支付宝平台侧的凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 支付宝平台侧的凭证核销次序号
	 */
	@ApiField("serial_no")
	private String serialNo;

	/**
	 * 核销状态
	 */
	@ApiField("use_status")
	private String useStatus;

	/**
	 * 券码code
	 */
	@ApiField("voucher_code")
	private String voucherCode;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getSerialNo() {
		return this.serialNo;
	}
	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getUseStatus() {
		return this.useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}

	public String getVoucherCode() {
		return this.voucherCode;
	}
	public void setVoucherCode(String voucherCode) {
		this.voucherCode = voucherCode;
	}

}
