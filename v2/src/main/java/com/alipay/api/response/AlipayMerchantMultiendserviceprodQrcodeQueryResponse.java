package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QrcodeWhiteList;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.multiendserviceprod.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-27 11:37:28
 */
public class AlipayMerchantMultiendserviceprodQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3388853834556852339L;

	/** 
	 * null
	 */
	@ApiListField("items")
	@ApiField("qrcode_white_list")
	private List<QrcodeWhiteList> items;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 单页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数量，单位：条
	 */
	@ApiField("total")
	private Long total;

	public void setItems(List<QrcodeWhiteList> items) {
		this.items = items;
	}
	public List<QrcodeWhiteList> getItems( ) {
		return this.items;
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

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
