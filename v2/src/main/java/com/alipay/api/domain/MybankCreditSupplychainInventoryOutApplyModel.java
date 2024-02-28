package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 供应链金融-交易库存出库
 *
 * @author auto create
 * @since 1.0, 2018-10-09 11:17:49
 */
public class MybankCreditSupplychainInventoryOutApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2813936216931235296L;

	/**
	 * 贷款合约编号
	 */
	@ApiField("ar_no")
	private String arNo;

	/**
	 * 资产列表
	 */
	@ApiListField("asset_info_list")
	@ApiField("inventory_info")
	private List<InventoryInfo> assetInfoList;

	/**
	 * 客户身份信息，在预付融资中代表的是买家的身份
	 */
	@ApiField("customer")
	private Member customer;

	/**
	 * 外部订单号，格式：机构ipRoleId_外部订单号
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 幂等编号，用于幂等控制，格式：机构ipRoleId_yyyymmddhhmmss_8位uniqId
	 */
	@ApiField("request_id")
	private String requestId;

	/**
	 * 销售产品码
	 */
	@ApiField("sale_pd_code")
	private String salePdCode;

	/**
	 * FACTORING：保理，PREPAYMENT：预付融资，CREDITPAY：信任付
	 */
	@ApiField("trade_type")
	private String tradeType;

	public String getArNo() {
		return this.arNo;
	}
	public void setArNo(String arNo) {
		this.arNo = arNo;
	}

	public List<InventoryInfo> getAssetInfoList() {
		return this.assetInfoList;
	}
	public void setAssetInfoList(List<InventoryInfo> assetInfoList) {
		this.assetInfoList = assetInfoList;
	}

	public Member getCustomer() {
		return this.customer;
	}
	public void setCustomer(Member customer) {
		this.customer = customer;
	}

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getSalePdCode() {
		return this.salePdCode;
	}
	public void setSalePdCode(String salePdCode) {
		this.salePdCode = salePdCode;
	}

	public String getTradeType() {
		return this.tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}

}
