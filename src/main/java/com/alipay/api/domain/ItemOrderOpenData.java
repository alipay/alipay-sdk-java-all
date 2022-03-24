package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户订单中心商品订单开放接口返回结果
 *
 * @author auto create
 * @since 1.0, 2018-11-27 15:37:09
 */
public class ItemOrderOpenData extends AlipayObject {

	private static final long serialVersionUID = 7423622588925893717L;

	/**
	 * 商品订单扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 订单创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 订单修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 商品ID
	 */
	@ApiField("item_id")
	private String itemId;

	/**
	 * 商品名称
	 */
	@ApiField("item_name")
	private String itemName;

	/**
	 * 商品订单ID
	 */
	@ApiField("item_order_id")
	private String itemOrderId;

	/**
	 * 关联主订单ID
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * 商品数量
	 */
	@ApiField("quantity")
	private Long quantity;

	/**
	 * 实付金额；单位：分
	 */
	@ApiField("real_amount")
	private Long realAmount;

	/**
	 * 商品SKUID
	 */
	@ApiField("sku_id")
	private String skuId;

	/**
	 * 商品快照ID
	 */
	@ApiField("snapshot_id")
	private String snapshotId;

	/**
	 * 商品订单状态；INIT(初始化)、WAIT_PAY(待支付)、PAID(已支付)、SUCCESS_FINISHED(已完结)、REFUNDED(已退款)、CLOSED(已关闭)
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商户补贴金额；单位：分
	 */
	@ApiField("subsidy_amount")
	private Long subsidyAmount;

	/**
	 * 商品单价；单位：分
	 */
	@ApiField("unit_price")
	private Long unitPrice;

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
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

	public String getItemId() {
		return this.itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return this.itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemOrderId() {
		return this.itemOrderId;
	}
	public void setItemOrderId(String itemOrderId) {
		this.itemOrderId = itemOrderId;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Long getQuantity() {
		return this.quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public Long getRealAmount() {
		return this.realAmount;
	}
	public void setRealAmount(Long realAmount) {
		this.realAmount = realAmount;
	}

	public String getSkuId() {
		return this.skuId;
	}
	public void setSkuId(String skuId) {
		this.skuId = skuId;
	}

	public String getSnapshotId() {
		return this.snapshotId;
	}
	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public Long getSubsidyAmount() {
		return this.subsidyAmount;
	}
	public void setSubsidyAmount(Long subsidyAmount) {
		this.subsidyAmount = subsidyAmount;
	}

	public Long getUnitPrice() {
		return this.unitPrice;
	}
	public void setUnitPrice(Long unitPrice) {
		this.unitPrice = unitPrice;
	}

}
