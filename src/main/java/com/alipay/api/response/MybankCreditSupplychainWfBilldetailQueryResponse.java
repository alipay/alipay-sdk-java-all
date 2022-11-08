package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BillDetailResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.billdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-18 15:16:58
 */
public class MybankCreditSupplychainWfBilldetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7432847791497798346L;

	/** 
	 * 账单明细集合
	 */
	@ApiListField("billdetailresultlist")
	@ApiField("bill_detail_result")
	private List<BillDetailResult> billdetailresultlist;

	/** 
	 * 当前页码1
	 */
	@ApiField("pageindex")
	private Long pageindex;

	/** 
	 * 每页数量
	 */
	@ApiField("pagesize")
	private Long pagesize;

	/** 
	 * 总数量
	 */
	@ApiField("totalnums")
	private Long totalnums;

	public void setBilldetailresultlist(List<BillDetailResult> billdetailresultlist) {
		this.billdetailresultlist = billdetailresultlist;
	}
	public List<BillDetailResult> getBilldetailresultlist( ) {
		return this.billdetailresultlist;
	}

	public void setPageindex(Long pageindex) {
		this.pageindex = pageindex;
	}
	public Long getPageindex( ) {
		return this.pageindex;
	}

	public void setPagesize(Long pagesize) {
		this.pagesize = pagesize;
	}
	public Long getPagesize( ) {
		return this.pagesize;
	}

	public void setTotalnums(Long totalnums) {
		this.totalnums = totalnums;
	}
	public Long getTotalnums( ) {
		return this.totalnums;
	}

}
