package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 储值卡充值的卡bin规则：新增或修改
 *
 * @author auto create
 * @since 1.0, 2021-04-21 15:06:42
 */
public class AlipayMerchantPayforprivilegeCardbinactivityCreateormodifyModel extends AlipayObject {

	private static final long serialVersionUID = 3166822797716152421L;

	/**
	 * 银行的标准缩写，大写。例如工行为ICBC、农行为ABC
	 */
	@ApiField("bank_code")
	private String bankCode;

	/**
	 * 规则中配置的银行卡卡bin。目前限制长度是6~8
	 */
	@ApiField("card_bin")
	private String cardBin;

	/**
	 * 卡bin规则的外部活动唯一编号，联合对应商家的pid作为唯一键
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getBankCode() {
		return this.bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCardBin() {
		return this.cardBin;
	}
	public void setCardBin(String cardBin) {
		this.cardBin = cardBin;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
