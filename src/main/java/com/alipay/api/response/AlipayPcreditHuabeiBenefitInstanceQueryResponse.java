package com.alipay.api.response;

import java.util.Date;
import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitInstance;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.benefit.instance.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-07 20:51:15
 */
public class AlipayPcreditHuabeiBenefitInstanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3341557757291477393L;

	/** 
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/** 
	 * 权益商品详情列表
	 */
	@ApiListField("benefit_instance_list")
	@ApiField("benefit_instance")
	private List<BenefitInstance> benefitInstanceList;

	/** 
	 * 权益订单生效时间
	 */
	@ApiField("order_gmt_active")
	private Date orderGmtActive;

	/** 
	 * 权益订单失效时间
	 */
	@ApiField("order_gmt_expire")
	private Date orderGmtExpire;

	/** 
	 * 权益订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 权益订单状态
	 */
	@ApiField("order_status")
	private String orderStatus;

	/** 
	 * 商户侧唯一请求流水号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}
	public String getAlipayUserId( ) {
		return this.alipayUserId;
	}

	public void setBenefitInstanceList(List<BenefitInstance> benefitInstanceList) {
		this.benefitInstanceList = benefitInstanceList;
	}
	public List<BenefitInstance> getBenefitInstanceList( ) {
		return this.benefitInstanceList;
	}

	public void setOrderGmtActive(Date orderGmtActive) {
		this.orderGmtActive = orderGmtActive;
	}
	public Date getOrderGmtActive( ) {
		return this.orderGmtActive;
	}

	public void setOrderGmtExpire(Date orderGmtExpire) {
		this.orderGmtExpire = orderGmtExpire;
	}
	public Date getOrderGmtExpire( ) {
		return this.orderGmtExpire;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}
	public String getOutRequestNo( ) {
		return this.outRequestNo;
	}

}
