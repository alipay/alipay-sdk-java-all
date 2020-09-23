package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商户券信息查询
 *
 * @author auto create
 * @since 1.0, 2020-09-11 22:07:45
 */
public class AlipayMarketingCampaignSelfVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6222461416356812636L;

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
