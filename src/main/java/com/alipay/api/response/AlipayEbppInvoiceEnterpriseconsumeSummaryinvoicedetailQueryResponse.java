package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CompleteVoucherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.summaryinvoicedetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-01-05 11:41:05
 */
public class AlipayEbppInvoiceEnterpriseconsumeSummaryinvoicedetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3662528714323598952L;

	/** 
	 * 企业汇总场景下，即企业ID
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * 申请时间
	 */
	@ApiField("apply_date")
	private Date applyDate;

	/** 
	 * 已废弃，开票批次 ID（建议使用summary_id）
	 */
	@ApiField("batch_id")
	private String batchId;

	/** 
	 * 批次状态<br/>
    INIT：汇总批次初始化状态，未进行汇总<br/>
    SUMMARY：汇总批次化汇总完成，汇总金额计算完成<br/>
    PROCESS：汇总批次初始化状态，汇总开票申请提交成功<br/>
    NOT_SUPPORT：汇总开票商户业务能力不支持<br/>
    FAIL：汇总批次申请失败状态<br/>
    SUCCESS：汇总批次申请成功状态，此时发票已回传<br/>
    MANUAL_CONFIRM：汇总批次人工确认收票<br/>
	 */
	@ApiField("batch_status")
	private String batchStatus;

	/** 
	 * 发票内容
	 */
	@ApiListField("complete_voucher_list")
	@ApiField("complete_voucher_info")
	private List<CompleteVoucherInfo> completeVoucherList;

	/** 
	 * 账期结束时间
	 */
	@ApiField("gmt_biz_end")
	private Date gmtBizEnd;

	/** 
	 * 账期起始时间
	 */
	@ApiField("gmt_biz_start")
	private Date gmtBizStart;

	/** 
	 * 状态对应的展示明细内容<br/>
    初始化<br/>
    汇总完成<br/>
    开票中...<br/>
    不支持开票<br/>
    开票失败<br/>
    已开票<br/>
    确认已收票<br/>
	 */
	@ApiField("status_show_content")
	private String statusShowContent;

	/** 
	 * 开票批次 ID
	 */
	@ApiField("summary_id")
	private String summaryId;

	/** 
	 * 企业汇总场景下，即企业ID（建议使用account_id）
	 */
	@ApiField("user_id")
	private String userId;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
	public Date getApplyDate( ) {
		return this.applyDate;
	}

	public void setBatchId(String batchId) {
		this.batchId = batchId;
	}
	public String getBatchId( ) {
		return this.batchId;
	}

	public void setBatchStatus(String batchStatus) {
		this.batchStatus = batchStatus;
	}
	public String getBatchStatus( ) {
		return this.batchStatus;
	}

	public void setCompleteVoucherList(List<CompleteVoucherInfo> completeVoucherList) {
		this.completeVoucherList = completeVoucherList;
	}
	public List<CompleteVoucherInfo> getCompleteVoucherList( ) {
		return this.completeVoucherList;
	}

	public void setGmtBizEnd(Date gmtBizEnd) {
		this.gmtBizEnd = gmtBizEnd;
	}
	public Date getGmtBizEnd( ) {
		return this.gmtBizEnd;
	}

	public void setGmtBizStart(Date gmtBizStart) {
		this.gmtBizStart = gmtBizStart;
	}
	public Date getGmtBizStart( ) {
		return this.gmtBizStart;
	}

	public void setStatusShowContent(String statusShowContent) {
		this.statusShowContent = statusShowContent;
	}
	public String getStatusShowContent( ) {
		return this.statusShowContent;
	}

	public void setSummaryId(String summaryId) {
		this.summaryId = summaryId;
	}
	public String getSummaryId( ) {
		return this.summaryId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
