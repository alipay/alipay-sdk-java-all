package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EpAssetInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.dossier.authasset.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-12-24 16:41:28
 */
public class ZhimaCreditEpDossierAuthassetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6443464635776764765L;

	/** 
	 * 企业授权资产信息列表
	 */
	@ApiListField("asset_infos")
	@ApiField("ep_asset_info")
	private List<EpAssetInfo> assetInfos;

	/** 
	 * 是否授权
	 */
	@ApiField("has_authed")
	private Boolean hasAuthed;

	public void setAssetInfos(List<EpAssetInfo> assetInfos) {
		this.assetInfos = assetInfos;
	}
	public List<EpAssetInfo> getAssetInfos( ) {
		return this.assetInfos;
	}

	public void setHasAuthed(Boolean hasAuthed) {
		this.hasAuthed = hasAuthed;
	}
	public Boolean getHasAuthed( ) {
		return this.hasAuthed;
	}

}
