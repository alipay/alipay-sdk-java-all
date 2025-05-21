package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CampusPointDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.point.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-25 10:22:27
 */
public class AlipayCommerceEducateCampusPointQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8216466825244337233L;

	/** 
	 * 校区点位信息
	 */
	@ApiListField("campus_point_detail_list")
	@ApiField("campus_point_detail")
	private List<CampusPointDetail> campusPointDetailList;

	public void setCampusPointDetailList(List<CampusPointDetail> campusPointDetailList) {
		this.campusPointDetailList = campusPointDetailList;
	}
	public List<CampusPointDetail> getCampusPointDetailList( ) {
		return this.campusPointDetailList;
	}

}
