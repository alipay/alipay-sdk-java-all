package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询商品接口
 *
 * @author auto create
 * @since 1.0, 2021-01-15 11:28:09
 */
public class AntMerchantExpandItemOpenQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3337648431311361174L;

	/**
	 * 场景码（具体值请参见产品文档）。
小程序订单中心场景固定为 APP_ORDER。
	 */
	@ApiField("scene")
	private String scene;

	/**
	 * 商品状态：EFFECT（有效）、INVALID（无效）
	 */
	@ApiField("status")
	private String status;

	/**
	 * 商品归属主体ID
例：商品归属主体类型target_type为店铺，则商品归属主体ID为店铺ID（支付宝侧店铺ID）；归属主体类型target_type为小程序，则归属主体ID为小程序ID
	 */
	@ApiField("target_id")
	private String targetId;

	/**
	 * 商品归属主体类型。枚举如下：
5：店铺。
8：小程序。
	 */
	@ApiField("target_type")
	private String targetType;

	public String getScene() {
		return this.scene;
	}
	public void setScene(String scene) {
		this.scene = scene;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
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
