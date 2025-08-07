package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 删除位置
 *
 * @author auto create
 * @since 1.0, 2025-06-09 09:57:47
 */
public class AlipayCommerceEducatePlaceInfoDeleteModel extends AlipayObject {

	private static final long serialVersionUID = 7266386161589451717L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 位置ID
	 */
	@ApiField("place_id")
	private String placeId;

	public String getInstId() {
		return this.instId;
	}
	public void setInstId(String instId) {
		this.instId = instId;
	}

	public String getPlaceId() {
		return this.placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

}
