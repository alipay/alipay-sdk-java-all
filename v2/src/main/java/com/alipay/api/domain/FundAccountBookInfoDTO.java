package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 淘客账本信息
 *
 * @author auto create
 * @since 1.0, 2023-06-16 15:24:33
 */
public class FundAccountBookInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5477564219541473197L;

	/**
	 * 账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 账户可用余额，单位元
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 外卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 账本类型，主：MAIN，子账本：SUB
	 */
	@ApiField("type")
	private String type;

	public String getAccountBookId() {
		return this.accountBookId;
	}
	public void setAccountBookId(String accountBookId) {
		this.accountBookId = accountBookId;
	}

	public String getAvailableAmount() {
		return this.availableAmount;
	}
	public void setAvailableAmount(String availableAmount) {
		this.availableAmount = availableAmount;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
