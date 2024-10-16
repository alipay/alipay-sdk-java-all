package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.bill.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2019-08-02 19:45:07
 */
public class AlipayEcoRenthouseBillOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2388119693279823761L;

	/** 
	 * billNo-账单编号
status-1:成功
	 */
	@ApiListField("result_bill_list")
	@ApiField("string")
	private List<String> resultBillList;

	public void setResultBillList(List<String> resultBillList) {
		this.resultBillList = resultBillList;
	}
	public List<String> getResultBillList( ) {
		return this.resultBillList;
	}

}
