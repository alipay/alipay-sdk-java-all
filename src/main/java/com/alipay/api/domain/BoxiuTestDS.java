package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 授权数据字段管控测试多级复杂对象
 *
 * @author auto create
 * @since 1.0, 2017-04-25 10:25:25
 */
public class BoxiuTestDS extends AlipayObject {

	private static final long serialVersionUID = 8727283372746817385L;

	/**
	 * 收货人地址列表
	 */
	@ApiField("deliver_address")
	private DeliverAddress deliverAddress;

	/**
	 * 资金渠道
	 */
	@ApiListField("fund_bill_list")
	@ApiField("trade_fund_bill")
	private List<TradeFundBill> fundBillList;

	/**
	 * ceshi
	 */
	@ApiField("out_no")
	private String outNo;

	public DeliverAddress getDeliverAddress() {
		return this.deliverAddress;
	}
	public void setDeliverAddress(DeliverAddress deliverAddress) {
		this.deliverAddress = deliverAddress;
	}

	public List<TradeFundBill> getFundBillList() {
		return this.fundBillList;
	}
	public void setFundBillList(List<TradeFundBill> fundBillList) {
		this.fundBillList = fundBillList;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

}
