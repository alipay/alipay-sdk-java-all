package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EndowmentOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.zcb.endowmentorder.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayFinanceZcbEndowmentorderDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5521222834244731116L;

	/** 
	 * order_list：查询出来的养老险指定产品的订单列表，EndowmentOrder模型包含：orderId，applyAmount，payTime，taRrequestId 4个字段
	 */
	@ApiListField("order_list")
	@ApiField("endowment_order")
	private List<EndowmentOrder> orderList;

	/** 
	 * total_amount:按照时间区间查询出的订单金额总和，可以用来跟查询出来的明细列表的金额进行核对以发现问题
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * total_count:按照时间区间查询出的订单的总笔数，可以根据该字段与明细列表的笔数进行对比，可以用来发现返回数据笔数是否有问题
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setOrderList(List<EndowmentOrder> orderList) {
		this.orderList = orderList;
	}
	public List<EndowmentOrder> getOrderList( ) {
		return this.orderList;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getTotalCount( ) {
		return this.totalCount;
	}

}
