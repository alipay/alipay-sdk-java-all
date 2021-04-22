package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 支付宝商户活动批量信息查询
 *
 * @author auto create
 * @since 1.0, 2021-04-09 19:42:45
 */
public class AlipayMarketingCampaignSelfActivityBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 6655151231439642764L;

	/**
	 * 是否需要券核销范围信息（包括pid列表、门店id列表和小程序appid列表，由于字段可能较大默认不返回，业务方也请慎用。pid列表:PID，门店id列表:SHOP_ID，小程序appid列表:APP_ID）
	 */
	@ApiListField("need_use_scope_info")
	@ApiField("string")
	private List<String> needUseScopeInfo;

	/**
	 * 场景码：默认(DEFAULT)
	 */
	@ApiListField("scene_code")
	@ApiField("string")
	private List<String> sceneCode;

	public List<String> getNeedUseScopeInfo() {
		return this.needUseScopeInfo;
	}
	public void setNeedUseScopeInfo(List<String> needUseScopeInfo) {
		this.needUseScopeInfo = needUseScopeInfo;
	}

	public List<String> getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(List<String> sceneCode) {
		this.sceneCode = sceneCode;
	}

}
