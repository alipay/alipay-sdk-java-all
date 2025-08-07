package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款活动信息
 *
 * @author auto create
 * @since 1.0, 2023-02-28 20:23:28
 */
public class RefundConfirmActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 1164832838428445494L;

	/**
	 * 活动id
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 待退款的数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 退款确认活动的券码列表
	 */
	@ApiListField("voucher_code_list")
	@ApiField("string")
	private List<String> voucherCodeList;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public List<String> getVoucherCodeList() {
		return this.voucherCodeList;
	}
	public void setVoucherCodeList(List<String> voucherCodeList) {
		this.voucherCodeList = voucherCodeList;
	}

}
