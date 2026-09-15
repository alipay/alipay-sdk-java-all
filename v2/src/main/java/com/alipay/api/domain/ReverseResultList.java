package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * null
 *
 * @author auto create
 * @since 1.0, 2026-08-27 15:57:49
 */
public class ReverseResultList extends AlipayObject {

	private static final long serialVersionUID = 4134722216318677559L;

	/**
	 * 对应入参的 data_id
	 */
	@ApiField("data_id")
	private String dataId;

	/**
	 * 该条记录删除是否成功（NOT_FOUND 视为 true，删除异常为 false）
	 */
	@ApiField("is_success")
	private String isSuccess;

	/**
	 * 该条记录结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	public String getDataId() {
		return this.dataId;
	}
	public void setDataId(String dataId) {
		this.dataId = dataId;
	}

	public String getIsSuccess() {
		return this.isSuccess;
	}
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getResultCode() {
		return this.resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

}
