package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 任务列表
 *
 * @author auto create
 * @since 1.0, 2023-08-23 12:46:04
 */
public class AlipayCommerceWaterTaskBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7622548174571744936L;

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
