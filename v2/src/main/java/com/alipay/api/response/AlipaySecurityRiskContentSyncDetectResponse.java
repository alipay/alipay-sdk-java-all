package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DetectCheckLabel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.content.sync.detect response.
 * 
 * @author auto create
 * @since 1.0, 2025-04-02 17:42:17
 */
public class AlipaySecurityRiskContentSyncDetectResponse extends AlipayResponse {

	private static final long serialVersionUID = 4713513391849471517L;

	/** 
	 * 风险识别标签内容
	 */
	@ApiField("detect_check_labels")
	private DetectCheckLabel detectCheckLabels;

	/** 
	 * 是否计费
	 */
	@ApiField("is_meter")
	private Boolean isMeter;

	/** 
	 * 是否同步返回
	 */
	@ApiField("is_sync")
	private Boolean isSync;

	/** 
	 * 计量产品，";"分割
	 */
	@ApiField("meter_products")
	private String meterProducts;

	/** 
	 * 业务请求ID
	 */
	@ApiField("request_id")
	private String requestId;

	/** 
	 * 业务返回结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 返回结果信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 处置建议：
pass:通过
block:拦截
review:复核
	 */
	@ApiField("suggestion")
	private String suggestion;

	public void setDetectCheckLabels(DetectCheckLabel detectCheckLabels) {
		this.detectCheckLabels = detectCheckLabels;
	}
	public DetectCheckLabel getDetectCheckLabels( ) {
		return this.detectCheckLabels;
	}

	public void setIsMeter(Boolean isMeter) {
		this.isMeter = isMeter;
	}
	public Boolean getIsMeter( ) {
		return this.isMeter;
	}

	public void setIsSync(Boolean isSync) {
		this.isSync = isSync;
	}
	public Boolean getIsSync( ) {
		return this.isSync;
	}

	public void setMeterProducts(String meterProducts) {
		this.meterProducts = meterProducts;
	}
	public String getMeterProducts( ) {
		return this.meterProducts;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getRequestId( ) {
		return this.requestId;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	public String getSuggestion( ) {
		return this.suggestion;
	}

}
