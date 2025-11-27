package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询位置详情
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:32:49
 */
public class AlipayCommerceEducatePlaceDetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1743924515364316178L;

	/**
	 * 机构内标
	 */
	@ApiField("inst_id")
	private String instId;

	/**
	 * 位置外部唯一编号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getPlaceId() {
		return this.placeId;
	}
	public void setPlaceId(String placeId) {
		this.placeId = placeId;
	}

}
