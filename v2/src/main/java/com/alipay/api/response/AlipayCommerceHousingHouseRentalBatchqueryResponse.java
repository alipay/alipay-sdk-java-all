package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RentHouseModelDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.housing.house.rental.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-14 11:32:26
 */
public class AlipayCommerceHousingHouseRentalBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3672797486154427274L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("rent_house_model_d_t_o")
	private List<RentHouseModelDTO> list;

	/** 
	 * 页码
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总的数据大小，单位：条
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<RentHouseModelDTO> list) {
		this.list = list;
	}
	public List<RentHouseModelDTO> getList( ) {
		return this.list;
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
