package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户认证状态查询
 *
 * @author auto create
 * @since 1.0, 2026-08-28 16:22:52
 */
public class AlipayUserAccountAcccoreCetifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2535781449889571369L;

	/**
	 * 目标查询账户的id，作为路由和查询账户使用
	 */
	@ApiField("alipay_id")
	private String alipayId;

	/**
	 * 查询场景，后续区分不同场景查询
	 */
	@ApiField("query_scene")
	private String queryScene;

	public String getAlipayId() {
		return this.alipayId;
	}
	public void setAlipayId(String alipayId) {
		this.alipayId = alipayId;
	}

	public String getQueryScene() {
		return this.queryScene;
	}
	public void setQueryScene(String queryScene) {
		this.queryScene = queryScene;
	}

}
