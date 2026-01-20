package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户合作设备解绑
 *
 * @author auto create
 * @since 1.0, 2025-11-18 14:53:46
 */
public class AntMerchantExpandIotdeviceRecycleModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3224214444141113484L;

	/**
	 * 设备SN
	 */
	@ApiField("device_sn")
	private String deviceSn;

	/**
	 * 回收单创建时间
	 */
	@ApiField("gmt_created")
	private String gmtCreated;

	/**
	 * 最后一次更新的时间
	 */
	@ApiField("gmt_modified")
	private String gmtModified;

	/**
	 * 安装订单编号
	 */
	@ApiField("install_order_id")
	private String installOrderId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 回收订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 回收人电话
	 */
	@ApiField("recycle_mobile")
	private String recycleMobile;

	/**
	 * 回收人姓名
	 */
	@ApiField("recycle_name")
	private String recycleName;

	/**
	 * 解绑原因: 默认(DEFAULT), 设备丢失(DEVICE_LOSS), 店铺解除合作,设备回收到仓库(SHOP_CANCEL_COOPERATION))
	 */
	@ApiField("recycle_reason")
	private String recycleReason;

	/**
	 * 报备人电话
	 */
	@ApiField("report_mobile")
	private String reportMobile;

	/**
	 * 报备人姓名
	 */
	@ApiField("report_name")
	private String reportName;

	/**
	 * 店铺联系人电话
说明：只做维保记录使用，不会变更设备对应的【店铺联系人电话】信息，如果设备信息变更需要使用变更接口服务
	 */
	@ApiField("shop_contact_mobile")
	private String shopContactMobile;

	/**
	 * 店铺联系人姓名
说明：只做维保记录使用，不会变更设备对应的【店铺联系人姓名】信息，如果设备信息变更需要使用变更接口服务
	 */
	@ApiField("shop_contact_name")
	private String shopContactName;

	/**
	 * 签约支付宝PID（有效）
	 */
	@ApiField("signed_alipay_id")
	private String signedAlipayId;

	/**
	 * 供应商id
	 */
	@ApiField("supplier_sn")
	private String supplierSn;

	public String getDeviceSn() {
		return this.deviceSn;
	}
	public void setDeviceSn(String deviceSn) {
		this.deviceSn = deviceSn;
	}

	public String getGmtCreated() {
		return this.gmtCreated;
	}
	public void setGmtCreated(String gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public String getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(String gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getInstallOrderId() {
		return this.installOrderId;
	}
	public void setInstallOrderId(String installOrderId) {
		this.installOrderId = installOrderId;
	}

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getRecycleMobile() {
		return this.recycleMobile;
	}
	public void setRecycleMobile(String recycleMobile) {
		this.recycleMobile = recycleMobile;
	}

	public String getRecycleName() {
		return this.recycleName;
	}
	public void setRecycleName(String recycleName) {
		this.recycleName = recycleName;
	}

	public String getRecycleReason() {
		return this.recycleReason;
	}
	public void setRecycleReason(String recycleReason) {
		this.recycleReason = recycleReason;
	}

	public String getReportMobile() {
		return this.reportMobile;
	}
	public void setReportMobile(String reportMobile) {
		this.reportMobile = reportMobile;
	}

	public String getReportName() {
		return this.reportName;
	}
	public void setReportName(String reportName) {
		this.reportName = reportName;
	}

	public String getShopContactMobile() {
		return this.shopContactMobile;
	}
	public void setShopContactMobile(String shopContactMobile) {
		this.shopContactMobile = shopContactMobile;
	}

	public String getShopContactName() {
		return this.shopContactName;
	}
	public void setShopContactName(String shopContactName) {
		this.shopContactName = shopContactName;
	}

	public String getSignedAlipayId() {
		return this.signedAlipayId;
	}
	public void setSignedAlipayId(String signedAlipayId) {
		this.signedAlipayId = signedAlipayId;
	}

	public String getSupplierSn() {
		return this.supplierSn;
	}
	public void setSupplierSn(String supplierSn) {
		this.supplierSn = supplierSn;
	}

}
