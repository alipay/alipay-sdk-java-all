package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 告警历史详情查询
 *
 * @author auto create
 * @since 1.0, 2024-05-08 14:34:09
 */
public class AlipayCloudCloudbaseMonitorAlarmhistorydetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4666456711672339415L;

	/**
	 * 小程序云app ID
	 */
	@ApiField("biz_app_id")
	private String bizAppId;

	/**
	 * 小程序云环境ID
	 */
	@ApiField("biz_env_id")
	private String bizEnvId;

	/**
	 * 结束时间
	 */
	@ApiField("end")
	private String end;

	/**
	 * 告警历史ID
	 */
	@ApiField("history_id")
	private String historyId;

	/**
	 * 页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页数量
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 开始时间
	 */
	@ApiField("start")
	private String start;

	public String getBizAppId() {
		return this.bizAppId;
	}
	public void setBizAppId(String bizAppId) {
		this.bizAppId = bizAppId;
	}

	public String getBizEnvId() {
		return this.bizEnvId;
	}
	public void setBizEnvId(String bizEnvId) {
		this.bizEnvId = bizEnvId;
	}

	public String getEnd() {
		return this.end;
	}
	public void setEnd(String end) {
		this.end = end;
	}

	public String getHistoryId() {
		return this.historyId;
	}
	public void setHistoryId(String historyId) {
		this.historyId = historyId;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getStart() {
		return this.start;
	}
	public void setStart(String start) {
		this.start = start;
	}

}
