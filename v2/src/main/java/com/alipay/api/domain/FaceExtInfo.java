package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人脸复杂类型
 *
 * @author auto create
 * @since 1.0, 2020-05-25 16:45:21
 */
public class FaceExtInfo extends AlipayObject {

	private static final long serialVersionUID = 7635911995934816845L;

	/**
	 * 年龄区间判断的上限，闭区间
	 */
	@ApiField("max_age")
	private String maxAge;

	/**
	 * 年龄区间判断的下限，闭区间
	 */
	@ApiField("min_age")
	private String minAge;

	/**
	 * query_type不填, 返回uid
query_type=1, 返回手机号
query_type=2, 返回图片
	 */
	@ApiField("query_type")
	private String queryType;

	public String getMaxAge() {
		return this.maxAge;
	}
	public void setMaxAge(String maxAge) {
		this.maxAge = maxAge;
	}

	public String getMinAge() {
		return this.minAge;
	}
	public void setMinAge(String minAge) {
		this.minAge = minAge;
	}

	public String getQueryType() {
		return this.queryType;
	}
	public void setQueryType(String queryType) {
		this.queryType = queryType;
	}

}
