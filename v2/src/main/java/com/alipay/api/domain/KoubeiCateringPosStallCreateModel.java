package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 新增档口
 *
 * @author auto create
 * @since 1.0, 2018-11-23 19:44:47
 */
public class KoubeiCateringPosStallCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1735974895165258682L;

	/**
	 * 档口下菜品集合
	 */
	@ApiListField("dish_ids")
	@ApiField("string")
	private List<String> dishIds;

	/**
	 * 打印机id
	 */
	@ApiField("printer_id")
	private String printerId;

	/**
	 * 打印机类型（FRONT_DESK_PRINTER：前台打印机；LABEL_PRINTER：标签打印机；KITCHEN_PRINTER：厨房打印机）
	 */
	@ApiField("printer_type")
	private String printerType;

	/**
	 * 是否分单打印（"parted"："菜品分开打印"；"together"："菜品统一打印"）
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

	public List<String> getDishIds() {
		return this.dishIds;
	}
	public void setDishIds(List<String> dishIds) {
		this.dishIds = dishIds;
	}

	public String getPrinterId() {
		return this.printerId;
	}
	public void setPrinterId(String printerId) {
		this.printerId = printerId;
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

}
