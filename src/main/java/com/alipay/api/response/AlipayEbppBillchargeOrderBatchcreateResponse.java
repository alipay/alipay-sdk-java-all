package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SubOrderInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.billcharge.order.batchcreate response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-08 09:58:07
 */
public class AlipayEbppBillchargeOrderBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1766925863589951152L;

	/** 
	 * 主订单流水号
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 外部订单id
	 */
	@ApiField("out_biz_id")
	private String outBizId;

	/** 
	 * 主订单状态
I-等待付款 P-已支付 C-单据关闭
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 子订单列
	 */
	@ApiListField("sub_order_list")
	@ApiField("sub_order_info")
	private List<SubOrderInfo> subOrderList;

	/** 
	 * 总支付金额
	 */
	@ApiField("total_pay_amount")
	private String totalPayAmount;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutBizId(String outBizId) {
		this.outBizId = outBizId;
	}
	public String getOutBizId( ) {
		return this.outBizId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSubOrderList(List<SubOrderInfo> subOrderList) {
		this.subOrderList = subOrderList;
	}
	public List<SubOrderInfo> getSubOrderList( ) {
		return this.subOrderList;
	}

	public void setTotalPayAmount(String totalPayAmount) {
		this.totalPayAmount = totalPayAmount;
	}
	public String getTotalPayAmount( ) {
		return this.totalPayAmount;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
