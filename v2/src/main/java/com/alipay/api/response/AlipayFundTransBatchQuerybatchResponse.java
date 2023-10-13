package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.QueryDetailAopResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.batch.querybatch response.
 * 
 * @author auto create
 * @since 1.0, 2023-05-30 23:48:52
 */
public class AlipayFundTransBatchQuerybatchResponse extends AlipayResponse {

	private static final long serialVersionUID = 7755878577133356355L;

	/** 
	 * 收款理由：创建时传入的收款说明
	 */
	@ApiField("batch_memo")
	private String batchMemo;

	/** 
	 * 批次编号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * INAVAILABLE:系统异常，
AVAILABLE：可付款，
FINISH：已完成，
SUCCESS：所有的单据创建成功并且都付款成功，
TIMEOUT：已过期
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * aa：AA收款，
general：活动收款，
support：群江湖救急
	 */
	@ApiField("batch_type")
	private String batchType;

	/** 
	 * 批次最后修改时间
	 */
	@ApiField("create_date")
	private Date createDate;

	/** 
	 * 批次创建者id
	 */
	@ApiField("create_user_id")
	private String createUserId;

	/** 
	 * 批次详情
	 */
	@ApiField("detail_list")
	private QueryDetailAopResult detailList;

	/** 
	 * 扩展数据，创建批次时传入的扩展数据；注：长度限制100
	 */
	@ApiField("ext_param")
	private String extParam;

	/** 
	 * 单笔金额，单位为元。注： AA收款为平均后的金额；活动收款为单笔金额； 江湖救急没有值；即创建批次时传入的相关数据
	 */
	@ApiField("pay_amount_single")
	private String payAmountSingle;

	/** 
	 * 总金额，单位为元。注：AA为收款总金额；活动收款为份数和单笔金额的积；江湖救急为目标金额；即为创建批次时传入的相关数据
	 */
	@ApiField("pay_amount_total")
	private String payAmountTotal;

	/** 
	 * 实际要创建的笔数。注：AA包括自己这里为show_items_total-1；活动收款为填写的份数;江湖救急没有值；即创建批次时传入的相关值
	 */
	@ApiField("real_items_total")
	private String realItemsTotal;

	/** 
	 * 显示的总笔数。注：AA收款为选择的人数；活动收款为填写的份数；江湖救急没有值；即创建批次时传入的相关值
	 */
	@ApiField("show_items_total")
	private String showItemsTotal;

	/** 
	 * 已付总金额，单位为元
	 */
	@ApiField("success_amount_total")
	private String successAmountTotal;

	/** 
	 * 已付总笔数
	 */
	@ApiField("success_items_total")
	private String successItemsTotal;

	/** 
	 * 过期时间，单位为小时
	 */
	@ApiField("time_out_value")
	private String timeOutValue;

	/** 
	 * token：创建批次时下发的token
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

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getCreateDate( ) {
		return this.createDate;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}
	public String getCreateUserId( ) {
		return this.createUserId;
	}

	public void setDetailList(QueryDetailAopResult detailList) {
		this.detailList = detailList;
	}
	public QueryDetailAopResult getDetailList( ) {
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
