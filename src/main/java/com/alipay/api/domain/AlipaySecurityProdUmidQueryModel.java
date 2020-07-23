package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据tokenID查询umid
 *
 * @author auto create
 * @since 1.0, 2017-09-14 10:32:55
 */
public class AlipaySecurityProdUmidQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8435117756439819194L;

	/**
	 * tokenID,客户端对应的token值: token由应用系统生成, 缓存在前台页面, 生成UMID的时候会传到UMID系统
	 */
	@ApiField("token_id")
	private String tokenId;

	public String getTokenId() {
		return this.tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}

}
