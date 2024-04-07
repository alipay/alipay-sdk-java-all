package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开发当面付付款码解码
 *
 * @author auto create
 * @since 1.0, 2023-11-01 14:32:58
 */
public class AlipayMarketingFacetofaceDecodeUseModel extends AlipayObject {

	private static final long serialVersionUID = 2523462613252539888L;

	/**
	 * 付款码码值
	 */
	@ApiField("dynamic_id")
	private String dynamicId;

	/**
	 * 外部业务号，用于标识这笔解码请求，对同一个码的重复解码请求，sence_no必须与上一次保持一致，每次请求的sence_no必须不一样，如alipay.marketing.facetoface.decode.use接口配合alipay.trade.pay（统一收单交易支付接口）一并使用时，alipay.trade.pay接口的extend_params属性中必须设置DYNAMIC_TOKEN_OUT_BIZ_NO，且值必须与sence_no保持一致。
	 */
	@ApiField("sence_no")
	private String senceNo;

	public String getDynamicId() {
		return this.dynamicId;
	}
	public void setDynamicId(String dynamicId) {
		this.dynamicId = dynamicId;
	}

	public String getSenceNo() {
		return this.senceNo;
	}
	public void setSenceNo(String senceNo) {
		this.senceNo = senceNo;
	}

}
