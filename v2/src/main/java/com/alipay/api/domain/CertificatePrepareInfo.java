package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证核销准备详情
 *
 * @author auto create
 * @since 1.0, 2023-10-16 15:24:26
 */
public class CertificatePrepareInfo extends AlipayObject {

	private static final long serialVersionUID = 8634723613878595212L;

	/**
	 * 凭证实例的金额信息，在异常场景下可能为空，需要判断是否有值才可进行使用。
	 */
	@ApiField("amount_info")
	private CertificateInstanceAmountInfo amountInfo;

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
	 * 购买商品的订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商品信息
	 */
	@ApiField("sku_info")
	private CertificateSkuInfo skuInfo;

	/**
	 * 商品类型为次卡时该值必填
	 */
	@ApiField("times_card_info")
	private CertificateTimesCardInfo timesCardInfo;

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

	public CertificateInstanceAmountInfo getAmountInfo() {
		return this.amountInfo;
	}
	public void setAmountInfo(CertificateInstanceAmountInfo amountInfo) {
		this.amountInfo = amountInfo;
	}

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

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public CertificateSkuInfo getSkuInfo() {
		return this.skuInfo;
	}
	public void setSkuInfo(CertificateSkuInfo skuInfo) {
		this.skuInfo = skuInfo;
	}

	public CertificateTimesCardInfo getTimesCardInfo() {
		return this.timesCardInfo;
	}
	public void setTimesCardInfo(CertificateTimesCardInfo timesCardInfo) {
		this.timesCardInfo = timesCardInfo;
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
