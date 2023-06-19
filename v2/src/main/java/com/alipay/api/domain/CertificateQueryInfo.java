package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证信息
 *
 * @author auto create
 * @since 1.0, 2023-05-30 23:34:37
 */
public class CertificateQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 7166127741355364295L;

	/**
	 * 用户凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 三方码凭证券码。
	 */
	@ApiField("code")
	private String code;

	/**
	 * 商品信息
	 */
	@ApiField("sku_info")
	private CertificateSkuInfo skuInfo;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	/**
	 * 开始生效时间
	 */
	@ApiField("valid_begin_time")
	private Date validBeginTime;

	/**
	 * 过期时间
	 */
	@ApiField("valid_end_time")
	private Date validEndTime;

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public CertificateSkuInfo getSkuInfo() {
		return this.skuInfo;
	}
	public void setSkuInfo(CertificateSkuInfo skuInfo) {
		this.skuInfo = skuInfo;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
