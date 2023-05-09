package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 账单同步
 *
 * @author auto create
 * @since 1.0, 2017-11-08 10:54:24
 */
public class AlipayEcoRenthouseBillOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6572361465478664926L;

	/**
	 * 账单条数1-50范围内，账单条数和账单明细数量必须一致
	 */
	@ApiField("bill_number")
	private String billNumber;

	/**
	 * 账单条数1-50范围内
	 */
	@ApiListField("bills")
	@ApiField("alipay_eco_renthouse_bill")
	private List<AlipayEcoRenthouseBill> bills;

	/**
	 * ka请求的唯一标志，长度64位以内字符串，仅限字母数字下划线组合。该标识作为业务调用的唯一标识，ka要保证其业务唯一性
	 */
	@ApiField("trade_id")
	private String tradeId;

	public String getBillNumber() {
		return this.billNumber;
	}
	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public List<AlipayEcoRenthouseBill> getBills() {
		return this.bills;
	}
	public void setBills(List<AlipayEcoRenthouseBill> bills) {
		this.bills = bills;
	}

	public String getTradeId() {
		return this.tradeId;
	}
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

}
