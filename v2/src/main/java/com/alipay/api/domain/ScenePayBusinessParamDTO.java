package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务参数模型
 *
 * @author auto create
 * @since 1.0, 2023-10-13 14:51:37
 */
public class ScenePayBusinessParamDTO extends AlipayObject {

	private static final long serialVersionUID = 8724256173958569654L;

	/**
	 * 业务自定义参数，交易异步通知和业务单同步查询时会返回
	 */
	@ApiField("custom_params")
	private String customParams;

	/**
	 * 命中门店信息
	 */
	@ApiField("hit_store_info")
	private StoreInfoDTO hitStoreInfo;

	/**
	 * 商圈中本次交易发生的商铺的识别号，在同一商铺类型下唯一
	 */
	@ApiField("mall_cell_id")
	private String mallCellId;

	/**
	 * 商圈中本次交易发生的商铺的识别类型，可取值：SMID,SHOPID,STOREID
	 */
	@ApiField("mall_cell_type")
	private String mallCellType;

	/**
	 * 场景支付创建业务单接口中：
当bizScene=MALL_PAY时，必填
	 */
	@ApiField("mall_id")
	private String mallId;

	/**
	 * 发生交易的商圈(非商圈组)的partnerId
	 */
	@ApiField("mall_pid")
	private String mallPid;

	/**
	 * 业务单关联的计划id
	 */
	@ApiField("plan_id")
	private String planId;

	/**
	 * 场景支付创建业务单接口中
当bizScene=MALL_PAY时，必填
	 */
	@ApiField("real_store_id")
	private String realStoreId;

	/**
	 * 业务单关联的券id信息
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getCustomParams() {
		return this.customParams;
	}
	public void setCustomParams(String customParams) {
		this.customParams = customParams;
	}

	public StoreInfoDTO getHitStoreInfo() {
		return this.hitStoreInfo;
	}
	public void setHitStoreInfo(StoreInfoDTO hitStoreInfo) {
		this.hitStoreInfo = hitStoreInfo;
	}

	public String getMallCellId() {
		return this.mallCellId;
	}
	public void setMallCellId(String mallCellId) {
		this.mallCellId = mallCellId;
	}

	public String getMallCellType() {
		return this.mallCellType;
	}
	public void setMallCellType(String mallCellType) {
		this.mallCellType = mallCellType;
	}

	public String getMallId() {
		return this.mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getMallPid() {
		return this.mallPid;
	}
	public void setMallPid(String mallPid) {
		this.mallPid = mallPid;
	}

	public String getPlanId() {
		return this.planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getRealStoreId() {
		return this.realStoreId;
	}
	public void setRealStoreId(String realStoreId) {
		this.realStoreId = realStoreId;
	}

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
