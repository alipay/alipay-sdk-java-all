package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户业务参数。用于透传业务扩展信息。
 *
 * @author auto create
 * @since 1.0, 2026-09-17 22:54:46
 */
public class SaasBusinessParams extends AlipayObject {

	private static final long serialVersionUID = 6316648414617296418L;

	/**
	 * 校园卡编号
	 */
	@ApiField("campus_card")
	private String campusCard;

	/**
	 * 银行的英文简称/缩写. 主要用于网银支付单通场景, 通过此字段指定付款行. 可用的付款行可通过alipay.trade.saas.ebank.consult接口查询获取. 不指定, 返回的链接不会自动跳转支付, 需要用户页面选择唯一付款行后提交支付.
	 */
	@ApiField("saas_ebank_bank_code")
	private String saasEbankBankCode;

	public String getCampusCard() {
		return this.campusCard;
	}
	public void setCampusCard(String campusCard) {
		this.campusCard = campusCard;
	}

	public String getSaasEbankBankCode() {
		return this.saasEbankBankCode;
	}
	public void setSaasEbankBankCode(String saasEbankBankCode) {
		this.saasEbankBankCode = saasEbankBankCode;
	}

}
