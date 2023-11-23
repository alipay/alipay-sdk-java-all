package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 人群看板分析
 *
 * @author auto create
 * @since 1.0, 2023-05-16 13:57:01
 */
public class AlipayMerchantQipanBoardQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4874861969983639818L;

	/**
	 * 看板场景对应的请求参数
	 */
	@ApiField("request_params")
	private BoardQueryRequest requestParams;

	/**
	 * 看板场景，全局唯一 如：用户资产总览、用户资产构成、人群概览。参考：<a href="https://opendocs.alipay.com/pre-open/04phhq#%E7%9C%8B%E6%9D%BF%E5%88%86%E6%9E%90%E4%B8%8D%E5%90%8Cscene_code%E6%9F%A5%E8%AF%A2" target="_blank">不同场景码对应的查询内容</a>
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public BoardQueryRequest getRequestParams() {
		return this.requestParams;
	}
	public void setRequestParams(BoardQueryRequest requestParams) {
		this.requestParams = requestParams;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
