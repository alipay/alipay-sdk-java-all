package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.direct.agent.query response.
 * 
 * @author auto create
 * @since 1.0, 2025-01-09 09:52:22
 */
public class AntMerchantExpandDirectAgentQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2856225443495792547L;

	/** 
	 * 蚂蚁门店shop_id为空的原因
	 */
	@ApiField("none_shop_reason")
	private String noneShopReason;

	/** 
	 * 商户支付宝账号对应的商户pid
	 */
	@ApiField("pid")
	private String pid;

	/** 
	 * 支付宝风控审核不通过原因
	 */
	@ApiField("reject_reason")
	private String rejectReason;

	/** 
	 * status=SUCCESS时，支付宝内部创建成功的蚂蚁门店ID。如果蚂蚁门店ID返回为空则代表未创建成功，需自行参考<a href="https://opendocs.alipay.com/open/014vrh?pathHash=37da4e7d">蚂蚁门店管理</a>创建门店。
	 */
	@ApiField("shop_id")
	private String shopId;

	/** 
	 * 商户进件状态
	 */
	@ApiField("status")
	private String status;

	public void setNoneShopReason(String noneShopReason) {
		this.noneShopReason = noneShopReason;
	}
	public String getNoneShopReason( ) {
		return this.noneShopReason;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

	public void setRejectReason(String rejectReason) {
		this.rejectReason = rejectReason;
	}
	public String getRejectReason( ) {
		return this.rejectReason;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}
	public String getShopId( ) {
		return this.shopId;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
