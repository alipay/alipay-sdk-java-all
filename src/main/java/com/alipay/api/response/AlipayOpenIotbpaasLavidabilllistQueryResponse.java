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
 * @since 1.0, 2021-09-16 11:44:27
 */
public class AlipayOpenIotbpaasLavidabilllistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5437454226562961927L;

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
