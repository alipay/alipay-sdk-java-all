package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 卡列表场景数据模型对象
 *
 * @author auto create
 * @since 1.0, 2025-08-04 17:01:51
 */
public class SubSceneCardModel extends AlipayObject {

	private static final long serialVersionUID = 4369697351411617551L;

	/**
	 * 子场景卡列表
	 */
	@ApiListField("sub_scene_card_list")
	@ApiField("special_card_info_model")
	private List<SpecialCardInfoModel> subSceneCardList;

	/**
	 * 城市编码
	 */
	@ApiField("sub_scene_code")
	private String subSceneCode;

	/**
	 * 子场景码名称
	 */
	@ApiField("sub_scene_code_name")
	private String subSceneCodeName;

	public List<SpecialCardInfoModel> getSubSceneCardList() {
		return this.subSceneCardList;
	}
	public void setSubSceneCardList(List<SpecialCardInfoModel> subSceneCardList) {
		this.subSceneCardList = subSceneCardList;
	}

	public String getSubSceneCode() {
		return this.subSceneCode;
	}
	public void setSubSceneCode(String subSceneCode) {
		this.subSceneCode = subSceneCode;
	}

	public String getSubSceneCodeName() {
		return this.subSceneCodeName;
	}
	public void setSubSceneCodeName(String subSceneCodeName) {
		this.subSceneCodeName = subSceneCodeName;
	}

}
