package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 云店记账本数据
 *
 * @author auto create
 * @since 1.0, 2022-12-14 11:15:39
 */
public class FundAccountBookInfo extends AlipayObject {

	private static final long serialVersionUID = 7636366418563594321L;

	/**
	 * 记账本id
	 */
	@ApiField("account_book_id")
	private String accountBookId;

	/**
	 * 可用余额
	 */
	@ApiField("available_amount")
	private String availableAmount;

	/**
	 * 记账本的外卡卡号
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 记账本类型
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
