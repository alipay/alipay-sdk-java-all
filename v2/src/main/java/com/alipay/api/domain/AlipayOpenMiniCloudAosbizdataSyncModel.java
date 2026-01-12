package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * aos业务数据同步接口
 *
 * @author auto create
 * @since 1.0, 2023-09-13 10:27:53
 */
public class AlipayOpenMiniCloudAosbizdataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6452323458278554211L;

	/**
	 * 应用身份标识id
	 */
	@ApiField("app_token")
	private String appToken;

	/**
	 * 数据
	 */
	@ApiListField("data")
	@ApiField("aos_data_item")
	private List<AosDataItem> data;

	/**
	 * 业务id类型
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 操作类型
	 */
	@ApiField("ops")
	private String ops;

	/**
	 * 时间戳字段
	 */
	@ApiField("ops_timestamp")
	private String opsTimestamp;

	/**
	 * 数据类型
	 */
	@ApiField("type")
	private String type;

	public String getAppToken() {
		return this.appToken;
	}
	public void setAppToken(String appToken) {
		this.appToken = appToken;
	}

	public List<AosDataItem> getData() {
		return this.data;
	}
	public void setData(List<AosDataItem> data) {
		this.data = data;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getOps() {
		return this.ops;
	}
	public void setOps(String ops) {
		this.ops = ops;
	}

	public String getOpsTimestamp() {
		return this.opsTimestamp;
	}
	public void setOpsTimestamp(String opsTimestamp) {
		this.opsTimestamp = opsTimestamp;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
