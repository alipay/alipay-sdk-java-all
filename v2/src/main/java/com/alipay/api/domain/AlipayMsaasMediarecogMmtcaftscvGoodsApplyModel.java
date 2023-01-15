package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 视觉货柜商品上新采集请求
 *
 * @author auto create
 * @since 1.0, 2022-09-26 11:18:30
 */
public class AlipayMsaasMediarecogMmtcaftscvGoodsApplyModel extends AlipayObject {

	private static final long serialVersionUID = 2735141913145875326L;

	/**
	 * 商品上新批次号
	 */
	@ApiField("batch_num")
	private String batchNum;

	/**
	 * 上新商品信息列表
	 */
	@ApiListField("goods_infos")
	@ApiField("apply_goods_info")
	private List<ApplyGoodsInfo> goodsInfos;

	/**
	 * 视觉货柜机型ID
	 */
	@ApiField("machine_type_id")
	private String machineTypeId;

	public String getBatchNum() {
		return this.batchNum;
	}
	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

	public List<ApplyGoodsInfo> getGoodsInfos() {
		return this.goodsInfos;
	}
	public void setGoodsInfos(List<ApplyGoodsInfo> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}

	public String getMachineTypeId() {
		return this.machineTypeId;
	}
	public void setMachineTypeId(String machineTypeId) {
		this.machineTypeId = machineTypeId;
	}

}
