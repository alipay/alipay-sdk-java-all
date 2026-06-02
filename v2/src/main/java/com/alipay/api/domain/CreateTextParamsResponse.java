package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 在百灵创建文案接口的返回对象
 *
 * @author auto create
 * @since 1.0, 2026-04-15 15:17:44
 */
public class CreateTextParamsResponse extends AlipayObject {

	private static final long serialVersionUID = 4114865818398418131L;

	/**
	 * 操作成功后完成标识为true
	 */
	@ApiField("push_bailingual_flag")
	private Boolean pushBailingualFlag;

	public Boolean getPushBailingualFlag() {
		return this.pushBailingualFlag;
	}
	public void setPushBailingualFlag(Boolean pushBailingualFlag) {
		this.pushBailingualFlag = pushBailingualFlag;
	}

}
