package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BatchDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.aacollect.batch.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-07-04 16:38:04
 */
public class AlipayFundTransAacollectBatchQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5124146888135838712L;

	/** 
	 * 批次说明
	 */
	@ApiField("batch_memo")
	private String batchMemo;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 批次状态
     * INAVAILABLE：系统异常
     * AVAILABLE：可付款
     * SUCCESS：所有的单据创建成功并且都付款成功
     * TIMEOUT：已过期（时间过期且未成功的批次均返回TIMEOUT）
     * STOP：停止收款（用户主动停止收款，且批次未过期时返回STOP）
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 业务类型,客户端透传给收银台。默认值：biz_account_transfer
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 批次创建时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/** 
	 * 发起方（收款人）uid
	 */
	@ApiField("creater_user_id")
	private String createrUserId;

	/** 
	 * 付款明细list
	 */
	@ApiListField("detail_list")
	@ApiField("batch_detail_info")
	private List<BatchDetailInfo> detailList;

	/** 
	 * 调用方扩充参数
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * 已付款明细list
	 */
	@ApiListField("paid_detail_list")
	@ApiField("batch_detail_info")
	private List<BatchDetailInfo> paidDetailList;

	/** 
	 * 单笔金额，单位为元，有两位小数
	 */
	@ApiField("pay_amount_single")
	private String payAmountSingle;

	/** 
	 * 收款总金额，单位为元，有两位小数
	 */
	@ApiField("pay_amount_total")
	private String payAmountTotal;

	/** 
	 * 收款方看到总金额（不包括自己）例如：100元3个人AA，收款人看到的是33.34*2=66.68
	 */
	@ApiField("pay_amount_total_for_receiver")
	private String payAmountTotalForReceiver;

	/** 
	 * 实际要创建的笔数：AA如果包括自己这里为show_items_total-1，如果不包括自己这里为show_items_total
	 */
	@ApiField("real_items_total")
	private String realItemsTotal;

	/** 
	 * 显示总笔数
	 */
	@ApiField("show_items_total")
	private String showItemsTotal;

	/** 
	 * 已付总笔数
	 */
	@ApiField("success_amount_total")
	private String successAmountTotal;

	/** 
	 * 过期时间值，单位小时
	 */
	@ApiField("time_out_value")
	private String timeOutValue;

	/** 
	 * 未付款明细list
	 */
	@ApiListField("unpaid_detail_list")
	@ApiField("batch_detail_info")
	private List<BatchDetailInfo> unpaidDetailList;

	public void setBatchMemo(String batchMemo) {
		this.batchMemo = batchMemo;
	}
	public String getBatchMemo( ) {
		return this.batchMemo;
	}

	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}
	public String getBatchNo( ) {
		return this.batchNo;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	public String getBatchStatus( ) {
		return this.batchStatus;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCreateDate( ) {
		return this.createDate;
	}

	public void setCreaterUserId(String createrUserId) {
		this.createrUserId = createrUserId;
	}
	public String getCreaterUserId( ) {
		return this.createrUserId;
	}

	public void setDetailList(List<BatchDetailInfo> detailList) {
		this.detailList = detailList;
	}
	public List<BatchDetailInfo> getDetailList( ) {
		return this.detailList;
	}

	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	public String getExtParam( ) {
		return this.extParam;
	}

	public void setPaidDetailList(List<BatchDetailInfo> paidDetailList) {
		this.paidDetailList = paidDetailList;
	}
	public List<BatchDetailInfo> getPaidDetailList( ) {
		return this.paidDetailList;
	}

	public void setPayAmountSingle(String payAmountSingle) {
		this.payAmountSingle = payAmountSingle;
	}
	public String getPayAmountSingle( ) {
		return this.payAmountSingle;
	}

	public void setPayAmountTotal(String payAmountTotal) {
		this.payAmountTotal = payAmountTotal;
	}
	public String getPayAmountTotal( ) {
		return this.payAmountTotal;
	}

	public void setPayAmountTotalForReceiver(String payAmountTotalForReceiver) {
		this.payAmountTotalForReceiver = payAmountTotalForReceiver;
	}
	public String getPayAmountTotalForReceiver( ) {
		return this.payAmountTotalForReceiver;
	}

	public void setRealItemsTotal(String realItemsTotal) {
		this.realItemsTotal = realItemsTotal;
	}
	public String getRealItemsTotal( ) {
		return this.realItemsTotal;
	}

	public void setShowItemsTotal(String showItemsTotal) {
		this.showItemsTotal = showItemsTotal;
	}
	public String getShowItemsTotal( ) {
		return this.showItemsTotal;
	}

	public void setSuccessAmountTotal(String successAmountTotal) {
		this.successAmountTotal = successAmountTotal;
	}
	public String getSuccessAmountTotal( ) {
		return this.successAmountTotal;
	}

	public void setTimeOutValue(String timeOutValue) {
		this.timeOutValue = timeOutValue;
	}
	public String getTimeOutValue( ) {
		return this.timeOutValue;
	}

	public void setUnpaidDetailList(List<BatchDetailInfo> unpaidDetailList) {
		this.unpaidDetailList = unpaidDetailList;
	}
	public List<BatchDetailInfo> getUnpaidDetailList( ) {
		return this.unpaidDetailList;
	}

}
