package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证实例的金额信息，在异常场景下可能为空，需要判断是否有值才可进行使用。
 *
 * @author auto create
 * @since 1.0, 2023-06-27 16:21:07
 */
public class CertificateInstanceAmountInfo extends AlipayObject {

	private static final long serialVersionUID = 7145187536653669111L;

	/**
	 * 商品标注的原价，单位为元。
	 */
	@ApiField("original_price")
	private String originalPrice;

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

	public String getOriginalPrice() {
		return this.originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
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
