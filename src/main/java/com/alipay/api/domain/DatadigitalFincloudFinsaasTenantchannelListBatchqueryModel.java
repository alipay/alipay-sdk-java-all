package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 租户渠道列表查询
 *
 * @author auto create
 * @since 1.0, 2022-09-13 22:49:14
 */
public class DatadigitalFincloudFinsaasTenantchannelListBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3877118931613188376L;

	/**
	 * 渠道类别+不唯一+租户渠道列表查询+数据库
	 */
	@ApiField("channel_category")
	private String channelCategory;

	/**
	 * 租户渠道状态+不唯一+租户渠道列表查询+数据库
	 */
	@ApiField("status")
	private String status;

	/**
	 * 租户code
	 */
	@ApiField("tenant_code")
	private String tenantCode;

	public String getChannelCategory() {
		return this.channelCategory;
	}
	public void setChannelCategory(String channelCategory) {
		this.channelCategory = channelCategory;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenantCode() {
		return this.tenantCode;
	}
	public void setTenantCode(String tenantCode) {
		this.tenantCode = tenantCode;
	}

}
