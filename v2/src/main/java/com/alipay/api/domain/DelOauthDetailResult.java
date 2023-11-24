package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 解除授权详情
 *
 * @author auto create
 * @since 1.0, 2023-11-21 10:23:25
 */
public class DelOauthDetailResult extends AlipayObject {

	private static final long serialVersionUID = 7491548918738372143L;

	/**
	 * 解除授权记录列表
	 */
	@ApiListField("details")
	@ApiField("del_oauth_detail")
	private List<DelOauthDetail> details;

	public List<DelOauthDetail> getDetails() {
		return this.details;
	}
	public void setDetails(List<DelOauthDetail> details) {
		this.details = details;
	}

}
