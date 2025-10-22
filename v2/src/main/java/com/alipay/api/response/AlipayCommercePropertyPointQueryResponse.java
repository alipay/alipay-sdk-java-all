package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.LocationPointInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class AlipayCommercePropertyPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1471782691147354152L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("location_point_info_v_o")
	private List<LocationPointInfoVO> list;

	/** 
	 * 数据总条数
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<LocationPointInfoVO> list) {
		this.list = list;
	}
	public List<LocationPointInfoVO> getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
