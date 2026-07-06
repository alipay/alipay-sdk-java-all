package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ReceiptIdentityInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.receiptidentity.pageinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-11 16:17:56
 */
public class AlipayCommerceEcReceiptidentityPageinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2322311212331854426L;

	/** 
	 * null
	 */
	@ApiListField("identity_list")
	@ApiField("receipt_identity_info")
	private List<ReceiptIdentityInfo> identityList;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小，单位：条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * 总记录条数
	 */
	@ApiField("total_size")
	private Long totalSize;

	public void setIdentityList(List<ReceiptIdentityInfo> identityList) {
		this.identityList = identityList;
	}
	public List<ReceiptIdentityInfo> getIdentityList( ) {
		return this.identityList;
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

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

}
