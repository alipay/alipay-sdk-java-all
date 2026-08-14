package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AdPublicTabInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.adcampaign.seriestab.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-28 19:22:54
 */
public class AlipayDataDataserviceAdcampaignSeriestabQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5435518334911784845L;

	/** 
	 * null
	 */
	@ApiListField("public_list")
	@ApiField("ad_public_tab_info")
	private List<AdPublicTabInfo> publicList;

	public void setPublicList(List<AdPublicTabInfo> publicList) {
		this.publicList = publicList;
	}
	public List<AdPublicTabInfo> getPublicList( ) {
		return this.publicList;
	}

}
