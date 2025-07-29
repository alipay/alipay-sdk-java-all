package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 国补营销查询
 *
 * @author auto create
 * @since 1.0, 2025-06-25 21:54:56
 */
public class AlipayMarketingAssetTransferdetailQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1654514463718743349L;

	/**
	 * 通过场景码控制查询范围
	 */
	@ApiField("scene_code")
	private String sceneCode;

	/**
	 * 场景参数mapkey：枚举值 （PID）value：参数值
	 */
	@ApiField("scene_param_map")
	private String sceneParamMap;

	/**
	 * 交易号
	 */
	@ApiField("trade_no")
	private String tradeNo;

	/**
	 * 默认查询所有交易类型
	 */
	@ApiListField("trans_types")
	@ApiField("string")
	private List<String> transTypes;

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

	public String getSceneParamMap() {
		return this.sceneParamMap;
	}
	public void setSceneParamMap(String sceneParamMap) {
		this.sceneParamMap = sceneParamMap;
	}

	public String getTradeNo() {
		return this.tradeNo;
	}
	public void setTradeNo(String tradeNo) {
		this.tradeNo = tradeNo;
	}

	public List<String> getTransTypes() {
		return this.transTypes;
	}
	public void setTransTypes(List<String> transTypes) {
		this.transTypes = transTypes;
	}

}
