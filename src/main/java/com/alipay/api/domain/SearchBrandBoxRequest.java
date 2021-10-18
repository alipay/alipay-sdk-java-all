package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 品牌box详情查询入参
 *
 * @author auto create
 * @since 1.0, 2021-07-12 16:43:42
 */
public class SearchBrandBoxRequest extends AlipayObject {

	private static final long serialVersionUID = 5747633816997266381L;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 品牌box工单id
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 用户id
	 */
	@ApiField("pid")
	private String pid;

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
