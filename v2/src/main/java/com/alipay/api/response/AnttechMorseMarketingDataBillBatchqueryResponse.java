package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DataBillResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.morse.marketing.data.bill.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-07 11:56:53
 */
public class AnttechMorseMarketingDataBillBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2162382498261266814L;

	/** 
	 * 查询账单的数据对象列表
	 */
	@ApiListField("bills")
	@ApiField("data_bill_result")
	private List<DataBillResult> bills;

	/** 
	 * 查询结果统计的总条数
	 */
	@ApiField("count")
	private Long count;

	/** 
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/** 
	 * 分页查询当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 查询结果数据中每页几条数据量
	 */
	@ApiField("page_size")
	private Long pageSize;

	public void setBills(List<DataBillResult> bills) {
		this.bills = bills;
	}
	public List<DataBillResult> getBills( ) {
		return this.bills;
	}

	public void setCount(Long count) {
		this.count = count;
	}
	public Long getCount( ) {
		return this.count;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
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

}
