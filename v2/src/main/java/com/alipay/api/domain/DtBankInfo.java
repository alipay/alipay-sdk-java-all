package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 活动配置银行信息
 *
 * @author auto create
 * @since 1.0, 2024-03-28 14:05:33
 */
public class DtBankInfo extends AlipayObject {

	private static final long serialVersionUID = 1373783298875964696L;

	/**
	 * 活动支持的银行机构列表
	 */
	@ApiListField("bank_inst_info_list")
	@ApiField("dt_bank_inst_info")
	private List<DtBankInstInfo> bankInstInfoList;

	/**
	 * 活动支持的卡bin列表
	 */
	@ApiListField("card_bin_list")
	@ApiField("string")
	private List<String> cardBinList;

	public List<DtBankInstInfo> getBankInstInfoList() {
		return this.bankInstInfoList;
	}
	public void setBankInstInfoList(List<DtBankInstInfo> bankInstInfoList) {
		this.bankInstInfoList = bankInstInfoList;
	}

	public List<String> getCardBinList() {
		return this.cardBinList;
	}
	public void setCardBinList(List<String> cardBinList) {
		this.cardBinList = cardBinList;
	}

}
