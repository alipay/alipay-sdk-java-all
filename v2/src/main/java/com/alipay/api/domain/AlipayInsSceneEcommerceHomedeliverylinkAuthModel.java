package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取上门寄件链接接口
 *
 * @author auto create
 * @since 1.0, 2024-09-10 14:42:18
 */
public class AlipayInsSceneEcommerceHomedeliverylinkAuthModel extends AlipayObject {

	private static final long serialVersionUID = 8131356727229543174L;

	/**
	 * 买家联系地址
	 */
	@ApiField("buyer_contact_address")
	private LogisticsContactAddressDTO buyerContactAddress;

	/**
	 * 买家ID
	 */
	@ApiField("buyer_id")
	private String buyerId;

	/**
	 * 订单
	 */
	@ApiField("order_dto")
	private EcomOrderDTO orderDto;

	/**
	 * session过期时间
	 */
	@ApiField("out_session_expiration")
	private Date outSessionExpiration;

	/**
	 * sessionId 外部的token
	 */
	@ApiField("out_session_id")
	private String outSessionId;

	/**
	 * 合作商标识
	 */
	@ApiField("partner_org_id")
	private String partnerOrgId;

	/**
	 * 订单逆向状态
	 */
	@ApiField("refund_status")
	private String refundStatus;

	/**
	 * 关联保单号
	 */
	@ApiField("related_policy_no")
	private String relatedPolicyNo;

	/**
	 * 卖家同意退货时间
	 */
	@ApiField("seller_agree_refund_time")
	private Date sellerAgreeRefundTime;

	/**
	 * 卖家联系地址
	 */
	@ApiField("seller_contact_address")
	private LogisticsContactAddressDTO sellerContactAddress;

	/**
	 * 客户端渠道
	 */
	@ApiField("user_client")
	private String userClient;

	public LogisticsContactAddressDTO getBuyerContactAddress() {
		return this.buyerContactAddress;
	}
	public void setBuyerContactAddress(LogisticsContactAddressDTO buyerContactAddress) {
		this.buyerContactAddress = buyerContactAddress;
	}

	public String getBuyerId() {
		return this.buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public EcomOrderDTO getOrderDto() {
		return this.orderDto;
	}
	public void setOrderDto(EcomOrderDTO orderDto) {
		this.orderDto = orderDto;
	}

	public Date getOutSessionExpiration() {
		return this.outSessionExpiration;
	}
	public void setOutSessionExpiration(Date outSessionExpiration) {
		this.outSessionExpiration = outSessionExpiration;
	}

	public String getOutSessionId() {
		return this.outSessionId;
	}
	public void setOutSessionId(String outSessionId) {
		this.outSessionId = outSessionId;
	}

	public String getPartnerOrgId() {
		return this.partnerOrgId;
	}
	public void setPartnerOrgId(String partnerOrgId) {
		this.partnerOrgId = partnerOrgId;
	}

	public String getRefundStatus() {
		return this.refundStatus;
	}
	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	public String getRelatedPolicyNo() {
		return this.relatedPolicyNo;
	}
	public void setRelatedPolicyNo(String relatedPolicyNo) {
		this.relatedPolicyNo = relatedPolicyNo;
	}

	public Date getSellerAgreeRefundTime() {
		return this.sellerAgreeRefundTime;
	}
	public void setSellerAgreeRefundTime(Date sellerAgreeRefundTime) {
		this.sellerAgreeRefundTime = sellerAgreeRefundTime;
	}

	public LogisticsContactAddressDTO getSellerContactAddress() {
		return this.sellerContactAddress;
	}
	public void setSellerContactAddress(LogisticsContactAddressDTO sellerContactAddress) {
		this.sellerContactAddress = sellerContactAddress;
	}

	public String getUserClient() {
		return this.userClient;
	}
	public void setUserClient(String userClient) {
		this.userClient = userClient;
	}

}
