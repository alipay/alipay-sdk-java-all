package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AreaInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.config.province.search response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayEbppConfigProvinceSearchResponse extends AlipayResponse {

	private static final long serialVersionUID = 5398694727363268397L;

	/** 
	 * 接口主要输出参数列表: AreaInfoResult{List{ areaInfo：{province, cityList<String>}} }
	 */
	@ApiListField("area_info_result")
	@ApiField("area_info")
	private List<AreaInfo> areaInfoResult;

	public void setAreaInfoResult(List<AreaInfo> areaInfoResult) {
		this.areaInfoResult = areaInfoResult;
	}
	public List<AreaInfo> getAreaInfoResult( ) {
		return this.areaInfoResult;
	}

}
