package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OuterGroup;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.group.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-05-08 11:48:50
 */
public class AlipayDataDataserviceAdGroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4671561338677631198L;

	/** 
	 * 单元详情
	 */
	@ApiField("group_detail")
	private OuterGroup groupDetail;

	public void setGroupDetail(OuterGroup groupDetail) {
		this.groupDetail = groupDetail;
	}
	public OuterGroup getGroupDetail( ) {
		return this.groupDetail;
	}

}
