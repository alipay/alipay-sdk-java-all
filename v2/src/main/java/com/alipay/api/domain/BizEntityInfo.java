package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务主体信息
 *
 * @author auto create
 * @since 1.0, 2025-03-25 12:45:37
 */
public class BizEntityInfo extends AlipayObject {

	private static final long serialVersionUID = 5596685331986592143L;

	/**
	 * 门店门头照image链接
	 */
	@ApiField("store_door_img")
	private String storeDoorImg;

	public String getStoreDoorImg() {
		return this.storeDoorImg;
	}
	public void setStoreDoorImg(String storeDoorImg) {
		this.storeDoorImg = storeDoorImg;
	}

}
