package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * AttachGoodReq
 *
 * @author auto create
 * @since 1.0, 2025-08-01 13:50:34
 */
public class AttachGoodReq extends AlipayObject {

	private static final long serialVersionUID = 4247254317443693885L;

	/**
	 * id
	 */
	@ApiField("attach_good_id")
	private String attachGoodId;

	/**
	 * 1
	 */
	@ApiField("quantity")
	private String quantity;

	public String getAttachGoodId() {
		return this.attachGoodId;
	}
	public void setAttachGoodId(String attachGoodId) {
		this.attachGoodId = attachGoodId;
	}

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

}
