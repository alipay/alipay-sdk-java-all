package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 凭证核销准备
 *
 * @author auto create
 * @since 1.0, 2024-04-03 15:47:16
 */
public class AlipayMarketingCertificateCertificationPrepareuseModel extends AlipayObject {

	private static final long serialVersionUID = 1347772811686151338L;

	/**
	 * 用户出示的核销二维码下方的12位券码
	 */
	@ApiField("code")
	private String code;

	/**
	 * 是否启用跨单核销。 该值默认为false
用户多次下单购买相同商品，当cross_order为true时，传入任一订单二维码信息可以获取用户多次购买该商品的所有有效券码信息。
	 */
	@ApiField("cross_order")
	private Boolean crossOrder;

	/**
	 * 根据用户出示的核销二维码解析出来的标识
	 */
	@ApiField("encrypted_data")
	private String encryptedData;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getCrossOrder() {
		return this.crossOrder;
	}
	public void setCrossOrder(Boolean crossOrder) {
		this.crossOrder = crossOrder;
	}

	public String getEncryptedData() {
		return this.encryptedData;
	}
	public void setEncryptedData(String encryptedData) {
		this.encryptedData = encryptedData;
	}

}
