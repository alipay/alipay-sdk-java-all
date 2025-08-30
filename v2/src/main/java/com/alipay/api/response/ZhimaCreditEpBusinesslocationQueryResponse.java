package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ZmEpBusinessLocationInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.businesslocation.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-06-27 14:22:29
 */
public class ZhimaCreditEpBusinesslocationQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3328471479583922866L;

	/** 
	 * 商户地理位置信息列表
	 */
	@ApiListField("array_data")
	@ApiField("zm_ep_business_location_info")
	private List<ZmEpBusinessLocationInfo> arrayData;

	public void setArrayData(List<ZmEpBusinessLocationInfo> arrayData) {
		this.arrayData = arrayData;
	}
	public List<ZmEpBusinessLocationInfo> getArrayData( ) {
		return this.arrayData;
	}

}
