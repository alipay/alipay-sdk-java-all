package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 产品开通列表
 *
 * @author auto create
 * @since 1.0, 2022-03-25 17:46:11
 */
public class RightNoOpenedList extends AlipayObject {

	private static final long serialVersionUID = 7183699163165847783L;

	/**
	 * 赠险标志
	 */
	@ApiField("gift_prod_code")
	private String giftProdCode;

	/**
	 * 是否开通
	 */
	@ApiField("opened")
	private Boolean opened;

	/**
	 * 赠险产品码
	 */
	@ApiField("right_no")
	private String rightNo;

	public String getGiftProdCode() {
		return this.giftProdCode;
	}
	public void setGiftProdCode(String giftProdCode) {
		this.giftProdCode = giftProdCode;
	}

	public Boolean getOpened() {
		return this.opened;
	}
	public void setOpened(Boolean opened) {
		this.opened = opened;
	}

	public String getRightNo() {
		return this.rightNo;
	}
	public void setRightNo(String rightNo) {
		this.rightNo = rightNo;
	}

}
