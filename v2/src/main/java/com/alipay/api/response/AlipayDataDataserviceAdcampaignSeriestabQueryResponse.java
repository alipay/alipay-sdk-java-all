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
 * @since 1.0, 2026-08-27 00:04:56
 */
public class AlipayDataDataserviceAdcampaignSeriestabQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1641228331572848745L;

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
