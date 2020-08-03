package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商家是否有核销中的账单
 *
 * @author auto create
 * @since 1.0, 2019-10-25 14:08:30
 */
public class AlipayBossFncPidUnwriteoffQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1786513217216918974L;

	/**
	 * 请求查询业务场景
INTER_TRADE:关联方场景
PROMOORDER:超级优惠购
IOT:iot
IPAY_TAKEOUT_REDPACKET:国际外卖红包
ADCENTER:广告平台
AFC:金融云业务场景
	 */
	@ApiField("business_scene")
	private String businessScene;

	/**
	 * 结算对象PID
	 */
	@ApiField("ip_role_id")
	private String ipRoleId;

	public String getBusinessScene() {
		return this.businessScene;
	}
	public void setBusinessScene(String businessScene) {
		this.businessScene = businessScene;
	}

	public String getIpRoleId() {
		return this.ipRoleId;
	}
	public void setIpRoleId(String ipRoleId) {
		this.ipRoleId = ipRoleId;
	}

}
