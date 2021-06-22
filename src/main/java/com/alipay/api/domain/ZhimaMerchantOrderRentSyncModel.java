package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 信用租赁订单订单信息同步接口
 *
 * @author auto create
 * @since 1.0, 2019-07-26 13:55:09
 */
public class ZhimaMerchantOrderRentSyncModel extends AlipayObject {

	private static final long serialVersionUID = 4128675388793785956L;

	/**
	 * 外部订单号, 用于定位需要修改的订单
	 */
	@ApiField("out_order_no")
	private String outOrderNo;

	/**
	 * 通过信用租赁接口曾发起扣款的外部交易号，如果sync_type=fund，传入该值有效，如果该笔扣款当前非成功状态，芝麻会标记该笔扣款已成功状态给用户进行展示
	 */
	@ApiField("out_trans_no")
	private String outTransNo;

	/**
	 * 被修改订单的新逾期时间，时间至少比当前时间晚一天，不能修改为过去的时间，注意格式为：yyyy-MM-dd HH:mm:ss，如果sync_type=overdue_time，传入该值有效
	 */
	@ApiField("overdue_time")
	private String overdueTime;

	/**
	 * 信用套餐产品码，固定值：w1010100000000002734
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 操作类型，标记是需要修改资金单状态或者是修改逾期时间，可选值：fund,overdue_time
	 */
	@ApiField("sync_type")
	private String syncType;

	/**
	 * 芝麻订单号，用于定位要修改的订单
	 */
	@ApiField("zm_order_no")
	private String zmOrderNo;

	public String getOutOrderNo() {
		return this.outOrderNo;
	}
	public void setOutOrderNo(String outOrderNo) {
		this.outOrderNo = outOrderNo;
	}

	public String getOutTransNo() {
		return this.outTransNo;
	}
	public void setOutTransNo(String outTransNo) {
		this.outTransNo = outTransNo;
	}

	public String getOverdueTime() {
		return this.overdueTime;
	}
	public void setOverdueTime(String overdueTime) {
		this.overdueTime = overdueTime;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getSyncType() {
		return this.syncType;
	}
	public void setSyncType(String syncType) {
		this.syncType = syncType;
	}

	public String getZmOrderNo() {
		return this.zmOrderNo;
	}
	public void setZmOrderNo(String zmOrderNo) {
		this.zmOrderNo = zmOrderNo;
	}

}
