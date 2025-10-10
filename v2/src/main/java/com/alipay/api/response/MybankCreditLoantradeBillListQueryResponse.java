package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BillDetailVo;
import com.alipay.api.domain.RefuseVo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.bill.list.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 19:39:07
 */
public class MybankCreditLoantradeBillListQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5666326285251176758L;

	/** 
	 * 账单详细信息
	 */
	@ApiField("bill_detail_list")
	private BillDetailVo billDetailList;

	/** 
	 * 是否有下一页，false表示已经到最后一页了
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前页面条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 不可见不可用信息
	 */
	@ApiField("refuse_msg")
	private RefuseVo refuseMsg;

	/** 
	 * 标识本次请求是否成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setBillDetailList(BillDetailVo billDetailList) {
		this.billDetailList = billDetailList;
	}
	public BillDetailVo getBillDetailList( ) {
		return this.billDetailList;
	}

	public void setHasNextPage(Boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
	public Boolean getHasNextPage( ) {
		return this.hasNextPage;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setRefuseMsg(RefuseVo refuseMsg) {
		this.refuseMsg = refuseMsg;
	}
	public RefuseVo getRefuseMsg( ) {
		return this.refuseMsg;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
