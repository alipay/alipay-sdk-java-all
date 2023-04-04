package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流单状态查询
 *
 * @author auto create
 * @since 1.0, 2018-06-01 17:20:06
 */
public class KoubeiRetailWmsDeliveryorderprocessQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5791291228542735243L;

	/**
	 * 通知单id
	 */
	@ApiField("notice_order_id")
	private String noticeOrderId;

	public String getNoticeOrderId() {
		return this.noticeOrderId;
	}
	public void setNoticeOrderId(String noticeOrderId) {
		this.noticeOrderId = noticeOrderId;
	}

}
