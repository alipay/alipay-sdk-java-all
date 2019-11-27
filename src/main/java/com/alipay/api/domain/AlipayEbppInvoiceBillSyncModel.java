package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 发票交易同步
 *
 * @author auto create
 * @since 1.0, 2019-09-16 17:39:57
 */
public class AlipayEbppInvoiceBillSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6664352778564327876L;

	/**
	 * 发起平台
	 */
	@ApiField("platform")
	private String platform;

	public String getPlatform() {
		return this.platform;
	}
	public void setPlatform(String platform) {
		this.platform = platform;
	}

}
