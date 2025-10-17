package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 批量应收确认服务
 *
 * @author auto create
 * @since 1.0, 2020-03-26 17:43:48
 */
public class AlipayBossFncSettleReceivableConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 3263385576381568525L;

	/**
	 * 批量应收确认请求列表
	 */
	@ApiListField("receivable_confirm_order_list")
	@ApiField("receivable_confirm_order")
	private List<ReceivableConfirmOrder> receivableConfirmOrderList;

	public List<ReceivableConfirmOrder> getReceivableConfirmOrderList() {
		return this.receivableConfirmOrderList;
	}
	public void setReceivableConfirmOrderList(List<ReceivableConfirmOrder> receivableConfirmOrderList) {
		this.receivableConfirmOrderList = receivableConfirmOrderList;
	}

}
