package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.DoctorContentStatisticalResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.industrydata.doctorcontentdetail.query response.
 * 
 * @author auto create
 * @since 1.0, 2024-05-14 10:47:02
 */
public class AlipayCommerceMedicalIndustrydataDoctorcontentdetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6534716141992127117L;

	/** 
	 * 错误信息
	 */
	@ApiField("error_message")
	private String errorMessage;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 无
	 */
	@ApiField("statistical_result")
	private DoctorContentStatisticalResult statisticalResult;

	/** 
	 * 时间戳
	 */
	@ApiField("time")
	private String time;

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	public String getErrorMessage( ) {
		return this.errorMessage;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setStatisticalResult(DoctorContentStatisticalResult statisticalResult) {
		this.statisticalResult = statisticalResult;
	}
	public DoctorContentStatisticalResult getStatisticalResult( ) {
		return this.statisticalResult;
	}

	public void setTime(String time) {
		this.time = time;
	}
	public String getTime( ) {
		return this.time;
	}

}
