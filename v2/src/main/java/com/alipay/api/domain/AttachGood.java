package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 加料
 *
 * @author auto create
 * @since 1.0, 2025-08-01 09:52:03
 */
public class AttachGood extends AlipayObject {

	private static final long serialVersionUID = 8591472813418241541L;

	/**
	 * 加料id
	 */
	@ApiField("attach_good_id")
	private String attachGoodId;

	/**
	 * 加料名
	 */
	@ApiField("attach_good_name")
	private String attachGoodName;

	/**
	 * 12元
	 */
	@ApiField("attach_good_price")
	private Long attachGoodPrice;

	/**
	 * 1个
	 */
	@ApiField("quantity")
	private String quantity;

	public String getAttachGoodId() {
		return this.attachGoodId;
	}
	public void setAttachGoodId(String attachGoodId) {
		this.attachGoodId = attachGoodId;
	}

	public String getAttachGoodName() {
		return this.attachGoodName;
	}
	public void setAttachGoodName(String attachGoodName) {
		this.attachGoodName = attachGoodName;
	}

	public Long getAttachGoodPrice() {
		return this.attachGoodPrice;
	}
	public void setAttachGoodPrice(Long attachGoodPrice) {
		this.attachGoodPrice = attachGoodPrice;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
