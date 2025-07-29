package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 资产明细DTO
 *
 * @author auto create
 * @since 1.0, 2025-06-25 21:54:56
 */
public class AssetTransferDetailDTO extends AlipayObject {

	private static final long serialVersionUID = 4676994696424687421L;

	/**
	 * 金额，单位分
	 */
	@ApiField("amount")
	private Long amount;

	/**
	 * 资产ID,指券id
	 */
	@ApiField("asset_id")
	private String assetId;

	/**
	 * 带出业务参数
	 */
	@ApiField("biz_param")
	private String bizParam;

	/**
	 * 业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 现金价值，单位为分
	 */
	@ApiField("cash")
	private Long cash;

	/**
	 * 交易消耗次数
	 */
	@ApiField("count")
	private Long count;

	/**
	 * 交易详情ID
	 */
	@ApiField("detail_id")
	private String detailId;

	/**
	 * 详细标签
	 */
	@ApiField("detail_tag")
	private String detailTag;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 订单状态，初始：I 成功：S
	 */
	@ApiField("status")
	private String status;

	/**
	 * 资产模板id
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 支付宝用户的userId。
	 */
	@ApiField("user_id")
	private String userId;

	public Long getAmount() {
		return this.amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public String getAssetId() {
		return this.assetId;
	}
	public void setAssetId(String assetId) {
		this.assetId = assetId;
	}

	public String getBizParam() {
		return this.bizParam;
	}
	public void setBizParam(String bizParam) {
		this.bizParam = bizParam;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public Long getCash() {
		return this.cash;
	}
	public void setCash(Long cash) {
		this.cash = cash;
	}

	public Long getCount() {
		return this.count;
	}
	public void setCount(Long count) {
		this.count = count;
	}

	public String getDetailId() {
		return this.detailId;
	}
	public void setDetailId(String detailId) {
		this.detailId = detailId;
	}

	public String getDetailTag() {
		return this.detailTag;
	}
	public void setDetailTag(String detailTag) {
		this.detailTag = detailTag;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
