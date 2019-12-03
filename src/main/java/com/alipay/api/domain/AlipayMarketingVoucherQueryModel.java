package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券查询
 *
 * @author auto create
 * @since 1.0, 2019-03-11 14:28:39
 */
public class AlipayMarketingVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4425467334365616281L;

	/**
	 * 券ID(券唯一标识, 发券接口返回参数)
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
