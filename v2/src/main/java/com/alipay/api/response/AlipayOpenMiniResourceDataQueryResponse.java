package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ResourceDataVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.resource.data.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-21 03:52:24
 */
public class AlipayOpenMiniResourceDataQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7458668277318577384L;

	/** 
	 * 流量位数据列表
	 */
	@ApiListField("resource_data_list")
	@ApiField("resource_data_v_o")
	private List<ResourceDataVO> resourceDataList;

	public void setResourceDataList(List<ResourceDataVO> resourceDataList) {
		this.resourceDataList = resourceDataList;
	}
	public List<ResourceDataVO> getResourceDataList( ) {
		return this.resourceDataList;
	}

}
