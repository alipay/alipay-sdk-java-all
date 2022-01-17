package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 借呗-房抵贷-房产链通知借呗
 *
 * @author auto create
 * @since 1.0, 2021-06-29 14:03:46
 */
public class AlipayPcreditLoanHousemortgageRealtychainNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 2133723559115638653L;

	/**
	 * 合同签署人-用户签约事件必传
	 */
	@ApiField("contract_signatory")
	private ContractSignatory contractSignatory;

	/**
	 * 失败场景的错误码：HQF_REALTY_NOT_EXISTS-查无此房, OTHER-其他
	 */
	@ApiField("fail_code")
	private String failCode;

	/**
	 * 授信受理单据号
	 */
	@ApiField("out_no")
	private String outNo;

	/**
	 * 流程类型：房产查询-HQ，抵押-MG，解抵押-MGR
	 */
	@ApiField("rcp_flow")
	private String rcpFlow;

	/**
	 * 房产链单据号
	 */
	@ApiField("rcp_no")
	private String rcpNo;

	/**
	 * 通知场景
FINISH_REALTY_QUERY_PASS：房产查询成功
FINISH_REALTY_QUERY_REJECT：房产查询失败
CB_MG_SIGN_URL：抵押合同客户签署地址通知
CB_MG_SIGNED_PERSON：抵押合同单个客户完成签署通知
FINISH_MG_CT_BANK_SIGN_PASS：银行完成签署确认抵押
FINISH_MG_CT_BANK_SIGN_REJECT：银行终止抵押
	 */
	@ApiField("scene")
	private String scene;

	public ContractSignatory getContractSignatory() {
		return this.contractSignatory;
	}
	public void setContractSignatory(ContractSignatory contractSignatory) {
		this.contractSignatory = contractSignatory;
	}

	public String getFailCode() {
		return this.failCode;
	}
	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}

	public String getOutNo() {
		return this.outNo;
	}
	public void setOutNo(String outNo) {
		this.outNo = outNo;
	}

	public String getRcpFlow() {
		return this.rcpFlow;
	}
	public void setRcpFlow(String rcpFlow) {
		this.rcpFlow = rcpFlow;
	}

	public String getRcpNo() {
		return this.rcpNo;
	}
	public void setRcpNo(String rcpNo) {
		this.rcpNo = rcpNo;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
