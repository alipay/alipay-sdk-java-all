package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通信息检测
 *
 * @author auto create
 * @since 1.0, 2025-04-21 10:27:56
 */
public class AntMerchantExpandIndirectZftsettlecardDetectModel extends AlipayObject {

	private static final long serialVersionUID = 3116674342868719341L;

	/**
	 * 卡户名
	 */
	@ApiField("account_holder_name")
	private String accountHolderName;

	/**
	 * 银行卡号
	 */
	@ApiField("account_no")
	private String accountNo;

	/**
	 * 进件生成的卡编号
	 */
	@ApiField("card_alias_no")
	private String cardAliasNo;

	/**
	 * 二级商户支付宝商户号，进件成功后由支付宝返回。
	 */
	@ApiField("smid")
	private String smid;

	public String getAccountHolderName() {
		return this.accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNo() {
		return this.accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getCardAliasNo() {
		return this.cardAliasNo;
	}
	public void setCardAliasNo(String cardAliasNo) {
		this.cardAliasNo = cardAliasNo;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
