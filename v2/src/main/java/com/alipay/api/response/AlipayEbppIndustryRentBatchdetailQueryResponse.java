package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentPayQueryBillDetailListResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.industry.rent.batchdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-19 22:32:24
 */
public class AlipayEbppIndustryRentBatchdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2344512788993588375L;

	/** 
	 * 对账单列表
	 */
	@ApiListField("bill_detail_list")
	@ApiField("rent_pay_query_bill_detail_list_response")
	private List<RentPayQueryBillDetailListResponse> billDetailList;

	/** 
	 * 对账单当前页数
	 */
	@ApiField("page_num")
	private String pageNum;

	/** 
	 * 对账单当前页记录数
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 总记录数
	 */
	@ApiField("total_count")
	private String totalCount;

	/** 
	 * 对账单总页数
	 */
	@ApiField("total_page")
	private String totalPage;

	public void setBillDetailList(List<RentPayQueryBillDetailListResponse> billDetailList) {
		this.billDetailList = billDetailList;
	}
	public List<RentPayQueryBillDetailListResponse> getBillDetailList( ) {
		return this.billDetailList;
	}

	public void setPageNum(String pageNum) {
		this.pageNum = pageNum;
	}
	public String getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPage(String totalPage) {
		this.totalPage = totalPage;
	}
	public String getTotalPage( ) {
		return this.totalPage;
	}

}
