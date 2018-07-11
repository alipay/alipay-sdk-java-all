package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻企业免押额度申请
 *
 * @author auto create
 * @since 1.0, 2018-03-16 13:47:50
 */
public class ZhimaCreditEpFreedepositApplyModel extends AlipayObject {

	private static final long serialVersionUID = 7716472316941843367L;

	/**
	 * 商户业务流水号，由商户生成，每次业务唯一。
	 */
	@ApiField("merchant_order_no")
	private String merchantOrderNo;

	/**
	 * 完成免押额度业务之后，回跳商户地址。如果没有传入，使用配置的默认地址。
	 */
	@ApiField("merchant_url")
	private String merchantUrl;

	/**
	 * 业务流水号，由芝麻生成，每次业务保证唯一。
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}
	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}

	public String getMerchantUrl() {
		return this.merchantUrl;
	}
	public void setMerchantUrl(String merchantUrl) {
		this.merchantUrl = merchantUrl;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
