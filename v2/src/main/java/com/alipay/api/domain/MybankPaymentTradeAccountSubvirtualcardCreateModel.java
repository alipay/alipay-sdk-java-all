package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开立子卡号
 *
 * @author auto create
 * @since 1.0, 2019-03-26 10:40:04
 */
public class MybankPaymentTradeAccountSubvirtualcardCreateModel extends AlipayObject {

	private static final long serialVersionUID = 5473354564248195549L;

	/**
	 * 买家标识
	 */
	@ApiField("member_id")
	private String memberId;

	/**
	 * 卖家主卡户名
	 */
	@ApiField("prim_card_name")
	private String primCardName;

	/**
	 * 卖家主卡号
	 */
	@ApiField("prim_card_no")
	private String primCardNo;

	public String getMemberId() {
		return this.memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getPrimCardName() {
		return this.primCardName;
	}
	public void setPrimCardName(String primCardName) {
		this.primCardName = primCardName;
	}

	public String getPrimCardNo() {
		return this.primCardNo;
	}
	public void setPrimCardNo(String primCardNo) {
		this.primCardNo = primCardNo;
	}

}
