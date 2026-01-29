package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LifeServiceBookingInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.lifeservice.booking.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-28 16:47:42
 */
public class AlipayCommerceLifeserviceBookingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8828231254684149347L;

	/** 
	 * null
	 */
	@ApiListField("booking_infos")
	@ApiField("life_service_booking_info")
	private List<LifeServiceBookingInfo> bookingInfos;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

	public void setBookingInfos(List<LifeServiceBookingInfo> bookingInfos) {
		this.bookingInfos = bookingInfos;
	}
	public List<LifeServiceBookingInfo> getBookingInfos( ) {
		return this.bookingInfos;
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
