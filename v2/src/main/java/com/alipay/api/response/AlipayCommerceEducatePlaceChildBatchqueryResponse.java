package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduPlaceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.place.child.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-22 21:17:25
 */
public class AlipayCommerceEducatePlaceChildBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8621186123429165669L;

	/** 
	 * 位置列表
	 */
	@ApiListField("place_list")
	@ApiField("edu_place_info")
	private List<EduPlaceInfo> placeList;

	public void setPlaceList(List<EduPlaceInfo> placeList) {
		this.placeList = placeList;
	}
	public List<EduPlaceInfo> getPlaceList( ) {
		return this.placeList;
	}

}
