package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 单个报名对象的报名结果
 *
 * @author auto create
 * @since 1.0, 2026-01-22 20:52:12
 */
public class BsEnrollParticipantResult extends AlipayObject {

	private static final long serialVersionUID = 6227352951626872474L;

	/**
	 * 报名是否成功。如果失败会有reason和code返回
	 */
	@ApiField("enroll_result")
	private Boolean enrollResult;

	/**
	 * 报名结果详细信息
	 */
	@ApiField("enroll_result_detail")
	private BsEnrollParticipantResultDetail enrollResultDetail;

	/**
	 * 报名失败的错误码，仅限报名失败场景透出。
	 */
	@ApiField("fail_code")
	private String failCode;

	/**
	 * 报名操作返回的失败原因，仅限报名失败场景透出
	 */
	@ApiField("fail_reason")
	private String failReason;

	/**
	 * 类型对应值，传入报名对象的返回值
	 */
	@ApiField("value")
	private String value;

	public Boolean getEnrollResult() {
		return this.enrollResult;
	}
	public void setEnrollResult(Boolean enrollResult) {
		this.enrollResult = enrollResult;
	}

	public BsEnrollParticipantResultDetail getEnrollResultDetail() {
		return this.enrollResultDetail;
	}
	public void setEnrollResultDetail(BsEnrollParticipantResultDetail enrollResultDetail) {
		this.enrollResultDetail = enrollResultDetail;
	}

	public String getFailCode() {
		return this.failCode;
	}
	public void setFailCode(String failCode) {
		this.failCode = failCode;
	}

	public String getFailReason() {
		return this.failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
