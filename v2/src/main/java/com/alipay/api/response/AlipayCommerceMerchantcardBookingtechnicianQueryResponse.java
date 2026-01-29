package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AxfBookingTechnicianInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.merchantcard.bookingtechnician.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-12-03 10:27:42
 */
public class AlipayCommerceMerchantcardBookingtechnicianQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5351447236477458837L;

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
	@ApiListField("technician_infos")
	@ApiField("axf_booking_technician_info")
	private List<AxfBookingTechnicianInfo> technicianInfos;

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

	public void setTechnicianInfos(List<AxfBookingTechnicianInfo> technicianInfos) {
		this.technicianInfos = technicianInfos;
	}
	public List<AxfBookingTechnicianInfo> getTechnicianInfos( ) {
		return this.technicianInfos;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
