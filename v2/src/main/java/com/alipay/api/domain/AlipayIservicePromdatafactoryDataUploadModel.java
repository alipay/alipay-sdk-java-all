package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 营销数据上传
 *
 * @author auto create
 * @since 1.0, 2026-01-13 14:37:42
 */
public class AlipayIservicePromdatafactoryDataUploadModel extends AlipayObject {

	private static final long serialVersionUID = 8244128578912662161L;

	/**
	 * null
	 */
	@ApiListField("data")
	@ApiField("data_sync_request")
	private List<DataSyncRequest> data;

	/**
	 * 租户标识
	 */
	@ApiField("tenant")
	private String tenant;

	public List<DataSyncRequest> getData() {
		return this.data;
	}
	public void setData(List<DataSyncRequest> data) {
		this.data = data;
	}

	public String getTenant() {
		return this.tenant;
	}
	public void setTenant(String tenant) {
		this.tenant = tenant;
	}

}
