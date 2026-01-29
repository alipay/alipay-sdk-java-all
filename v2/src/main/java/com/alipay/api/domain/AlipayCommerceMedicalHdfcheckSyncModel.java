package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 履约方同步检验检查单状态数据V2
 *
 * @author auto create
 * @since 1.0, 2025-12-26 11:03:52
 */
public class AlipayCommerceMedicalHdfcheckSyncModel extends AlipayObject {

	private static final long serialVersionUID = 2115148685129655535L;

	/**
	 * 双方定义
	 */
	@ApiField("biz_source")
	private String bizSource;

	/**
	 * 已退款、已取消时有
	 */
	@ApiField("cancel_reason")
	private String cancelReason;

	/**
	 * 已退款、已取消时有
	 */
	@ApiField("cancel_time")
	private String cancelTime;

	/**
	 * hdf申请单号
	 */
	@ApiField("hdf_apply_no")
	private String hdfApplyNo;

	/**
	 * null
	 */
	@ApiListField("item_info_list")
	@ApiField("sync_status_item_info")
	private List<SyncStatusItemInfo> itemInfoList;

	/**
	 * 订单总金额，单位：元
	 */
	@ApiField("order_price")
	private String orderPrice;

	/**
	 * 履约方单号
	 */
	@ApiField("union_apply_no")
	private String unionApplyNo;

	/**
	 * 履约方支付状态，1:待支付 2:已支付 3:已退款 4:已取消
	 */
	@ApiField("union_apply_pay_status")
	private Long unionApplyPayStatus;

	public String getBizSource() {
		return this.bizSource;
	}
	public void setBizSource(String bizSource) {
		this.bizSource = bizSource;
	}

	public String getCancelReason() {
		return this.cancelReason;
	}
	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getCancelTime() {
		return this.cancelTime;
	}
	public void setCancelTime(String cancelTime) {
		this.cancelTime = cancelTime;
	}

	public String getHdfApplyNo() {
		return this.hdfApplyNo;
	}
	public void setHdfApplyNo(String hdfApplyNo) {
		this.hdfApplyNo = hdfApplyNo;
	}

	public List<SyncStatusItemInfo> getItemInfoList() {
		return this.itemInfoList;
	}
	public void setItemInfoList(List<SyncStatusItemInfo> itemInfoList) {
		this.itemInfoList = itemInfoList;
	}

	public String getOrderPrice() {
		return this.orderPrice;
	}
	public void setOrderPrice(String orderPrice) {
		this.orderPrice = orderPrice;
	}

	public String getUnionApplyNo() {
		return this.unionApplyNo;
	}
	public void setUnionApplyNo(String unionApplyNo) {
		this.unionApplyNo = unionApplyNo;
	}

	public Long getUnionApplyPayStatus() {
		return this.unionApplyPayStatus;
	}
	public void setUnionApplyPayStatus(Long unionApplyPayStatus) {
		this.unionApplyPayStatus = unionApplyPayStatus;
	}

}
