package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.HotelStatusInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.asiangames.hotelstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-05-19 20:21:41
 */
public class AlipayCommerceAsiangamesHotelstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1638893194895361943L;

	/** 
	 * 列表展示
	 */
	@ApiListField("hotel_status_list")
	@ApiField("hotel_status_info")
	private List<HotelStatusInfo> hotelStatusList;

	/** 
	 * 当前页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 返回页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 查询出来的总数
	 */
	@ApiField("total")
	private Long total;

	public void setHotelStatusList(List<HotelStatusInfo> hotelStatusList) {
		this.hotelStatusList = hotelStatusList;
	}
	public List<HotelStatusInfo> getHotelStatusList( ) {
		return this.hotelStatusList;
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
