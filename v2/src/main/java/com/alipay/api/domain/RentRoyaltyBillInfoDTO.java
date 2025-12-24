package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 分账账单信息
 *
 * @author auto create
 * @since 1.0, 2025-04-24 14:27:34
 */
public class RentRoyaltyBillInfoDTO extends AlipayObject {

	private static final long serialVersionUID = 5379514614417839358L;

	/**
	 * 平台订单号
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/**
	 * 资方名称
	 */
	@ApiField("invest_name")
	private String investName;

	/**
	 * 资方pid
	 */
	@ApiField("invest_pid")
	private String investPid;

	/**
	 * 商家订单号
	 */
	@ApiField("out_order_id")
	private String outOrderId;

	/**
	 * 分账单明细列表
	 */
	@ApiListField("royalty_detail_list")
	@ApiField("rent_royalty_bill_detail_d_t_o")
	private List<RentRoyaltyBillDetailDTO> royaltyDetailList;

	/**
	 * 租赁商用户Id
	 */
	@ApiField("seller_id")
	private String sellerId;

	/**
	 * 商家名称
	 */
	@ApiField("seller_name")
	private String sellerName;

	public String getBizOrderId() {
		return this.bizOrderId;
	}
	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}

	public String getInvestName() {
		return this.investName;
	}
	public void setInvestName(String investName) {
		this.investName = investName;
	}

	public String getInvestPid() {
		return this.investPid;
	}
	public void setInvestPid(String investPid) {
		this.investPid = investPid;
	}

	public String getOutOrderId() {
		return this.outOrderId;
	}
	public void setOutOrderId(String outOrderId) {
		this.outOrderId = outOrderId;
	}

	public List<RentRoyaltyBillDetailDTO> getRoyaltyDetailList() {
		return this.royaltyDetailList;
	}
	public void setRoyaltyDetailList(List<RentRoyaltyBillDetailDTO> royaltyDetailList) {
		this.royaltyDetailList = royaltyDetailList;
	}

	public String getSellerId() {
		return this.sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return this.sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

}
