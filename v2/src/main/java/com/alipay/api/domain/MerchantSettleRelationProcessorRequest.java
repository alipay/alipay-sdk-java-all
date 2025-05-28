package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家的分账关系
 *
 * @author auto create
 * @since 1.0, 2023-10-10 10:04:24
 */
public class MerchantSettleRelationProcessorRequest extends AlipayObject {

	private static final long serialVersionUID = 4723862795563977548L;

	/**
	 * 分账比例，范围在0-30之间，可包含小数点后两位
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 分账接收方账号
	 */
	@ApiField("trans_in_account")
	private String transInAccount;

	/**
	 * 分账接收方名称
	 */
	@ApiField("trans_in_name")
	private String transInName;

	public String getRate() {
		return this.rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}

	public String getTransInAccount() {
		return this.transInAccount;
	}
	public void setTransInAccount(String transInAccount) {
		this.transInAccount = transInAccount;
	}

	public String getTransInName() {
		return this.transInName;
	}
	public void setTransInName(String transInName) {
		this.transInName = transInName;
	}

}
