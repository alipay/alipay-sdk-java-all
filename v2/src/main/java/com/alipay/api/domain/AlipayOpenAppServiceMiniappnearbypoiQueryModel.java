package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 服务详细信息查询
 *
 * @author auto create
 * @since 1.0, 2019-08-01 20:35:14
 */
public class AlipayOpenAppServiceMiniappnearbypoiQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7466398791593996137L;

	/**
	 * poiCode列表
	 */
	@ApiListField("poi_code_list")
	@ApiField("string")
	private List<String> poiCodeList;

	/**
	 * 服务编码
	 */
	@ApiField("service_code")
	private String serviceCode;

	public List<String> getPoiCodeList() {
		return this.poiCodeList;
	}
	public void setPoiCodeList(List<String> poiCodeList) {
		this.poiCodeList = poiCodeList;
	}

	public String getServiceCode() {
		return this.serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

}
