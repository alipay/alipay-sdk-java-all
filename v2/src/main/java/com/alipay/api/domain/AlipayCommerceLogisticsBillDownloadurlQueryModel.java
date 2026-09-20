package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 同城并呼对账单文件地址查询
 *
 * @author auto create
 * @since 1.0, 2026-09-14 15:42:53
 */
public class AlipayCommerceLogisticsBillDownloadurlQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6279391432138972253L;

	/**
	 * * 日账单格式为yyyy-MM-dd，最早可下载近6年的日账单。不支持下载当日账单，只能下载前一日24点前的账单数据（T+1），当日数据一般于次日 9 点前生成，特殊情况可能延迟。
* 当这一日非账单出账日 会返回空
	 */
	@ApiField("bill_date")
	private String billDate;

	/**
	 * ORDER_SETTLE：订单结算单账单
	 */
	@ApiField("bill_type")
	private String billType;

	/**
	 * 支付宝分配
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 物流账单场景编码，由支付宝定义
	 */
	@ApiField("scene")
	private String scene;

	public String getBillDate() {
		return this.billDate;
	}
	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}

	public String getBillType() {
		return this.billType;
	}
	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

}
