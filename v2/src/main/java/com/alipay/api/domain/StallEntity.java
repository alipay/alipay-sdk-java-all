package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 档口详情entity
 *
 * @author auto create
 * @since 1.0, 2018-12-21 17:36:37
 */
public class StallEntity extends AlipayObject {

	private static final long serialVersionUID = 6261979222981949245L;

	/**
	 * 档口下菜品集合
	 */
	@ApiListField("dish_ids")
	@ApiField("string")
	private List<String> dishIds;

	/**
	 * 档口id
	 */
	@ApiField("id")
	private String id;

	/**
	 * 档口和kds的绑定信息
	 */
	@ApiListField("kds_list")
	@ApiField("stall_kds_entity")
	private List<StallKdsEntity> kdsList;

	/**
	 * 商户id
	 */
	@ApiField("merchant_id")
	private String merchantId;

	/**
	 * 打印机id
	 */
	@ApiField("printer_id")
	private String printerId;

	/**
	 * 打印机名称
	 */
	@ApiField("printer_name")
	private String printerName;

	/**
	 * 打印机类型（FRONT_DESK_PRINTER：前台打印机；LABEL_PRINTER：标签打印机；KITCHEN_PRINTER：厨房打印机）
	 */
	@ApiField("printer_type")
	private String printerType;

	/**
	 * 是否分单打印（parted：菜品分开打印；together：菜品统一打印）
	 */
	@ApiField("receipt_type")
	private String receiptType;

	/**
	 * 门店id
	 */
	@ApiField("shop_id")
	private String shopId;

	/**
	 * 档口名称
	 */
	@ApiField("stall_name")
	private String stallName;

	/**
	 * 启用情况（false:停用；true:启用）
	 */
	@ApiField("use")
	private Boolean use;

	public List<String> getDishIds() {
		return this.dishIds;
	}
	public void setDishIds(List<String> dishIds) {
		this.dishIds = dishIds;
	}

	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public List<StallKdsEntity> getKdsList() {
		return this.kdsList;
	}
	public void setKdsList(List<StallKdsEntity> kdsList) {
		this.kdsList = kdsList;
	}

	public String getMerchantId() {
		return this.merchantId;
	}
	public void setMerchantId(String merchantId) {
		this.merchantId = merchantId;
	}

	public String getPrinterId() {
		return this.printerId;
	}
	public void setPrinterId(String printerId) {
		this.printerId = printerId;
	}

	public String getPrinterName() {
		return this.printerName;
	}
	public void setPrinterName(String printerName) {
		this.printerName = printerName;
	}

	public String getPrinterType() {
		return this.printerType;
	}
	public void setPrinterType(String printerType) {
		this.printerType = printerType;
	}

	public String getReceiptType() {
		return this.receiptType;
	}
	public void setReceiptType(String receiptType) {
		this.receiptType = receiptType;
	}

	public String getShopId() {
		return this.shopId;
	}
	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getStallName() {
		return this.stallName;
	}
	public void setStallName(String stallName) {
		this.stallName = stallName;
	}

	public Boolean getUse() {
		return this.use;
	}
	public void setUse(Boolean use) {
		this.use = use;
	}

}
