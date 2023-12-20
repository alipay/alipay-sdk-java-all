package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 物料单据反馈结果
 *
 * @author auto create
 * @since 1.0, 2017-07-27 19:41:21
 */
public class AccessOrdersFeedBackResult extends AlipayObject {

	private static final long serialVersionUID = 8592714822483499344L;

	/**
	 * 错误码
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 错误描述
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 反馈主键ID（生产单ID或者采购单ID或者码token）
	 */
	@ApiField("feedback_id")
	private String feedbackId;

	/**
	 * 生产单：PRODUCE_ORDER
采购单：PURCHASE_ORDER
二维码：QRCODE
	 */
	@ApiField("order_type")
	private String orderType;

	/**
	 * 外部单据号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 每条记录处理结果
	 */
	@ApiField("success")
	private Boolean success;

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public String getFeedbackId() {
		return this.feedbackId;
	}
	public void setFeedbackId(String feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getOrderType() {
		return this.orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public Boolean getSuccess() {
		return this.success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}

}
