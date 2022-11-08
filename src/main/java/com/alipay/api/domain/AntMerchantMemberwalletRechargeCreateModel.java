package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员钱包充值预下单
 *
 * @author auto create
 * @since 1.0, 2022-05-20 16:07:33
 */
public class AntMerchantMemberwalletRechargeCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8524136758444585811L;

	/**
	 * 充值权益金（单位：元）
	 */
	@ApiField("benefit_amount")
	private String benefitAmount;

	/**
	 * 充值权益金有效期
<br>格式：yyyy-MM-dd
	 */
	@ApiField("benefit_validate_date")
	private Date benefitValidateDate;

	/**
	 * 会员钱包产品ID
	 */
	@ApiField("member_wallet_id")
	private String memberWalletId;

	/**
	 * 外部交易唯一流水号
	 */
	@ApiField("out_trade_no")
	private String outTradeNo;

	/**
	 * 充值本金（单位：元）
	 */
	@ApiField("principal_amount")
	private String principalAmount;

	/**
	 * 充值金额有效期
<br>格式：yyyy-MM-dd
	 */
	@ApiField("validate_date")
	private Date validateDate;

	/**
	 * 会员钱包账户ID
	 */
	@ApiField("wallet_id")
	private String walletId;

	public String getBenefitAmount() {
		return this.benefitAmount;
	}
	public void setBenefitAmount(String benefitAmount) {
		this.benefitAmount = benefitAmount;
	}

	public Date getBenefitValidateDate() {
		return this.benefitValidateDate;
	}
	public void setBenefitValidateDate(Date benefitValidateDate) {
		this.benefitValidateDate = benefitValidateDate;
	}

	public String getMemberWalletId() {
		return this.memberWalletId;
	}
	public void setMemberWalletId(String memberWalletId) {
		this.memberWalletId = memberWalletId;
	}

	public String getOutTradeNo() {
		return this.outTradeNo;
	}
	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getPrincipalAmount() {
		return this.principalAmount;
	}
	public void setPrincipalAmount(String principalAmount) {
		this.principalAmount = principalAmount;
	}

	public Date getValidateDate() {
		return this.validateDate;
	}
	public void setValidateDate(Date validateDate) {
		this.validateDate = validateDate;
	}

	public String getWalletId() {
		return this.walletId;
	}
	public void setWalletId(String walletId) {
		this.walletId = walletId;
	}

}
