package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询导购员任务列表
 *
 * @author auto create
 * @since 1.0, 2022-03-25 10:51:26
 */
public class AlipayCommerceYuntaskHunterQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8852574187614997295L;

	/**
	 * 导购员id
	 */
	@ApiField("hunter_id")
	private String hunterId;

	/**
	 * 商家id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/**
	 * 页码
	 */
	@ApiField("page")
	private Long page;

	/**
	 * 页面大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 店铺id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 任务类型
RECEIVED: 已领取任务
RECOMMENDED: 推荐任务
FINISHED：领取的已结束任务
EXCHANGEABLE：可兑换的任务
	 */
	@ApiField("type")
	private String type;

	public String getHunterId() {
		return this.hunterId;
	}
	public void setHunterId(String hunterId) {
		this.hunterId = hunterId;
	}

	public String getMerchantPid() {
		return this.merchantPid;
	}
	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}

	public Long getPage() {
		return this.page;
	}
	public void setPage(Long page) {
		this.page = page;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
