package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * cspordext通用同步接口
 *
 * @author auto create
 * @since 1.0, 2022-06-30 11:25:35
 */
public class AlipayEcoCityserviceExtSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4235454271576327445L;

	/**
	 * 同步数据
	 */
	@ApiListField("data")
	@ApiField("sync_data")
	private List<SyncData> data;

	/**
	 * 数据同步类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public List<SyncData> getData() {
		return this.data;
	}
	public void setData(List<SyncData> data) {
		this.data = data;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
