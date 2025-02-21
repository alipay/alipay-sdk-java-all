package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RecycleCharityProjectDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.recycle.charity.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-14 14:28:04
 */
public class AlipayCommerceRecycleCharityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1656977435682248814L;

	/** 
	 * 公益捐赠项目列表
	 */
	@ApiListField("charity_project_list")
	@ApiField("recycle_charity_project_d_t_o")
	private List<RecycleCharityProjectDTO> charityProjectList;

	public void setCharityProjectList(List<RecycleCharityProjectDTO> charityProjectList) {
		this.charityProjectList = charityProjectList;
	}
	public List<RecycleCharityProjectDTO> getCharityProjectList( ) {
		return this.charityProjectList;
	}

}
