package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BillApiSingleItem;
import com.alipay.api.domain.BillApiStatisticInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.mobilebill.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-03-13 10:42:44
 */
public class AlipayUserMobilebillListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8555966777241479576L;

	/** 
	 * 账单列表查询为空时，返回nu l l
	 */
	@ApiField("bill_list_items")
	private BillApiSingleItem billListItems;

	/** 
	 * 查询出的账单列表，当查询不到账单时，为空
	 */
	@ApiField("statistic_info")
	private BillApiStatisticInfo statisticInfo;

	public void setBillListItems(BillApiSingleItem billListItems) {
		this.billListItems = billListItems;
	}
	public BillApiSingleItem getBillListItems( ) {
		return this.billListItems;
	}

	public void setStatisticInfo(BillApiStatisticInfo statisticInfo) {
		this.statisticInfo = statisticInfo;
	}
	public BillApiStatisticInfo getStatisticInfo( ) {
		return this.statisticInfo;
	}

}
