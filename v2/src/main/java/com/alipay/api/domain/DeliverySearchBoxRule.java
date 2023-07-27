package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广搜索品牌box规则
 *
 * @author auto create
 * @since 1.0, 2023-07-12 10:39:25
 */
public class DeliverySearchBoxRule extends AlipayObject {

	private static final long serialVersionUID = 3562433997135915866L;

	/**
	 * 指定搜索直达区域
	 */
	@ApiField("box_id")
	private String boxId;

	public String getBoxId() {
		return this.boxId;
	}
	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}

}
