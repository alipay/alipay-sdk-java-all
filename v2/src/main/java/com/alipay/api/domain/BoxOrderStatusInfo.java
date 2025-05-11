package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * box工单基础类型
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:01:46
 */
public class BoxOrderStatusInfo extends AlipayObject {

	private static final long serialVersionUID = 2711382949765278428L;

	/**
	 * 工单数据
	 */
	@ApiField("data")
	private String data;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 工单id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 最新工单状态
	 */
	@ApiField("latest_status")
	private String latestStatus;

	public String getData() {
		return this.data;
	}
	public void setData(String data) {
		this.data = data;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getLatestStatus() {
		return this.latestStatus;
	}
	public void setLatestStatus(String latestStatus) {
		this.latestStatus = latestStatus;
	}

}
