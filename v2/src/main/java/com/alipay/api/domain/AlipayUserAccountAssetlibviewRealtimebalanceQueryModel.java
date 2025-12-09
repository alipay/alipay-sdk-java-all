package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 余额账户实时余额查询
 *
 * @author auto create
 * @since 1.0, 2025-09-29 14:01:46
 */
public class AlipayUserAccountAssetlibviewRealtimebalanceQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8564166875628763639L;

	/**
	 * 目标查询账户的id，只作为路由和查询账户使用
	 */
	@ApiField("asset_alipay_id")
	private String assetAlipayId;

	/**
	 * 查询场景，后续区分不同场景查询
	 */
	@ApiField("query_scene")
	private String queryScene;

	public String getAssetAlipayId() {
		return this.assetAlipayId;
	}
	public void setAssetAlipayId(String assetAlipayId) {
		this.assetAlipayId = assetAlipayId;
	}

	public String getQueryScene() {
		return this.queryScene;
	}
	public void setQueryScene(String queryScene) {
		this.queryScene = queryScene;
	}

}
