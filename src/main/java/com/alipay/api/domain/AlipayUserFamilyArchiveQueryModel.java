package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询家人信息档案(选人授权)组件已选的家人档案信息
 *
 * @author auto create
 * @since 1.0, 2020-07-08 11:52:25
 */
public class AlipayUserFamilyArchiveQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5553327298587631913L;

	/**
	 * 家人信息档案(选人授权)组件渲染请求令牌
	 */
	@ApiField("archive_token")
	private String archiveToken;

	public String getArchiveToken() {
		return this.archiveToken;
	}
	public void setArchiveToken(String archiveToken) {
		this.archiveToken = archiveToken;
	}

}
