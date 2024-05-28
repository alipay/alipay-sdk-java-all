package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 小程序云智能应用上传数据接口
 *
 * @author auto create
 * @since 1.0, 2024-02-28 15:09:15
 */
public class TechriskInnovateMpcpromoDataSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6476211361175375625L;

	/**
	 * 商品数据的列表
	 */
	@ApiListField("data_list")
	@ApiField("mpcpromo_goods_list")
	private List<MpcpromoGoodsList> dataList;

	/**
	 * 数据类型 : SHOP（店铺数据）、VOUCHER（商家券数据）、ITEM（商品数据）
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 行业类别:   goodsLease（常规/租赁 商品数据）,voucherNormal（常规商家券）,shopNormal（店铺数据）
	 */
	@ApiField("industry")
	private String industry;

	/**
	 * 店铺数据
	 */
	@ApiListField("shop_list")
	@ApiField("mpcpromo_shop_list")
	private List<MpcpromoShopList> shopList;

	/**
	 * 商家券数据
	 */
	@ApiListField("voucher_list")
	@ApiField("mpcpromo_voucher_list")
	private List<MpcpromoVoucherList> voucherList;

	public List<MpcpromoGoodsList> getDataList() {
		return this.dataList;
	}
	public void setDataList(List<MpcpromoGoodsList> dataList) {
		this.dataList = dataList;
	}

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getIndustry() {
		return this.industry;
	}
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public List<MpcpromoShopList> getShopList() {
		return this.shopList;
	}
	public void setShopList(List<MpcpromoShopList> shopList) {
		this.shopList = shopList;
	}

	public List<MpcpromoVoucherList> getVoucherList() {
		return this.voucherList;
	}
	public void setVoucherList(List<MpcpromoVoucherList> voucherList) {
		this.voucherList = voucherList;
	}

}
