package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.UrlBindingInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.sp.nordermaterialsapply.materialsurlbinding.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-15 15:52:54
 */
public class AlipayOpenSpNordermaterialsapplyMaterialsurlbindingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8169497288894247352L;

	/** 
	 * null
	 */
	@ApiListField("url_binding_infos")
	@ApiField("url_binding_info")
	private List<UrlBindingInfo> urlBindingInfos;

	public void setUrlBindingInfos(List<UrlBindingInfo> urlBindingInfos) {
		this.urlBindingInfos = urlBindingInfos;
	}
	public List<UrlBindingInfo> getUrlBindingInfos( ) {
		return this.urlBindingInfos;
	}

}
