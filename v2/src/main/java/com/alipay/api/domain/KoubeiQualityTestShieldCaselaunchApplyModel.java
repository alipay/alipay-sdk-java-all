package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 触发测试场景用例
 *
 * @author auto create
 * @since 1.0, 2020-01-08 14:47:59
 */
public class KoubeiQualityTestShieldCaselaunchApplyModel extends AlipayObject {

	private static final long serialVersionUID = 6879192881595486459L;

	/**
	 * 需要执行的测试用例id,多个id用逗号隔开
	 */
	@ApiField("collection_ids")
	private String collectionIds;

	/**
	 * 钉钉群的dingding_token，用来发送钉钉群消息
	 */
	@ApiField("dingding_token")
	private String dingdingToken;

	/**
	 * 拓展信息
	 */
	@ApiField("ext_infos")
	private String extInfos;

	public String getCollectionIds() {
		return this.collectionIds;
	}
	public void setCollectionIds(String collectionIds) {
		this.collectionIds = collectionIds;
	}

	public String getDingdingToken() {
		return this.dingdingToken;
	}
	public void setDingdingToken(String dingdingToken) {
		this.dingdingToken = dingdingToken;
	}

	public String getExtInfos() {
		return this.extInfos;
	}
	public void setExtInfos(String extInfos) {
		this.extInfos = extInfos;
	}

}
