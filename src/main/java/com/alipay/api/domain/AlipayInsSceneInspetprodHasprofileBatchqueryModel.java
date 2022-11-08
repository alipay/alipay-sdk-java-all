package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 查询用户是否建档标志
 *
 * @author auto create
 * @since 1.0, 2022-01-14 13:54:17
 */
public class AlipayInsSceneInspetprodHasprofileBatchqueryModel extends AlipayObject {

	private static final long serialVersionUID = 8772388654917952582L;

	/**
	 * 场景码-外部场景标识
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 渠道号
	 */
	@ApiField("channel")
	private String channel;

	/**
	 * 用户标识List
	 */
	@ApiListField("mark_id_list")
	@ApiField("pet_mark_id_d_t_o")
	private List<PetMarkIdDTO> markIdList;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

	public String getChannel() {
		return this.channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}

	public List<PetMarkIdDTO> getMarkIdList() {
		return this.markIdList;
	}
	public void setMarkIdList(List<PetMarkIdDTO> markIdList) {
		this.markIdList = markIdList;
	}

}
