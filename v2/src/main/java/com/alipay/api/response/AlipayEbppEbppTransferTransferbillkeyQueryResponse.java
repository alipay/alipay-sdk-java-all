package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TransferBillkey;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.ebpp.transfer.transferbillkey.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-10-08 14:27:56
 */
public class AlipayEbppEbppTransferTransferbillkeyQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4323374968685732357L;

	/** 
	 * 转供户号信息集合
	 */
	@ApiListField("transfer_billkey_list")
	@ApiField("transfer_billkey")
	private List<TransferBillkey> transferBillkeyList;

	public void setTransferBillkeyList(List<TransferBillkey> transferBillkeyList) {
		this.transferBillkeyList = transferBillkeyList;
	}
	public List<TransferBillkey> getTransferBillkeyList( ) {
		return this.transferBillkeyList;
	}

}
