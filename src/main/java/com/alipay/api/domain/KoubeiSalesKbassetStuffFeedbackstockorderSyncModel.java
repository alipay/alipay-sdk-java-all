package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物流仓库供应商反馈取消出/入库单接口
 *
 * @author auto create
 * @since 1.0, 2019-05-30 23:22:56
 */
public class KoubeiSalesKbassetStuffFeedbackstockorderSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8285637832894913833L;

	/**
	 * erp订单号
	 */
	@ApiField("erp_order")
	private String erpOrder;

	/**
	 * 扩展字段
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 反馈类型
取消入库单：CANCEL_STOCK_IN_ORDER
取消出库单：CANCEL_STOCK_OUT_ORDER
	 */
	@ApiField("feedback_type")
	private String feedbackType;

	public String getErpOrder() {
		return this.erpOrder;
	}
	public void setErpOrder(String erpOrder) {
		this.erpOrder = erpOrder;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getFeedbackType() {
		return this.feedbackType;
	}
	public void setFeedbackType(String feedbackType) {
		this.feedbackType = feedbackType;
	}

}
