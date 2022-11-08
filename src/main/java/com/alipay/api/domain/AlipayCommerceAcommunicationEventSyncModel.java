package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 充值中心外部机构订单状态同步
 *
 * @author auto create
 * @since 1.0, 2022-09-27 10:03:58
 */
public class AlipayCommerceAcommunicationEventSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4777126155448313261L;

	/**
	 * 手机号,卡号,户号等
	 */
	@ApiField("bill_key")
	private String billKey;

	/**
	 * 一级业务标识
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 产品类目
	 */
	@ApiField("category")
	private String category;

	/**
	 * 渠道标识
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 事件发生时间
	 */
	@ApiField("event_time")
	private Date eventTime;

	/**
	 * 事件类型，
例如创单 create
办理失败 fail
	 */
	@ApiField("event_type")
	private String eventType;

	/**
	 * 外部订单号
	 */
	@ApiField("flow_id")
	private String flowId;

	/**
	 * 合作伙伴名称
	 */
	@ApiField("partner_name")
	private String partnerName;

	/**
	 * 产品id
	 */
	@ApiField("product_id")
	private String productId;

	/**
	 * 产品sku, json格式
	 */
	@ApiField("sku_info")
	private String skuInfo;

	/**
	 * 二级业务标识
	 */
	@ApiField("sub_biz_type")
	private String subBizType;

	/**
	 * 蚂蚁统一会员ID
	 */
	@ApiField("user_id")
	private String userId;

	public String getBillKey() {
		return this.billKey;
	}
	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public Date getEventTime() {
		return this.eventTime;
	}
	public void setEventTime(Date eventTime) {
		this.eventTime = eventTime;
	}

	public String getEventType() {
		return this.eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getFlowId() {
		return this.flowId;
	}
	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}

	public String getPartnerName() {
		return this.partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getSkuInfo() {
		return this.skuInfo;
	}
	public void setSkuInfo(String skuInfo) {
		this.skuInfo = skuInfo;
	}

	public String getSubBizType() {
		return this.subBizType;
	}
	public void setSubBizType(String subBizType) {
		this.subBizType = subBizType;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
