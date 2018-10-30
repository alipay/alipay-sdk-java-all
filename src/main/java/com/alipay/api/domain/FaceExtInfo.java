package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸复杂类型
 *
 * @author auto create
 * @since 1.0, 2018-07-20 00:30:44
 */
public class FaceExtInfo extends AlipayObject {

	private static final long serialVersionUID = 1481786222223146189L;

	/**
	 * query_type不填, 返回uid
query_type=1, 返回手机号
query_type=2, 返回图片
	 */
	@ApiField("query_type")
	private String queryType;

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
