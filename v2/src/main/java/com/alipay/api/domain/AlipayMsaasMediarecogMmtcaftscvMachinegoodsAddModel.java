package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 视觉货柜商品选取放入
 *
 * @author auto create
 * @since 1.0, 2022-09-26 11:17:39
 */
public class AlipayMsaasMediarecogMmtcaftscvMachinegoodsAddModel extends AlipayObject {

	private static final long serialVersionUID = 8416925425934314918L;

	/**
	 * 当前请求选取商品算法Id
	 */
	@ApiField("algorithm_goods_id")
	private String algorithmGoodsId;

	/**
	 * 商品摆放姿态
	 */
	@ApiField("display_mode")
	private String displayMode;

	/**
	 * 柜内已有商品摆放状态
	 */
	@ApiListField("exist_goods_state")
	@ApiField("goods_state")
	private List<GoodsState> existGoodsState;

	/**
	 * 货柜层数
	 */
	@ApiField("floor_num")
	private Long floorNum;

	/**
	 * 货柜型号
	 */
	@ApiField("machine_type_id")
	private String machineTypeId;

	public String getAlgorithmGoodsId() {
		return this.algorithmGoodsId;
	}
	public void setAlgorithmGoodsId(String algorithmGoodsId) {
		this.algorithmGoodsId = algorithmGoodsId;
	}

	public String getDisplayMode() {
		return this.displayMode;
	}
	public void setDisplayMode(String displayMode) {
		this.displayMode = displayMode;
	}

	public List<GoodsState> getExistGoodsState() {
		return this.existGoodsState;
	}
	public void setExistGoodsState(List<GoodsState> existGoodsState) {
		this.existGoodsState = existGoodsState;
	}

	public Long getFloorNum() {
		return this.floorNum;
	}
	public void setFloorNum(Long floorNum) {
		this.floorNum = floorNum;
	}

	public String getMachineTypeId() {
		return this.machineTypeId;
	}
	public void setMachineTypeId(String machineTypeId) {
		this.machineTypeId = machineTypeId;
	}

}
