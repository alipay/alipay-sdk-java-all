package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BillInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.iotbpaas.lavidabilllist.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-04-08 19:00:19
 */
public class AlipayOpenIotbpaasLavidabilllistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8319576539387668249L;

	/** 
	 * 账单数量
	 */
	@ApiField("bill_count")
	private Long billCount;

	/** 
	 * 账单列表
	 */
	@ApiListField("bill_list")
	@ApiField("bill_info")
	private List<BillInfo> billList;

	public void setBillCount(Long billCount) {
		this.billCount = billCount;
	}
	public Long getBillCount( ) {
		return this.billCount;
	}

	public void setBillList(List<BillInfo> billList) {
		this.billList = billList;
	}
	public List<BillInfo> getBillList( ) {
		return this.billList;
	}

}
