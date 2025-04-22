package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 请款创建数据对象
 *
 * @author auto create
 * @since 1.0, 2020-03-26 17:40:40
 */
public class CaptureCreateDTO extends AlipayObject {

	private static final long serialVersionUID = 4619727327688564163L;

	/**
	 * 请款单号
	 */
	@ApiField("capture_no")
	private String captureNo;

	/**
	 * 外部业务请求号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public String getCaptureNo() {
		return this.captureNo;
	}
	public void setCaptureNo(String captureNo) {
		this.captureNo = captureNo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

}
