package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 碰点餐物料铺设回传送审
 *
 * @author auto create
 * @since 1.0, 2026-05-29 10:42:47
 */
public class AlipayOpenSpNordermaterialsapplyMaterialsrecordSyncModel extends AlipayObject {

	private static final long serialVersionUID = 5455699749813294582L;

	/**
	 * 门店提报/一次性场景必填
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 门店信息二选一：地址5要素之一
	 */
	@ApiField("area")
	private String area;

	/**
	 * 门店信息二选一：地址5要素之一
	 */
	@ApiField("city")
	private String city;

	/**
	 * 门店信息二选一：地址5要素之一
	 */
	@ApiField("detail_address")
	private String detailAddress;

	/**
	 * null
	 */
	@ApiListField("file_id_list")
	@ApiField("string")
	private List<String> fileIdList;

	/**
	 * null
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
	 * 门店信息二选一：地址5要素之一
	 */
	@ApiField("province")
	private String province;

	/**
	 * 返佣pid
	 */
	@ApiField("rebate_pid")
	private String rebatePid;

	/**
	 * 视频送审场景必填（阶段一/一次性出参返回），唯一标识一个门店
	 */
	@ApiField("shop_biz_id")
	private String shopBizId;

	/**
	 * 门店信息二选一：传shop_id 或 传地址5要素（省+市+区+详细地址+门店名称）
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店信息二选一：地址5要素之一
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * saas_ka场景必填
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

	public List<String> getFileIdList() {
		return this.fileIdList;
	}
	public void setFileIdList(List<String> fileIdList) {
		this.fileIdList = fileIdList;
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

	public String getShopBizId() {
		return this.shopBizId;
	}
	public void setShopBizId(String shopBizId) {
		this.shopBizId = shopBizId;
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
