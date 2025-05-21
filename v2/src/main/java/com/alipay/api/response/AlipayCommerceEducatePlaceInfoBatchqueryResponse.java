package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduPlaceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.place.info.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2025-05-08 17:27:24
 */
public class AlipayCommerceEducatePlaceInfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5481933127123559185L;

	/** 
	 * 位置信息列表
	 */
	@ApiListField("place_info_list")
	@ApiField("edu_place_info")
	private List<EduPlaceInfo> placeInfoList;

	/** 
	 * 总数量
	 */
	@ApiField("total_num")
	private Long totalNum;

	public void setPlaceInfoList(List<EduPlaceInfo> placeInfoList) {
		this.placeInfoList = placeInfoList;
	}
	public List<EduPlaceInfo> getPlaceInfoList( ) {
		return this.placeInfoList;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

}
