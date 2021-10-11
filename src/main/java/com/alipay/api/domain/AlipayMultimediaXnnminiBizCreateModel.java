package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * xnn小程序创建业务
 *
 * @author auto create
 * @since 1.0, 2020-11-12 15:36:55
 */
public class AlipayMultimediaXnnminiBizCreateModel extends AlipayObject {

	private static final long serialVersionUID = 3847358638915134882L;

	/**
	 * 业务描述
	 */
	@ApiField("des")
	private String des;

	/**
	 * 模型绑定应用id
	 */
	@ApiField("mini_app_id")
	private String miniAppId;

	/**
	 * 业务名称
	 */
	@ApiField("name")
	private String name;

	/**
	 * 模型创建用户
	 */
	@ApiField("user_id")
	private String userId;

	public String getDes() {
		return this.des;
	}
	public void setDes(String des) {
		this.des = des;
	}

	public String getMiniAppId() {
		return this.miniAppId;
	}
	public void setMiniAppId(String miniAppId) {
		this.miniAppId = miniAppId;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return this.userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

}
