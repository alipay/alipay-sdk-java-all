package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 修改活动状态入参
 *
 * @author auto create
 * @since 1.0, 2021-07-12 16:43:25
 */
public class SearchBoxMarketingchangeOptStatusReq extends AlipayObject {

	private static final long serialVersionUID = 6579728939268839148L;

	/**
	 * 需修改至何种状态(支持撤销和删除)
	 */
	@ApiField("action")
	private String action;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 工单id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 用户id
	 */
	@ApiField("pid")
	private String pid;

	public String getAction() {
		return this.action;
	}
	public void setAction(String action) {
		this.action = action;
	}

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

}
