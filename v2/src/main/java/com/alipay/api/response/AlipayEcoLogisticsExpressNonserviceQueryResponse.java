package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AreaCode;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.logistics.express.nonservice.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-08-20 17:45:01
 */
public class AlipayEcoLogisticsExpressNonserviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5614732134151795744L;

	/** 
	 * 非服务区区域代码列表
	 */
	@ApiListField("area_codes")
	@ApiField("area_code")
	private List<AreaCode> areaCodes;

	public void setAreaCodes(List<AreaCode> areaCodes) {
		this.areaCodes = areaCodes;
	}
	public List<AreaCode> getAreaCodes( ) {
		return this.areaCodes;
	}

}
