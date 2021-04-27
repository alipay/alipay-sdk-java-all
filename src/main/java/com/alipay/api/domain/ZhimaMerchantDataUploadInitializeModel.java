package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻数据传入初始化
 *
 * @author auto create
 * @since 1.0, 2018-01-08 16:16:18
 */
public class ZhimaMerchantDataUploadInitializeModel extends AlipayObject {

	private static final long serialVersionUID = 4252153678851353985L;

	/**
	 * 芝麻平台服务商模式下的二级商户标识，如果是直连商户调用该接口，不需要设置
	 */
	@ApiField("linked_merchant_id")
	private String linkedMerchantId;

	/**
	 * 数据应用的场景编码，场景码和场景名称（数字或字符串为场景码）如下：
8：数据反馈
32：骑行
CAR_RENTING：租车行业解决方案
	 */
	@ApiField("scene_code")
	private String sceneCode;

	public String getLinkedMerchantId() {
		return this.linkedMerchantId;
	}
	public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}

	public String getSceneCode() {
		return this.sceneCode;
	}
	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}

}
