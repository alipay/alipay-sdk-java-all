package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 小区服务状态查询接口
 *
 * @author auto create
 * @since 1.0, 2021-11-09 14:34:42
 */
public class AlipayEbppCommunityServiceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2234728182723355647L;

	/**
	 * 小区短名
	 */
	@ApiField("community_short_name")
	private String communityShortName;

	public String getCommunityShortName() {
		return this.communityShortName;
	}
	public void setCommunityShortName(String communityShortName) {
		this.communityShortName = communityShortName;
	}

}
