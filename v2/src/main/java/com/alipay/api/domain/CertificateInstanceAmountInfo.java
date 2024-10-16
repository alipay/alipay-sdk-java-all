package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证实例的金额信息
 *
 * @author auto create
 * @since 1.0, 2024-04-03 15:47:15
 */
public class CertificateInstanceAmountInfo extends AlipayObject {

	private static final long serialVersionUID = 8842125438926937436L;

	/**
	 * 核销后商家减收部分，单位为元
	 */
	@ApiField("merchant_discount_amount")
	private String merchantDiscountAmount;

	/**
	 * 商品标注的原价，单位为元。
	 */
	@ApiField("original_price")
	private String originalPrice;

	/**
	 * 用户实付金额，单位为元
	 */
	@ApiField("pay_amount")
	private String payAmount;

	/**
	 * 核销生效后平台、商家等出资的优惠部分，单位为元
	 */
	@ApiField("platform_discount_amount")
	private String platformDiscountAmount;

	/**
	 * 商品售价去除商家订单优惠后的商家实收，未计算收单费率等，单位为元。
	 */
	@ApiField("receipt_amount")
	private String receiptAmount;

	/**
	 * 商品售卖的价格，单位为元。
	 */
	@ApiField("sale_price")
	private String salePrice;

	public String getMerchantDiscountAmount() {
		return this.merchantDiscountAmount;
	}
	public void setMerchantDiscountAmount(String merchantDiscountAmount) {
		this.merchantDiscountAmount = merchantDiscountAmount;
	}

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}

	public String getPayAmount() {
		return this.payAmount;
	}
	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}

	public String getPlatformDiscountAmount() {
		return this.platformDiscountAmount;
	}
	public void setPlatformDiscountAmount(String platformDiscountAmount) {
		this.platformDiscountAmount = platformDiscountAmount;
	}

	public String getReceiptAmount() {
		return this.receiptAmount;
	}
	public void setReceiptAmount(String receiptAmount) {
		this.receiptAmount = receiptAmount;
	}

	public String getSalePrice() {
		return this.salePrice;
	}
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}

}
