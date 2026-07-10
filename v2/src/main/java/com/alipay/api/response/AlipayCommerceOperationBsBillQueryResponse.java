package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BsBillDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.bs.bill.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-09 19:27:55
 */
public class AlipayCommerceOperationBsBillQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2356187567778294879L;

	/** 
	 * 账单明细列表
	 */
	@ApiListField("bill_details")
	@ApiField("bs_bill_detail")
	private List<BsBillDetail> billDetails;

	/** 
	 * 下一次查询需要回传的游标。为空表示没有下一页
	 */
	@ApiField("next_cursor")
	private String nextCursor;

	/** 
	 * 满足查询条件的总条数。仅首次查询且 `need_count=true` 时返回
	 */
	@ApiField("total_count")
	private Long totalCount;

	public void setBillDetails(List<BsBillDetail> billDetails) {
		this.billDetails = billDetails;
	}
	public List<BsBillDetail> getBillDetails( ) {
		return this.billDetails;
	}

	public void setNextCursor(String nextCursor) {
		this.nextCursor = nextCursor;
	}
	public String getNextCursor( ) {
		return this.nextCursor;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

}
