package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户合作设备维保替换
 *
 * @author auto create
 * @since 1.0, 2021-12-21 11:25:12
 */
public class AntMerchantExpandIotdeviceMaintenanceModifyModel extends AlipayObject {

	private static final long serialVersionUID = 3595629843729183499L;

	/**
	 * 订单创建时间
	 */
	@ApiField("gmt_created")
	private Date gmtCreated;

	/**
	 * 订单修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 安装入驻订单号
	 */
	@ApiField("install_order_id")
	private String installOrderId;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 新设备SN
	 */
	@ApiField("new_device_sn")
	private String newDeviceSn;

	/**
	 * 旧设备SN，被替换的设备
	 */
	@ApiField("old_device_sn")
	private String oldDeviceSn;

	/**
	 * 维保订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 问题类型
	 */
	@ApiField("problem_type")
	private String problemType;

	/**
	 * 报修人电话
	 */
	@ApiField("repair_mobile")
	private String repairMobile;

	/**
	 * 报修人姓名
	 */
	@ApiField("repair_name")
	private String repairName;

	/**
	 * 店铺联系人电话
说明：只做维保记录使用，不会变更设备对应的【店铺联系人电话】信息，如果设备信息变更需要使用变更接口服务
	 */
	@ApiField("shop_contact_mobile")
	private String shopContactMobile;

	/**
	 * 店铺联系人姓名
说明：只做维保记录信息使用，不会变更设备对应的【店铺联系人】信息，如果设备信息变更需要使用变更接口服务
	 */
	@ApiField("shop_contact_name")
	private String shopContactName;

	/**
	 * 店铺名称
说明：只做维保记录使用，不会变更设备对应的【店铺名称】信息，如果设备信息变更需要使用变更接口服务
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 签约支付宝PID（有效）(必须与原始设备签约账号一致)
	 */
	@ApiField("signed_alipay_id")
	private String signedAlipayId;

	/**
	 * 供应商id
	 */
	@ApiField("supplier_sn")
	private String supplierSn;

	public Date getGmtCreated() {
		return this.gmtCreated;
	}
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
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

	public String getNewDeviceSn() {
		return this.newDeviceSn;
	}
	public void setNewDeviceSn(String newDeviceSn) {
		this.newDeviceSn = newDeviceSn;
	}

	public String getOldDeviceSn() {
		return this.oldDeviceSn;
	}
	public void setOldDeviceSn(String oldDeviceSn) {
		this.oldDeviceSn = oldDeviceSn;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getProblemType() {
		return this.problemType;
	}
	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}

	public String getRepairMobile() {
		return this.repairMobile;
	}
	public void setRepairMobile(String repairMobile) {
		this.repairMobile = repairMobile;
	}

	public String getRepairName() {
		return this.repairName;
	}
	public void setRepairName(String repairName) {
		this.repairName = repairName;
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

	public String getShopName() {
		return this.shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
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
