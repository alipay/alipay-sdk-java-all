package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商业关系门店经营信息
 *
 * @author auto create
 * @since 1.0, 2022-06-02 11:54:28
 */
public class BusinessRelationShopTradeInfo extends AlipayObject {

	private static final long serialVersionUID = 2568289282156496952L;

	/**
	 * 商业关系物理门店id
	 */
	@ApiField("real_shop_id")
	private String realShopId;

	/**
	 * 商业关系门店编号
	 */
	@ApiField("real_shop_no")
	private String realShopNo;

	/**
	 * 门店确权状态，READY、PENDING两种状态
	 */
	@ApiField("shop_confirm_status")
	private String shopConfirmStatus;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店经营数据信息
	 */
	@ApiField("shop_trade_data_info")
	private BusinessRelationTradeInfo shopTradeDataInfo;

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

	public String getShopConfirmStatus() {
		return this.shopConfirmStatus;
	}
	public void setShopConfirmStatus(String shopConfirmStatus) {
		this.shopConfirmStatus = shopConfirmStatus;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public BusinessRelationTradeInfo getShopTradeDataInfo() {
		return this.shopTradeDataInfo;
	}
	public void setShopTradeDataInfo(BusinessRelationTradeInfo shopTradeDataInfo) {
		this.shopTradeDataInfo = shopTradeDataInfo;
	}

}
