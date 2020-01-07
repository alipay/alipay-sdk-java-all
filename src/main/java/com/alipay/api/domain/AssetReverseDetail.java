package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 逆向物料信息 - 退换货或取消订单
 *
 * @author auto create
 * @since 1.0, 2018-09-19 11:01:27
 */
public class AssetReverseDetail extends AlipayObject {

	private static final long serialVersionUID = 1386314185764741194L;

	/**
	 * 退货数量
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 取消订单或退货唯一ID
	 */
	@ApiField("assign_item_id")
	private String assignItemId;

	/**
	 * 批次号
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 物料状态
	 */
	@ApiField("goods_status")
	private String goodsStatus;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getAssignItemId() {
		return this.assignItemId;
	}
	public void setAssignItemId(String assignItemId) {
		this.assignItemId = assignItemId;
	}

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getGoodsStatus() {
		return this.goodsStatus;
	}
	public void setGoodsStatus(String goodsStatus) {
		this.goodsStatus = goodsStatus;
	}

}
