package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.gas.info.groupcoupon.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-11-25 20:40:14
 */
public class AlipayCommerceGasInfoGroupcouponQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6866182216163295641L;

	/** 
	 * 当前页码,不填写默认查第1页
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页显示数量,不填写默认10条
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总页数
	 */
	@ApiField("total_pages")
	private Long totalPages;

	/** 
	 * 总记录数
	 */
	@ApiField("total_size")
	private Long totalSize;

	/** 
	 * 用户劵信息
	 */
	@ApiListField("voucher_infos")
	@ApiField("voucher_info_v_o")
	private List<VoucherInfoVO> voucherInfos;

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

	public void setTotalPages(Long totalPages) {
		this.totalPages = totalPages;
	}
	public Long getTotalPages( ) {
		return this.totalPages;
	}

	public void setTotalSize(Long totalSize) {
		this.totalSize = totalSize;
	}
	public Long getTotalSize( ) {
		return this.totalSize;
	}

	public void setVoucherInfos(List<VoucherInfoVO> voucherInfos) {
		this.voucherInfos = voucherInfos;
	}
	public List<VoucherInfoVO> getVoucherInfos( ) {
		return this.voucherInfos;
	}

}
