package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryDetailAopResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.transfer.batch.querybatch response.
 * 
 * @author auto create
 * @since 1.0, 2019-03-08 15:29:11
 */
public class AlipayFundTransferBatchQuerybatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 2394985577228389659L;

	/** 
	 * 收款理由
	 */
	@ApiField("batch_memo")
	private String batchMemo;

	/** 
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * test
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * test
	 */
	@ApiField("batch_type")
	private String batchType;

	/** 
	 * 批次创建时间
	 */
	@ApiField("create_date")
	private String createDate;

	/** 
	 * 批次创建者ID（支付宝Id）
	 */
	@ApiField("create_user_id")
	private String createUserId;

	/** 
	 * 收付款明细的list
	 */
	@ApiListField("detail_list")
	@ApiField("query_detail_aop_result")
	private List<QueryDetailAopResult> detailList;

	/** 
	 * 扩展参数，map的json串格式
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * 单笔金额
	 */
	@ApiField("pay_amount_single")
	private String payAmountSingle;

	/** 
	 * test
	 */
	@ApiField("pay_amount_total")
	private String payAmountTotal;

	/** 
	 * test
	 */
	@ApiField("real_items_total")
	private String realItemsTotal;

	/** 
	 * test
	 */
	@ApiField("show_items_total")
	private String showItemsTotal;

	/** 
	 * 已付总金额
	 */
	@ApiField("success_amount_total")
	private String successAmountTotal;

	/** 
	 * 已付总笔数
	 */
	@ApiField("success_items_total")
	private String successItemsTotal;

	/** 
	 * 过期时间
	 */
	@ApiField("time_out_value")
	private String timeOutValue;

	/** 
	 * 用于防止遍历批次的token
	 */
	@ApiField("token")
	private String token;

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

	public void setBatchType(String batchType) {
		this.batchType = batchType;
	}
	public String getBatchType( ) {
		return this.batchType;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getCreateDate( ) {
		return this.createDate;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public String getCreateUserId( ) {
		return this.createUserId;
	}

	public void setDetailList(List<QueryDetailAopResult> detailList) {
		this.detailList = detailList;
	}
	public List<QueryDetailAopResult> getDetailList( ) {
		return this.detailList;
	}

	public void setExtParam(String extParam) {
		this.extParam = extParam;
	}
	public String getExtParam( ) {
		return this.extParam;
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

	public void setSuccessItemsTotal(String successItemsTotal) {
		this.successItemsTotal = successItemsTotal;
	}
	public String getSuccessItemsTotal( ) {
		return this.successItemsTotal;
	}

	public void setTimeOutValue(String timeOutValue) {
		this.timeOutValue = timeOutValue;
	}
	public String getTimeOutValue( ) {
		return this.timeOutValue;
	}

	public void setToken(String token) {
		this.token = token;
	}
	public String getToken( ) {
		return this.token;
	}

}
