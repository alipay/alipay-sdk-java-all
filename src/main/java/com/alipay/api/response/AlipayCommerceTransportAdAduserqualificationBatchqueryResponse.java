package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdUserQualification;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.aduserqualification.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayCommerceTransportAdAduserqualificationBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8326956856457116684L;

	/** 
	 * 广告主用户资质列表 + 根据广告主用户id获得对应的资质列表
	 */
	@ApiListField("ad_user_qualification")
	@ApiField("ad_user_qualification")
	private List<AdUserQualification> adUserQualification;

	public void setAdUserQualification(List<AdUserQualification> adUserQualification) {
		this.adUserQualification = adUserQualification;
	}
	public List<AdUserQualification> getAdUserQualification( ) {
		return this.adUserQualification;
	}

}
