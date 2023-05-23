package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 业务参数模型
 *
 * @author auto create
 * @since 1.0, 2023-03-14 17:56:38
 */
public class ScenePayBusinessParamDTO extends AlipayObject {

	private static final long serialVersionUID = 8828636883332112872L;

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
	 * 场景支付创建业务单接口中
当bizScene=MALL_PAY时，必填
	 */
	@ApiField("real_store_id")
	private String realStoreId;

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

	public String getRealStoreId() {
		return this.realStoreId;
	}
	public void setRealStoreId(String realStoreId) {
		this.realStoreId = realStoreId;
	}

}
