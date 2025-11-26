package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灯火广告定向行业主题人群查询
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:28:14
 */
public class AlipayDataDataserviceAdcrowdThemecrowdBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 1262391752134633193L;

	/**
	 * 该参数为模糊搜索行业主题人群包名称时填写的搜索词
	 */
	@ApiField("keyword")
	private String keyword;

	/**
	 * 该参数为灯火商家唯一标识
	 */
	@ApiField("principal_tag")
	private String principalTag;

	public String getKeyword() {
		return this.keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public String getPrincipalTag() {
		return this.principalTag;
	}
	public void setPrincipalTag(String principalTag) {
		this.principalTag = principalTag;
	}

}
