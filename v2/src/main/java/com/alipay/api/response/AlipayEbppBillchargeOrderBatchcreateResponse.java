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
 * @since 1.0, 2025-03-19 13:12:26
 */
public class AlipayEbppBillchargeOrderBatchcreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 7733552484445664267L;

	/** 
	 * 行业收单流水,50新链路单笔订单创建的时候返回。对应原本的子订单号中的参数
	 */
	@ApiField("bill_no")
	private String billNo;

	/** 
	 * 用于作为交易号拉起 my.tradePay 收银台
	 */
	@ApiField("merge_trade_no")
	private String mergeTradeNo;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

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
	 * 统一收单流水号用于非合并支付情况下50新链路拉起收银台
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}
	public String getBillNo( ) {
		return this.billNo;
	}

	public void setMergeTradeNo(String mergeTradeNo) {
		this.mergeTradeNo = mergeTradeNo;
	}
	public String getMergeTradeNo( ) {
		return this.mergeTradeNo;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

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

	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}
	public String getTradeNo( ) {
		return this.tradeNo;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
