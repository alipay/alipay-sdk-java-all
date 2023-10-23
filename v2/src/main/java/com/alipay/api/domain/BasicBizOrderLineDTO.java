package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单明细行信息
 *
 * @author auto create
 * @since 1.0, 2023-01-03 21:40:17
 */
public class BasicBizOrderLineDTO extends AlipayObject {

	private static final long serialVersionUID = 6811325255711622854L;

	/**
	 * 合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 审核备注驳回原因
	 */
	@ApiField("audit_memo")
	private String auditMemo;

	/**
	 * 后台产品码
	 */
	@ApiField("fulfil_product_code")
	private String fulfilProductCode;

	/**
	 * 订单明细行状态
	 */
	@ApiField("order_line_state")
	private String orderLineState;

	/**
	 * 前台产品开通号
	 */
	@ApiField("pd_open_no")
	private String pdOpenNo;

	/**
	 * 开通账号列表
	 */
	@ApiField("permission_set_code")
	private String permissionSetCode;

	/**
	 * 权限集开通号
	 */
	@ApiField("permission_set_open_no")
	private String permissionSetOpenNo;

	/**
	 * 开通账号列表
	 */
	@ApiListField("purchaser")
	@ApiField("string")
	private List<String> purchaser;

	/**
	 * 开通账号类型
	 */
	@ApiField("purchaser_type")
	private String purchaserType;

	/**
	 * 前台产品码
	 */
	@ApiField("sales_product_code")
	private String salesProductCode;

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public String getAuditMemo() {
		return this.auditMemo;
	}
	public void setAuditMemo(String auditMemo) {
		this.auditMemo = auditMemo;
	}

	public String getFulfilProductCode() {
		return this.fulfilProductCode;
	}
	public void setFulfilProductCode(String fulfilProductCode) {
		this.fulfilProductCode = fulfilProductCode;
	}

	public String getOrderLineState() {
		return this.orderLineState;
	}
	public void setOrderLineState(String orderLineState) {
		this.orderLineState = orderLineState;
	}

	public String getPdOpenNo() {
		return this.pdOpenNo;
	}
	public void setPdOpenNo(String pdOpenNo) {
		this.pdOpenNo = pdOpenNo;
	}

	public String getPermissionSetCode() {
		return this.permissionSetCode;
	}
	public void setPermissionSetCode(String permissionSetCode) {
		this.permissionSetCode = permissionSetCode;
	}

	public String getPermissionSetOpenNo() {
		return this.permissionSetOpenNo;
	}
	public void setPermissionSetOpenNo(String permissionSetOpenNo) {
		this.permissionSetOpenNo = permissionSetOpenNo;
	}

	public List<String> getPurchaser() {
		return this.purchaser;
	}
	public void setPurchaser(List<String> purchaser) {
		this.purchaser = purchaser;
	}

	public String getPurchaserType() {
		return this.purchaserType;
	}
	public void setPurchaserType(String purchaserType) {
		this.purchaserType = purchaserType;
	}

	public String getSalesProductCode() {
		return this.salesProductCode;
	}
	public void setSalesProductCode(String salesProductCode) {
		this.salesProductCode = salesProductCode;
	}

}
