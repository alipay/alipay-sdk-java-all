package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据识别因子查询蚂蚁通行证信息
 *
 * @author auto create
 * @since 1.0, 2018-10-15 15:14:52
 */
public class AlipayUserAntpaasTokenidentityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5781462911296424793L;

	/**
	 * 业务Id，如口碑小程序场景下，该业务Id设置为微信unionId
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

}
