package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 退款活动信息
 *
 * @author auto create
 * @since 1.0, 2021-08-27 13:09:40
 */
public class RefundActivityInfo extends AlipayObject {

	private static final long serialVersionUID = 8173728668432828123L;

	/**
	 * 待退款的活动id。
	 */
	@ApiField("activity_id")
	private String activityId;

	/**
	 * 待退款的数量。

由于目前支付宝只支持下单时购买1个商品，因此退款也只支持数量为1的退款。
	 */
	@ApiField("quantity")
	private String quantity;

	/**
	 * 待失效的券码列表。

退款时传入的券码数量必须和 quantity一致。

单个code最长64位
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

	public String getQuantity() {
		return this.quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public List<String> getVoucherCodeList() {
		return this.voucherCodeList;
	}
	public void setVoucherCodeList(List<String> voucherCodeList) {
		this.voucherCodeList = voucherCodeList;
	}

}
