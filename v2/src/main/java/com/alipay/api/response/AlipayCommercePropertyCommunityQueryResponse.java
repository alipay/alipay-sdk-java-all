package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CommunityInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.property.community.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-19 20:02:29
 */
public class AlipayCommercePropertyCommunityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1422571836926647378L;

	/** 
	 * null
	 */
	@ApiListField("list")
	@ApiField("community_info_v_o")
	private List<CommunityInfoVO> list;

	/** 
	 * 数据总条数
	 */
	@ApiField("total")
	private Long total;

	public void setList(List<CommunityInfoVO> list) {
		this.list = list;
	}
	public List<CommunityInfoVO> getList( ) {
		return this.list;
	}

	public void setTotal(Long total) {
		this.total = total;
	}
	public Long getTotal( ) {
		return this.total;
	}

}
