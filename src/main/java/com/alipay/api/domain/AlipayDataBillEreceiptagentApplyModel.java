package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * ISV代理商户申请电子回单
 *
 * @author auto create
 * @since 1.0, 2021-08-13 16:37:20
 */
public class AlipayDataBillEreceiptagentApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6347758156233944633L;

	/**
	 * ISV与商户签约授权协议号
	 */
	@ApiField("agreement_no")
	private String agreementNo;

	/**
	 * 根据不同业务类型，传入不同参数。格式如下： * FUND_DETAIL - 资金业务回单。传入资金单号(fundOrderId，可通过充值、转账、提现接口获取)
	 */
	@ApiField("key")
	private String key;

	/**
	 * 申请的类型（目前仅支持资金业务回单）。可传入： * FUND_DETAIL - 资金业务回单。
	 */
	@ApiField("type")
	private String type;

	public String getAgreementNo() {
		return this.agreementNo;
	}
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}

	public String getKey() {
		return this.key;
	}
	public void setKey(String key) {
		this.key = key;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
