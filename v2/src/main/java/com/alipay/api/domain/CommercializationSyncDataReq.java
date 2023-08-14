package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中欧基金数据同步请求体
 *
 * @author auto create
 * @since 1.0, 2023-03-20 10:25:32
 */
public class CommercializationSyncDataReq extends AlipayObject {

	private static final long serialVersionUID = 1763741573727819164L;

	/**
	 * 数据文件链接  可访问的csv文件
	 */
	@ApiField("data_link")
	private String dataLink;

	/**
	 * 同步数据类型，固定类型
	 */
	@ApiField("data_sync_type")
	private String dataSyncType;

	/**
	 * 文件接口返回的fileId，也就是oss的objectKey
	 */
	@ApiField("file_id")
	private String fileId;

	/**
	 * 提交唯一标识，幂等性验证
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 同步时间戳
	 */
	@ApiField("sync_timestamp")
	private String syncTimestamp;

	public String getDataLink() {
		return this.dataLink;
	}
	public void setDataLink(String dataLink) {
		this.dataLink = dataLink;
	}

	public String getDataSyncType() {
		return this.dataSyncType;
	}
	public void setDataSyncType(String dataSyncType) {
		this.dataSyncType = dataSyncType;
	}

	public String getFileId() {
		return this.fileId;
	}
	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSyncTimestamp() {
		return this.syncTimestamp;
	}
	public void setSyncTimestamp(String syncTimestamp) {
		this.syncTimestamp = syncTimestamp;
	}

}
