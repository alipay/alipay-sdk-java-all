package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.SupvFundTransferDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.finance.fsupv.transfer.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-02-01 17:41:59
 */
public class AnttechBlockchainFinanceFsupvTransferQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8359597382471486586L;

	/** 
	 * 资金划拨受理后生产的流水
	 */
	@ApiField("accepted_no")
	private String acceptedNo;

	/** 
	 * 资金管控任务编号
	 */
	@ApiField("fund_supv_task_id")
	private String fundSupvTaskId;

	/** 
	 * 资金管控专户号
	 */
	@ApiField("supv_special_account_no")
	private String supvSpecialAccountNo;

	/** 
	 * 划拨说明
	 */
	@ApiField("transfer_desc")
	private String transferDesc;

	/** 
	 * 划拨明细，描述划拨金额及状态
	 */
	@ApiListField("transfer_detail")
	@ApiField("supv_fund_transfer_detail")
	private List<SupvFundTransferDetail> transferDetail;

	/** 
	 * 划拨状态
	 */
	@ApiField("transfer_status")
	private String transferStatus;

	public void setAcceptedNo(String acceptedNo) {
		this.acceptedNo = acceptedNo;
	}
	public String getAcceptedNo( ) {
		return this.acceptedNo;
	}

	public void setFundSupvTaskId(String fundSupvTaskId) {
		this.fundSupvTaskId = fundSupvTaskId;
	}
	public String getFundSupvTaskId( ) {
		return this.fundSupvTaskId;
	}

	public void setSupvSpecialAccountNo(String supvSpecialAccountNo) {
		this.supvSpecialAccountNo = supvSpecialAccountNo;
	}
	public String getSupvSpecialAccountNo( ) {
		return this.supvSpecialAccountNo;
	}

	public void setTransferDesc(String transferDesc) {
		this.transferDesc = transferDesc;
	}
	public String getTransferDesc( ) {
		return this.transferDesc;
	}

	public void setTransferDetail(List<SupvFundTransferDetail> transferDetail) {
		this.transferDetail = transferDetail;
	}
	public List<SupvFundTransferDetail> getTransferDetail( ) {
		return this.transferDetail;
	}

	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
	public String getTransferStatus( ) {
		return this.transferStatus;
	}

}
