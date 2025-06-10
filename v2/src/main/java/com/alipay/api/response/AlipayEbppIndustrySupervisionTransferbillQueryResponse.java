package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupervisionOrderTransferBillInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.supervision.transferbill.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-06-12 10:07:04
 */
public class AlipayEbppIndustrySupervisionTransferbillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8635118813434171265L;

	/** 
	 * 资金划拨账单列表
	 */
	@ApiListField("transfer_bill_list")
	@ApiField("supervision_order_transfer_bill_info")
	private List<SupervisionOrderTransferBillInfo> transferBillList;

	public void setTransferBillList(List<SupervisionOrderTransferBillInfo> transferBillList) {
		this.transferBillList = transferBillList;
	}
	public List<SupervisionOrderTransferBillInfo> getTransferBillList( ) {
		return this.transferBillList;
	}

}
