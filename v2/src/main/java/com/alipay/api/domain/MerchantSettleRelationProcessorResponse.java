package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账
 *
 * @author auto create
 * @since 1.0, 2023-10-09 10:01:31
 */
public class MerchantSettleRelationProcessorResponse extends AlipayObject {

	private static final long serialVersionUID = 7491165312767522799L;

	/**
	 * 分账比例
	 */
	@ApiField("rate")
	private String rate;

	/**
	 * 分账接收方账号
	 */
	@ApiField("trans_in_account")
	private String transInAccount;

	/**
	 * 分账接收方ID
	 */
	@ApiField("trans_in_id")
	private String transInId;

	/**
	 * 分账接收方名称
	 */
	@ApiField("trans_in_name")
	private String transInName;

	/**
	 * 分账类型
	 */
	@ApiField("trans_in_type")
	private String transInType;

	/**
	 * 分账出资方账号
	 */
	@ApiField("trans_out_account")
	private String transOutAccount;

	/**
	 * 分账出资方ID
	 */
	@ApiField("trans_out_id")
	private String transOutId;

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

	public String getTransInId() {
		return this.transInId;
	}
	public void setTransInId(String transInId) {
		this.transInId = transInId;
	}

	public String getTransInName() {
		return this.transInName;
	}
	public void setTransInName(String transInName) {
		this.transInName = transInName;
	}

	public String getTransInType() {
		return this.transInType;
	}
	public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

	public String getTransOutAccount() {
		return this.transOutAccount;
	}
	public void setTransOutAccount(String transOutAccount) {
		this.transOutAccount = transOutAccount;
	}

	public String getTransOutId() {
		return this.transOutId;
	}
	public void setTransOutId(String transOutId) {
		this.transOutId = transOutId;
	}

}
