package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 跨境游内容对接-飞猪装修中心店铺装修鉴权接口
 *
 * @author auto create
 * @since 1.0, 2020-04-03 11:17:28
 */
public class AlipayOverseasTravelFliggyAuthorityQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2257676712944435417L;

	/**
	 * 支付宝运营店ID
	 */
	@ApiField("global_shop_id")
	private String globalShopId;

	/**
	 * 登录账户的操作员ID
	 */
	@ApiField("operator_id")
	private String operatorId;

	/**
	 * 用户类型: 主账户 or 操作员.
主账号:MAIN_ACCOUNT
操作员:OPERATOR
	 */
	@ApiField("operator_type")
	private String operatorType;

	/**
	 * 登录账户归属的机构PID
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 飞猪门店ID
	 */
	@ApiField("store_id")
	private String storeId;

	public String getGlobalShopId() {
		return this.globalShopId;
	}
	public void setGlobalShopId(String globalShopId) {
		this.globalShopId = globalShopId;
	}

	public String getOperatorId() {
		return this.operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorType() {
		return this.operatorType;
	}
	public void setOperatorType(String operatorType) {
		this.operatorType = operatorType;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getStoreId() {
		return this.storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

}
