package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LocalSettleBillItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.orderbill.localsettle.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-31 09:47:04
 */
public class AlipayOpenMiniOrderbillLocalsettleBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3622326818717513963L;

	/** 
	 * 账单明细列表
	 */
	@ApiListField("bill_list")
	@ApiField("local_settle_bill_item")
	private List<LocalSettleBillItem> billList;

	/** 
	 * 当前分页大小，单位：条目数。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 分页标识，没有下一页时返回空
	 */
	@ApiField("page_token")
	private String pageToken;

	public void setBillList(List<LocalSettleBillItem> billList) {
		this.billList = billList;
	}
	public List<LocalSettleBillItem> getBillList( ) {
		return this.billList;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setPageToken(String pageToken) {
		this.pageToken = pageToken;
	}
	public String getPageToken( ) {
		return this.pageToken;
	}

}
