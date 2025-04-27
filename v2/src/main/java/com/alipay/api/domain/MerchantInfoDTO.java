package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外部权益同步，商户模型
 *
 * @author auto create
 * @since 1.0, 2023-07-10 20:17:41
 */
public class MerchantInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 6721515848958212449L;

	/**
	 * 品牌id（统一权益池的品牌id）
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * mcc编码
	 */
	@ApiField("mcc")
	private String mcc;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getMcc() {
		return this.mcc;
	}
	public void setMcc(String mcc) {
		this.mcc = mcc;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

}
