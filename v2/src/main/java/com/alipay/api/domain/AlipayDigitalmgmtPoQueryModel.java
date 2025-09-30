package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 根据PO编号查询PO信息
 *
 * @author auto create
 * @since 1.0, 2025-08-07 19:07:45
 */
public class AlipayDigitalmgmtPoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3161657715757663987L;

	/**
	 * 实际需求方采购组织ID
	 */
	@ApiField("demander_purchase_org_id")
	private Long demanderPurchaseOrgId;

	/**
	 * PO编号集合
	 */
	@ApiListField("po_number_list")
	@ApiField("string")
	private List<String> poNumberList;

	/**
	 * PO视图，控制接口返回的信息量，参考{PoViewEnum}用逗号分隔
外部接口希望PO聚合返回的信息量越来越多，为了支持更加灵活的信息组装方式，由上面的枚举改为String，方便后续扩展）
 e.g. 希望返回"订单头+行+付款条款"："ITEM_INCLUDED,PAYMENT_PLAN_INCLUDED"
e.g. 希望返回"订单头+行+行上扩展信息+付款条款"："ITEM_INCLUDED_AND_EXT_INFO_INCLUDED,PAYMENT_PLAN_INCLUDED"
e.g. 希望返回"订单头+行+行上财务段值+付款条款"："ITEM_INCLUDED_AND_FINANCIAL_ATTRS,PAYMENT_PLAN_INCLUDED"
e.g. 希望返回"订单头+付款条款"："PAYMENT_PLAN_INCLUDED"
	 */
	@ApiField("po_view_control")
	private String poViewControl;

	/**
	 * 明细上的接收人
	 */
	@ApiField("receiver")
	private String receiver;

	/**
	 * 状态集合
	 */
	@ApiListField("status")
	@ApiField("string")
	private List<String> status;

	/**
	 * 供应商ID (非必传,如果传按照指定供应商查询)
	 */
	@ApiField("supplier_id")
	private String supplierId;

	public Long getDemanderPurchaseOrgId() {
		return this.demanderPurchaseOrgId;
	}
	public void setDemanderPurchaseOrgId(Long demanderPurchaseOrgId) {
		this.demanderPurchaseOrgId = demanderPurchaseOrgId;
	}

	public List<String> getPoNumberList() {
		return this.poNumberList;
	}
	public void setPoNumberList(List<String> poNumberList) {
		this.poNumberList = poNumberList;
	}

	public String getPoViewControl() {
		return this.poViewControl;
	}
	public void setPoViewControl(String poViewControl) {
		this.poViewControl = poViewControl;
	}

	public String getReceiver() {
		return this.receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}

	public List<String> getStatus() {
		return this.status;
	}
	public void setStatus(List<String> status) {
		this.status = status;
	}

	public String getSupplierId() {
		return this.supplierId;
	}
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}

}
