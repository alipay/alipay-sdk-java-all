package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CPAliveBillEntrySet;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cplife.bill.delete response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 17:31:56
 */
public class AlipayEcoCplifeBillDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 5425387942754752138L;

	/** 
	 * 不允许删除（支付中或者支付完成）的账单明细条目列表
	 */
	@ApiListField("alive_bill_entry_list")
	@ApiField("c_p_alive_bill_entry_set")
	private List<CPAliveBillEntrySet> aliveBillEntryList;

	public void setAliveBillEntryList(List<CPAliveBillEntrySet> aliveBillEntryList) {
		this.aliveBillEntryList = aliveBillEntryList;
	}
	public List<CPAliveBillEntrySet> getAliveBillEntryList( ) {
		return this.aliveBillEntryList;
	}

}
