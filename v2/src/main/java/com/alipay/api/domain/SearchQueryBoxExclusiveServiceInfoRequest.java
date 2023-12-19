package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询品牌绑定的官方账号入参
 *
 * @author auto create
 * @since 1.0, 2021-09-17 18:02:35
 */
public class SearchQueryBoxExclusiveServiceInfoRequest extends AlipayObject {

	private static final long serialVersionUID = 5394318641911463436L;

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
	 * 服务类型标识符：SP_MINI_APP/SP_PUBLIC_APP（小程序/生活号）
	 */
	@ApiField("spec_code")
	private String specCode;

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

	public String getSpecCode() {
		return this.specCode;
	}
	public void setSpecCode(String specCode) {
		this.specCode = specCode;
	}

}
