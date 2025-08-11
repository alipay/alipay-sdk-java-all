package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘开放行为分析接口
 *
 * @author auto create
 * @since 1.0, 2023-05-16 13:57:11
 */
public class AlipayMerchantQipanBehaviorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3846653965999536789L;

	/**
	 * 行为分析查询，不同查询场景的查询参数，如关系类型、关系对象类型等。
	 */
	@ApiField("request_params")
	private BehaviorQueryRequest requestParams;

	/**
	 * 查询场景，由棋盘注册，全局唯一。如：会员客单价区间、支付频次等。参考：<a href="https://opendocs.alipay.com/pre-open/04phhq#%E8%A1%8C%E4%B8%BA%E5%88%86%E6%9E%90%E4%B8%8D%E5%90%8C%20scene_code%20%E6%9F%A5%E8%AF%A2" target="_blank">行为分析不同scene_code查询内容</a>
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public BehaviorQueryRequest getRequestParams() {
		return this.requestParams;
	}
	public void setRequestParams(BehaviorQueryRequest requestParams) {
		this.requestParams = requestParams;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
