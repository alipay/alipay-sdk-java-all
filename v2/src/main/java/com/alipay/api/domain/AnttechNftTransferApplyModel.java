package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 藏品发放接口
 *
 * @author auto create
 * @since 1.0, 2025-04-17 17:39:23
 */
public class AnttechNftTransferApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6729671712463182831L;

	/**
	 * 调用方渠道租户，传租户id即可
	 */
	@ApiField("channel_tenant")
	private String channelTenant;

	/**
	 * 被转入用户的支付宝uid或手机号
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 参照idType
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 用户在商户购买的订单号，鲸探侧主要用来做幂等，调用方自己定义的幂等单据号
	 */
	@ApiField("order_no")
	private String orderNo;

	/**
	 * 用户购买价格，可以为0，单位分
	 */
	@ApiField("price_cent")
	private Long priceCent;

	/**
	 * 请求唯一ID，用于链路跟踪和问题排查
	 */
	@ApiField("req_msg_id")
	private String reqMsgId;

	/**
	 * 藏品标识sku
	 */
	@ApiField("sku_id")
	private Long skuId;

	public String getChannelTenant() {
		return this.channelTenant;
	}
	public void setChannelTenant(String channelTenant) {
		this.channelTenant = channelTenant;
	}

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOrderNo() {
		return this.orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public Long getPriceCent() {
		return this.priceCent;
	}
	public void setPriceCent(Long priceCent) {
		this.priceCent = priceCent;
	}

	public String getReqMsgId() {
		return this.reqMsgId;
	}
	public void setReqMsgId(String reqMsgId) {
		this.reqMsgId = reqMsgId;
	}

	public Long getSkuId() {
		return this.skuId;
	}
	public void setSkuId(Long skuId) {
		this.skuId = skuId;
	}

}
