package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店物料信息
 *
 * @author auto create
 * @since 1.0, 2024-09-12 19:55:17
 */
public class ShopMaterialsInfo extends AlipayObject {

	private static final long serialVersionUID = 8581756413614252622L;

	/**
	 * 收货地址
	 */
	@ApiField("delivery_address")
	private String deliveryAddress;

	/**
	 * 物料对应桌号
	 */
	@ApiField("desk_no")
	private String deskNo;

	/**
	 * 一个实例对应的实际生产数量
	 */
	@ApiField("materials_count")
	private Long materialsCount;

	/**
	 * 标识物料的唯一性
	 */
	@ApiField("materials_instance_id")
	private String materialsInstanceId;

	/**
	 * 描述门店对应的商家名称，有部分物料印刷时需要，有必要时才会传递
	 */
	@ApiField("merchant_name")
	private String merchantName;

	/**
	 * 物料的nfc链接，有可能为空，为空则先不写入碰一碰的url
	 */
	@ApiField("nfc_url")
	private String nfcUrl;

	/**
	 * 生产要素扩展参数
	 */
	@ApiField("production_ext_info")
	private String productionExtInfo;

	/**
	 * 二维码url
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/**
	 * 收件人姓名
	 */
	@ApiField("receiver_name")
	private String receiverName;

	/**
	 * 收货人联系电话
	 */
	@ApiField("receiver_phone")
	private String receiverPhone;

	/**
	 * xxx门店
	 */
	@ApiField("shop_name")
	private String shopName;

	/**
	 * 门店单号
	 */
	@ApiField("shop_order_no")
	private String shopOrderNo;

	/**
	 * 对应门店数量的序列号 当前字段已废弃(无具体业务含义，修改为废弃)
	 */
	@ApiField("shop_serial_number")
	@Deprecated
	private String shopSerialNumber;

	public String getDeliveryAddress() {
		return this.deliveryAddress;
	}
	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getDeskNo() {
		return this.deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public Long getMaterialsCount() {
		return this.materialsCount;
	}
	public void setMaterialsCount(Long materialsCount) {
		this.materialsCount = materialsCount;
	}

	public String getMaterialsInstanceId() {
		return this.materialsInstanceId;
	}
	public void setMaterialsInstanceId(String materialsInstanceId) {
		this.materialsInstanceId = materialsInstanceId;
	}

	public String getMerchantName() {
		return this.merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}

	public String getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(String nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

	public String getProductionExtInfo() {
		return this.productionExtInfo;
	}
	public void setProductionExtInfo(String productionExtInfo) {
		this.productionExtInfo = productionExtInfo;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

	public String getReceiverName() {
		return this.receiverName;
	}
	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getReceiverPhone() {
		return this.receiverPhone;
	}
	public void setReceiverPhone(String receiverPhone) {
		this.receiverPhone = receiverPhone;
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

	public String getShopSerialNumber() {
		return this.shopSerialNumber;
	}
	public void setShopSerialNumber(String shopSerialNumber) {
		this.shopSerialNumber = shopSerialNumber;
	}

}
