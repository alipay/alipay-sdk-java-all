package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 直付通结算信息解绑
 *
 * @author auto create
 * @since 1.0, 2023-12-28 14:59:40
 */
public class AntMerchantExpandZftSettlementUnbindModel extends AlipayObject {

	private static final long serialVersionUID = 5564331812166889544L;

	/**
	 * 结算支付宝账号（与进件生成的卡编号二选其一）
	 */
	@ApiField("alipay_logon_id")
	private String alipayLogonId;

	/**
	 * 进件生成的卡编号（与结算支付宝账号二选其一）
	 */
	@ApiField("card_alias_no")
	private String cardAliasNo;

	/**
	 * 二级商户ID
	 */
	@ApiField("smid")
	private String smid;

	public String getAlipayLogonId() {
		return this.alipayLogonId;
	}
	public void setAlipayLogonId(String alipayLogonId) {
		this.alipayLogonId = alipayLogonId;
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
