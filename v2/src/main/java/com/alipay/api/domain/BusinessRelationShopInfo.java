package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 基于商业关系的门店信息
 *
 * @author auto create
 * @since 1.0, 2021-06-29 18:14:17
 */
public class BusinessRelationShopInfo extends AlipayObject {

	private static final long serialVersionUID = 1149966151789867551L;

	/**
	 * 基于商业关系的代运营门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	/**
	 * 外部门店编号，用于ISV系统内部门店标识等
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	/**
	 * 新版门店类目标准二级类目code。类目标准及与原类目映射关系参见 支付宝门店类目-最新 表格。
	 */
	@ApiField("shop_category")
	private String shopCategory;

	/**
	 * 代运营商业关系门店名称，即当前组织下可运营门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	public String getRealShopId() {
		return this.realShopId;
	}
	public void setRealShopId(String realShopId) {
		this.realShopId = realShopId;
	}

	public String getRealShopNo() {
		return this.realShopNo;
	}
	public void setRealShopNo(String realShopNo) {
		this.realShopNo = realShopNo;
	}

	public String getShopCategory() {
		return this.shopCategory;
	}
	public void setShopCategory(String shopCategory) {
		this.shopCategory = shopCategory;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

}
