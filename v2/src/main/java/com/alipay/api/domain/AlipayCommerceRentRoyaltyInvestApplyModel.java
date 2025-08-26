package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 资方申请分账能力
 *
 * @author auto create
 * @since 1.0, 2025-08-19 15:25:29
 */
public class AlipayCommerceRentRoyaltyInvestApplyModel extends AlipayObject {

	private static final long serialVersionUID = 3466921974941359625L;

	/**
	 * 操作类型，PAUSE：分账暂停；RECOVER：分账恢复
	 */
	@ApiField("operate_type")
	private String operateType;

	/**
	 * 交易组件订单id列表
	 */
	@ApiListField("order_list")
	@ApiField("string")
	private List<String> orderList;

	public String getOperateType() {
		return this.operateType;
	}
	public void setOperateType(String operateType) {
		this.operateType = operateType;
	}

	public List<String> getOrderList() {
		return this.orderList;
	}
	public void setOrderList(List<String> orderList) {
		this.orderList = orderList;
	}

}
