package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量账单号查询月账单客户视图
 *
 * @author auto create
 * @since 1.0, 2020-01-08 14:37:01
 */
public class AlipayBossFncApbillBillcustviewBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8495178139679532233L;

	/**
	 * 月账单号列表
	 */
	@ApiListField("bill_nos")
	@ApiField("string")
	private List<String> billNos;

	public List<String> getBillNos() {
		return this.billNos;
	}
	public void setBillNos(List<String> billNos) {
		this.billNos = billNos;
	}

}
