package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 行业代扣合约版签约
 *
 * @author auto create
 * @since 1.0, 2022-12-20 12:12:40
 */
public class AlipayEbppInstserviceContractdeductSignModel extends AlipayObject {

	private static final long serialVersionUID = 5136169168565497775L;

	/**
	 * 用户户号
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 支付宝用户的openId
	 */
	@ApiField("open_id")
	private String openId;

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

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
