package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 会员购商品状态同步
 *
 * @author auto create
 * @since 1.0, 2026-09-23 14:12:51
 */
public class AlipayUserMemberbuyStatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2561499584824187841L;

	/**
	 * 淘侧商品id
	 */
	@ApiField("out_item_id")
	private String outItemId;

	/**
	 * 可售/不可售
	 */
	@ApiField("status")
	private String status;

	public String getOutItemId() {
		return this.outItemId;
	}
	public void setOutItemId(String outItemId) {
		this.outItemId = outItemId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
