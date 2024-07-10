package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 银行机构信息
 *
 * @author auto create
 * @since 1.0, 2024-03-28 14:05:33
 */
public class DtBankInstInfo extends AlipayObject {

	private static final long serialVersionUID = 4825738359218978655L;

	/**
	 * 活动支持的银行卡类型，["CREDIT"]表示支持信用卡，["DEBIT"]表示支持借记卡，["CREDIT","DEBIT"]表示两种卡均支持。
	 */
	@ApiListField("bank_card_type_list")
	@ApiField("string")
	private List<String> bankCardTypeList;

	/**
	 * 活动支持的银行名称。取值为“所有银行”表示活动支持所有银行。
	 */
	@ApiField("bank_name")
	private String bankName;

	public List<String> getBankCardTypeList() {
		return this.bankCardTypeList;
	}
	public void setBankCardTypeList(List<String> bankCardTypeList) {
		this.bankCardTypeList = bankCardTypeList;
	}

	public String getBankName() {
		return this.bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}
