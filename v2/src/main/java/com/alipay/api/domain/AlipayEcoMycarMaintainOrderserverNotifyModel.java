package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单内容变更接口
 *
 * @author auto create
 * @since 1.0, 2023-11-06 11:01:44
 */
public class AlipayEcoMycarMaintainOrderserverNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6435697566851333594L;

	/**
	 * 更改金额。变更项影响金额。金额增加为正数，金额减少为负数。金额单位(元)，保留两位小数。
	 */
	@ApiField("change_cost")
	private String changeCost;

	/**
	 * 变更描述，描述订单变更内容。
	 */
	@ApiField("change_desc")
	private String changeDesc;

	/**
	 * 车主平台订单编号
	 */
	@ApiField("order_no")
	private String orderNo;

	public String getChangeCost() {
		return this.changeCost;
	}
	public void setChangeCost(String changeCost) {
		this.changeCost = changeCost;
	}

	public String getChangeDesc() {
		return this.changeDesc;
	}
	public void setChangeDesc(String changeDesc) {
		this.changeDesc = changeDesc;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

}
