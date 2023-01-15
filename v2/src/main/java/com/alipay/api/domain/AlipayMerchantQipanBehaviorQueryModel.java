package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 棋盘开放行为分析接口
 *
 * @author auto create
 * @since 1.0, 2023-01-05 17:19:51
 */
public class AlipayMerchantQipanBehaviorQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7296496788839289411L;

	/**
	 * 扩展参数，不同sceneCode下的具体说明见文档。
relationType：关系类型；objectType：客体类型；objectId：客体id；cardTemplateId：会员卡模板id
	 */
	@ApiField("request_params")
	private String requestParams;

	/**
	 * 查询场景，由棋盘注册，全局唯一。如：会员客单价区间、支付频次等。每种场景码对应不同的request_params结构
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
