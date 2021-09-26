package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 微客isv开票结果反馈
 *
 * @author auto create
 * @since 1.0, 2019-10-17 15:40:50
 */
public class AlipayMerchantWeikeInvoiceNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 5494986585697237254L;

	/**
	 * 申请ID
	 */
	@ApiField("apply_id")
	private String applyId;

	/**
	 * 开票拒绝反馈错误码
	 */
	@ApiField("feedback_code")
	private String feedbackCode;

	/**
	 * 开票拒绝反馈原因
	 */
	@ApiField("feedback_msg")
	private String feedbackMsg;

	/**
	 * 反馈状态:true开票成功；false开票拒绝
	 */
	@ApiField("feedback_result")
	private Boolean feedbackResult;

	/**
	 * 发票种类，0=电子发票，1=纸质发票，2=专票
	 */
	@ApiField("invoice_kind")
	private Long invoiceKind;

	/**
	 * isv的物流信息
	 */
	@ApiListField("logistics_info")
	@ApiField("isv_logistics_info")
	private List<IsvLogisticsInfo> logisticsInfo;

	public String getApplyId() {
		return this.applyId;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}

	public String getFeedbackCode() {
		return this.feedbackCode;
	}
	public void setFeedbackCode(String feedbackCode) {
		this.feedbackCode = feedbackCode;
	}

	public String getFeedbackMsg() {
		return this.feedbackMsg;
	}
	public void setFeedbackMsg(String feedbackMsg) {
		this.feedbackMsg = feedbackMsg;
	}

	public Boolean getFeedbackResult() {
		return this.feedbackResult;
	}
	public void setFeedbackResult(Boolean feedbackResult) {
		this.feedbackResult = feedbackResult;
	}

	public Long getInvoiceKind() {
		return this.invoiceKind;
	}
	public void setInvoiceKind(Long invoiceKind) {
		this.invoiceKind = invoiceKind;
	}

	public List<IsvLogisticsInfo> getLogisticsInfo() {
		return this.logisticsInfo;
	}
	public void setLogisticsInfo(List<IsvLogisticsInfo> logisticsInfo) {
		this.logisticsInfo = logisticsInfo;
	}

}
