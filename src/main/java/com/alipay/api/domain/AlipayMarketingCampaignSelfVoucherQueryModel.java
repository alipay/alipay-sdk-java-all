package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝商户券信息查询
 *
 * @author auto create
 * @since 1.0, 2021-01-25 11:47:27
 */
public class AlipayMarketingCampaignSelfVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2366572366971271938L;

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
