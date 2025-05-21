package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 合约订购关系返回模型
 *
 * @author auto create
 * @since 1.0, 2021-01-19 17:00:24
 */
public class ProductOrderDTO extends AlipayObject {

	private static final long serialVersionUID = 6248137741938593312L;

	/**
	 * 生效时间
	 */
	@ApiField("active_datetime")
	private String activeDatetime;

	/**
	 * 失效时间
	 */
	@ApiField("inactive_datetime")
	private String inactiveDatetime;

	/**
	 * 订购编号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订购者支付宝ID
	 */
	@ApiField("order_user_id")
	private String orderUserId;

	/**
	 * 订购平台
	 */
	@ApiField("ordered_channel")
	private String orderedChannel;

	/**
	 * 申请时间
	 */
	@ApiField("ordering_datetime")
	private String orderingDatetime;

	/**
	 * 外部商户ID
	 */
	@ApiField("out_merchant_id")
	private String outMerchantId;

	/**
	 * 产品名称
	 */
	@ApiField("prod_name")
	private String prodName;

	/**
	 * 产品码
	 */
	@ApiField("ps_code")
	private String psCode;

	/**
	 * 签约活动
	 */
	@ApiField("sign_activity_dto")
	private SignActivityDTO signActivityDto;

	/**
	 * 合约状态
	 */
	@ApiField("status")
	private String status;

	public String getActiveDatetime() {
		return this.activeDatetime;
	}
	public void setActiveDatetime(String activeDatetime) {
		this.activeDatetime = activeDatetime;
	}

	public String getInactiveDatetime() {
		return this.inactiveDatetime;
	}
	public void setInactiveDatetime(String inactiveDatetime) {
		this.inactiveDatetime = inactiveDatetime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderUserId() {
		return this.orderUserId;
	}
	public void setOrderUserId(String orderUserId) {
		this.orderUserId = orderUserId;
	}

	public String getOrderedChannel() {
		return this.orderedChannel;
	}
	public void setOrderedChannel(String orderedChannel) {
		this.orderedChannel = orderedChannel;
	}

	public String getOrderingDatetime() {
		return this.orderingDatetime;
	}
	public void setOrderingDatetime(String orderingDatetime) {
		this.orderingDatetime = orderingDatetime;
	}

	public String getOutMerchantId() {
		return this.outMerchantId;
	}
	public void setOutMerchantId(String outMerchantId) {
		this.outMerchantId = outMerchantId;
	}

	public String getProdName() {
		return this.prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getPsCode() {
		return this.psCode;
	}
	public void setPsCode(String psCode) {
		this.psCode = psCode;
	}

	public SignActivityDTO getSignActivityDto() {
		return this.signActivityDto;
	}
	public void setSignActivityDto(SignActivityDTO signActivityDto) {
		this.signActivityDto = signActivityDto;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
