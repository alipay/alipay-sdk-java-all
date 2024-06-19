package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监管子户来账记录查询
 *
 * @author auto create
 * @since 1.0, 2024-05-30 10:14:20
 */
public class AlipayEbppIndustrySupervisionBillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1483523294525183682L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * YYYYMMDD
专款钱包场景下 为 yyyyMMddHHmmss
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 企业监管子户账号
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
	 * 驾培场景下该参数无效。只返回来帐记录。
专款钱包场景下根据该字段返回对应类型的记录
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * YYYYMMDD

专款钱包场景下 为 yyyyMMddHHmmss
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

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
