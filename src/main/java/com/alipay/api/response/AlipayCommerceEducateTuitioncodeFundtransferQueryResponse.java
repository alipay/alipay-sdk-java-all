package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.EduPlanInstanceInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.tuitioncode.fundtransfer.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-04 18:12:50
 */
public class AlipayCommerceEducateTuitioncodeFundtransferQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3579247996969157133L;

	/** 
	 * 资金划拨单的理论划拨金额
	 */
	@ApiField("amount")
	private String amount;

	/** 
	 * 学费码的资金划拨单号。是学费码打款单、退款单的业务单号
	 */
	@ApiField("fund_transfer_no")
	private String fundTransferNo;

	/** 
	 * 资金划拨的外部请求编号，对应服务商申请打款或申请退款请求的request_id
	 */
	@ApiField("out_req_no")
	private String outReqNo;

	/** 
	 * 资金划拨单关联任务
	 */
	@ApiListField("plan_list")
	@ApiField("edu_plan_instance_info")
	private List<EduPlanInstanceInfo> planList;

	/** 
	 * 学费码的资金划拨状态：0-待划拨；1-划拨中；3-划拨成功
	 */
	@ApiField("transfer_status")
	private String transferStatus;

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

	public void setFundTransferNo(String fundTransferNo) {
		this.fundTransferNo = fundTransferNo;
	}
	public String getFundTransferNo( ) {
		return this.fundTransferNo;
	}

	public void setOutReqNo(String outReqNo) {
		this.outReqNo = outReqNo;
	}
	public String getOutReqNo( ) {
		return this.outReqNo;
	}

	public void setPlanList(List<EduPlanInstanceInfo> planList) {
		this.planList = planList;
	}
	public List<EduPlanInstanceInfo> getPlanList( ) {
		return this.planList;
	}

	public void setTransferStatus(String transferStatus) {
		this.transferStatus = transferStatus;
	}
	public String getTransferStatus( ) {
		return this.transferStatus;
	}

}
