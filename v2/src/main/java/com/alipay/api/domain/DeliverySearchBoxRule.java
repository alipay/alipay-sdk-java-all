package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 推广搜索品牌box规则
 *
 * @author auto create
 * @since 1.0, 2023-03-22 20:10:03
 */
public class DeliverySearchBoxRule extends AlipayObject {

	private static final long serialVersionUID = 6358199242852522148L;

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
