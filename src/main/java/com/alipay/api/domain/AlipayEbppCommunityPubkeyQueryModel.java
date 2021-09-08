package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询公钥
 *
 * @author auto create
 * @since 1.0, 2021-01-13 17:05:14
 */
public class AlipayEbppCommunityPubkeyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4462288544216643531L;

	/**
	 * ISV短名(创建ISV时生成)
	 */
	@ApiField("isv_short_name")
	private String isvShortName;

	public String getIsvShortName() {
		return this.isvShortName;
	}
	public void setIsvShortName(String isvShortName) {
		this.isvShortName = isvShortName;
	}

}
