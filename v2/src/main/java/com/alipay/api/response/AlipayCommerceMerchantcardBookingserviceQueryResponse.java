package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AxfBookingServiceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.bookingservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-01-12 15:05:26
 */
public class AlipayCommerceMerchantcardBookingserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1439152994788923144L;

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
	 * null
	 */
	@ApiListField("service_infos")
	@ApiField("axf_booking_service_info")
	private List<AxfBookingServiceInfo> serviceInfos;

	/** 
	 * 总数
	 */
	@ApiField("total")
	private Long total;

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

	public void setServiceInfos(List<AxfBookingServiceInfo> serviceInfos) {
		this.serviceInfos = serviceInfos;
	}
	public List<AxfBookingServiceInfo> getServiceInfos( ) {
		return this.serviceInfos;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
