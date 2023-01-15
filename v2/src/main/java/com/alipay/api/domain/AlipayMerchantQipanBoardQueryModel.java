package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群看板分析
 *
 * @author auto create
 * @since 1.0, 2023-01-05 17:18:55
 */
public class AlipayMerchantQipanBoardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 8363338592792271235L;

	/**
	 * 扩展请求参数，如关系类型、聚合维度
	 */
	@ApiField("request_params")
	private String requestParams;

	/**
	 * 看板场景，全局唯一 如：用户资产总览、用户资产构成、人群概览
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getRequestParams() {
		return this.requestParams;
	}
	public void setRequestParams(String requestParams) {
		this.requestParams = requestParams;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
