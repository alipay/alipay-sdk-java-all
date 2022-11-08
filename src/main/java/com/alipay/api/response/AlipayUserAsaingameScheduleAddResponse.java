package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.OpenApiUserScheduleVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.asaingame.schedule.add response.
 * 
 * @author auto create
 * @since 1.0, 2022-06-05 21:01:42
 */
public class AlipayUserAsaingameScheduleAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 6329252537365123117L;

	/** 
	 * 业务错误码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 错误描述
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 成功与否
	 */
	@ApiField("success")
	private Boolean success;

	/** 
	 * 用户行程
	 */
	@ApiField("user_schedule")
	private OpenApiUserScheduleVO userSchedule;

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

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

	public void setUserSchedule(OpenApiUserScheduleVO userSchedule) {
		this.userSchedule = userSchedule;
	}
	public OpenApiUserScheduleVO getUserSchedule( ) {
		return this.userSchedule;
	}

}
