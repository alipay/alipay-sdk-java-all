package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * keyantestoneone
 *
 * @author auto create
 * @since 1.0, 2017-08-01 16:05:55
 */
public class ZhimaOpenAppKeyanLqlCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3672827218648552477L;

	/**
	 * 参数描述必须通俗易懂、无错别字、完整。描述的内容请按此格式填写：参数名+是1否唯一(如需)+应用场景+枚举值(如有)+如何获取+特殊说明(如有)。如不符合标准终审会驳回，影响上线时间。
	 */
	@ApiField("cert_no")
	private String certNo;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

}
