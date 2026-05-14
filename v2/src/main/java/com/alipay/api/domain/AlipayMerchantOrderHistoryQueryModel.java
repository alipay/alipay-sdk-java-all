package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单批量查询接口
 *
 * @author auto create
 * @since 1.0, 2026-04-11 01:22:45
 */
public class AlipayMerchantOrderHistoryQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5549344519813224271L;

	/**
	 * 创建订单的结束时间，格式：yyyyMMdd
	 */
	@ApiField("create_time_end")
	private String createTimeEnd;

	/**
	 * 创建订单的开始时间，格式：yyyyMMdd
	 */
	@ApiField("create_time_start")
	private String createTimeStart;

	/**
	 * 订单最近一次更新结束时间，格式：yyyyMMdd
	 */
	@ApiField("modify_time_end")
	private String modifyTimeEnd;

	/**
	 * 订单最近一次更新开始时间，格式：yyyyMMdd
	 */
	@ApiField("modify_time_start")
	private String modifyTimeStart;

	/**
	 * 页码，默认 1（可选）
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页条数，默认 20，最大 1000
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * null
	 */
	@ApiListField("shop_id_list")
	@ApiField("string")
	private List<String> shopIdList;

	public String getCreateTimeEnd() {
		return this.createTimeEnd;
	}
	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd;
	}

	public String getCreateTimeStart() {
		return this.createTimeStart;
	}
	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart;
	}

	public String getModifyTimeEnd() {
		return this.modifyTimeEnd;
	}
	public void setModifyTimeEnd(String modifyTimeEnd) {
		this.modifyTimeEnd = modifyTimeEnd;
	}

	public String getModifyTimeStart() {
		return this.modifyTimeStart;
	}
	public void setModifyTimeStart(String modifyTimeStart) {
		this.modifyTimeStart = modifyTimeStart;
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

	public List<String> getShopIdList() {
		return this.shopIdList;
	}
	public void setShopIdList(List<String> shopIdList) {
		this.shopIdList = shopIdList;
	}

}
