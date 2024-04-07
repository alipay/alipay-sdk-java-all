package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监管子户来账记录查询
 *
 * @author auto create
 * @since 1.0, 2023-03-28 13:52:52
 */
public class AlipayEbppIndustrySupervisionBillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4628757411853931964L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * YYYYMMDD
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 驾校监管子户账号
	 */
	@ApiField("merchant_account_no")
	private String merchantAccountNo;

	/**
	 * 查询分页开始索引，从1开始
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 分页大小 1
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * YYYYMMDD
	 */
	@ApiField("start_time")
	private String startTime;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getMerchantAccountNo() {
		return this.merchantAccountNo;
	}
	public void setMerchantAccountNo(String merchantAccountNo) {
		this.merchantAccountNo = merchantAccountNo;
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
