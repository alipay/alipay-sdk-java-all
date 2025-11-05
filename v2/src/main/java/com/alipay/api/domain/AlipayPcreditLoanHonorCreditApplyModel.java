package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授信申请
 *
 * @author auto create
 * @since 1.0, 2025-09-12 16:08:47
 */
public class AlipayPcreditLoanHonorCreditApplyModel extends AlipayObject {

	private static final long serialVersionUID = 1196214687828617174L;

	/**
	 * 支付宝用户id
	 */
	@ApiField("alipay_user_id")
	private String alipayUserId;

	/**
	 * 联合建模模型分 (Map< key, value>的 json字符串)
	 */
	@ApiField("api_model_score_map")
	private String apiModelScoreMap;

	/**
	 * 用户标签 (Map< key, value>的 json字符串)
	 */
	@ApiField("api_usr_tag_map")
	private String apiUsrTagMap;

	/**
	 * 申请单号
	 */
	@ApiField("apply_no")
	private String applyNo;

	/**
	 * 申请时间
	 */
	@ApiField("apply_time")
	private Date applyTime;

	/**
	 * 渠道用户id
	 */
	@ApiField("channel_customer_id")
	private String channelCustomerId;

	/**
	 * 授信方案咨询时返回的号，授信申请时依赖。
	 */
	@ApiField("credit_consult_serial_no")
	private String creditConsultSerialNo;

	/**
	 * 用于标记支付宝用户在应用下的唯一标识
	 */
	@ApiField("open_id")
	private String openId;

	/**
	 * 渠道traceid
	 */
	@ApiField("out_trace_id")
	private String outTraceId;

	/**
	 * SL_PD_SALE_CODE-HONOR
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 请求源
	 */
	@ApiField("request_source")
	private String requestSource;

	/**
	 * 大安全风控信息
	 */
	@ApiField("risk_info")
	private String riskInfo;

	public String getAlipayUserId() {
		return this.alipayUserId;
	}
	public void setAlipayUserId(String alipayUserId) {
		this.alipayUserId = alipayUserId;
	}

	public String getApiModelScoreMap() {
		return this.apiModelScoreMap;
	}
	public void setApiModelScoreMap(String apiModelScoreMap) {
		this.apiModelScoreMap = apiModelScoreMap;
	}

	public String getApiUsrTagMap() {
		return this.apiUsrTagMap;
	}
	public void setApiUsrTagMap(String apiUsrTagMap) {
		this.apiUsrTagMap = apiUsrTagMap;
	}

	public String getApplyNo() {
		return this.applyNo;
	}
	public void setApplyNo(String applyNo) {
		this.applyNo = applyNo;
	}

	public Date getApplyTime() {
		return this.applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getChannelCustomerId() {
		return this.channelCustomerId;
	}
	public void setChannelCustomerId(String channelCustomerId) {
		this.channelCustomerId = channelCustomerId;
	}

	public String getCreditConsultSerialNo() {
		return this.creditConsultSerialNo;
	}
	public void setCreditConsultSerialNo(String creditConsultSerialNo) {
		this.creditConsultSerialNo = creditConsultSerialNo;
	}

	public String getOpenId() {
		return this.openId;
	}
	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getOutTraceId() {
		return this.outTraceId;
	}
	public void setOutTraceId(String outTraceId) {
		this.outTraceId = outTraceId;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRequestSource() {
		return this.requestSource;
	}
	public void setRequestSource(String requestSource) {
		this.requestSource = requestSource;
	}

	public String getRiskInfo() {
		return this.riskInfo;
	}
	public void setRiskInfo(String riskInfo) {
		this.riskInfo = riskInfo;
	}

}
