package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 缴费账单详情
 *
 * @author auto create
 * @since 1.0, 2021-08-17 14:59:15
 */
public class EduPayItems extends AlipayObject {

	private static final long serialVersionUID = 8113855818914651265L;

	/**
	 * 缴费项是否必选 如果缴费项是多选模式，此参数生效。 “Y”表示必填，“N”或空表示非必填。
	 */
	@ApiField("item_mandatory")
	private String itemMandatory;

	/**
	 * 缴费项最大可选数 如果缴费项是多选模式，此参数生效，范围是1-9，如果为空，则最大项默认为9
	 */
	@ApiField("item_maximum")
	private Long itemMaximum;

	/**
	 * 缴费项名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 缴费项金额
	 */
	@ApiField("item_price")
	private String itemPrice;

	/**
	 * 缴费项序号，如果缴费项是多选模式，此项为必填，建议从1开始的连续数字， 用户支付成功后，通过passback_params参数带回已选择的缴费项。例如:orderNo=uoo234234&isvOrderNo=24werwe&items=1-2|2-1|3-5 1-2|2-1|3-5 表示：缴费项序列号-缴费项数|缴费项序列号-缴费项数
	 */
	@ApiField("item_serial_number")
	private Long itemSerialNumber;

	public String getItemMandatory() {
		return this.itemMandatory;
	}
	public void setItemMandatory(String itemMandatory) {
		this.itemMandatory = itemMandatory;
	}

	public Long getItemMaximum() {
		return this.itemMaximum;
	}
	public void setItemMaximum(Long itemMaximum) {
		this.itemMaximum = itemMaximum;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemPrice() {
		return this.itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Long getItemSerialNumber() {
		return this.itemSerialNumber;
	}
	public void setItemSerialNumber(Long itemSerialNumber) {
		this.itemSerialNumber = itemSerialNumber;
	}

}
