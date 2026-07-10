package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherInfoResponse;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.employee.voucher.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-06-15 15:37:55
 */
public class AlipayCommerceEcEmployeeVoucherQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2462592421367235224L;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页数据量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

	/** 
	 * 券列表
	 */
	@ApiField("voucher_info_list")
	private VoucherInfoResponse voucherInfoList;

	/** 
	 * 券列表
	 */
	@ApiListField("voucher_info_response_list")
	@ApiField("voucher_info_response")
	private List<VoucherInfoResponse> voucherInfoResponseList;

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

	public void setTotalPageCount(Long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public Long getTotalPageCount( ) {
		return this.totalPageCount;
	}

	public void setVoucherInfoList(VoucherInfoResponse voucherInfoList) {
		this.voucherInfoList = voucherInfoList;
	}
	public VoucherInfoResponse getVoucherInfoList( ) {
		return this.voucherInfoList;
	}

	public void setVoucherInfoResponseList(List<VoucherInfoResponse> voucherInfoResponseList) {
		this.voucherInfoResponseList = voucherInfoResponseList;
	}
	public List<VoucherInfoResponse> getVoucherInfoResponseList( ) {
		return this.voucherInfoResponseList;
	}

}
