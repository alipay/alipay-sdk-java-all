package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 结算单创建
 *
 * @author auto create
 * @since 1.0, 2020-03-26 17:40:50
 */
public class AlipayBossFncSettleSettlementbillCreateModel extends AlipayObject {

	private static final long serialVersionUID = 6699968796575296314L;

	/**
	 * 结算单创建请求列表
	 */
	@ApiListField("settlement_bill_create_order")
	@ApiField("settlement_bill_create_order")
	private List<SettlementBillCreateOrder> settlementBillCreateOrder;

	public List<SettlementBillCreateOrder> getSettlementBillCreateOrder() {
		return this.settlementBillCreateOrder;
	}
	public void setSettlementBillCreateOrder(List<SettlementBillCreateOrder> settlementBillCreateOrder) {
		this.settlementBillCreateOrder = settlementBillCreateOrder;
	}

}
