package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.mdeviceprod.device.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 15:51:37
 */
public class AlipayCommerceIotMdeviceprodDeviceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7755667511841156859L;

	/** 
	 * 机具绑定状态
"BIND"--已绑定
"UNBIND"--未绑定
	 */
	@ApiField("bind_status")
	private String bindStatus;

	/** 
	 * 设备id,支付宝内生产的设备唯一id
	 */
	@ApiField("biz_tid")
	private String bizTid;

	/** 
	 * 设备使用业务场景:
团餐机具
快消机具
未来校园
K12
长尾机具
智能售卖
公交机具
客运机具
餐饮机具
政务机具
医疗机具
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/** 
	 * 机具所属ISV的ID
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/** 
	 * 物料id
	 */
	@ApiField("item_id")
	private String itemId;

	/** 
	 * 机具绑定的商户id
	 */
	@ApiField("merchant_pid")
	private String merchantPid;

	/** 
	 * 机具绑定的使用门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 机具状态，
"UNREGISTER" -- 未注册
"ACTIVED" -- 已激活
"UNACTIVED" -- 未激活
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 机具供应商id
	 */
	@ApiField("supplier_sn")
	private String supplierSn;

	public void setBindStatus(String bindStatus) {
		this.bindStatus = bindStatus;
	}
	public String getBindStatus( ) {
		return this.bindStatus;
	}

	public void setBizTid(String bizTid) {
		this.bizTid = bizTid;
	}
	public String getBizTid( ) {
		return this.bizTid;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getExtInfo( ) {
		return this.extInfo;
	}

	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}
	public String getIsvPid( ) {
		return this.isvPid;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemId( ) {
		return this.itemId;
	}

	public void setMerchantPid(String merchantPid) {
		this.merchantPid = merchantPid;
	}
	public String getMerchantPid( ) {
		return this.merchantPid;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSupplierSn(String supplierSn) {
		this.supplierSn = supplierSn;
	}
	public String getSupplierSn( ) {
		return this.supplierSn;
	}

}
