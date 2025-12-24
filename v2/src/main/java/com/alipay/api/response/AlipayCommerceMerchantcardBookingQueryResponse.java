package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AxfBookingInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.booking.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:43
 */
public class AlipayCommerceMerchantcardBookingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8343685621786915722L;

	/** 
	 * null
	 */
	@ApiListField("booking_infos")
	@ApiField("axf_booking_info")
	private List<AxfBookingInfo> bookingInfos;

	/** 
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/** 
	 * 每页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setBookingInfos(List<AxfBookingInfo> bookingInfos) {
		this.bookingInfos = bookingInfos;
	}
	public List<AxfBookingInfo> getBookingInfos( ) {
		return this.bookingInfos;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo( ) {
		return this.pageNo;
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
