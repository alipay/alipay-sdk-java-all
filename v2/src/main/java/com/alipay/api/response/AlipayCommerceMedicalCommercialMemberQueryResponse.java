package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.commercial.member.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-04-23 17:22:01
 */
public class AlipayCommerceMedicalCommercialMemberQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1754192512796273541L;

	/** 
	 * 权益订单id，支付宝侧用户对商户某一权益的唯一订单子单id。该订单记录了用户的核销次数与总次数，以及订单状态
	 */
	@ApiField("biz_order_id")
	private String bizOrderId;

	/** 
	 * 权益总次数，-1代表不限次
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 用户权益的结束过期时间
	 */
	@ApiField("end_time")
	private Date endTime;

	/** 
	 * exist用于在商户查询某一用户是否具备会员资格时，返回的最终结果，true为具备资格，false为不具备。
	 */
	@ApiField("exist")
	private Boolean exist;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("open_id")
	private String openId;

	/** 
	 * 用户在支付宝支付后，医疗行业生成的唯一订单id。在履约通知接口会传递给商户，并且在会员卡权益新增时，商户需要识别用户并绑定当前生效订单id与商户侧用户可使用的权益
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * out_product_id为外部商户侧的权益唯一id，用于标记外部用户的权益
	 */
	@ApiField("out_product_id")
	private String outProductId;

	/** 
	 * 用户权益的开始生效时间
	 */
	@ApiField("start_time")
	private Date startTime;

	/** 
	 * 权益已核销次数
	 */
	@ApiField("usage_count")
	private String usageCount;

	/** 
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public void setBizOrderId(String bizOrderId) {
		this.bizOrderId = bizOrderId;
	}
	public String getBizOrderId( ) {
		return this.bizOrderId;
	}

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime( ) {
		return this.endTime;
	}

	public void setExist(Boolean exist) {
		this.exist = exist;
	}
	public Boolean getExist( ) {
		return this.exist;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}
	public String getOpenId( ) {
		return this.openId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOutProductId(String outProductId) {
		this.outProductId = outProductId;
	}
	public String getOutProductId( ) {
		return this.outProductId;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime( ) {
		return this.startTime;
	}

	public void setUsageCount(String usageCount) {
		this.usageCount = usageCount;
	}
	public String getUsageCount( ) {
		return this.usageCount;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId( ) {
		return this.userId;
	}

}
