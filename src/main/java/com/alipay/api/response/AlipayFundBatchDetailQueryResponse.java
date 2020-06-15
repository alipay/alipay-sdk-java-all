package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AccDetailModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.batch.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-04-13 15:25:13
 */
public class AlipayFundBatchDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8619931638551865817L;

	/** 
	 * 1）当批次状态为INIT状态时，明细信息还未落地，返回明细信息为空
2）如果以上都没有问题，返回明细为空，请检查是否以下情况导致：
1. 校验商户只能查询自己上传的批次信息，批次号不存在或者不是该商户上传的批次。
2. 查询条件没有查询到结果，包括总共5页，商户要求查询第6页的内容。
3. 查询的状态不存在。
	 */
	@ApiListField("acc_detail_list")
	@ApiField("acc_detail_model")
	private List<AccDetailModel> accDetailList;

	/** 
	 * 商户请求的批次流水号，同请求中的"batch_no"。（注：只有境外代发使用，其他场景返回out_batch_no）
	 */
	@ApiField("batch_no")
	private String batchNo;

	/** 
	 * 境外场景批次状态：
INIT	批次已接收
WAIT_APPLY 批次资金准备中
DEALING 批次处理中
FINISH 批次处理完成
FAIL 全部处理失败
UNKNOWN 未知状态

其他场景批次状态：
INIT	批次已接收
WAIT_PAY 等待支付
DEALING 批次处理中
SUCCESS 批次处理全部成功
PART_SUCCESS 批次处理部分成功
FAIL 全部处理失败
DISUSE 批次单据废弃
INVALID 批次单据中明细全部无效
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 支付宝系统内部批次请求id。
	 */
	@ApiField("batch_trans_id")
	private String batchTransId;

	/** 
	 * 批量代发业务标识。

批量代发到支付宝账户：BATCH_TRANS_ACC
批量代发到银行账户：BATCH_TRANS_BC
（注：只有境外代发使用，其他场景返回product_code）
	 */
	@ApiField("biz_code")
	private String bizCode;

	/** 
	 * 批量代发业务场景。
如：
GLOBAL：全球代发，多币种代发（包括除人民币以外的同币种代发），需要支付宝做货币兑换。
LOCAL：纯人民币代发，不需要支付宝做货币兑换。
MESSAGE_BATCH_PAY：接口报文代发。
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/** 
	 * 批次失败错误码. 
大部分情况是没有的. 只有余额不足超时关闭或者付款方账户状态不正常
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 失败金额
	 */
	@ApiField("fail_amount")
	private String failAmount;

	/** 
	 * 失败笔数
	 */
	@ApiField("fail_count")
	private Long failCount;

	/** 
	 * 批次失败错误原因
	 */
	@ApiField("fail_reason")
	private String failReason;

	/** 
	 * 批次处理完成时间
	 */
	@ApiField("gmt_finish")
	private String gmtFinish;

	/** 
	 * 批次支付完成时间
	 */
	@ApiField("gmt_pay_finish")
	private String gmtPayFinish;

	/** 
	 * 商户的批次号
	 */
	@ApiField("out_batch_no")
	private String outBatchNo;

	/** 
	 * 当前页数
	 */
	@ApiField("page_num")
	private Long pageNum;

	/** 
	 * 当前记录数（默认500，达不到500按实际记录返回）。
	 */
	@ApiField("page_size")
	private Long pageSize;

	/** 
	 * 付款方身份标识
	 */
	@ApiField("payer_id")
	private String payerId;

	/** 
	 * 付款方需要支付的金额，受理成功（status为APPLIED）之后才会有值，受理成功之前是0。
	 */
	@ApiField("payment_amount")
	private String paymentAmount;

	/** 
	 * 支付币种, 与代发请求的payment_currency相同.
	 */
	@ApiField("payment_currency")
	private String paymentCurrency;

	/** 
	 * 业务产品码。不同产品值不同，具体值联系支付宝确认。
	 */
	@ApiField("product_code")
	private String productCode;

	/** 
	 * 签约了批量代发产品的支付宝账号。（注：境外代发场景加会返回）
	 */
	@ApiField("sign_principal")
	private String signPrincipal;

	/** 
	 * 成功金额
	 */
	@ApiField("success_amount")
	private String successAmount;

	/** 
	 * 成功笔数
	 */
	@ApiField("success_count")
	private Long successCount;

	/** 
	 * 批次总金额
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 总记录数
	 */
	@ApiField("total_item_count")
	private Long totalItemCount;

	/** 
	 * 总页数
	 */
	@ApiField("total_page_count")
	private Long totalPageCount;

	public void setAccDetailList(List<AccDetailModel> accDetailList) {
		this.accDetailList = accDetailList;
	}
	public List<AccDetailModel> getAccDetailList( ) {
		return this.accDetailList;
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

	public void setBatchTransId(String batchTransId) {
		this.batchTransId = batchTransId;
	}
	public String getBatchTransId( ) {
		return this.batchTransId;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}
	public String getBizCode( ) {
		return this.bizCode;
	}

	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}
	public String getBizScene( ) {
		return this.bizScene;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setFailAmount(String failAmount) {
		this.failAmount = failAmount;
	}
	public String getFailAmount( ) {
		return this.failAmount;
	}

	public void setFailCount(Long failCount) {
		this.failCount = failCount;
	}
	public Long getFailCount( ) {
		return this.failCount;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
	public String getFailReason( ) {
		return this.failReason;
	}

	public void setGmtFinish(String gmtFinish) {
		this.gmtFinish = gmtFinish;
	}
	public String getGmtFinish( ) {
		return this.gmtFinish;
	}

	public void setGmtPayFinish(String gmtPayFinish) {
		this.gmtPayFinish = gmtPayFinish;
	}
	public String getGmtPayFinish( ) {
		return this.gmtPayFinish;
	}

	public void setOutBatchNo(String outBatchNo) {
		this.outBatchNo = outBatchNo;
	}
	public String getOutBatchNo( ) {
		return this.outBatchNo;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
	}
	public Long getPageNum( ) {
		return this.pageNum;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize( ) {
		return this.pageSize;
	}

	public void setPayerId(String payerId) {
		this.payerId = payerId;
	}
	public String getPayerId( ) {
		return this.payerId;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public String getPaymentAmount( ) {
		return this.paymentAmount;
	}

	public void setPaymentCurrency(String paymentCurrency) {
		this.paymentCurrency = paymentCurrency;
	}
	public String getPaymentCurrency( ) {
		return this.paymentCurrency;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductCode( ) {
		return this.productCode;
	}

	public void setSignPrincipal(String signPrincipal) {
		this.signPrincipal = signPrincipal;
	}
	public String getSignPrincipal( ) {
		return this.signPrincipal;
	}

	public void setSuccessAmount(String successAmount) {
		this.successAmount = successAmount;
	}
	public String getSuccessAmount( ) {
		return this.successAmount;
	}

	public void setSuccessCount(Long successCount) {
		this.successCount = successCount;
	}
	public Long getSuccessCount( ) {
		return this.successCount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalItemCount(Long totalItemCount) {
		this.totalItemCount = totalItemCount;
	}
	public Long getTotalItemCount( ) {
		return this.totalItemCount;
	}

	public void setTotalPageCount(Long totalPageCount) {
		this.totalPageCount = totalPageCount;
	}
	public Long getTotalPageCount( ) {
		return this.totalPageCount;
	}

}
