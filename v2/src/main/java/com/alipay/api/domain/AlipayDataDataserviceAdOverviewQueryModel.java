package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 主账户余额查询
 *
 * @author auto create
 * @since 1.0, 2026-04-01 13:32:45
 */
public class AlipayDataDataserviceAdOverviewQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2776269732923541326L;

	/**
	 * 钱包类型：
通用钱包-INTELLIGENT
外投钱包-XAB_BP
	 */
	@ApiField("biz_scene")
	private String bizScene;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

}
