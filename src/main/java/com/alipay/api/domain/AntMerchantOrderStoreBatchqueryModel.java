package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家端订单批量查询接口
 *
 * @author auto create
 * @since 1.0, 2020-03-13 16:19:02
 */
public class AntMerchantOrderStoreBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 4182273729726253247L;

	/**
	 * 结束时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/**
	 * 订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 当前页码
	 */
	@ApiField("page_no")
	private Long pageNo;

	/**
	 * 分页数量
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 插件业务场景code，预约为ShopService
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 线下门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 开始时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/**
	 * 线上店的ID
	 */
	@ApiField("store_open_id")
	private String storeOpenId;

	public Date getEndTime() {
		return this.endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getPageNo() {
		return this.pageNo;
	}
	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
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

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public Date getStartTime() {
		return this.startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStoreOpenId() {
		return this.storeOpenId;
	}
	public void setStoreOpenId(String storeOpenId) {
		this.storeOpenId = storeOpenId;
	}

}
