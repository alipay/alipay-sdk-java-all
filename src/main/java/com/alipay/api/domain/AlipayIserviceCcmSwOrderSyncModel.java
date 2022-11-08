package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 商品订单同步
 *
 * @author auto create
 * @since 1.0, 2022-10-26 15:53:14
 */
public class AlipayIserviceCcmSwOrderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 3128314289186489588L;

	/**
	 * 订单金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 订单链接
	 */
	@ApiField("link_url")
	private String linkUrl;

	/**
	 * 订单物流数量
	 */
	@ApiField("logistic_count")
	private Long logisticCount;

	/**
	 * 物流信息列表
	 */
	@ApiListField("logistics")
	@ApiField("logistic_info")
	private List<LogisticInfo> logistics;

	/**
	 * 订单创建时间
	 */
	@ApiField("order_create_time")
	private String orderCreateTime;

	/**
	 * 订单id
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 普通订单：NORMAL
预售订单：PRE_SALE
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 订单商品种类
	 */
	@ApiField("spu_count")
	private Long spuCount;

	/**
	 * 订单商品信息
	 */
	@ApiListField("spus")
	@ApiField("spu_info")
	private List<SpuInfo> spus;

	/**
	 * 订单状态，目前支持以下几种状态
下单未支付	WAIT_PAY
支付未发货	PAIED
已发货	IN_DELIVERY
售后中	IN_AFTER_SALE
订单完成	FINISHED
	 */
	@ApiField("status")
	private String status;

	/**
	 * 订单子状态
	 */
	@ApiField("sub_status")
	private String subStatus;

	/**
	 * 下单用户id(外部系统ID)
	 */
	@ApiField("user_id")
	private String userId;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}
	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public Long getLogisticCount() {
		return this.logisticCount;
	}
	public void setLogisticCount(Long logisticCount) {
		this.logisticCount = logisticCount;
	}

	public List<LogisticInfo> getLogistics() {
		return this.logistics;
	}
	public void setLogistics(List<LogisticInfo> logistics) {
		this.logistics = logistics;
	}

	public String getOrderCreateTime() {
		return this.orderCreateTime;
	}
	public void setOrderCreateTime(String orderCreateTime) {
		this.orderCreateTime = orderCreateTime;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public Long getSpuCount() {
		return this.spuCount;
	}
	public void setSpuCount(Long spuCount) {
		this.spuCount = spuCount;
	}

	public List<SpuInfo> getSpus() {
		return this.spus;
	}
	public void setSpus(List<SpuInfo> spus) {
		this.spus = spus;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getSubStatus() {
		return this.subStatus;
	}
	public void setSubStatus(String subStatus) {
		this.subStatus = subStatus;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
