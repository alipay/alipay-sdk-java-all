package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 核销信息
 *
 * @author auto create
 * @since 1.0, 2025-10-21 19:20:59
 */
public class MiniCertificateUseInfo extends AlipayObject {

	private static final long serialVersionUID = 6144951848466499722L;

	/**
	 * 核销金额（元）
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 凭证id
	 */
	@ApiField("certificate_id")
	private String certificateId;

	/**
	 * 凭证次序号
	 */
	@ApiField("certificate_sequence_id")
	private String certificateSequenceId;

	/**
	 * 核销门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 核销门店名字
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 核销时间
	 */
	@ApiField("use_time")
	private String useTime;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getCertificateId() {
		return this.certificateId;
	}
	public void setCertificateId(String certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateSequenceId() {
		return this.certificateSequenceId;
	}
	public void setCertificateSequenceId(String certificateSequenceId) {
		this.certificateSequenceId = certificateSequenceId;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getUseTime() {
		return this.useTime;
	}
	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}

}
