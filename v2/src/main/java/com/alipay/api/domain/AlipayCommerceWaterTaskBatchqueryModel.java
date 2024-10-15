package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务列表
 *
 * @author auto create
 * @since 1.0, 2024-02-27 09:52:54
 */
public class AlipayCommerceWaterTaskBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6344954812164961547L;

	/**
	 * 商户pid
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

}
