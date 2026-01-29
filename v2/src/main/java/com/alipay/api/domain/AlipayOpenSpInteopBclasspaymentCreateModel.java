package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务商代开通B类支付连锁通解决方案
 *
 * @author auto create
 * @since 1.0, 2026-01-23 09:52:43
 */
public class AlipayOpenSpInteopBclasspaymentCreateModel extends AlipayObject {

	private static final long serialVersionUID = 4129746766545216888L;

	/**
	 * 银行卡信息
	 */
	@ApiField("bank_card_info")
	private BClassPaymentBankCardInfo bankCardInfo;

	/**
	 * 商家联系方式
	 */
	@ApiField("contact_info")
	private BClassPaymentContactInfo contactInfo;

	/**
	 * 一体化作业开通主单号，单号为服务商一体化作业主单创建返回值。
	 */
	@ApiField("inteop_order_no")
	private String inteopOrderNo;

	/**
	 * 商家经营类目编码。参见 <a href="https://opendocs.alipay.com/common/02khjv">商家经营类目2.0</a> 中的“一级类目code_二级类目code”。
	 */
	@ApiField("mcc_code")
	private String mccCode;

	/**
	 * 小程序appId
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	public BClassPaymentBankCardInfo getBankCardInfo() {
		return this.bankCardInfo;
	}
	public void setBankCardInfo(BClassPaymentBankCardInfo bankCardInfo) {
		this.bankCardInfo = bankCardInfo;
	}

	public BClassPaymentContactInfo getContactInfo() {
		return this.contactInfo;
	}
	public void setContactInfo(BClassPaymentContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getInteopOrderNo() {
		return this.inteopOrderNo;
	}
	public void setInteopOrderNo(String inteopOrderNo) {
		this.inteopOrderNo = inteopOrderNo;
	}

	public String getMccCode() {
		return this.mccCode;
	}
	public void setMccCode(String mccCode) {
		this.mccCode = mccCode;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

}
