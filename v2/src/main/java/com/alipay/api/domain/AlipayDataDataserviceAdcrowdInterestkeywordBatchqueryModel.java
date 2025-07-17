package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 灯火广告定向兴趣人群关键词查询
 *
 * @author auto create
 * @since 1.0, 2025-05-12 11:32:10
 */
public class AlipayDataDataserviceAdcrowdInterestkeywordBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 7387753371223164177L;

	/**
	 * 该参数可模糊搜索兴趣人群名称，填写后查询结果将包含填写的词。
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
