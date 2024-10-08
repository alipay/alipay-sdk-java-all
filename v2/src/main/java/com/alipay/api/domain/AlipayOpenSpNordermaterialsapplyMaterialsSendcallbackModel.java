package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 碰一下点餐物料铺设回传
 *
 * @author auto create
 * @since 1.0, 2024-09-18 20:42:15
 */
public class AlipayOpenSpNordermaterialsapplyMaterialsSendcallbackModel extends AlipayObject {

	private static final long serialVersionUID = 2127244284916233477L;

	/**
	 * 申请单ID，等同创建申请单返回的ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 铺设门店所在区县
	 */
	@ApiField("area")
	private String area;

	/**
	 * 铺设门店所在城市
	 */
	@ApiField("city")
	private String city;

	/**
	 * 门店铺设所在详细地址
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * 铺设的物料信息
	 */
	@ApiListField("materials_info")
	@ApiField("call_back_materials_info")
	private List<CallBackMaterialsInfo> materialsInfo;

	/**
	 * 铺设的门店所属商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 支付宝上的点餐小程序
	 */
	@ApiField("order_app_id")
	private String orderAppId;

	/**
	 * 铺设门店所属省份
	 */
	@ApiField("province")
	private String province;

	/**
	 * 返佣pid，用于后续返佣政策
	 */
	@ApiField("rebate_pid")
	private String rebatePid;

	/**
	 * 蚂蚁体系的门店ID
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 铺设门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店单标识
	 */
	@ApiField("shop_order_no")
	private String shopOrderNo;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getArea() {
		return this.area;
	}
	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getDetailAddress() {
		return this.detailAddress;
	}
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	public List<CallBackMaterialsInfo> getMaterialsInfo() {
		return this.materialsInfo;
	}
	public void setMaterialsInfo(List<CallBackMaterialsInfo> materialsInfo) {
		this.materialsInfo = materialsInfo;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getOrderAppId() {
		return this.orderAppId;
	}
	public void setOrderAppId(String orderAppId) {
		this.orderAppId = orderAppId;
	}

	public String getProvince() {
		return this.province;
	}
	public void setProvince(String province) {
		this.province = province;
	}

	public String getRebatePid() {
		return this.rebatePid;
	}
	public void setRebatePid(String rebatePid) {
		this.rebatePid = rebatePid;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getShopOrderNo() {
		return this.shopOrderNo;
	}
	public void setShopOrderNo(String shopOrderNo) {
		this.shopOrderNo = shopOrderNo;
	}

}
