package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 付款申请单查询模型
 *
 * @author auto create
 * @since 1.0, 2021-09-28 14:28:22
 */
public class PaymentApplyQueryOrder extends AlipayObject {

	private static final long serialVersionUID = 6241717219467963991L;

	/**
	 * 发票受理单的外部单号out_bill_no
	 */
	@ApiListField("apply_relative_id_list")
	@ApiField("string")
	private List<String> applyRelativeIdList;

	/**
	 * 合约号
	 */
	@ApiField("arrangement_no")
	private String arrangementNo;

	/**
	 * 汇总单号billNo|预付单号（outBizNo）
	 */
	@ApiField("bill_no")
	private String billNo;

	/**
	 * 查询可票的账单 ,为空时sql查询不关注可票金额条件
	 */
	@ApiField("inv_accept_status")
	private String invAcceptStatus;

	/**
	 * 发票
	 */
	@ApiField("invoice_id")
	private String invoiceId;

	/**
	 * 商户名称pid
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	/**
	 * 结算状态
	 */
	@ApiListField("settle_status_list")
	@ApiField("string")
	private List<String> settleStatusList;

	/**
	 * 结算单类型
	 */
	@ApiField("type")
	private String type;

	public List<String> getApplyRelativeIdList() {
		return this.applyRelativeIdList;
	}
	public void setApplyRelativeIdList(List<String> applyRelativeIdList) {
		this.applyRelativeIdList = applyRelativeIdList;
	}

	public String getArrangementNo() {
		return this.arrangementNo;
	}
	public void setArrangementNo(String arrangementNo) {
		this.arrangementNo = arrangementNo;
	}

	public String getBillNo() {
		return this.billNo;
	}
	public void setBillNo(String billNo) {
		this.billNo = billNo;
	}

	public String getInvAcceptStatus() {
		return this.invAcceptStatus;
	}
	public void setInvAcceptStatus(String invAcceptStatus) {
		this.invAcceptStatus = invAcceptStatus;
	}

	public String getInvoiceId() {
		return this.invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

	public List<String> getSettleStatusList() {
		return this.settleStatusList;
	}
	public void setSettleStatusList(List<String> settleStatusList) {
		this.settleStatusList = settleStatusList;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
