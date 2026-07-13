package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 碰一下匹配包裹被取出回传
 *
 * @author auto create
 * @since 1.0, 2026-05-29 14:02:51
 */
public class AlipayCommerceLogisticsTokenPickupNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 7489845145559637675L;

	/**
	 * 支付宝跳转商户小程序携带的token，商户通过token回查支付宝获取token关联的运单信息
	 */
	@ApiField("info_token")
	private String infoToken;

	/**
	 * 物流公司编码
	 */
	@ApiField("logistics_code")
	private String logisticsCode;

	/**
	 * [
    {
        "name": "明文匹配",
        "value": "L1"
    },
    {
        "name": "大数据匹配",
        "value": "L2"
    },
    {
        "name": "疑似包裹",
        "value": "L3"
    },
    {
        "name": "疑似包裹",
        "value": "L4"
    }
]
	 */
	@ApiField("match_type")
	private String matchType;

	/**
	 * [{"name":"取件码校验","value":"AUTH_CODE_CHECK"},{"name":"基础校验","value":"BASE_CHECK"},{"name":"无校验","value":"ON_CHECK"}]
	 */
	@ApiField("pickup_auth_type")
	private String pickupAuthType;

	/**
	 * token场景 NFC_PICK_PKG碰一下取件
	 */
	@ApiField("token_scene")
	private String tokenScene;

	/**
	 * 运单号
	 */
	@ApiField("waybill_no")
	private String waybillNo;

	public String getInfoToken() {
		return this.infoToken;
	}
	public void setInfoToken(String infoToken) {
		this.infoToken = infoToken;
	}

	public String getLogisticsCode() {
		return this.logisticsCode;
	}
	public void setLogisticsCode(String logisticsCode) {
		this.logisticsCode = logisticsCode;
	}

	public String getMatchType() {
		return this.matchType;
	}
	public void setMatchType(String matchType) {
		this.matchType = matchType;
	}

	public String getPickupAuthType() {
		return this.pickupAuthType;
	}
	public void setPickupAuthType(String pickupAuthType) {
		this.pickupAuthType = pickupAuthType;
	}

	public String getTokenScene() {
		return this.tokenScene;
	}
	public void setTokenScene(String tokenScene) {
		this.tokenScene = tokenScene;
	}

	public String getWaybillNo() {
		return this.waybillNo;
	}
	public void setWaybillNo(String waybillNo) {
		this.waybillNo = waybillNo;
	}

}
