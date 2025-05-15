package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 场景查询信息
 *
 * @author auto create
 * @since 1.0, 2023-07-31 16:28:05
 */
public class MpcSceneQueryInfo extends AlipayObject {

	private static final long serialVersionUID = 8779133758784997665L;

	/**
	 * 商品id列表
	 */
	@ApiListField("goods_id")
	@ApiField("string")
	private List<String> goodsId;

	/**
	 * 最后更新人
	 */
	@ApiField("last_operator")
	private String lastOperator;

	/**
	 * 坑位id
	 */
	@ApiField("position_code")
	private String positionCode;

	/**
	 * 推荐对象类型
	 */
	@ApiField("recomment_type")
	private String recommentType;

	/**
	 * 场景描述
	 */
	@ApiField("scene_description")
	private String sceneDescription;

	/**
	 * 场景id
	 */
	@ApiField("scene_id")
	private String sceneId;

	/**
	 * 场景项目名称
	 */
	@ApiField("scene_project_name")
	private String sceneProjectName;

	/**
	 * 状态
	 */
	@ApiField("status")
	private String status;

	public List<String> getGoodsId() {
		return this.goodsId;
	}
	public void setGoodsId(List<String> goodsId) {
		this.goodsId = goodsId;
	}

	public String getLastOperator() {
		return this.lastOperator;
	}
	public void setLastOperator(String lastOperator) {
		this.lastOperator = lastOperator;
	}

	public String getPositionCode() {
		return this.positionCode;
	}
	public void setPositionCode(String positionCode) {
		this.positionCode = positionCode;
	}

	public String getRecommentType() {
		return this.recommentType;
	}
	public void setRecommentType(String recommentType) {
		this.recommentType = recommentType;
	}

	public String getSceneDescription() {
		return this.sceneDescription;
	}
	public void setSceneDescription(String sceneDescription) {
		this.sceneDescription = sceneDescription;
	}

	public String getSceneId() {
		return this.sceneId;
	}
	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
	}

	public String getSceneProjectName() {
		return this.sceneProjectName;
	}
	public void setSceneProjectName(String sceneProjectName) {
		this.sceneProjectName = sceneProjectName;
	}

	public String getStatus() {
		return this.status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
