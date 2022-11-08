package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户交易数据查询
 *
 * @author auto create
 * @since 1.0, 2022-03-18 20:51:52
 */
public class AlipayFundUsertradeBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4557333997862296925L;

	/**
	 * 查询交易数据场景码
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 拉取的结算时间，格式yyyy-MM-dd HH:mm:ss，拉取逻辑包含该时刻。
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 分页页码，从1开始，必须大于0
	 */
	@ApiField("page_index")
	private String pageIndex;

	/**
	 * 分页大小，必须大于0，最大设置100
	 */
	@ApiField("page_size")
	private String pageSize;

	/**
	 * 查询交易数据产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 拉取的起始时间，格式yyyy-MM-dd HH:mm:ss，时间必须早于拉取的截止时间，并且，接口仅限查询用户30天内交易数据，拉取逻辑包含该时刻。
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

	public String getPageIndex() {
		return this.pageIndex;
	}
	public void setPageIndex(String pageIndex) {
		this.pageIndex = pageIndex;
	}

	public String getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

}
