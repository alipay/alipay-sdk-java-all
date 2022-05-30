package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 电子小票信息回流接口
 *
 * @author auto create
 * @since 1.0, 2022-03-11 17:46:36
 */
public class AlipayCommerceReceiptSendModel extends AlipayObject {

	private static final long serialVersionUID = 5297788898482463644L;

	/**
	 * 订单信息,最大限制10条
	 */
	@ApiListField("order_list")
	@ApiField("receipt_order_d_t_o")
	private List<ReceiptOrderDTO> orderList;

	/**
	 * 请求id，基于该字段做幂等校验，冲突返回错误ORDER_DUPLICATE
	 */
	@ApiField("record_id")
	private String recordId;

	public List<ReceiptOrderDTO> getOrderList() {
		return this.orderList;
	}
	public void setOrderList(List<ReceiptOrderDTO> orderList) {
		this.orderList = orderList;
	}

	public String getRecordId() {
		return this.recordId;
	}
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}

}
