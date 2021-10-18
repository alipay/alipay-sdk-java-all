package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户签约美味不用等接口
 *
 * @author auto create
 * @since 1.0, 2020-11-26 21:10:05
 */
public class KoubeiCateringMerchantTmallSyncModel extends AlipayObject {

	private static final long serialVersionUID = 8846834989311942138L;

	/**
	 * 业务类型，标识商户操作类型是签约还是解约操作，枚举值：SIGN表示签约、UNSIGN表示解约
	 */
	@ApiField("biz_type")
	private String bizType;

	/**
	 * 请求id，唯一，用于标识唯一请求，可用uuid生成
	 */
	@ApiField("request_id")
	private String requestId;

	public String getBizType() {
		return this.bizType;
	}
	public void setBizType(String bizType) {
		this.bizType = bizType;
	}

	public String getRequestId() {
		return this.requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

}
