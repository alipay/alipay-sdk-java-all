package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 应用内容商品查询
 *
 * @author auto create
 * @since 1.0, 2023-02-22 15:11:23
 */
public class AlipayOpenAppAppcontentItemQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2767223828517731296L;

	/**
	 * 支付宝小程序ID
	 */
	@ApiField("alipay_app_id")
	private String alipayAppId;

	/**
	 * 商品状态；可选值：VALID（上架）、INVALID（下架）
	 */
	@ApiField("item_status")
	private String itemStatus;

	/**
	 * 商品名称（模糊查询）
	 */
	@ApiField("item_title")
	private String itemTitle;

	/**
	 * 当前页码；大于0
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 每页查询数量；可选值：1到20
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 商户ID
	 */
	@ApiField("pid")
	private String pid;

	public String getAlipayAppId() {
		return this.alipayAppId;
	}
	public void setAlipayAppId(String alipayAppId) {
		this.alipayAppId = alipayAppId;
	}

	public String getItemStatus() {
		return this.itemStatus;
	}
	public void setItemStatus(String itemStatus) {
		this.itemStatus = itemStatus;
	}

	public String getItemTitle() {
		return this.itemTitle;
	}
	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
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

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
