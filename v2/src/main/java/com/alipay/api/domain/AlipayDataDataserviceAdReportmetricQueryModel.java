package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 支付宝广告商家指标查询
 *
 * @author auto create
 * @since 1.0, 2025-08-21 10:58:19
 */
public class AlipayDataDataserviceAdReportmetricQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4166373533696639717L;

	/**
	 * 代理商商家标识,在广告投放平台代理商详情获取。<a href="https://opendocs.alipay.com/xlight/0eucvz?pathHash=dc01fadb">获取文档</a>
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
