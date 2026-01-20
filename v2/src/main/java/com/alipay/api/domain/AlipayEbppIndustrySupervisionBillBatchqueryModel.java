package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 监管子户来账记录查询
 *
 * @author auto create
 * @since 1.0, 2024-06-28 10:13:14
 */
public class AlipayEbppIndustrySupervisionBillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 3612613592117342419L;

	/**
	 * 不同的业务场景下对应不同的业务规则
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 查询的账单记录结束时间
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 本次查询账单的对应子户账户户号
对应开户接口 account.create 中返回的「子户账户户号 merchant_account_no」
	 */
	@ApiField("merchant_account_no")
	private String merchantAccountNo;

	/**
	 * 查询页码
	 */
	@ApiField("page_index")
	private Long pageIndex;

	/**
	 * 每页记录数
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
	 * 查询的账单记录开始时间
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
