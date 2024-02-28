package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询小程序订单对账列表信息
 *
 * @author auto create
 * @since 1.0, 2023-11-29 00:53:49
 */
public class AlipayOpenMiniOrderItembillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 5275521229838161839L;

	/**
	 * 订单创建日期，格式为yyyy-MM-dd
	 */
	@ApiField("create_time")
	private String createTime;

	/**
	 * 小程序应用ID
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 订单状态，传入此参数可查询指定状态的订单
	 */
	@ApiField("order_status")
	private String orderStatus;

	/**
	 * 分页页码，从1开始
	 */
	@ApiField("page_num")
	private Long pageNum;

	/**
	 * 分页大小
	 */
	@ApiField("page_size")
	private Long pageSize;

	/**
	 * 账单类型分类列表
	 */
	@ApiListField("service_type_list")
	@ApiField("string")
	private List<String> serviceTypeList;

	/**
	 * 结算状态，传入此参数可查询指定结算状态的订单
	 */
	@ApiField("settle_status")
	private String settleStatus;

	/**
	 * 订单结算日期，格式为yyyy-MM-dd
	 */
	@ApiField("settlement_date")
	private String settlementDate;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public String getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getOrderStatus() {
		return this.orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Long getPageNum() {
		return this.pageNum;
	}
	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

	public List<String> getServiceTypeList() {
		return this.serviceTypeList;
	}
	public void setServiceTypeList(List<String> serviceTypeList) {
		this.serviceTypeList = serviceTypeList;
	}

	public String getSettleStatus() {
		return this.settleStatus;
	}
	public void setSettleStatus(String settleStatus) {
		this.settleStatus = settleStatus;
	}

	public String getSettlementDate() {
		return this.settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
