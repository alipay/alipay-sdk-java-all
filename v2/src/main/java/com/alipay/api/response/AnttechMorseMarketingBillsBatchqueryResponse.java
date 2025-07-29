package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BillResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.bills.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-25 15:01:02
 */
public class AnttechMorseMarketingBillsBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5121773727726745413L;

	/** 
	 * 交易账单列表
	 */
	@ApiListField("bills")
	@ApiField("bill_result")
	private List<BillResult> bills;

	/** 
	 * 业务唯一标识，用于双方排查问题
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 查询结果统计的总条数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 分页查询当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	public void setBills(List<BillResult> bills) {
		this.bills = bills;
	}
	public List<BillResult> getBills( ) {
		return this.bills;
	}

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

}
