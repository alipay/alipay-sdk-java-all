package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * nfc展会碰一下打卡点查询
 *
 * @author auto create
 * @since 1.0, 2026-05-25 18:02:50
 */
public class AlipayOfflineProviderExpoCheckplaceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7879422145522144434L;

	/**
	 * 活动code
	 */
	@ApiField("activity_code")
	private String activityCode;

	/**
	 * 页码，从1开始，默认1
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页大小，最大50，默认20
	 */
	@ApiField("page_size")
	private Long pageSize;

	public String getActivityCode() {
		return this.activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
