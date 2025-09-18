package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.AddressDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.service.miniappnearbypoipage.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-13 16:12:42
 */
public class AlipayOpenAppServiceMiniappnearbypoipageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4327267261695436995L;

	/** 
	 * 服务poi信息列表
	 */
	@ApiField("addresses")
	private AddressDTO addresses;

	/** 
	 * 当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 每页条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 总条数
	 */
	@ApiField("total")
	private Long total;

	public void setAddresses(AddressDTO addresses) {
		this.addresses = addresses;
	}
	public AddressDTO getAddresses( ) {
		return this.addresses;
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
