package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 外部营销账号
 *
 * @author auto create
 * @since 1.0, 2023-12-04 14:40:11
 */
public class OutMktAccount extends AlipayObject {

	private static final long serialVersionUID = 2144864366914232843L;

	/**
	 * 营销账号id
	 */
	@ApiField("mkt_owner_id")
	private String mktOwnerId;

	/**
	 * 营销账号名
	 */
	@ApiField("mkt_owner_name")
	private String mktOwnerName;

	/**
	 * 外部操作员列表
	 */
	@ApiListField("out_operators")
	@ApiField("out_operator")
	private List<OutOperator> outOperators;

	/**
	 * 支付账号id
	 */
	@ApiField("payment_owner_id")
	private String paymentOwnerId;

	/**
	 * 支付账号名
	 */
	@ApiField("payment_owner_name")
	private String paymentOwnerName;

	public String getMktOwnerId() {
		return this.mktOwnerId;
	}
	public void setMktOwnerId(String mktOwnerId) {
		this.mktOwnerId = mktOwnerId;
	}

	public String getMktOwnerName() {
		return this.mktOwnerName;
	}
	public void setMktOwnerName(String mktOwnerName) {
		this.mktOwnerName = mktOwnerName;
	}

	public List<OutOperator> getOutOperators() {
		return this.outOperators;
	}
	public void setOutOperators(List<OutOperator> outOperators) {
		this.outOperators = outOperators;
	}

	public String getPaymentOwnerId() {
		return this.paymentOwnerId;
	}
	public void setPaymentOwnerId(String paymentOwnerId) {
		this.paymentOwnerId = paymentOwnerId;
	}

	public String getPaymentOwnerName() {
		return this.paymentOwnerName;
	}
	public void setPaymentOwnerName(String paymentOwnerName) {
		this.paymentOwnerName = paymentOwnerName;
	}

}
