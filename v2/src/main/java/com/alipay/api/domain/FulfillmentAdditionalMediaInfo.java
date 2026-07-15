package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 补充凭证
 *
 * @author auto create
 * @since 1.0, 2026-06-24 16:45:31
 */
public class FulfillmentAdditionalMediaInfo extends AlipayObject {

	private static final long serialVersionUID = 6498951312273813442L;

	/**
	 * 补充凭证类型。FACE_SIGN_PDF 面签、FACE_ACTIVE_JPG_LIST 激活、ELECTRONIC_SIGNATURE 签收底单、FACE_DOCUMENT 面单、ROUTE_TRACKING 路由轨迹、ELECTRONIC_STUB 电子存根、RENT_CONTRACT 租赁合同
	 */
	@ApiField("type")
	private String type;

	/**
	 * 补充凭证数据
	 */
	@ApiField("value")
	private String value;

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

	public String getValue() {
		return this.value;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
