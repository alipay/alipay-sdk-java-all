package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 货品模板商品集识别精确度校验
 *
 * @author auto create
 * @since 1.0, 2019-10-21 16:20:50
 */
public class AlipayMsaasMediarecogMmtcaftscvTemplateVerifyModel extends AlipayObject {

	private static final long serialVersionUID = 5523194443945625652L;

	/**
	 * 商品Id列表
	 */
	@ApiListField("algorithm_goods_ids")
	@ApiField("string")
	private List<String> algorithmGoodsIds;

	/**
	 * 商品数量
	 */
	@ApiField("good_count")
	private Long goodCount;

	/**
	 * 机型编号
	 */
	@ApiField("machine_type_id")
	private String machineTypeId;

	/**
	 * 场景关联id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 模板编号
	 */
	@ApiField("template_id")
	private String templateId;

	/**
	 * 商品id冲突校验白名单，逗号分隔字符串对List。例如，一个商品有ABC三个外观，需传入["A,B", "B,C", "A,C"]
	 */
	@ApiListField("white_list")
	@ApiField("string")
	private List<String> whiteList;

	public List<String> getAlgorithmGoodsIds() {
		return this.algorithmGoodsIds;
	}
	public void setAlgorithmGoodsIds(List<String> algorithmGoodsIds) {
		this.algorithmGoodsIds = algorithmGoodsIds;
	}

	public Long getGoodCount() {
		return this.goodCount;
	}
	public void setGoodCount(Long goodCount) {
		this.goodCount = goodCount;
	}

	public String getMachineTypeId() {
		return this.machineTypeId;
	}
	public void setMachineTypeId(String machineTypeId) {
		this.machineTypeId = machineTypeId;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getTemplateId() {
		return this.templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public List<String> getWhiteList() {
		return this.whiteList;
	}
	public void setWhiteList(List<String> whiteList) {
		this.whiteList = whiteList;
	}

}
