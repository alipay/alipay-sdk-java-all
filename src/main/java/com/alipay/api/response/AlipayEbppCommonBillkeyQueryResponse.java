package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EbppBillKey;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.common.billkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:43:55
 */
public class AlipayEbppCommonBillkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4169532942532276635L;

	/** 
	 * 户号列表
	 */
	@ApiListField("bill_key_list")
	@ApiField("ebpp_bill_key")
	private List<EbppBillKey> billKeyList;

	public void setBillKeyList(List<EbppBillKey> billKeyList) {
		this.billKeyList = billKeyList;
	}
	public List<EbppBillKey> getBillKeyList( ) {
		return this.billKeyList;
	}

}
