package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TenantChannelDetailDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.tenantchannel.list.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2024-03-01 16:26:17
 */
public class DatadigitalFincloudFinsaasTenantchannelListBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4634962989391179333L;

	/** 
	 * 租户渠道列表+不唯一+租户渠道列表查询+数据库
	 */
	@ApiListField("tenant_channel_list")
	@ApiField("tenant_channel_detail_d_t_o")
	private List<TenantChannelDetailDTO> tenantChannelList;

	public void setTenantChannelList(List<TenantChannelDetailDTO> tenantChannelList) {
		this.tenantChannelList = tenantChannelList;
	}
	public List<TenantChannelDetailDTO> getTenantChannelList( ) {
		return this.tenantChannelList;
	}

}
