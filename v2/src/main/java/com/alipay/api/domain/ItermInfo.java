package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 返回充值面额状态list
 *
 * @author auto create
 * @since 1.0, 2016-10-26 17:43:42
 */
public class ItermInfo extends AlipayObject {

	private static final long serialVersionUID = 2394669689996287162L;

	/**
	 * 更新时系统异常，返回错误详细信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/**
	 * 充值面额的状态Y/N
	 */
	@ApiField("is_for_sale")
	private String isForSale;

	/**
	 * 面额的code，唯一标示码
	 */
	@ApiField("item_code")
	private String itemCode;

	/**
	 * 售价，比如100的面额，卖99元
	 */
	@ApiField("mark_price")
	private String markPrice;

	/**
	 * 针对更新时，是否更新成功
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 手机充值的面额价格
	 */
	@ApiField("supplier_price")
	private String supplierPrice;

	public String getErrorMessage() {
		return this.errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getIsForSale() {
		return this.isForSale;
	}
	public void setIsForSale(String isForSale) {
		this.isForSale = isForSale;
	}

	public String getItemCode() {
		return this.itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getMarkPrice() {
		return this.markPrice;
	}
	public void setMarkPrice(String markPrice) {
		this.markPrice = markPrice;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getSupplierPrice() {
		return this.supplierPrice;
	}
	public void setSupplierPrice(String supplierPrice) {
		this.supplierPrice = supplierPrice;
	}

}
