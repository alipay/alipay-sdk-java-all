package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TaxRefundDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.tax.order.list.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-11-22 14:34:54
 */
public class AlipayOverseasTaxOrderListBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1455429279378189974L;

	/** 
	 * 每页的退税记录
	 */
	@ApiListField("detail_data")
	@ApiField("tax_refund_detail")
	private List<TaxRefundDetail> detailData;

	/** 
	 * 是否还有下一页
	 */
	@ApiField("has_next_page")
	private Boolean hasNextPage;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	public void setDetailData(List<TaxRefundDetail> detailData) {
		this.detailData = detailData;
	}
	public List<TaxRefundDetail> getDetailData( ) {
		return this.detailData;
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

}
