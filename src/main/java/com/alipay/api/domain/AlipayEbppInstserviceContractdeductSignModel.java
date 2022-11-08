package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业代扣合约版签约
 *
 * @author auto create
 * @since 1.0, 2022-10-12 16:31:41
 */
public class AlipayEbppInstserviceContractdeductSignModel extends AlipayObject {

	private static final long serialVersionUID = 8717746487863211242L;

	/**
	 * 用户户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
