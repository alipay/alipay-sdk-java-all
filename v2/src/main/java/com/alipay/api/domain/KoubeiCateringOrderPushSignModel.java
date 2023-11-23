package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 订单推单回执接口
 *
 * @author auto create
 * @since 1.0, 2019-01-18 15:26:33
 */
public class KoubeiCateringOrderPushSignModel extends AlipayObject {

	private static final long serialVersionUID = 1798513266729893371L;

	/**
	 * 口碑推单批次号，口碑推单时传入；
	 */
	@ApiField("batch_no")
	private String batchNo;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	/**
	 * 口碑主订单号
	 */
	@ApiField("order_id")
	private String orderId;

	/**
	 * POS订单号；在接单的情况下，必须返回
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 推单处理结果，可枚举：
(1) 已拒单：REJECT
(2) 已接单：RECEIPT
	 */
	@ApiField("receipt_code")
	private String receiptCode;

	/**
	 * 接单时间
	 */
	@ApiField("receipt_time")
	private Date receiptTime;

	/**
	 * 拒单原因编码：
(1) 桌号不存在，请联系服务员：TABLE_NOT_EXIST
(2) 店铺太忙，无法接待：BUSY
(3) 重复订单：DUPLICATE_ORDER
(4) 店铺已打烊：SHOP_CLOSE
(5) 菜品售完：SELL_OUT
(6) 其他原因：OTHER_REASON
(7) LOW_VERSION 收银系统版本过低
(8) SHOP_NOT_CONNECTED 没有门店绑定关系
(9) MERCHANT_NOT_AUTHORIZED 商户没有授权
(10) POS_UNCONNECTED POS关机或未联网
(11) DISH_REASON 菜品原因
(12) ACCEPT_REFUND 协商退款
	 */
	@ApiField("reject_reason_code")
	private String rejectReasonCode;

	/**
	 * 拒单的原因描述
	 */
	@ApiField("reject_reason_desc")
	private String rejectReasonDesc;

	public String getBatchNo() {
		return this.batchNo;
	}
	public void setBatchNo(String batchNo) {
		this.batchNo = batchNo;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

	public String getOrderId() {
		return this.orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getReceiptCode() {
		return this.receiptCode;
	}
	public void setReceiptCode(String receiptCode) {
		this.receiptCode = receiptCode;
	}

	public Date getReceiptTime() {
		return this.receiptTime;
	}
	public void setReceiptTime(Date receiptTime) {
		this.receiptTime = receiptTime;
	}

	public String getRejectReasonCode() {
		return this.rejectReasonCode;
	}
	public void setRejectReasonCode(String rejectReasonCode) {
		this.rejectReasonCode = rejectReasonCode;
	}

	public String getRejectReasonDesc() {
		return this.rejectReasonDesc;
	}
	public void setRejectReasonDesc(String rejectReasonDesc) {
		this.rejectReasonDesc = rejectReasonDesc;
	}

}
