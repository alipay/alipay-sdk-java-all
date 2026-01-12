package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * C2C短信验证码查询
 *
 * @author auto create
 * @since 1.0, 2025-11-18 21:12:42
 */
public class AnttechNftCtocSmscodeQueryModel extends AlipayObject {

	private static final long serialVersionUID = 4438522388188273366L;

	/**
	 * 用户ID
	 */
	@ApiField("id_no")
	private String idNo;

	/**
	 * 枚举： OPEN_UID-鲸探openUid
	 */
	@ApiField("id_type")
	private String idType;

	/**
	 * 秒转验证码
	 */
	@ApiField("sms_biz_scene")
	private String smsBizScene;

	public String getIdNo() {
		return this.idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}

	public String getIdType() {
		return this.idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getSmsBizScene() {
		return this.smsBizScene;
	}
	public void setSmsBizScene(String smsBizScene) {
		this.smsBizScene = smsBizScene;
	}

}
