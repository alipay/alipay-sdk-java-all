package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 汇率openapi通用操作接口
 *
 * @author auto create
 * @since 1.0, 2025-08-07 21:46:21
 */
public class AlipayAccountExrateRateSyncModel extends AlipayObject {

	private static final long serialVersionUID = 6132683693698555192L;

	/**
	 * 通用接口入参，json字符串的形式。比如该openapi绑定客户汇率发布能力，则以json字符串的形式传入客户汇率
	 */
	@ApiField("biz_context")
	private String bizContext;

	/**
	 * 客户汇率发布
	 */
	@ApiField("biz_type")
	private String bizType;

	public String getBizContext() {
		return this.bizContext;
	}
	public void setBizContext(String bizContext) {
		this.bizContext = bizContext;
	}

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

}
