package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 商户标签创建接口
 *
 * @author auto create
 * @since 1.0, 2019-10-31 20:48:35
 */
public class AntMerchantExpandClassificationCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7239931654252231768L;

	/**
	 * 标签名称，又支付宝业务分配，请联系对应业务方获取
	 */
	@ApiField("cl_key")
	private String clKey;

	/**
	 * 标签值，支持0（去标），1（打标）和自定义标签值。如何传值请联系对应业务方确认。
	 */
	@ApiField("cl_vlaue")
	private String clVlaue;

	/**
	 * 2088
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 打标目标id类型，目前支持
MID,
PID,
SHOPID
	 */
	@ApiField("target_type")
	private String targetType;

	public String getClKey() {
		return this.clKey;
	}
	public void setClKey(String clKey) {
		this.clKey = clKey;
	}

	public String getClVlaue() {
		return this.clVlaue;
	}
	public void setClVlaue(String clVlaue) {
		this.clVlaue = clVlaue;
	}

	public String getTargetId() {
		return this.targetId;
	}
	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTargetType() {
		return this.targetType;
	}
	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

}
