package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 大出行智能平台-出行数据-同步
 *
 * @author auto create
 * @since 1.0, 2022-11-03 14:43:19
 */
public class AlipayCommerceTransportIntelligentizeDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8427446853615596492L;

	/**
	 * 待同步的数据，json字符串，每种类型的数据格式由双方约定
	 */
	@ApiField("data")
	private String data;

	/**
	 * 数据类型枚举code
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 请求ID，唯一标识一次请求，由调用方自行确保唯一性
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 数据同步操作（CREATE_OR_UPDATE、CREATE、UPDATE、DELETE）
	 */
	@ApiField("sync_type")
	private String syncType;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

}
