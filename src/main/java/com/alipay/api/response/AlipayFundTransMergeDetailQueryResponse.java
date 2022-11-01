package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MergePayOrder;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.merge.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-08-25 19:51:44
 */
public class AlipayFundTransMergeDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4535146463819755945L;

	/** 
	 * 分渠道金额汇总
	 */
	@ApiField("amount_statistics")
	private String amountStatistics;

	/** 
	 * 总失败金额
	 */
	@ApiField("fail_total_amount")
	private String failTotalAmount;

	/** 
	 * 总失败笔数
	 */
	@ApiField("fail_total_count")
	private String failTotalCount;

	/** 
	 * 明细列表
	 */
	@ApiListField("item_list")
	@ApiField("merge_pay_order")
	private List<MergePayOrder> itemList;

	/** 
	 * 合并单号
	 */
	@ApiField("merge_order_id")
	private String mergeOrderId;

	/** 
	 * 订单标题
	 */
	@ApiField("order_title")
	private String orderTitle;

	/** 
	 * 支付宝登录号
	 */
	@ApiField("payer_logon_id")
	private String payerLogonId;

	/** 
	 * 业务上需要展示付款方名字
	 */
	@ApiField("payer_name")
	private String payerName;

	/** 
	 * 单据状态
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 总成功金额
	 */
	@ApiField("success_total_amount")
	private String successTotalAmount;

	/** 
	 * 总成功笔数
	 */
	@ApiField("success_total_count")
	private String successTotalCount;

	/** 
	 * 总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 总笔数
	 */
	@ApiField("total_count")
	private String totalCount;

	public void setAmountStatistics(String amountStatistics) {
		this.amountStatistics = amountStatistics;
	}
	public String getAmountStatistics( ) {
		return this.amountStatistics;
	}

	public void setFailTotalAmount(String failTotalAmount) {
		this.failTotalAmount = failTotalAmount;
	}
	public String getFailTotalAmount( ) {
		return this.failTotalAmount;
	}

	public void setFailTotalCount(String failTotalCount) {
		this.failTotalCount = failTotalCount;
	}
	public String getFailTotalCount( ) {
		return this.failTotalCount;
	}

	public void setItemList(List<MergePayOrder> itemList) {
		this.itemList = itemList;
	}
	public List<MergePayOrder> getItemList( ) {
		return this.itemList;
	}

	public void setMergeOrderId(String mergeOrderId) {
		this.mergeOrderId = mergeOrderId;
	}
	public String getMergeOrderId( ) {
		return this.mergeOrderId;
	}

	public void setOrderTitle(String orderTitle) {
		this.orderTitle = orderTitle;
	}
	public String getOrderTitle( ) {
		return this.orderTitle;
	}

	public void setPayerLogonId(String payerLogonId) {
		this.payerLogonId = payerLogonId;
	}
	public String getPayerLogonId( ) {
		return this.payerLogonId;
	}

	public void setPayerName(String payerName) {
		this.payerName = payerName;
	}
	public String getPayerName( ) {
		return this.payerName;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSuccessTotalAmount(String successTotalAmount) {
		this.successTotalAmount = successTotalAmount;
	}
	public String getSuccessTotalAmount( ) {
		return this.successTotalAmount;
	}

	public void setSuccessTotalCount(String successTotalCount) {
		this.successTotalCount = successTotalCount;
	}
	public String getSuccessTotalCount( ) {
		return this.successTotalCount;
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
