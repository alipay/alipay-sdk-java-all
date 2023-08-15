package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询小程序订单对账列表信息
 *
 * @author auto create
 * @since 1.0, 2023-08-09 16:49:59
 */
public class AlipayOpenMiniOrderItembillBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 2846666781775622792L;

	/**
	 * 小程序订单结算日期，格式为"yyyy-MM-dd"，如"2023-03-22"
	 */
	@ApiField("create_time")
	private Date createTime;

	/**
	 * 小程序ID，必填
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

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
	 * 小程序订单结算日期，格式为"yyyy-MM-dd"，如"2023-03-22"
	 */
	@ApiField("settlement_date")
	private Date settlementDate;

	/**
	 * 支付宝交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	public Date getCreateTime() {
		return this.createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
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

	public Date getSettlementDate() {
		return this.settlementDate;
	}
	public void setSettlementDate(Date settlementDate) {
		this.settlementDate = settlementDate;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

}
