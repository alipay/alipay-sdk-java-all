package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EcnyBatchTransferInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.ecny.fund.batchtransfer.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-05-14 10:17:45
 */
public class MybankEcnyFundBatchtransferQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6662626139632461476L;

	/** 
	 * 订单受理失败时，失败原因必填。
	 */
	@ApiField("batch_transfer_fail_reason")
	private String batchTransferFailReason;

	/** 
	 * 交易完成时间
	 */
	@ApiField("gmt_success")
	private Date gmtSuccess;

	/** 
	 * 网商银行订单号，处理完成时必填
	 */
	@ApiField("order_no")
	private String orderNo;

	/** 
	 * 由双方协商约定分配值
	 */
	@ApiField("out_request_from")
	private String outRequestFrom;

	/** 
	 * 仅支持字母、数字，作为幂等字段，需保证在调用方内部不重复
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/** 
	 * 批量代发单处理状态，枚举值：ACCEPTING-受理中，FINISH-处理完成，ACCEPT_FAIL-受理失败
	 */
	@ApiField("status")
	private String status;

	/** 
	 * 单位：元，精确到小数点后两位
	 */
	@ApiField("success_amount")
	private String successAmount;

	/** 
	 * 代发成功总笔数
	 */
	@ApiField("success_num")
	private Long successNum;

	/** 
	 * 单位为元，精确到小数点后两位
	 */
	@ApiField("total_amount")
	private String totalAmount;

	/** 
	 * 代发总笔数
	 */
	@ApiField("total_num")
	private Long totalNum;

	/** 
	 * null
	 */
	@ApiListField("transfer_info_list")
	@ApiField("ecny_batch_transfer_info")
	private List<EcnyBatchTransferInfo> transferInfoList;

	public void setBatchTransferFailReason(String batchTransferFailReason) {
		this.batchTransferFailReason = batchTransferFailReason;
	}
	public String getBatchTransferFailReason( ) {
		return this.batchTransferFailReason;
	}

	public void setGmtSuccess(Date gmtSuccess) {
		this.gmtSuccess = gmtSuccess;
	}
	public Date getGmtSuccess( ) {
		return this.gmtSuccess;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

	public void setOutRequestFrom(String outRequestFrom) {
		this.outRequestFrom = outRequestFrom;
	}
	public String getOutRequestFrom( ) {
		return this.outRequestFrom;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

	public void setSuccessAmount(String successAmount) {
		this.successAmount = successAmount;
	}
	public String getSuccessAmount( ) {
		return this.successAmount;
	}

	public void setSuccessNum(Long successNum) {
		this.successNum = successNum;
	}
	public Long getSuccessNum( ) {
		return this.successNum;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}
	public String getTotalAmount( ) {
		return this.totalAmount;
	}

	public void setTotalNum(Long totalNum) {
		this.totalNum = totalNum;
	}
	public Long getTotalNum( ) {
		return this.totalNum;
	}

	public void setTransferInfoList(List<EcnyBatchTransferInfo> transferInfoList) {
		this.transferInfoList = transferInfoList;
	}
	public List<EcnyBatchTransferInfo> getTransferInfoList( ) {
		return this.transferInfoList;
	}

}
