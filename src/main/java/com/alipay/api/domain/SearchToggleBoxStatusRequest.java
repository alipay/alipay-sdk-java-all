package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 切换品牌box运营状态入参
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:02:30
 */
public class SearchToggleBoxStatusRequest extends AlipayObject {

	private static final long serialVersionUID = 7117786316161827152L;

	/**
	 * 品牌id
	 */
	@ApiField("brand_id")
	private String brandId;

	/**
	 * 用户id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 需切换的状态
	 */
	@ApiField("status")
	private String status;

	public String getBrandId() {
		return this.brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
