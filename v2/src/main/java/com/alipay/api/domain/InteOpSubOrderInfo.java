package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 一体化作业项订单结构信息
 *
 * @author auto create
 * @since 1.0, 2025-12-15 23:21:38
 */
public class InteOpSubOrderInfo extends AlipayObject {

	private static final long serialVersionUID = 6242145994311584465L;

	/**
	 * 备注
	 */
	@ApiField("memo")
	private String memo;

	/**
	 * 一体化作业商户门店信息
	 */
	@ApiListField("shop_infos")
	@ApiField("inte_op_shop_info_v_o")
	private List<InteOpShopInfoVO> shopInfos;

	/**
	 * 一体化作业子项单号
	 */
	@ApiField("sub_order_no")
	private String subOrderNo;

	/**
	 * 一体化作业子项状态
	 */
	@ApiField("sub_order_status")
	private String subOrderStatus;

	/**
	 * 一体化作业子项类型
	 */
	@ApiField("type")
	private String type;

	public String getMemo() {
		return this.memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public List<InteOpShopInfoVO> getShopInfos() {
		return this.shopInfos;
	}
	public void setShopInfos(List<InteOpShopInfoVO> shopInfos) {
		this.shopInfos = shopInfos;
	}

	public String getSubOrderNo() {
		return this.subOrderNo;
	}
	public void setSubOrderNo(String subOrderNo) {
		this.subOrderNo = subOrderNo;
	}

	public String getSubOrderStatus() {
		return this.subOrderStatus;
	}
	public void setSubOrderStatus(String subOrderStatus) {
		this.subOrderStatus = subOrderStatus;
	}

	public String getType() {
		return this.type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
