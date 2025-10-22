package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 关闭微信开通
 *
 * @author auto create
 * @since 1.0, 2025-04-08 16:22:15
 */
public class AlipayOfflineSmddShopWechatApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6158725678917638123L;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 操作类型，OPEN：开通，CLOSE：关闭
	 */
	@ApiField("operation_type")
	private String operationType;

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

}
