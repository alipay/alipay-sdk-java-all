package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商场付业务规则限制的门店信息结构
 *
 * @author auto create
 * @since 1.0, 2023-08-08 15:38:31
 */
public class RuleLimitShopContentDTO extends AlipayObject {

	private static final long serialVersionUID = 6117568863554619329L;

	/**
	 * 商圈物理门店ID
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	/**
	 * 商圈物理门店名称
	 */
	@ApiField("real_shop_name")
	private String realShopName;

	/**
	 * 外部门店编号
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	public String getRealShopId() {
		return this.realShopId;
	}
	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}

	public String getRealShopName() {
		return this.realShopName;
	}
	public void setRealShopName(String realShopName) {
		this.realShopName = realShopName;
	}

	public String getRealShopNo() {
		return this.realShopNo;
	}
	public void setRealShopNo(String realShopNo) {
		this.realShopNo = realShopNo;
	}

}
