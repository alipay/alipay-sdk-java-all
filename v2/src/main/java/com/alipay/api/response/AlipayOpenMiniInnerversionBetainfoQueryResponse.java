package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PluginBetaItemInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.innerversion.betainfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-09-11 18:49:11
 */
public class AlipayOpenMiniInnerversionBetainfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3391453538629179778L;

	/** 
	 * 邀测结果列表
	 */
	@ApiListField("plugin_beta_item_list")
	@ApiField("plugin_beta_item_info")
	private List<PluginBetaItemInfo> pluginBetaItemList;

	/** 
	 * 邀测状态，待确认WAITCHECK/确认CHECKED/拒绝REJECT
	 */
	@ApiField("status")
	private String status;

	public void setPluginBetaItemList(List<PluginBetaItemInfo> pluginBetaItemList) {
		this.pluginBetaItemList = pluginBetaItemList;
	}
	public List<PluginBetaItemInfo> getPluginBetaItemList( ) {
		return this.pluginBetaItemList;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
