package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BizFundReportResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.bill.bizfundagent.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-11-20 16:07:17
 */
public class AlipayDataBillBizfundagentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8761791924954293126L;

	/** 
	 * 资金明细记录
	 */
	@ApiListField("detail_list")
	@ApiField("biz_fund_report_result")
	private List<BizFundReportResult> detailList;

	/** 
	 * 分页号，从1开始
	 */
	@ApiField("page_no")
	private String pageNo;

	/** 
	 * 页面大小，最大2000
	 */
	@ApiField("page_size")
	private String pageSize;

	/** 
	 * 数据分页总页数
	 */
	@ApiField("total_size")
	private String totalSize;

	public void setDetailList(List<BizFundReportResult> detailList) {
		this.detailList = detailList;
	}
	public List<BizFundReportResult> getDetailList( ) {
		return this.detailList;
	}

	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getPageNo( ) {
		return this.pageNo;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}
	public String getPageSize( ) {
		return this.pageSize;
	}

	public void setTotalSize(String totalSize) {
		this.totalSize = totalSize;
	}
	public String getTotalSize( ) {
		return this.totalSize;
	}

}
