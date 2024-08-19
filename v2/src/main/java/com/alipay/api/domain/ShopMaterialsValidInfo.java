package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 门店物料校验信息
 *
 * @author auto create
 * @since 1.0, 2024-08-09 19:05:18
 */
public class ShopMaterialsValidInfo extends AlipayObject {

	private static final long serialVersionUID = 4282378682387932127L;

	/**
	 * 物料的nfc芯片id
	 */
	@ApiField("chip_id")
	private String chipId;

	/**
	 * 物料对应桌号
	 */
	@ApiField("desk_no")
	private String deskNo;

	/**
	 * 标识物料的唯一性
	 */
	@ApiField("materials_instance_id")
	private String materialsInstanceId;

	/**
	 * 物料的nfc链接，有可能为空，为空则先不写入碰一碰的url
	 */
	@ApiField("nfc_url")
	private String nfcUrl;

	/**
	 * 物料二维码url
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	/**
	 * 门店单号
	 */
	@ApiField("shop_order_no")
	private String shopOrderNo;

	public String getChipId() {
		return this.chipId;
	}
	public void setChipId(String chipId) {
		this.chipId = chipId;
	}

	public String getDeskNo() {
		return this.deskNo;
	}
	public void setDeskNo(String deskNo) {
		this.deskNo = deskNo;
	}

	public String getMaterialsInstanceId() {
		return this.materialsInstanceId;
	}
	public void setMaterialsInstanceId(String materialsInstanceId) {
		this.materialsInstanceId = materialsInstanceId;
	}

	public String getNfcUrl() {
		return this.nfcUrl;
	}
	public void setNfcUrl(String nfcUrl) {
		this.nfcUrl = nfcUrl;
	}

	public String getQrCodeUrl() {
		return this.qrCodeUrl;
	}
	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}

	public String getShopOrderNo() {
		return this.shopOrderNo;
	}
	public void setShopOrderNo(String shopOrderNo) {
		this.shopOrderNo = shopOrderNo;
	}

}
