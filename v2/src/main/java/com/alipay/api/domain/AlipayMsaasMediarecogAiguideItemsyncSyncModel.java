package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 中石化向支付宝同步商品档案OpenAPI接口
 *
 * @author auto create
 * @since 1.0, 2026-10-28 13:52:59
 */
public class AlipayMsaasMediarecogAiguideItemsyncSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4586831532449976617L;

	/**
	 * 商品档案文件下载URL，需至少7天有效
	 */
	@ApiField("file_url")
	private String fileUrl;

	/**
	 * 服务商名称
	 */
	@ApiField("isv_name")
	private String isvName;

	/**
	 * 服务商PID，接入前向支付宝申请分配
	 */
	@ApiField("isv_pid")
	private String isvPid;

	/**
	 * 商户ID，为空时取isv_pid
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 商户名称
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 设备ID，支付宝IoT设备的唯一标识，由设备注册支付宝IoT平台时分配；无sn时传，同时传sn时需与sn解析结果一致。
	 */
	@ApiField("n_device_id")
	private String nDeviceId;

	/**
	 * POS机ID，中石化门店收银终端的唯一标识，由中石化门店管理系统分配。用于推荐算法定位终端，可不传（不影响商品档案同步）。
	 */
	@ApiField("pos_id")
	private String posId;

	/**
	 * POS机名称
	 */
	@ApiField("pos_name")
	private String posName;

	/**
	 * 门店ID，中石化门店的唯一标识，由中石化门店管理系统分配，接入前需向支付宝侧报备。
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 门店名称
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 设备序列号（优先传）；sn 与 n_device_id 至少传一个。
	 */
	@ApiField("sn")
	private String sn;

	public String getFileUrl() {
		return this.fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getIsvName() {
		return this.isvName;
	}
	public void setIsvName(String isvName) {
		this.isvName = isvName;
	}

	public String getIsvPid() {
		return this.isvPid;
	}
	public void setIsvPid(String isvPid) {
		this.isvPid = isvPid;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getnDeviceId() {
		return this.nDeviceId;
	}
	public void setnDeviceId(String nDeviceId) {
		this.nDeviceId = nDeviceId;
	}

	public String getPosId() {
		return this.posId;
	}
	public void setPosId(String posId) {
		this.posId = posId;
	}

	public String getPosName() {
		return this.posName;
	}
	public void setPosName(String posName) {
		this.posName = posName;
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

	public String getSn() {
		return this.sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}

}
