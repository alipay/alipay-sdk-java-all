package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 留学缴费VCC代付单payment信息
 *
 * @author auto create
 * @since 1.0, 2023-06-29 15:26:31
 */
public class TuitionISVPoboPaymentInfo extends AlipayObject {

	private static final long serialVersionUID = 7619648669895153814L;

	/**
	 * amount+留学VCC场景
	 */
	@ApiField("amount")
	private TuitionMoneyDTO amount;

	/**
	 * 卡品牌+留学VCC场景
	 */
	@ApiField("card_brand")
	private String cardBrand;

	/**
	 * 卡过期时间+留学缴费VCC场景
	 */
	@ApiField("card_expiry_date")
	private String cardExpiryDate;

	/**
	 * 持卡人地址+留学缴费VCC
	 */
	@ApiField("card_holder_address")
	private TuitionAddress cardHolderAddress;

	/**
	 * 持卡人姓名+留学缴费VCC场景
	 */
	@ApiField("card_holder_name")
	private String cardHolderName;

	/**
	 * VCC卡号+留学缴费VCC
	 */
	@ApiField("card_no")
	private String cardNo;

	/**
	 * 卡生效时间+留学缴费VCC场景
	 */
	@ApiField("card_start_date")
	private String cardStartDate;

	/**
	 * cvv+留学缴费VCC场景
	 */
	@ApiField("cvv")
	private String cvv;

	public TuitionMoneyDTO getAmount() {
		return this.amount;
	}
	public void setAmount(TuitionMoneyDTO amount) {
		this.amount = amount;
	}

	public String getCardBrand() {
		return this.cardBrand;
	}
	public void setCardBrand(String cardBrand) {
		this.cardBrand = cardBrand;
	}

	public String getCardExpiryDate() {
		return this.cardExpiryDate;
	}
	public void setCardExpiryDate(String cardExpiryDate) {
		this.cardExpiryDate = cardExpiryDate;
	}

	public TuitionAddress getCardHolderAddress() {
		return this.cardHolderAddress;
	}
	public void setCardHolderAddress(TuitionAddress cardHolderAddress) {
		this.cardHolderAddress = cardHolderAddress;
	}

	public String getCardHolderName() {
		return this.cardHolderName;
	}
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public String getCardNo() {
		return this.cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCardStartDate() {
		return this.cardStartDate;
	}
	public void setCardStartDate(String cardStartDate) {
		this.cardStartDate = cardStartDate;
	}

	public String getCvv() {
		return this.cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

}
