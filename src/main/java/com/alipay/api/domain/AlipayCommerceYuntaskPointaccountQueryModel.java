package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 导购员查询积分余额
 *
 * @author auto create
 * @since 1.0, 2022-03-25 10:51:51
 */
public class AlipayCommerceYuntaskPointaccountQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4381926592952782343L;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 商家id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

}
