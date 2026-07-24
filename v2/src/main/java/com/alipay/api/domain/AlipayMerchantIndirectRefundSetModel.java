package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 退款优惠明细打标接口
 *
 * @author auto create
 * @since 1.0, 2026-06-02 13:38:53
 */
public class AlipayMerchantIndirectRefundSetModel extends AlipayObject {

	private static final long serialVersionUID = 6151769784661227518L;

	/**
	 * 支付宝子商户号，一般是2088开头的数字，该子商户号由服务商进件而来。
	 */
	@ApiField("smid")
	private String smid;

	/**
	 * 是否开启字段透传或关闭字段透传，如果未传则默认为开启。
	 */
	@ApiField("tag_value")
	private String tagValue;

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

	public String getTagValue() {
		return this.tagValue;
	}
	public void setTagValue(String tagValue) {
		this.tagValue = tagValue;
	}

}
