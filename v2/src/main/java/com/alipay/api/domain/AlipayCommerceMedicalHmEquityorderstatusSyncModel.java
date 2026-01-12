package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健管订单状态同步
 *
 * @author auto create
 * @since 1.0, 2025-12-19 10:27:41
 */
public class AlipayCommerceMedicalHmEquityorderstatusSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3837455397584924463L;

	/**
	 * null
	 */
	@ApiListField("appoint_info_list")
	@ApiField("hm_appoint_info")
	private List<HmAppointInfo> appointInfoList;

	/**
	 * 健管用户uid
	 */
	@ApiField("hm_uid")
	private String hmUid;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 要修改的订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	public List<HmAppointInfo> getAppointInfoList() {
		return this.appointInfoList;
	}
	public void setAppointInfoList(List<HmAppointInfo> appointInfoList) {
		this.appointInfoList = appointInfoList;
	}

	public String getHmUid() {
		return this.hmUid;
	}
	public void setHmUid(String hmUid) {
		this.hmUid = hmUid;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

}
