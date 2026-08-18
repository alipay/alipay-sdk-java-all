package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MerchantCardTemplatePriceItem;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.templateprice.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-31 11:12:49
 */
public class AlipayCommerceMerchantcardTemplatepriceBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1468687362766992774L;

	/** 
	 * null
	 */
	@ApiListField("content")
	@ApiField("merchant_card_template_price_item")
	private List<MerchantCardTemplatePriceItem> content;

	/** 
	 * 当前页码。
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数量。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 符合条件的价格明细总数。
	 */
	@ApiField("total_count")
	private Long totalCount;

	/** 
	 * 符合条件的总页数。
	 */
	@ApiField("total_page")
	private Long totalPage;

	public void setContent(List<MerchantCardTemplatePriceItem> content) {
		this.content = content;
	}
	public List<MerchantCardTemplatePriceItem> getContent( ) {
		return this.content;
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

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}
	public Long getTotalCount( ) {
		return this.totalCount;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalPage( ) {
		return this.totalPage;
	}

}
