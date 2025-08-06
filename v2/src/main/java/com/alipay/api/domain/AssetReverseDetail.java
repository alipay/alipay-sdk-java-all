package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 逆向物料信息 - 退换货或取消订单
 *
 * @author auto create
 * @since 1.0, 2023-12-15 14:54:44
 */
public class AssetReverseDetail extends AlipayObject {

	private static final long serialVersionUID = 4149438525449275681L;

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

	/**
	 * 地址是否修改成功标志；取消/退货  不填
地址修改  必填
	 */
	@ApiField("success")
	private Boolean success;

	/**
	 * 过账日期
	 */
	@ApiField("voucher_time")
	private String voucherTime;

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

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getVoucherTime() {
		return this.voucherTime;
	}
	public void setVoucherTime(String voucherTime) {
		this.voucherTime = voucherTime;
	}

}
