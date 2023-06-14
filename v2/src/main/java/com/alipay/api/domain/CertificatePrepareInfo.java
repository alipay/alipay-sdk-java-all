package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证核销准备详情
 *
 * @author auto create
 * @since 1.0, 2023-05-30 23:34:21
 */
public class CertificatePrepareInfo extends AlipayObject {

	private static final long serialVersionUID = 8528443161671349884L;

	/**
	 * 凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 加密券码，核销接口使用
	 */
	@ApiField("encrypted_code")
	private String encryptedCode;

	/**
	 * 商品信息
	 */
	@ApiField("sku_info")
	private CertificateSkuInfo skuInfo;

	/**
	 * 券的有效期开始时间
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * 券的有效期结束时间
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getEncryptedCode() {
		return this.encryptedCode;
	}
	public void setEncryptedCode(String encryptedCode) {
		this.encryptedCode = encryptedCode;
	}

	public CertificateSkuInfo getSkuInfo() {
		return this.skuInfo;
	}
	public void setSkuInfo(CertificateSkuInfo skuInfo) {
		this.skuInfo = skuInfo;
	}

	public Date getValidBeginTime() {
		return this.validBeginTime;
	}
	public void setValidBeginTime(Date validBeginTime) {
		this.validBeginTime = validBeginTime;
	}

	public Date getValidEndTime() {
		return this.validEndTime;
	}
	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

}
