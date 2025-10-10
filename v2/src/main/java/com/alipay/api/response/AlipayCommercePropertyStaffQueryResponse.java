package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.StaffVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.staff.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-08-07 10:42:37
 */
public class AlipayCommercePropertyStaffQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2174933287821238516L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("staff_v_o")
	private List<StaffVO> list;

	/** 
	 * 数据总条数
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<StaffVO> list) {
		this.list = list;
	}
	public List<StaffVO> getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
