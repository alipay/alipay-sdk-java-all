package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 荣耀银行卡信息
 *
 * @author auto create
 * @since 1.0, 2025-09-01 17:24:39
 */
public class HonorBankCardDTO extends AlipayObject {

	private static final long serialVersionUID = 5212512134235166672L;

	/**
	 * 支付宝绑卡唯一id
	 */
	@ApiField("bank_contract_id")
	private String bankContractId;

	/**
	 * 银行id
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 展示的银行名称缩写
	 */
	@ApiField("inst_name")
	private String instName;

	/**
	 * 展示的脱敏卡号后四位
	 */
	@ApiField("show_card_no")
	private String showCardNo;

	public String getBankContractId() {
		return this.bankContractId;
	}
	public void setBankContractId(String bankContractId) {
		this.bankContractId = bankContractId;
	}

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getInstName() {
		return this.instName;
	}
	public void setInstName(String instName) {
		this.instName = instName;
	}

	public String getShowCardNo() {
		return this.showCardNo;
	}
	public void setShowCardNo(String showCardNo) {
		this.showCardNo = showCardNo;
	}

}
