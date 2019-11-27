package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 权益商品详情
 *
 * @author auto create
 * @since 1.0, 2018-12-27 10:54:06
 */
public class BenefitInstance extends AlipayObject {

	private static final long serialVersionUID = 7419342945863533639L;

	/**
	 * 描述
	 */
	@ApiField("goods_desc")
	private String goodsDesc;

	/**
	 * 权益商品副标题
	 */
	@ApiField("goods_sub_title")
	private String goodsSubTitle;

	/**
	 * 权益商品标题
	 */
	@ApiField("goods_title")
	private String goodsTitle;

	/**
	 * 权益实例额外信息
	 */
	@ApiField("instance_extra")
	private String instanceExtra;

	/**
	 * 权益实例生效时间
	 */
	@ApiField("instance_gmt_active")
	private Date instanceGmtActive;

	/**
	 * 权益实例失效时间
	 */
	@ApiField("instance_gmt_expire")
	private Date instanceGmtExpire;

	/**
	 * 权益实例ID
	 */
	@ApiField("instance_id")
	private String instanceId;

	/**
	 * 权益实例状态
	 */
	@ApiField("instance_status")
	private String instanceStatus;

	/**
	 * 权益订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 权益商品id
	 */
	@ApiField("out_goods_id")
	private String outGoodsId;

	/**
	 * 权益商品sku_id
	 */
	@ApiField("out_sku_id")
	private String outSkuId;

	/**
	 * 权益sku描述
	 */
	@ApiField("sku_desc")
	private String skuDesc;

	/**
	 * 权益sku副标题
	 */
	@ApiField("sku_sub_title")
	private String skuSubTitle;

	/**
	 * 权益sku标题
	 */
	@ApiField("sku_title")
	private String skuTitle;

	public String getGoodsDesc() {
		return this.goodsDesc;
	}
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public String getGoodsSubTitle() {
		return this.goodsSubTitle;
	}
	public void setGoodsSubTitle(String goodsSubTitle) {
		this.goodsSubTitle = goodsSubTitle;
	}

	public String getGoodsTitle() {
		return this.goodsTitle;
	}
	public void setGoodsTitle(String goodsTitle) {
		this.goodsTitle = goodsTitle;
	}

	public String getInstanceExtra() {
		return this.instanceExtra;
	}
	public void setInstanceExtra(String instanceExtra) {
		this.instanceExtra = instanceExtra;
	}

	public Date getInstanceGmtActive() {
		return this.instanceGmtActive;
	}
	public void setInstanceGmtActive(Date instanceGmtActive) {
		this.instanceGmtActive = instanceGmtActive;
	}

	public Date getInstanceGmtExpire() {
		return this.instanceGmtExpire;
	}
	public void setInstanceGmtExpire(Date instanceGmtExpire) {
		this.instanceGmtExpire = instanceGmtExpire;
	}

	public String getInstanceId() {
		return this.instanceId;
	}
	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
	}

	public String getInstanceStatus() {
		return this.instanceStatus;
	}
	public void setInstanceStatus(String instanceStatus) {
		this.instanceStatus = instanceStatus;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutGoodsId() {
		return this.outGoodsId;
	}
	public void setOutGoodsId(String outGoodsId) {
		this.outGoodsId = outGoodsId;
	}

	public String getOutSkuId() {
		return this.outSkuId;
	}
	public void setOutSkuId(String outSkuId) {
		this.outSkuId = outSkuId;
	}

	public String getSkuDesc() {
		return this.skuDesc;
	}
	public void setSkuDesc(String skuDesc) {
		this.skuDesc = skuDesc;
	}

	public String getSkuSubTitle() {
		return this.skuSubTitle;
	}
	public void setSkuSubTitle(String skuSubTitle) {
		this.skuSubTitle = skuSubTitle;
	}

	public String getSkuTitle() {
		return this.skuTitle;
	}
	public void setSkuTitle(String skuTitle) {
		this.skuTitle = skuTitle;
	}

}
