package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * B端订单数据列表查询-安全云专用	
 *
 * @author auto create
 * @since 1.0, 2019-09-15 11:40:41
 */
public class AlipayMerchantOrderSecuritydigestBusinessBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2678783228518234899L;

	/**
	 * 结束时间，格式为：yyyy-MM-dd hh:mm:ss 查询返回的订单支付时间在end_time之前，不包括end_time
	 */
	@ApiField("end_time")
	private String endTime;

	/**
	 * 分页查询的页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页查询每页返回的条数
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 卖家支付宝id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 查询开始时间，格式为：yyyy-MM-dd hh:mm:ss 查询返回的订单支付时间在start_time之后，包括start_time
	 */
	@ApiField("start_time")
	private String startTime;

	/**
	 * 小程序订单id
	 */
	@ApiField("tiny_app_id")
	private String tinyAppId;

	public String getEndTime() {
		return this.endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
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

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getStartTime() {
		return this.startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTinyAppId() {
		return this.tinyAppId;
	}
	public void setTinyAppId(String tinyAppId) {
		this.tinyAppId = tinyAppId;
	}

}
